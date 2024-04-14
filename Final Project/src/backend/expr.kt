package backend

abstract class Expr {
    abstract fun eval(runtime:Runtime):Data
}

class Block(val exprs:List<Expr>):Expr() {
    override fun eval(runtime:Runtime):Data
    = exprs.map { it.eval(runtime) }.last()
}

class IntLiteral(val lexeme:String): Expr() {
    override fun eval(runtime:Runtime): Data
    = IntData(Integer.parseInt(lexeme))
}

class StringLiteral(val lexeme:String): Expr() {
    override fun eval(runtime:Runtime): Data
    = StringData(lexeme)
}

class BooleanLiteral(val lexeme:String): Expr() {
    override fun eval(runtime:Runtime): Data
    = BooleanData(lexeme.equals("true"))
}

class IdentifierExpr(val identifier: String) : Expr() {
    override fun eval(runtime: Runtime): Data {
        val value = runtime.symbolTable[identifier]
        return value ?: throw RuntimeException("Identifier '$identifier' is not defined")
    }
}
class NoneExpr(): Expr() {
    override fun eval(runtime:Runtime) = None
}

class Assign(
    val type: String,
    val name: String,
    val expr: Expr
): Expr() {
    override fun eval(runtime:Runtime):Data {
        val item:Data = expr.eval(runtime)
        if(type == "String"){
            if(item is StringData){
                val v:StringData = item
                runtime.symbolTable.put(name, v)
            }else{
               throw Exception("$name was expecting type String")
            }
        } else if(type == "Int"){
            if(item is IntData){
                val v:IntData = item
                runtime.symbolTable.put(name, v)
            }else{
                throw Exception("$name was expecting type Int")
            }
        } else if(type == "Boolean"){
            if(item is BooleanData){
                val v:BooleanData = item
                runtime.symbolTable.put(name, v)
            }else{
                throw Exception("$name was expecting type Boolean")
            }
        } else{
            throw Exception("$type is an invalid type")
        }
        return None
    }
}

class Reassign(
    val name: String,
    val expr: Expr
): Expr() {
    override fun eval(runtime:Runtime):Data {
        val item:Data = expr.eval(runtime)
        val curVal = runtime.symbolTable[name]
        if(curVal is StringData){
            if(item is StringData){
                val v:StringData = item
                runtime.symbolTable.put(name, v)
            }else{
               throw Exception("$name was expecting type String")
            }
        }else if(curVal is IntData){
            if(item is IntData){
                val v:IntData = item
                runtime.symbolTable.put(name, v)
            }else{
                throw Exception("$name was expecting type Int")
            }
        }else if(curVal is BooleanData){
            if(item is BooleanData){
                val v:BooleanData = item
                runtime.symbolTable.put(name, v)
            }else{
                throw Exception("$name was expecting type Boolean")
            }
        } else{
            throw Exception("Invalid type")
        }
        return None
    }
}

class Print(
    val exprs: List<Expr>
): Expr() {
    override fun eval(runtime:Runtime): Data {
        var data = ""
        exprs.forEach {
            data = data + it.eval(runtime)
        }
        println(data.toString())
        return StringData(data)
    }
}

enum class Operator {
    ADD,
    SUB,
    MUL,
    DIV
}

class Arith(
    val op:Operator,
    val left:Expr,
    val right:Expr,
) : Expr() {
    override fun eval(runtime:Runtime):Data {
        val x = left.eval(runtime)
        val y = right.eval(runtime)
        if(x is IntData && y is IntData) {
            return IntData(
                when(op) {
                    Operator.ADD -> x.value + y.value
                    Operator.SUB -> x.value - y.value
                    Operator.MUL -> x.value * y.value
                    Operator.DIV -> x.value / y.value
                }
            )
        } else if(x is StringData && y is IntData) {
            if(op == Operator.MUL){
                return StringData(x.value.repeat(y.value))
            } else {
            throw Exception("Operation not supported")
        }
        }
        else {
            throw Exception("Operation not supported")
        }
    }
}

enum class CmpOperators {
    LT,
    GT,
    EQ,
    LTE,
    GTE
}

class Cmp(
    val op:CmpOperators,
    val left:Expr,
    val right:Expr
) : Expr() {
    override fun eval(runtime:Runtime): Data {
        val x:Data = left.eval(runtime)
        val y:Data = right.eval(runtime)
        if(x is IntData && y is IntData) {
            val result = when(op) {
                CmpOperators.LT -> x.value < y.value
                CmpOperators.GT -> x.value > y.value
                CmpOperators.EQ -> x.value == y.value
                CmpOperators.LTE -> x.value <= y.value
                CmpOperators.GTE -> x.value >= y.value
            }
            return BooleanData(result)
        } else {
            throw Exception("Both Values must be of IntData to compare")
        }
    }
}

class Concat(val expr1: Expr, val expr2: Expr): Expr(){
    override fun eval(runtime:Runtime):Data {
        var expression1 = expr1.eval(runtime)
        var expression2 = expr2.eval(runtime)
        if(expression1 is StringData && expression2 is StringData){
            return StringData(expression1.value + expression2.value)
        }else{
            throw RuntimeException("Error: Both operands of Concatenate operation must be of type string")
        }
    }
}

class For(val name: String, val startRange: Expr, val endRange: Expr, val body: Expr): Expr() {
    override fun eval(runtime:Runtime): Data {
        Assign("Int", name, startRange).eval(runtime)
        var counter = IdentifierExpr(name)
        while((Cmp(CmpOperators.LTE, counter, endRange).eval(runtime) as BooleanData).value) {
            body.eval(runtime)
            Reassign(name, Arith(Operator.ADD, counter, IntLiteral("1"))).eval(runtime)
            counter = IdentifierExpr(name)
            
        }
        return None
    }
}

class Ifelse(
    val cond: Expr,
    val trueExpr: Expr,
    val falseExpr: Expr,
) : Expr() {
    override fun eval(runtime:Runtime): Data {
        val result = cond.eval(runtime) as BooleanData
        return if(result.value) {
            trueExpr.eval(runtime)
        } else {
            falseExpr.eval(runtime)
        }
    }
}

class Declare(
    val name: String,
    val returnType: String,
    val parameters: List<String>,
    val body: Expr,
) : Expr() {
    override fun eval(runtime:Runtime):Data {
        val funcdata = FuncData(name, returnType, parameters, body)
        runtime.symbolTable[name] = funcdata
        return None
    }
}

class Invoke(
    val funcname: String,
    val arguments: List<Expr>,
) : Expr() {
    override fun eval(runtime:Runtime): Data {
        val f = runtime.symbolTable[funcname]
        if(f == null) {
            throw Exception("$funcname does not exist.")
        }
        if(f !is FuncData) {
            throw Exception("$funcname is not a function.")
        }
        if(arguments.size != f.parameters.size) {
            throw Exception("$funcname expects ${f.parameters.size} arguments, but ${arguments.size} given.")
        }
        
        // evaluate each argument to a data
        val argumentData = arguments.map {
            it.eval(runtime)
        }
        // create a subscope and evaluate the body using the subscope
        val returnData:Data = f.body.eval(runtime.subscope(
            f.parameters.zip(argumentData).toMap()
        ))
        if(f.returnType == "String"){
            if(returnData is StringData){
                return returnData
            }else{
               throw Exception("Final value of $funcname was expecting type String")
            }
        } else if(f.returnType == "Int"){
            if(returnData is IntData){
                return returnData
            }else{
                throw Exception("Final value of $funcname was expecting type Int")
            }
        } else if(f.returnType == "Boolean"){
            if(returnData is BooleanData){
                return returnData
            }else{
                throw Exception("Final value of $funcname was expecting type Boolean")
            }
        } else{
            throw Exception("Defined Function type is invalid")
        }
        
    }
}
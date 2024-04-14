package backend

class Runtime() {
    val symbolTable:MutableMap<String, Data> = mutableMapOf()

    fun subscope(bindings:Map<String, Data>):Runtime {
        val parentSymbolTable = this.symbolTable
        return Runtime().apply {
            symbolTable.putAll(parentSymbolTable)

            for((key, item) in bindings){
                 var tmp = key.split(" ")
                 if(tmp[0]  == "String"){
                    if(item is StringData){
                        val v:StringData = item
                        symbolTable.put(tmp[1], v)
                        }else{
                           throw Exception("${tmp[1]} was expecting type String")
                        }
                    }else if(tmp[0]  == "Int"){
                        if(item is IntData){
                            val v:IntData = item
                            symbolTable.put(tmp[1], v)
                        }else{
                            throw Exception("${tmp[1]} was expecting type Int")
                        }
                    }else if(tmp[0]  == "Boolean"){
                        if(item is BooleanData){
                            val v:BooleanData = item
                            symbolTable.put(tmp[1], v)
                        }else{
                            throw Exception("${tmp[1]} was expecting type Boolean")
                        }
                    } else{
                        throw Exception("Invalid type")
                    }
            }
            
        }
    }

    override fun toString():String =
        symbolTable.map { 
            entry -> "${entry.key} = ${entry.value}"
        }.joinToString("; ")
}



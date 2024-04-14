package backend

abstract class Data

class IntData(val value:Int): Data() {
    override fun toString(): String = "$value"
}

class StringData(val value:String): Data() {
    override fun toString(): String = "$value"
}

class BooleanData(val value:Boolean): Data() {
    override fun toString() = "${value}"
}

class FuncData(
    val name: String,
    val returnType: String,
    val parameters: List<String>,
    val body: Expr,
) : Data() {
    override fun toString()
    = parameters.joinToString(", ").let {
        "$name($it)"
    }
}

object None:Data() {
    override fun toString() = "None"
}
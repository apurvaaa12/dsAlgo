//same as static final in java
const val pi = 3.14

fun main() {
    var name: String = "Apurva"
    var age: Int = 25
    println("name: {$name}, age: {$age}")
    var salary: Any = false;
    println(salary)

    //Var - change the contents of the variable once it's assigned
    var nameVar="lol"
    nameVar = "Apurva"
    //val - can not perform the exact same thing
    //Val can not be reassigned
    //Immutable ~~ final string brand = "lol'
    val nameVal = "lol"
//    nameVal = "Apurva"

    println(pi)

    // '?' will allow the null values
    var myName : String? = "Apurva";
//    var myName : String? = null;
//    myName =null
    println(myName?.uppercase())
    println(myName?.get(4) ?: null)


    var email = """
        Hello
        how are you? %s
        all well?
    """.trimIndent()

    println(email.format("Apurva"))


    val one  = "Hey"
    val two = "bye"
    println(one == two)
    println(one .equals(two))
    val three = String("Third".toCharArray())
}


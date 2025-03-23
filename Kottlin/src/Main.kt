fun main(args : Array<String>) {
    println("Hello World!")

    //Lists are by default mutable in kotlin
    //You can not add another element to the list
    //If you want to add another element to the list you must make it mutableListOf
    val list = listOf("Apurva","Akshith")
    println(list)

    var listMutable = mutableListOf("Apurva","Akshith")
    listMutable.add("Papa")
    listMutable.add("Momsi")
    println(listMutable)

    for(i in 1..5){
        println(i)
    }

    for(i in 1 until 5){
        println(i)
    }

    println("Program arguments: ${args.joinToString()}" )
    printing("Apurva")
    name = "lol"
}

fun printing(name : String){
    println("My name is : $name")
}

var name : String? = null
    get() {
        TODO()
    }
val names : String?
    get() {
        TODO()
    }
fun main(){
    var text= "AkiraChix"
    print(text[0])
    print(text[2])
    println(text[5])

    var x=statement("Ngata",21)
    println(x)
var y=word("Friday")
    println(y.length)
    var d=identity("Star")


}
fun statement(a:String,b:Int):String{
    var statement="Hi my name is $a and I'm $b years old"
    return statement
}
fun word(c:String):String{
    var c="Friday"
    return c
}
fun identity(name:String) {
    if (name == "Star")
        println("Thats me")
    else
        println("I don't know who that is")

}




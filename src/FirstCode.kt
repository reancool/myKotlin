/**
 * Created by fly on 2017/7/8.
 */
fun main(args: Array<String>)
{
    var str: String ?=null;
//    var titu =Alien();
    var titu =AlienKt();
//    println(titu.name?.length)
//    println(titu.name)


    val num : Int =2;
    when (num){
        1-> println("one")
        2-> println("two")
        3-> println("three")
        else-> println("nothing")
    }

    var str2=when(num){
        1-> "two"
        2->"three"
        else -> {
            "nothing"
        }
    }
    println("str2 is ${str2}")
}
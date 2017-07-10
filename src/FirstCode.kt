import java.math.BigInteger
import java.util.*

/**
 * Created by fly on 2017/7/8.
 */
class Human (var n: String){

    var name:String=n
    var age:Int=0
    constructor(age:Int,name:String):this(name){
        this.age=age
    }
    fun think(){
        println("I'm thinking  ${name} --$age")
    }
}

fun main(args: Array<String>)
{
 var h =Human(name = "fly",age=25)
    h.think()


}









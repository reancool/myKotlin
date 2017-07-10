import java.math.BigInteger
import java.util.*

/**
 * Created by fly on 2017/7/8.
 */
open class Human{

    open fun think(){
        println("real Thinking")
    }
}
class Alien2 : Human()
{
    override fun think() {
        super.think()
        println("vitrual Thinking")
    }
}
fun main(args: Array<String>)
{
 var h =Alien2()
    h.think()


}









import java.math.BigInteger
import java.util.*

/**
 * Created by fly on 2017/7/8.
 */
abstract class Human(){
   abstract fun think()
    fun talk(){

    }
}
class Doctor:Human(){
    override fun think() {
        println(" docker")
    }
}

fun main(args: Array<String>)
{
 var h =Doctor()
    h.think()


}









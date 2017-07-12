import java.math.BigInteger
import java.util.*

/**
 * Created by fly on 2017/7/8.
 */
class A
{
    companion object {

        fun create():A=A()
    }


    fun show()
    {
        println("in  show")
    }
}

fun main(args: Array<String>)
{
    var obj=A.create()
    obj.show()

//    var obj=A()
//    obj.show()

}









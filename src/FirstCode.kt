import java.util.*

/**
 * Created by fly on 2017/7/8.
 */
fun main(args: Array<String>)
{
    var str: String="4a"
    var num:Int=

    try {
       str.toInt()
    } catch(e: NumberFormatException) {
        -1
    }
    num++
    println(num)
}

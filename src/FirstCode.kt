import java.util.*

/**
 * Created by fly on 2017/7/8.
 */
fun main(args: Array<String>)
{
    var nums= listOf(1,2,3)
    for ((i,e) in nums.withIndex()){
        println("index--${i}-value-${e}")
    }

    var map = TreeMap<String, Int>()
    map["Navin"]=543
    map["Kishor"]=666

    for ((name,age)in map)
    {
        println("${name}--${age}")
    }
}
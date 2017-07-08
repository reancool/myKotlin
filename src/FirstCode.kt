import java.util.*

/**
 * Created by fly on 2017/7/8.
 */
fun main(args: Array<String>)
{
    println("a+b=${add(5,6)}")
    println("max=${max(5,6)}")
}
fun add(a:Int,b:Int) : Int{
    return  a+b
}
fun max(a:Int,b:Int):Int{
    if(a>b){
        return a
    }else{
        return b
    }
}
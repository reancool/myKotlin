import java.math.BigInteger
import java.util.*

/**
 * Created by fly on 2017/7/8.
 */
fun main(args: Array<String>)
{
    var num=7
    var fact=1
    for (i in 1..num    ){
        fact=fact*i
    }
    println(fact)

    println(fact(num))

    var bNum=BigInteger("70")
    println(factB(bNum))

    var bbNum=BigInteger("70")
    println(factBB(bbNum, BigInteger.ONE))

}
fun fact(num:Int):Int{
    if(num==0)
        return 1
    else
        return num*fact(num-1)
}

fun factB(num:BigInteger):BigInteger{
    if(num==BigInteger.ZERO)
        return BigInteger("1")
    else
        return num* factB(num-BigInteger.ONE)
}

fun factBB(num:BigInteger,result:BigInteger):BigInteger{
    if(num==BigInteger.ZERO)
        return BigInteger("1")
    else
        println("hello "+num)
        return num* factBB(num-BigInteger.ONE,num*result)
}








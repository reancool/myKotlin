import java.util.*

/**
 * Created by fly on 2017/7/8.
 */
fun main(args: Array<String>)
{
    var finalAmt=calaAmount(50,0.03)
    var finalAmt2=calaAmount(interest=0.03,amt=60)
    println("finalAmt is ${finalAmt}")
    println("finalAmt2 is ${finalAmt2}")

}
@JvmOverloads
fun calaAmount(amt:Int,interest:Double=0.04) :Double{
    return amt+amt*interest
}
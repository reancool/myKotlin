import java.util.*

/**
 * Created by fly on 2017/7/8.
 */
fun main(args: Array<String>)
{
   var a1=AlienKt()
    a1.skills="Java"
    a1.show()

    var a2=AlienKt()
    a2.skills="SQL"
    a2.show()

    var a3=a1.plus(a2)
    a3.show()

}

fun AlienKt.plus(a:AlienKt):AlienKt{
    var newAlien=AlienKt()
    newAlien.skills=this.skills+" "+a.skills
    return newAlien
}
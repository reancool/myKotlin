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

    var a3=a1.pluss(a2)
    a3.show()

    var a4=a1 plusI a2
    a4.show()

    var a5=a1 + a2
    a5.show()
}

fun AlienKt.pluss(a:AlienKt):AlienKt{
    var newAlien=AlienKt()
    newAlien.skills=this.skills+" "+a.skills
    return newAlien
}

infix fun AlienKt.plusI(a:AlienKt):AlienKt{
    var newAlien=AlienKt()
    newAlien.skills=this.skills+" "+a.skills
    return newAlien
}
operator infix fun AlienKt.plus(a:AlienKt):AlienKt{
    var newAlien=AlienKt()
    newAlien.skills=this.skills+" "+a.skills
    return newAlien
}



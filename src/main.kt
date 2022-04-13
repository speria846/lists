
fun main() {
    var m=numbers(listOf("maga","junoir","adan","damnin","wengon","qeen","krist","speria","daean","ferado"))
println(m)
    var ma= listPerson(listOf(23,42,56,13,57,64,65))
    println(ma)
var ca=character("speria",22,56,34.3)
    var na=character("dall",34,45,63.1)
    var ba=character("shimon",23,52,26.4)
    var list=listOf(ca,na,ba)
    var result=list.sortedByDescending { a->a.age }
    println(list)
    var d=car("ua232ln",68.4)
    var s=car("UAerts",45.7)
    var n=car("Ku2451",34.5)
var all=listOf(d,s,n)
    println(vehicle(all))

    }

fun numbers(names:List<String>): MutableList<String> {
   var list= mutableListOf<String>()
    names.forEachIndexed{index,a->
       if(index %2  ==0)
           list.add(a)
    }
    return list
}
fun listPerson(people:List<Int>): List<Any> {
    var a = people.average()
    var b = people.sum()
    var c = listOf(a, b)
return c
}

 class character(var name:String,var age:Int,var height:Int, var weight:Double){

}

data class car(var registration:String,var mileage:Double)
fun vehicle(galax:List<car>):Double{
    var sum=0.0
    var x=galax.count()
    galax.forEach{c->
        sum+=c.mileage

    }
    return sum
}
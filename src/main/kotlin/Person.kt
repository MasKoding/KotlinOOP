class Person{
    var firstName:String=""
    var lastName:String=""
}

fun main(){
    var nama1 = Person()
    var nama2 = Person()
    var nama3 = Person()

    nama1.firstName = "Steve"
    nama1.lastName = "Job"

    nama2.firstName = "Bill"
    nama2.lastName = "Gates"

    nama3.firstName = "Mark"
    nama3.lastName = "Zuckenberg"

    println("${nama1.firstName} ${nama1.lastName}")
    println("${nama2.firstName} ${nama2.lastName}")
    println("${nama3.firstName} ${nama3.lastName}")
}
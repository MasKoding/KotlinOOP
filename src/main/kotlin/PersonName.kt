class PersonName(paramfirstName:String,paramMidName:String,paramLastName:String) {
    val firstName = paramfirstName
    val midName = paramMidName
    val lastName = paramLastName

    init{
        print("Nama Lengkap:")
    }

}
fun main(){
    val personName = PersonName("Anda","Sudah","hebat")
    println("${personName.firstName} ${personName.midName} ${personName.lastName}  ")
    val personName2 = PersonName("Kerja","Bagus","hebat")
    println("${personName2.firstName} ${personName2.midName} ${personName2.lastName}  ")

}
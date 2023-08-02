class Car(paramBrand:String,paramYear:Int=2020) {
    val brand:String = paramBrand
    val year:Int = paramYear
//   initializer block : fungsi pertama di eksekusi ketika object dibuat
    init {
            println("Object Car Dibuat")
    }
}
fun main(){
    var car1 = Car("Almaz",2022)
    println("Brand : ${car1.brand}")
    println("Year : ${car1.year}")
    // buat objek car2 isi brand Toyota dan tahun 2020
    var car2 = Car("Toyota")
    println("Brand : ${car2.brand}")
    println("Year : ${car2.year}")
}

/**
 *  Buatlah class PersonName(firstName,middleName,lastName)
 *  Buatlah 2 object isi namanya bebas
 *   Nama Lengkap: Anda Sudah hebat
 *   Nama Lengkap: Kerja Bagus Sekali
 */

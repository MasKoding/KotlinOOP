class GameSederhanaSuit {
    val playerName:String
    var score:Int = 0
    var opsi1:String=""
    var opsi2 = listOf("B","G","K")
    var status:String=""

    constructor(paramPlayerName:String){
        playerName=paramPlayerName
    }
    fun increamentScore(){
        score+=10
        println("Score : $score")
    }
    fun decreamentScore(){
        score-=10
        println("Score: $score")
    }
    fun gameStart(){
        // game akan jalan terus ketika di mulai
        while (true){
            print("Apakah Anda ingin bermain (Y/N):")
            var start:String= readLine()!!.toString()
            when(start){
                "Y"->suit()
                else->break
            }
        }
    }
    fun suit(){
        print("Masukkan Pilihan Anda (B/G/K):")
        opsi1 = readLine()!!.toString()
        // fungsi shuffled adalah untuk merubah urutan array secara random
        // ambil index 0
        var computerOpsi = opsi2.shuffled()[0]
        println("Computer Memilih : $computerOpsi")

        when(opsi1){
//KONDISI PERTAMA
            "B"->when(computerOpsi){
                "G"->{
                    status="Win"
                    increamentScore()
                }
                "B"->{
                    status="Draw"
                }
                "K"->{
                    status="Lose"
                    decreamentScore()
                }
            }
//            KONDISI KEDUA
            "G"->when(computerOpsi){
                "G"->{
                    status="Draw"

                }
                "B"->{
                    status="Lose"
                    decreamentScore()
                }
                "K"->{
                    status="Win"
                    increamentScore()
                }
            }
//            KONDISI KETIGA
            "K"->when(computerOpsi){
                "G"->{
                    status="Lose"
                    decreamentScore()
                }
                "B"->{
                    status="Win"
                    increamentScore()
                }
                "K"->{
                    status="Draw"
                }
            }
        }
            println("Status : $status")
    }
}

fun main(){
    print("Masukkan Nama Anda:")
    var nama:String = readLine()!!.toString()
    var gameSederhanaSuit = GameSederhanaSuit(nama)
    gameSederhanaSuit.gameStart()
}

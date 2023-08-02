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


}
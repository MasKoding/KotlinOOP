class GameSederhanaSuit {
    val playerName:String
    var score:Int = 0
    var opsi1:String=""
    var opsi2 = listOf("B","G","K")

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

}
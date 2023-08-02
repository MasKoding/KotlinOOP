class GamePlayer {
    var score:Int
    var playerName:String

    constructor(paramScore:Int,paramPlayerName:String){
        score = paramScore
        playerName = paramPlayerName
    }

    fun changePlayerName(name:String){
        playerName = name
        println(" $playerName  win with score $score")
    }
    fun changeScore(paramScore:Int){
        score = paramScore
        println(" $playerName  win with score $score")
    }
}

fun main(){
    var gamePlayer = GamePlayer(20,"Paul")
    gamePlayer.changePlayerName("John")
    gamePlayer.changeScore(80)

}
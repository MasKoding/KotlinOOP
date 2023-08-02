class Game(play:Boolean?,score:Int,playerName:String) {

    constructor(paramScore:Int,paramPlayerName:String)
      : this(null,paramScore,paramPlayerName){
          println("Score: $paramScore")
          println("Player Name: $paramPlayerName")
      }
}
fun main(){
    // panggil object game
    Game(paramScore = 20, paramPlayerName = "Steve")

}
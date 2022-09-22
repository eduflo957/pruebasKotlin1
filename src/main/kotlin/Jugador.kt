/****CLASES VIDEOJUEGO***************/
class Jugador {
    var nombre = ""
    var numPartidasJugadas = 0
    var numHorasJugasas = 0
    var numKills = 0
    var numDead = 0
    var ratioKillDead = numKills.toFloat()/numDead.toFloat()

    constructor (nombre : String, numPartidasJugadas : Int, numHorasJugasas : Int, numKills : Int, numDead : Int) {
        this.nombre = nombre
        this.numPartidasJugadas = numPartidasJugadas
        this.numHorasJugasas = numHorasJugasas
        this.numKills = numKills
        this.numDead = numDead
        this.ratioKillDead = ratioKillDead
    }
    constructor()
    override fun toString(): String {
        return "jugador(nombre='$nombre', numPartidasJugadas=$numPartidasJugadas, numHorasJugasas=$numHorasJugasas, numKills=$numKills, numDead=$numDead, ratioKillDead=$ratioKillDead)"
    }

}
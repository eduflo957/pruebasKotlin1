fun main(args: Array<String>) {
    println("Hello World")
    //var es la variables
    //val es una constante
    //si declaras la variables, siempre va a tener que ser así
    //pero si no la declaras, luego la puedes modificar
    val textVariable = "texto";
    val y = 3
    val x = 2
    val num = y + x
    println("el numero es $num")

    //Se puede declarar variables nulas
    val variable3: Int? = null
    val pizza : Int? = 4

    when (pizza) {
        0 -> println("$pizza es igual a 0 ")
        in 1..99 -> println("$pizza es un número comprendido entre 0 y 99")
        100,101 -> println("$pizza es 100 o 101")
        else -> println("$pizza es menor de 0 y mayor de 101")
    }

    //Es posible combinar con el resultado de realizar ciertas acciones sobre las variables.
    // Para ello tenemos utilizar la combinación ${} Mirar también el casting
    println("La variable1 tiene el valor en Float de ${num.toFloat()}")

    ///////////////////////////////////////////////////////////////////////////
    //TODO Crea una constante de Tipo Long y dale el valor 13.
    //TODO Usa print() para escribir por pantalla (utiliza la variable):
    //TODO “El número 13 es mi número favorito”.
    //TODO Transforma la variable en un Double y usa println() para escribir por pantalla:
    //TODO “Sin embargo, 13.0…
    //TODO no me gusta”.

    var numero: Long = 13
    println(numero)
    println("Mi número favorito es el $numero")
    println("Sin embargo ${numero.toDouble()} no me gusta")
/////////////////////////////////////////////////////////////////////////////////
    /*println(funReturningString(15))
    transformarIntADouble(x);
    println(diEdad ("edu",27))
    println(sumaStrings("1","2"))
    calcularPrecio(20,"Edu")
    println(positNegat(4))
    println(parImpar (5))
    probarNulos(1,2,3,4);
    probarNulos(1,2,3,null);*/
    println("Empezamos con bucles")
    funRepeat1();
    repeatTorre();
    val array = arrayOf("hola", "adios")
    print(array.contentToString()) //También se puede con joinToString
    pruebaListas()
}

fun funReturningString(param1: Long): String {
    return "Esta función devuelve este texto y un $param1"
}

fun funWithParams(number: Int) : String{
    return "=== Soy la función funWithParams ==="
    return "He recibido el número recibido $number"
}

//Hay que ponerle el formato de la salida
fun transformarIntADouble(num : Int) : Double {
    return num.toDouble();
}

//Crea una función que reciba un String con el nombre de una persona
//y un número y devuelva un String que diga “Soy {nombre de la persona}, y tengo {número} años”. Llámala “diEdad”.
fun diEdad (nombre : String, num : Int) : String {
    return "soy $nombre, y tengo $num años"
}

fun sumaStrings (texto1: String, texto2: String): Double {
    return texto1.toDouble()+texto2.toDouble()
}

fun calcularPrecio (edad : Int, nombre : String){
    if (edad == 18) println("$nombre, debes abonar 5€")
    if (edad>18 && edad<65) println("$nombre debes abonar 10€")
    if (edad>65) println("$nombre para ti es gratis")
}

fun positNegat (num : Int) : Float {
    var numReturn : Int = 0
    if (num > 0)
        numReturn = (num*2)+3
    else if (num < 0)
        numReturn = (num/3)-3
    else
        numReturn = 0
    return numReturn.toFloat()
}

fun parImpar (num : Int) : String {
    if (num % 2 == 0)
        return "$num es par"
    else
        return "$num es impar"
}

fun probarNulos (num1:Int?, num2:Int?, num3:Int?, num4:Int?) : Int? { //Si ponemos ? significa que acepta nulos
    if (num1 == null || num2 == null || num3 == null || num4 == null) {
        return null;
    } else {
        return num1 + num2 + num3 + num4;
    }
}

fun funRepeat1 (){
    val repetition:Int = 3
    repeat (repetition) {
        println ("Estoy repitiendo esto por $it vez de un total de $repetition")
    }
}

fun repeatTorre () {
    val altura:Int = 10
    val pisos:Int = 4
    val techo:Int = pisos*2
    repeat(techo) {
        print("__")
    }
    print("\n")
    repeat(altura) {
        repeat(pisos) {
            print("|__|")
        }
        print("\n")
    }
}

fun repeatPiramide () {
    val longitud:Int = 10
    //Hacer en casa
}

fun pruebaListas () //Revisar en casa{
//val listaAnimales = mutableListOf("Perro", "Gato", "Hamster")
val listaRandom = mutableListOf<Int>()
repeat (100) {
    listaRandom.add(Math.random().toInt())
}
print(listaRandom.toString())
}


/*

    for ((element, index) in lista.withIndex()){
        print("$element,$index")
    }*/
import java.util.*

fun main() {
    var palabras = ArrayList<String>()
    var sc = Scanner(System.`in`)
    println("Ingrese cantidad de palabras a ingresar: ")
    var opc = sc.nextInt()
    opc = opc + 1
    var whi = 0
    while (whi < opc) {
        val m = sc.nextLine()
        palabras.add(m)
        whi = whi+1
    }
    for (i in 1..opc){
        var sc = Scanner(System.`in`)
        var x = palabras[i-1]
        var test = x
        var contvoca = 0
        var iguales = 0
        var contvoce = 0
        var contvoci = 0
        var contvoco = 0
        var contvocu = 0
        var y = x.length
        var reves:String = ""
        for(i in 1..y) {
            reves = x[i-1].toString() + reves
            if (x[i-1] == 'a'){
                contvoca = contvoca + 1
            }else if(x[i-1] == 'e'){
                contvoce = contvoce + 1
            }else if(x[i-1] == 'i'){
                contvoci = contvoci + 1
            }else if(x[i-1] == 'o'){
                contvoco = contvoco + 1
            }else if(x[i-1] == 'u'){
                contvoco = contvocu + 1
            }
        }
        if (contvoca >= 1){
            iguales = iguales + 1
        }
        if (contvoce >= 1){
            iguales = iguales + 1
        }
        if (contvoci >= 1){
            iguales = iguales + 1
        }
        if (contvoco >= 1){
            iguales = iguales + 1
        }
        if (contvocu >= 1){
            iguales = iguales + 1
        }
        if (test != "") {
            if (test.compareTo(reves) == 0) {
                println("La palabra $reves es palindroma")
            }
            if (iguales >= 2) {
                println("la palabra $test contiene almenos 2 vocales distintas")
            }
        }
        if (!test.startsWith('a') && !test.startsWith('e') && !test.startsWith('i') && !test.startsWith('o') && !test.startsWith('u')) {
            println("La palabra $test empieza con consonante o numero")
        }
    }
}
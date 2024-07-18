import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    var par:String = " ";
    var residuo = 0;
    println("Ingrese su valor: ")
    var x = sc.nextInt()
    while (x > 1){
        residuo = x % 2
        par = residuo.toString() + par
        x = x/2
    }
    println("1" + par)
}
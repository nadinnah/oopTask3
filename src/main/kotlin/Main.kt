import java.util.Scanner
fun main() {
    val scn= Scanner(System.`in`)
    println("Enter the bmw details")
    val bmw= BMW(scn.nextLine(),scn.nextLine(), scn.nextInt())
    println("BMW model: ${bmw.model} \nBMW colour: ${bmw.colour} \nBMW speed: ${bmw.speed} ")
    scn.nextLine()
    println("BMW fuel type: ${bmw.getFuelType()}")

    println("Enter the tesla details")
    val tesla= Tesla(scn.nextLine(),scn.nextLine(), scn.nextInt())
    println("Tesla model: ${tesla.model} \nTesla colour: ${tesla.colour} \nTesla speed: ${tesla.speed} ")
    scn.nextLine()
    println("Tesla fuel type: ${tesla.getFuelType()}")

}
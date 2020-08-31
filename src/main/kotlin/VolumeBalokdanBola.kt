import java.awt.SystemColor.menu
import java.util.Scanner;

public var input = Scanner(System.`in`)

fun main() {
    //membuat objek scanner
    val input = Scanner(System.`in`)

    //Menginputkan Identitas
    println("Identitas")
    print("Nama: ")
    val nama: String? = input.nextLine()
    if(nama.isNullOrEmpty()){
        println("Mohon diisi")
        main()
    }
    print("Kelas: ")
    val kelas: String? = input.nextLine()
    if(kelas.isNullOrEmpty()){
        print("Mohon Diisi")
        main()
    }
    print("Absen: ")
    val absen: String? = input.nextLine()
    println(" ")

    print("GitHub:")
    val git: String? = null
    val gitLength = git?.length ?: "EkaVerantina"
    println(gitLength)

    println("|--MENGHITUNG BANGUN RUANG--|")
    println("|1. Volume Balok\t\t\t|")
    println("|2. Volume Bola \t\t\t|")
    print("Masukan Menu Pilihan : ")
    val menu = readLine()

    when (menu) {
        "1" -> {
            println(" ")
            println("---Volume Balok---")
            print("Masukan Panjang Balok : ")
            val p: Double = input.nextDouble()
            print("Masukan Lebar Balok   : ")
            val l: Double = input.nextDouble()
            print("Masukan Tinggi Balok  : ")
            val t: Double = input.nextDouble()

            //menghitung Balok
            val vt: Double = p * l * t;

            //cetak hasil
            println(" ")
            println("Volume Balok adalah = ")
            System.out.printf("%.2f", vt);
            println()

            //kembali ke menu
            print("Kembali ke menu [Y/N] : ")
            val next2 = readLine()
            if(next2=="Y" || next2=="y"){
                main()
            }
            else{
                print("Press Enter Key To Exit")
            }

        }
        "2" -> {
            println(" ")
            println("---Volume Bola=---")
            print("Masukan jari-jari Bola : ")
            val r: Double = input.nextDouble()

            //menghitung Bola
            val vb: Double = 4/3 * Math.PI * r * r * r;

            //cetak hasil
            println(" ")
            println("Volume Bola adalah = ")
            System.out.printf("%.2f", vb);
            println()

            //kembali ke menu
            print("Kembali ke menu [Y/N] : ")
            val next1 = readLine()
            if(next1=="Y" || next1=="y"){
                main()
            }
            else{
                print("Press Enter Key To Exit")
            }

        }
        else-> {
            println("Menu Tidak Tersedia")
        }
    }
}
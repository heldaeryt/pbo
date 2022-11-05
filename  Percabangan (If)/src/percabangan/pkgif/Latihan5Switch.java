/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percabangan.pkgif;

/**
 *
 * @author ACER
 */
import java.util.Scanner;

public class Latihan5Switch {
    public static void main(String[] args) {
      int noHari;
      Scanner hari = new Scanner (System.in).useDelimiter("\n");
        System.out.print("Masukkan Nomor Hari : ");
        noHari = hari.nextInt();
      
      switch(noHari){
        case 1:
            System.out.println("Hari ke-" + noHari + " adalah Minggu");
            break;
        case 2:
            System.out.println("Hari ke-" + noHari + " adalah Senin");
            break;
        case 3:
            System.out.println("Hari ke-" + noHari + " adalah Selasa");
            break;
        case 4:
            System.out.println("Hari ke-" + noHari + " adalah Rabu");
            break;
        case 5:
            System.out.println("Hari ke-" + noHari + " adalah Kamis");
            break;
        case 6:
            System.out.println("Hari ke-" + noHari + " adalah Jumat");
            break;
        case 7:
            System.out.println("Hari ke-" + noHari + " adalah Sabtu");
            break;
        default:
            System.out.println("Tidak ada hari ke-" + noHari);
    }
    }
}

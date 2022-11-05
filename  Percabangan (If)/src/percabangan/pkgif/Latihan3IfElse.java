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

public class Latihan3IfElse {
    public static void main(String[] args) {
     int nilai1, nilai2, nilai3;
    Scanner inputan = new Scanner (System.in).useDelimiter("\n");
    
        System.out.print("Masukkan Nilai 1 = ");
        nilai1 = inputan.nextInt();
        System.out.print("Masukkan Nilai 2 = ");
        nilai2 = inputan.nextInt();
        System.out.print("Masukkan Nilai 3 = ");
        nilai3 = inputan.nextInt();
    
        if((nilai1 > nilai2) && (nilai1 > nilai3)){
            System.out.println("Nilai 1 terbesar");
        } else if ((nilai2 > nilai1) && (nilai2 > nilai3)){
            System.out.println("Nilai 2 terbesar");
        } else if ((nilai3 > nilai1) && (nilai3 > nilai2)){
            System.out.println("Nilai 3 terbesar");
    } else {
            System.out.println("Semua nilai sama besar.");
        }
    }
}

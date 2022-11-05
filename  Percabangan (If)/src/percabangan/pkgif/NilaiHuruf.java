/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percabangan.pkgif;

import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class NilaiHuruf {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        
        System.out.print("Masukkan Nilai = ");
        int nilai = inp.nextInt();
        
        if (nilai > 0 && nilai <= 55) {
            System.out.println("Anda mendapat nilai E");
        } else if (nilai > 56 && nilai <= 65) {
            System.out.println("Anda mendapat nilai D");
        } else if (nilai > 66 && nilai <= 75) {
            System.out.println("Anda mendapat nilai C");
        } else if (nilai > 76 && nilai <= 85) {
            System.out.println("Anda mendapat nilai B");
        } else if (nilai > 86 && nilai <= 100) {
            System.out.println("Anda mendapat nilai A");
        } else {
            System.out.println("Error");
        }
    }
}

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
public class Zodiak {
    public static void main(String[] args) {
        Scanner inputan = new Scanner (System.in);
        int zodiak;
        System.out.print("Masukkan zodiak anda (angka) = ");
        zodiak = inputan.nextInt();
    
    switch (zodiak) {
        case 1: 
            System.out.println("Zodiak : Capricorn");
            break;
        case 2:
            System.out.println("Zodiak : Aquarius");
            break;
        case 3:
            System.out.println("Zodiak : Pisces");
            break;
        case 4:
            System.out.println("Zodiak : Aries");
            break;
        case 5:
            System.out.println("Zodiak : Taurus");
            break;
        case 6:
            System.out.println("Zodiak : Gemini");
            break;
        case 7:
            System.out.println("Zodiak : Cancer");
            break;
        case 8:
            System.out.println("Zodiak : Leo");
            break;
        case 9:
            System.out.println("Zodiak : Virgo");
            break;
        case 10:
            System.out.println("Zodiak : Libra");
            break;
        case 11:
            System.out.println("Zodiak : Scorpio");
            break;
        case 12:
            System.out.println("Zodiak : Sagitarius");
            break;
        default:
            System.out.println("Tidak Ada Zodiak");
    }
    }
}

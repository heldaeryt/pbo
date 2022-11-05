/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo3;

import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in).useDelimiter("\n");
        int sisi;
        System.out.println("Pilih Metode");
        System.out.println("1. Menghitung Luas Persegi");
        System.out.println("2. Menghitung Keliling Persegi");
        System.out.print("Pilihan : ");
        int pilihan = input.nextInt();
        
        switch(pilihan) {
            case 1:
                System.out.print("Masukkan panjang sisi persegi : ");
                sisi = input.nextInt();
                System.out.println("Luas persegi adalah "+ sisi * sisi +" cm");
                break;
            case 2:
                System.out.print("Masukkan panjang sisi persegi : ");
                sisi = input.nextInt();
                System.out.println("Keliling persegi adalah "+ 4 * sisi +" cm");
                break;
            default:
                System.out.println("Sistem Error");
        }
    }
}

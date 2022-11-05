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
public class DiskonBelanja {
    public static void main(String[] args) {
        Scanner inputan = new Scanner (System.in);
        
        int harga;
        int jumlah;
        int diskon;
        int total;
        
        System.out.print("Masukkan harga barang  = ");
        harga = inputan.nextInt();
        System.out.print("Masukkan jumlah barang = ");
        jumlah = inputan.nextInt();
        total = jumlah*harga;
        
        if (total < 100000) {
            diskon = total*0/100;
            total = total-diskon;
            System.out.println("Maaf anda tidak mendapatkan diskon");
            System.out.println("Jadi totalnya = " +total);
        }
        else if (total <= 500000) {
            diskon = total*10/100;
            total = total-diskon;
            System.out.println("Selamat anda mendapatkan diskon 10%");
            System.out.println("Jadi totalnya " +total);
        }
        else if (total <= 1000000) {
            diskon = total*20/100;
            total = total-diskon;
            System.out.println("Selamat anda mendapatkan diskon 20%");
            System.out.println("Jadi totalnya " +total);
        }
        else if (total > 1000000) {
            diskon = total*30/100;
            total = total-diskon;
            System.out.println("Selamat anda mendapatkan diskon 30%");
            System.out.println("Jadi totalnya = " +total);
        }
    }
}

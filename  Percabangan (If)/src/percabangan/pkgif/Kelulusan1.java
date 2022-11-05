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
public class Kelulusan1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        String nama;
        String nim;
        int nilai;
        
        System.out.print("Masukkan Nama Anda = ");
        nama = inp.next();
        
        System.out.print("Masukkan NIM       = ");
        nim = inp.next();
        
        System.out.print("Masukkan Nilai     = ");
        nilai = inp.nextInt();
        
        if(nilai >= 55) {
            System.out.println("Selamat anda lulus");
        } else {
            System.out.println("Anda tidak lulus");
        }
    }
}

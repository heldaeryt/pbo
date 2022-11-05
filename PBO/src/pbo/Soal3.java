/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;

import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Soal3 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner (System.in).useDelimiter("\n");
        String nama;
        String nim;
        String semester;
        String kelas;
        
        System.out.print("Masukkan Nama     : ");
        nama = inputan.nextLine();
        System.out.print("Masukkan NIM      : ");
        nim = inputan.nextLine();
        System.out.print("Masukkan Semester : ");
        semester = inputan.nextLine();
        System.out.print("Masukkan Kelas    : ");
        kelas = inputan.nextLine();
        
        System.out.println("-----Hasil------");
        
        System.out.println("Nama     : " +nama);
        System.out.println("NIM      : " +nim);
        System.out.println("Semester : " +semester);
        System.out.println("Kelas    : " +kelas);
    }
}

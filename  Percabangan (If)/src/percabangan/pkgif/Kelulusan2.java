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
public class Kelulusan2 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner (System.in);
        String nama, jeniskelamin;
        int tinggibadan;
        
        System.out.print("Masukkan nama          = ");
        nama = inputan.nextLine();
        
        System.out.print("Masukkan jenis kelamin = ");
        jeniskelamin = inputan.next();
        
        System.out.print("Masukkan tinggi badan  = ");
        tinggibadan = inputan.nextInt();
        
        if(("laki-laki".equals(jeniskelamin))) {
            if (tinggibadan >= 0 && tinggibadan <= 170) {
                System.out.println("Anda Gagal");
            } else if ((tinggibadan >= 171 && tinggibadan <= 230)) {
                System.out.println("Selamat Anda Lulus");
            } else {
                System.out.println("Error");
            }
        } else if (("perempuan".equals(jeniskelamin))){
            if (tinggibadan >= 0 && tinggibadan <= 160) {
                System.out.println("Anda Gagal");
            } else if ((tinggibadan >= 161) && (tinggibadan <= 210)) {
                System.out.println("Selamat Anda Lulus");
            } else {
                System.out.println("Error");
        } 
        }
    }
}

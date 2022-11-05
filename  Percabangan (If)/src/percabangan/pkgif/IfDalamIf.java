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
public class IfDalamIf {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        
        System.out.print("Masukkan Nama    = ");
        String nama = inp.nextLine();
        
        System.out.print("Masukkan Nilai   = ");
        int nilai = inp.nextInt();
        
        System.out.print("Masukkan Jurusan = ");
        String jurusan = inp.next();
        
        if ("IPA".equals(jurusan)) {
            if (nilai >= 85) {
                System.out.println("Anda lulus");
            } else {
                System.out.println("Anda tidak lulus");
            }
        } else if ("IPS".equals(jurusan)) {
            if (nilai >= 75) {
                System.out.println("Anda lulus");
            } else {
                System.out.println("Anda tidak lulus");
            }
        }
    }
}

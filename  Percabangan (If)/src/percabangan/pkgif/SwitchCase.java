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
public class SwitchCase {
    public static void main(String[] args) {
        int kode;
        Scanner inputan = new Scanner (System.in).useDelimiter("\n");
        System.out.print("Masukkan kode : ");
        kode = inputan.nextInt();
        
    switch(kode) {
        case 1:
            System.out.println("IPA");
            break;
        case 2:
            System.out.println("IPS");
            break;
        case 3:
            System.out.println("BAHASA");
        default:
            System.out.println("Error");
    }    
    }
}

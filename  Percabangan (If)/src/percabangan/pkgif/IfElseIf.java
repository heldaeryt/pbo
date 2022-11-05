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
public class IfElseIf {
    public static void main(String[] args) {
        Scanner inputan = new Scanner (System.in);
        float nilai;
        
        System.out.print("Masukkan Nilai = ");
        nilai = inputan.nextFloat();
        
        if (nilai < 3.00) {
            System.out.println("Cukup");
        } else if (nilai < 3.49) {
            System.out.println("Memuaskan");
        } else if (nilai < 3.79) {
            System.out.println("Sangat Memuaskan");
        } else {
            System.out.println("Cum Laude");
        }
    }
}

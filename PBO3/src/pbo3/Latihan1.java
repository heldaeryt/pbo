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
public class Latihan1 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner (System.in);
        int angka_sistem = 100;
        
        System.out.print("Masukkan angka = ");
        angka_sistem = inputan.nextInt();
        
        if (angka_sistem < 150) {
            System.out.println("Ini merupakan statement if");
        } else {
        System.out.println("Program selesai");
        }
    }
}

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
public class Latihan5 {
    public static void main(String[] args) {
        int a = (int) (Math.random()*10), b = (int) (Math.random()*10), hasil = a+b;
        Scanner scan = new Scanner (System.in).useDelimiter("\n");
        
        System.out.print("Berapakah hasil dari "+a+" dan "+b+"? ");
        int jawaban = scan.nextInt();
        
        if (jawaban == hasil) {
            System.out.println("Selamat, jawaban anda benar.");
        } else {
            System.out.println("Maaf, jawaban yang benar adalah "+hasil);
        }
    }
}

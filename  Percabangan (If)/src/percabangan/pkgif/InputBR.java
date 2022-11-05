/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percabangan.pkgif;

/**
 *
 * @author ACER
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputBR {
    
    public static void main(String[] args) {
        BufferedReader br1 = new BufferedReader (new InputStreamReader (System.in));
        
            try {
                System.out.print("Nama = ");
                String nama = br1.readLine();
                
                System.out.print("Umur = ");
                int umur = Integer.parseInt(br1.readLine());
                
                System.out.println("Assalamu'alaikum " + nama + ". Apa kabar? Tidak terasa sekarang anda sudah " + umur + " tahun.");
            } catch (IOException ex) {
                System.out.println("Error pada saat input data");
            }
    } 
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;

/**
 *
 * @author zifat
 */
public class MainOperasiHitung {
    public static void main(String [] args){
        // Objek penjumlahan
        OperasiHitung penjumlahan = new Penjumlahan ();
        System.out.println("penjumlahan: " + penjumlahan.hitung(10, 5)); // Output: 15
        
        // Objeck Pengurangan
        OperasiHitung pengurangan = new Pengurangan ();
        System.out.println("Pengurangan: " + pengurangan.hitung (10, 5)); // Output: 5
    }
    
}

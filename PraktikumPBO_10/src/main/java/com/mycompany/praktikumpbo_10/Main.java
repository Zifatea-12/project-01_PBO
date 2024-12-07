/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikumpbo_10;

/**
 *
 * @author zifat
 */
public class Main {
    public static void main(String[] args) {
        // Objek Elektronik dan menghitung pajaknya
        Elektronik elektronik = new Elektronik();
        double hargaElektronik = 5000.0;
        System.out.println("Pajak Elektronik: " + elektronik.hitungPajak(hargaElektronik));

        // Objek Makanan dan menghitung pajaknya
        Makanan makanan = new Makanan();
        double hargaMakanan = 3000.0;
        System.out.println("Pajak Makanan: " + makanan.hitungPajak(hargaMakanan));
    }
}

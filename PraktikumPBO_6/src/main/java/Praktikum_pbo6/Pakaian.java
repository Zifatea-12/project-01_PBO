/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_pbo6;

/**
 *
 * @author zifat
 */
public class Pakaian extends Produk {
    double diskon;

    Pakaian(String nama, double harga, double diskonPersen) {
        super(nama, harga);
        this.diskon = diskonPersen;
    }

    @Override
    double hitungDiskon() {
        return harga * diskon / 50; // Hitung diskon persentase
    }
}

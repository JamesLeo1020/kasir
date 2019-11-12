/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challangepewarisan;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class shoe extends stok {

    private int size;
    private int harga;
    private int merk;
    private int warna;
    private int jenis;
    private int kategori;
    private String user;
    Scanner alay = new Scanner(System.in);
    Scanner boyy = new Scanner(System.in);
    Scanner cuyy = new Scanner(System.in);

    public shoe(int size, int harga, String merk, String warna, String jenis, String kategori) {
        super.stok(merk, warna, jenis, kategori);
        System.out.println("Size sepatu: ");
        this.size = alay.nextInt();
        System.out.println("Harga sepatu: ");
        this.harga = boyy.nextInt();
        System.out.println("Nama CUSTOMER: ");
        this.user = cuyy.nextLine();
    }

    public void data() {
        System.out.println("\n ===================== UNCHARTED & LUCKYCAT SUPPLY =======================");
        System.out.println("     Nama pelayan kasir: broodie");
        System.out.println("     Tanggal: 10-6-2070");
        System.out.println("     Alamat: JALAN AJA TAPI GK JADIAN");

        System.out.println("\n \t Nama Customer: " + this.user);
        super.data();
        if (size > 46) {
            System.out.println("\t Size tidak tersedia");
        } else if (size < 35) {
            System.out.println("\t size tidak tersedia");
        } else {
            System.out.println("\t Size sepatu: " + this.size);

        }

        System.out.println("\n\t Harga sepatu: " + this.harga);
        System.out.println("\t ================TERIMA KASIH===============");
        System.out.println("\t =====KAMI TUNGGU KEDATANGGANYA KEMBALI=====");
    }

}

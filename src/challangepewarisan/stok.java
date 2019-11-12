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
public class stok {

    private int merk;
    private int warna;
    private int jenis;
    private int kategori;
    Scanner cimeng = new Scanner(System.in);
    Scanner gomeng = new Scanner(System.in);
    Scanner mahal = new Scanner(System.in);
    Scanner murah = new Scanner(System.in);

    public void stok(String merk, String warna, String jenis, String kategori) {
        
        
        System.out.println(" 1.Nike \n 2.Adidas \n 3.Bape \n 3.OffWhite \n 4.Gucci \n 5.LV \n 6.Balenciaga \n 7.Vetemens \n 8.Y3 \n 9.Swallow \n Pilih merk sepatu:");
        this.merk = cimeng.nextInt();
        

        System.out.println("\n =====Pilih warna===== \n 1.camo \n 2.triplewhite \n 3.tripleblack \n 4.unchanged color \n 5.BRED \n 6.Gold");
        this.warna = gomeng.nextInt();
        

        System.out.println("\n =====Pilih jenis===== \n 1.pria \n 2.wanita ");
        this.jenis = mahal.nextInt();
        

        System.out.println("\n =====Plih kategori sepatu===== \n 1.olahraga \n 2.lari \n 3.santai \n 4.hypebeast ");
        this.kategori = murah.nextInt();
        
        
    }
    
    

    public void data() {
        if (merk == 1) {
            System.out.println("\t barang: NIKE");
        } else if (merk == 2) {
            System.out.println("\t barang: ADIDAS");
        } else if (merk == 3) {
            System.out.println("\t barang: BAPE");
        } else if (merk == 3) {
            System.out.println("\t barang: OFFWHITE");
        } else if (merk == 4) {
            System.out.println("\t barang: GUCCI");
        } else if (merk == 5) {
            System.out.println("\t barang: LV");
        } else if (merk == 6) {
            System.out.println("\t barang: BALENCIAGA");
        } else if (merk == 7) {
            System.out.println("\t barang: VETEMENS");
        } else if (merk == 8) {
            System.out.println("\t barang: Y3");
        } else if (merk == 9) {
            System.out.println("\t barang: SWALLOW");
        }
        //System.out.println("\t Warna sepatu: "+ this.warna);
        if (warna == 1) {
            System.out.println("\t Warna: CAMO");
        } else if (warna == 2) {
            System.out.println("\t Warna: Triplewhite");
        } else if (warna == 3) {
            System.out.println("\t Warna: Tripleblack");
        } else if (warna == 4) {
            System.out.println("\t Warna: Unchanged color");
        } else if (warna == 5) {
            System.out.println("\t Warna: Bred");
        }
        //System.out.println("\t jenis Sepatu: "+this.jenis);
        if (jenis == 1) {
            System.out.println("\t Jenis: PRIA");
        } else if (jenis == 2) {
            System.out.println("\t Jenis: WANITA");
        }
        // System.out.println("\t Kategori sepatu: "+ this.kategori);
        if (kategori == 1) {
            System.out.println("\t Kategori: OLAHRAGA");
        } else if (kategori == 2) {
            System.out.println("\t Kategori: LARI");
        } else if (kategori == 3) {
            System.out.println("\t Kategori: SANTAI");
        } else if (kategori == 4) {
            System.out.println("\t Kategori: HYPEBEAST");
        }
    }

}
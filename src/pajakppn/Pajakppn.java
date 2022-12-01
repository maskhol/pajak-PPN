
package pajakppn;

import java.util.Scanner;

public class Pajakppn {

   
    public static void main(String[] args) {
        int harga, jumlah,bayar,total,pajak;

        // membuat scanner baru
        Scanner sc = new Scanner(System.in);

        // Tampilkan output ke user
        System.out.println("### KASIR INBOUND PM ###");
        System.out.print("Jumlah Barang: ");
        // menggunakan scanner dan menyimpan apa yang diketik di variabel jumlah
        jumlah = sc.nextInt();
        // Tampilkan outpu lagi
        System.out.print("Harga barang: ");
        // menggunakan scanner lagi
        harga = sc.nextInt();
        
        total= jumlah * harga;
        pajak= total *10/100;
        bayar= total + pajak;
        
        

        // Menampilkan apa yang sudah simpan di variabel
        System.out.println("--------------------");
        System.out.println("Jumlah Barang: " + jumlah);
        System.out.println("Harga barang: " + harga);
        System.out.println("PPn: " + pajak);
        System.out.println("total semua: Rp " + bayar);
    }
    
}

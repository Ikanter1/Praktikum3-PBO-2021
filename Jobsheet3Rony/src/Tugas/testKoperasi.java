/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class testKoperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int jumlahPinjam, jumlahAngsur;
        Anggota rony = new Anggota("111333444", "Rony", 5000000);
        
        System.out.println("Nama Anggota: " + rony.getNama());
        System.out.println("Limit Pinjaman: " + rony.getLimitPinjam());
        
        System.out.print("Meminjam Uang : ");
        jumlahPinjam = input.nextInt();
        rony.pinjam(jumlahPinjam);
        System.out.println("Jumlah pinjaman saat ini: " + rony.getJumlahPinjam());
        
        System.out.print("Membayar Angsuran : ");
        jumlahAngsur = input.nextInt();
        rony.angsur(jumlahAngsur);
        System.out.println("Jumlah pinjaman saat ini: " + rony.getJumlahPinjam());
        
        System.out.print("Membayar Angsuran : ");
        jumlahAngsur = input.nextInt();
        rony.angsur(jumlahAngsur);
        System.out.println("Jumlah pinjaman saat ini: " + rony.getJumlahPinjam());
        
    }
    
}

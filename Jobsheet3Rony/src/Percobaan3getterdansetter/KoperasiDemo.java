/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan3getterdansetter;

/**
 *
 * @author LENOVO
 */
public class KoperasiDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Anggota anggota1 = new Anggota("Rony", "Perum Permata Asri Pakis");
        System.out.println("Simpanan " +anggota1.getNama()+" : Rp " +anggota1.getSimpanan());
        
        anggota1.setNama("Rony");
        anggota1.setAlamat("Perum Permata Asri Pakis");
        
        anggota1.setor(100000);
        System.out.println("Simpanan " +anggota1.getNama()+" : Rp " +anggota1.getSimpanan());
        
        anggota1.pinjam(5000);
        System.out.println("Simpanan " +anggota1.getNama()+" : Rp " +anggota1.getSimpanan());
    }
    
}

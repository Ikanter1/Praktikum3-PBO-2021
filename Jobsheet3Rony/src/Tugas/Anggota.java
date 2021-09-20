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
public class Anggota {
    String nama, nomorKtp;
    int limitPinjam, jumlahPinjam;
    
    Anggota(String nomorKtp, String nama, int limitPinjam){
        this.nomorKtp = nomorKtp;
        this.nama = nama;
        this.limitPinjam = limitPinjam;
    }
    
    String getNama(){
        return nama;
    }
    int getLimitPinjam(){
        return limitPinjam;
    }
    int getJumlahPinjam(){
        return jumlahPinjam;
    }
    
    public void pinjam(int pinjam){
        if(jumlahPinjam + pinjam <= limitPinjam){
            jumlahPinjam += pinjam;
        }
        else{
            System.out.println("Maaf, Jumlah pinjaman melebihi limit!!!");
        }
    }
    
    public void angsur(int angsur){
        if(angsur > (0.01 * jumlahPinjam)){
            jumlahPinjam -= angsur;
        }
        else{
            System.out.println("Maaf, Angsuran harus 10% dari jumlah pinjaman");
        }
    }
}

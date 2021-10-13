/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasJB6Rony;

/**
 *
 * @author LENOVO
 */
public class MainTugas01 {
    public static void main(String[]args){
        Dosen01 r = new Dosen01(50000, "2041720037", "Abdulah Syahrony Kurniawan", "Malang");
        r.setSKS();
        Pegawai01 p = new Pegawai01("2041720037", "Rony Kurniawan", "Pakis");
        DaftarGaji01 Gaji = new DaftarGaji01(25000);
        Gaji.addPegawai01(p);
        Gaji.addPegawai01(r);
        Gaji.printSemuaGaji();
    }
}

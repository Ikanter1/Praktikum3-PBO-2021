/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasJB6Rony;

/**
 *
 * @author LENOVO
 */
public class Dosen01 extends Pegawai01{
    protected int jumlahSKS;
    protected int TARIF_SKS;

    Dosen01(int tarifsks, String nip, String nama, String alamat) {
        super(nip, nama, alamat);
        this.TARIF_SKS = tarifsks;
    }

    public void setSKS() {
        jumlahSKS = 17;
    }

    public int getGaji() {
        int gaji = jumlahSKS * TARIF_SKS;
        System.out.println("Gaji Dosen : " + gaji);
        return gaji;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasJB6Rony;

/**
 *
 * @author LENOVO
 */
public class DaftarGaji01 {
    protected Pegawai01 listPegawai[];
    public int jmlp;

    DaftarGaji01(int jml) {
        listPegawai = new Pegawai01[jml];
    }

    public void addPegawai01(Pegawai01 pg) {
        listPegawai[jmlp] = pg;
        jmlp++;
    }

    public void printSemuaGaji() {
        for (int a = 0; a < jmlp; a++) {
            System.out.println("Nama : " + listPegawai[a].getNama());
            System.out.println("NIP : " + listPegawai[a].nip);
            System.out.println("Alamat : " + listPegawai[a].alamat);
            System.out.println("Gaji : " + listPegawai[a].getGaji());
            System.out.println();
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manajemen.puskesma;

/**
 *
 * @author Bariq Qushoyyi
 */
public class Poli {
    String Nama;
    int JumlahPegawai,JummlahPasien;

    public Poli(String Nama, int JumlahPegawai, int JummlahPasien) {
        this.Nama = Nama;
        this.JumlahPegawai = JumlahPegawai;
        this.JummlahPasien = JummlahPasien;
    }

    String getNama() {
        return Nama;
    }

    int getJumlahPegawai() {
        return JumlahPegawai;
    }

    int getJummlahPasien() {
        return JummlahPasien;
    }
    
    
}

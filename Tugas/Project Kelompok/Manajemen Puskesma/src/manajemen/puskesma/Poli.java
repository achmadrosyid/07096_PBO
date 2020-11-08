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
    int JumlahPegawai,JumlahPasien;

    public Poli(String Nama, int JumlahPegawai, int JumlahPasien) {
        this.Nama = Nama;
        this.JumlahPegawai = JumlahPegawai;
        this.JumlahPasien = JumlahPasien;
    }
    
    String getNama() {
        return this.Nama;
    }

    int getJumlahPegawai() {
        return this.JumlahPegawai;
    }

    int getJumlahPasien() {
        return this.JumlahPasien;
    }
}
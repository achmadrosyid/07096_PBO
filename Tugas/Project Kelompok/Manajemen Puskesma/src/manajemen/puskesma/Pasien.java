/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manajemen.puskesma;

import java.util.Date;

/**
 *
 * @author Bariq Qushoyyi
 */

public class Pasien extends Orang {
    String Penyakit;

    public Pasien(String Penyakit, int NIK, String Nama, String Password, Date TanggalLahir, int Type, String Alamat, int JenisKelamin) {
        super(NIK, Nama, Password, TanggalLahir, Type, Alamat, JenisKelamin);
        this.Penyakit = Penyakit;
    }


    String getPenyakit() {
        return this.Penyakit;
    }
}

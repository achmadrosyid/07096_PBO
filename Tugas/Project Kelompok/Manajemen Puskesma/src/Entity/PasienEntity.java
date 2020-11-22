/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;

/**
 *
 * @author Bariq Qushoyyi
 */
public class PasienEntity extends OrangEntity {

    private String Penyakit;

    public PasienEntity(String Penyakit, String Nama, String Password, String Alamat, String JenisKelamin, Date TanggalLahir, int NIK) {
        super(Nama, Password, Alamat, JenisKelamin, TanggalLahir, NIK);
        this.Penyakit = Penyakit;
    }

    public void setPenyakit(String Penyakit) {
        this.Penyakit = Penyakit;
    }

    public String getPenyakit() {
        return Penyakit;
    }
}

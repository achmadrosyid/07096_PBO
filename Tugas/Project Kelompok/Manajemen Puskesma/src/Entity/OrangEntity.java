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
public abstract class OrangEntity {

    String Nama, Password, Alamat, JenisKelamin;
    Date TanggalLahir;
    int NIK;

    public OrangEntity(String Nama, String Password, String Alamat, String JenisKelamin, Date TanggalLahir, int NIK) {
        this.Nama = Nama;
        this.Password = Password;
        this.Alamat = Alamat;
        this.JenisKelamin = JenisKelamin;
        this.TanggalLahir = TanggalLahir;
        this.NIK = NIK;
    }

    public String getNama() {
        return Nama;
    }

    public String getPassword() {
        return Password;
    }

    public String getAlamat() {
        return Alamat;
    }

    public String getJenisKelamin() {
        return JenisKelamin;
    }

    public Date getTanggalLahir() {
        return TanggalLahir;
    }

    public int getNIK() {
        return NIK;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public void setJenisKelamin(String JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }

    public void setTanggalLahir(Date TanggalLahir) {
        this.TanggalLahir = TanggalLahir;
    }

    public void setNIK(int NIK) {
        this.NIK = NIK;
    }
    
    
}

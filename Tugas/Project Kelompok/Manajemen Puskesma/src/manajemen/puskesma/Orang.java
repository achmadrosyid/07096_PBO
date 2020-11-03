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
public class Orang {
    String Nama, Type, Alamat;
    boolean JenisKelamin;
    int NIK;

    public Orang(String Nama, String Type, String Alamat, boolean JenisKelamin, int NIK) {
        this.Nama = Nama;
        this.Type = Type;
        this.Alamat = Alamat;
        this.JenisKelamin = JenisKelamin;
        this.NIK = NIK;
    }

    public String getNama() {
        return Nama;
    }

    public String getType() {
        return Type;
    }

    public String getAlamat() {
        return Alamat;
    }

    public boolean isJenisKelamin() {
        return JenisKelamin;
    }

    public int getNIK() {
        return NIK;
    }
    
    
}

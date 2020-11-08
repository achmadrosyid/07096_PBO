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
import java.util.Date;

public class Orang {
    String Nama, Password, Alamat;
    Date TanggalLahir;
    int NIK, Type, JenisKelamin;

    public Orang(int NIK, String Nama, String Password, Date TanggalLahir, int Type, String Alamat, int JenisKelamin) {
        this.NIK = NIK;
        this.Nama = Nama;
        this.Password = Password;
        this.TanggalLahir = TanggalLahir;
        this.Type = Type;
        this.Alamat = Alamat;
        this.JenisKelamin = JenisKelamin;
    }
    
    int getNik() {
        return this.NIK;
    }

    String getNama() {
        return this.Nama;
    }
    
    String getPassword() {
        return this.Password;
    }
    
    Date getDate() {
        return this.TanggalLahir;
    }

    int getType() {
        return this.Type;
    }

    String getAlamat() {
        return this.Alamat;
    }

    int isJenisKelamin() {
        return this.JenisKelamin;
    }
}

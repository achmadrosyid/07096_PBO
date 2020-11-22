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
public class DokterEntity extends OrangEntity {

    private String Spesialis;
    private int IndexPoli;

    public DokterEntity(String Spesialis, String Nama, String Password, String Alamat, String JenisKelamin, Date TanggalLahir, int NIK, int IndexPoli) {
        super(Nama, Password, Alamat, JenisKelamin, TanggalLahir, NIK);
        this.Spesialis = Spesialis;
        this.IndexPoli = IndexPoli;
    }

    public void setSpesialis(String Spesialis) {
        this.Spesialis = Spesialis;
    }

    public String getSpesialis() {
        return Spesialis;
    }

    public int getIndexPoli() {
        return IndexPoli;
    }

    public void setIndexPoli(int IndexPoli) {
        this.IndexPoli = IndexPoli;
    }
}

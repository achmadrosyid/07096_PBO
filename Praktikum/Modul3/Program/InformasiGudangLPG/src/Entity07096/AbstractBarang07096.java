/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity07096;

import java.util.Date;

/**
 *
 * @author LENOVO
 */
public abstract class AbstractBarang07096 {
     protected String kode, jenis, harga;
    protected Date tanggal;

    public AbstractBarang07096(String kode, String jenis, String harga,Date tanggal) {
        this.kode    = kode;
        this.jenis   = jenis;
        this.harga   = harga;
        this.tanggal = tanggal;
    }

    public AbstractBarang07096() {
        
    }
    
    public abstract String getKode();

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }
    
}

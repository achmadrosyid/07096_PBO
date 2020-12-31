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
public class BarangKeluar07096 extends AbstractBarang07096 {
    private String kota;
    
     public BarangKeluar07096 (String kode, String jenis, String harga,Date tanggal,String kota){
        super (kode,jenis,harga,tanggal);
        this.kota = kota;
    }
     
    @Override

    public String getKode() {
        return kode;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }
    
    
}

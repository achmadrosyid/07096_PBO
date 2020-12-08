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
public class BarangMasuk07096 extends AbstractBarang07096 {
    private String gudang;
    
    public BarangMasuk07096 (String kode, String jenis, String harga,Date tanggal,String gudang){
        super (kode,jenis,harga,tanggal);
        this.gudang = gudang;
    }

    @Override

    public String getKode() {
        return kode;
    }

    public String getGudang() {
        return gudang;
    }
    public void gudang(String gudang){
        this.gudang = gudang;
    }
           
}

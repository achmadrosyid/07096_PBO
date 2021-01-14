/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity07096;

/**
 *
 * @author LENOVO
 */
public class DaftarBarang07096 {
    
    private BarangKeluar07096 keluar;
    private boolean isVerified;
    private int indexBarang;

    public DaftarBarang07096(int indexBarang, BarangKeluar07096 keluar, boolean isVerified) {
        this.keluar = keluar;
        this.isVerified = isVerified;
        this.indexBarang = indexBarang;
    }

    public BarangKeluar07096 getKeluar() {
        return keluar;
    }

    public void setKeluar(BarangKeluar07096 keluar) {
        this.keluar = keluar;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setIsVerified(boolean isVerified) {
        this.isVerified = isVerified;
    }

    public int getIndexBarang() {
        return indexBarang;
    }

    public void setIndexBarang(int indexBarang) {
        this.indexBarang = indexBarang;
    }

    
}

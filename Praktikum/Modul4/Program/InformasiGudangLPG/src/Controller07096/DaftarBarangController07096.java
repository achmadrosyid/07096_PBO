package Controller07096;

import Entity07096.BarangKeluar07096;
import Entity07096.DaftarBarang07096;

public class DaftarBarangController07096 {
    int indexLogin = 0;
    
    public DaftarBarangController07096() {
    }
    
    // menampilkan daftar barang
    public void viewBarang() {
        AllObjectModel07096.daftarBarangModel.view();
    }
    
    // mengambil daftar barang
    public DaftarBarang07096 daftarBarangEntity(int indexLogin) {
        return AllObjectModel07096.daftarBarangModel.showDaftarBarang(indexLogin);
    }
    
    // method untuk update verified barang
    public void verifiedBarang(int index,DaftarBarang07096 daftarBarang07096) {
        AllObjectModel07096.daftarBarangModel.updateIsVerified(index,(DaftarBarang07096) daftarBarang07096);
    }
}

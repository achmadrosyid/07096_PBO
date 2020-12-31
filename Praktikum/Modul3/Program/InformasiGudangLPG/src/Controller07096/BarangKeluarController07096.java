package Controller07096;

import Entity07096.*;

public class BarangKeluarController07096 {
    int indexLogin = 0;
    
    public BarangKeluarController07096() {
    }
    
    // insert data barang melalui model
    public void insertBarang(BarangKeluar07096 barangkeluar07096) {
        AllObjectModel07096.barangKeluarModel.insert(barangkeluar07096);
    }
    
    // update data barang melalui model
    public void updateBarang(int index, BarangKeluar07096 barangKeluar07096) {
        AllObjectModel07096.barangKeluarModel.update(index,(BarangKeluar07096) barangKeluar07096);
    }

    // delete data barang melalui model
    public void removeBarang(int index) {
        AllObjectModel07096.barangKeluarModel.remove(index);
    }
    
    // view data barang melalui model
    public void viewBarang() {
        AllObjectModel07096.barangKeluarModel.view();
    }
    
    // mengambil data barang melalui model
    public BarangKeluar07096 barangKeluarEntity() {
        return AllObjectModel07096.barangKeluarModel.showDataBarang(indexLogin);
    }
}

package Controller07096;

import Entity07096.*;

public class BarangMasukController07096 {
    int indexLogin = 0;
    
    public BarangMasukController07096() {
    }
    
    // insert data barang melalui model
    public void insertBarang(BarangMasuk07096 barangmasuk07096) {
        AllObjectModel07096.barangMasukModel.insertBarang(barangmasuk07096);
    }
    
    // update data barang melalui model
    public void updateBarang(int index, BarangMasuk07096 barangmasuk07096) {
        AllObjectModel07096.barangMasukModel.update(index,(BarangMasuk07096) barangmasuk07096);
    }

    // delete data barang melalui model
    public void removeBarang(int index) {
        AllObjectModel07096.barangMasukModel.remove(index);
    }
    
    // view data barang melalui model
    public void viewBarang() {
        AllObjectModel07096.barangMasukModel.view();
    }
    
    // mengambil data barang melalui model
    public BarangMasuk07096 barangMasukEntity() {
        return AllObjectModel07096.barangMasukModel.showDataBarang(indexLogin);
    }
}

package Controller07096;

import Entity07096.*;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

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
    public DefaultTableModel barangmasuk() {
        DefaultTableModel dtmbarangmasuk = new DefaultTableModel();
        Object[] kolom = {"No","Kode","Jenis","Harga","Tanggal","Gudang"};
        dtmbarangmasuk.setColumnIdentifiers(kolom);
        int size = AllObjectModel07096.barangMasukModel.viewAll();
        for(int i=0;i<size;i++) {
            Object[] data = new Object[6];
            data[0] = i;
            data[1] = AllObjectModel07096.barangMasukModel.showDataBarang(i).getKode();
            data[2] = AllObjectModel07096.barangMasukModel.showDataBarang(i).getJenis();
            data[3] = AllObjectModel07096.barangMasukModel.showDataBarang(i).getHarga();
            data[4] = new SimpleDateFormat("dd/MM/yyyy").format(AllObjectModel07096.barangMasukModel.showDataBarang(i).getTanggal());
            data[5] = AllObjectModel07096.barangMasukModel.showDataBarang(i).getGudang();
            dtmbarangmasuk.addRow(data);
        }
        return dtmbarangmasuk;
    }
}

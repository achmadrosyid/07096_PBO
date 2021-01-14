package Controller07096;

import Entity07096.*;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

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
    public DefaultTableModel barangkeluar() {
        DefaultTableModel dtmbarangkeluar = new DefaultTableModel();
        Object[] kolom = {"No","Kode","Jenis","Harga","Tanggal","Kota"};
        dtmbarangkeluar.setColumnIdentifiers(kolom);
        int size = AllObjectModel07096.barangKeluarModel.viewAll();
        for(int i=0;i<size;i++) {
            Object[] data = new Object[6];
            data[0] = i;
            data[1] = AllObjectModel07096.barangKeluarModel.showDataBarang(i).getKode();
            data[2] = AllObjectModel07096.barangKeluarModel.showDataBarang(i).getJenis();
            data[3] = AllObjectModel07096.barangKeluarModel.showDataBarang(i).getHarga();
            data[4] = new SimpleDateFormat("dd/MM/yyyy").format(AllObjectModel07096.barangKeluarModel.showDataBarang(i).getTanggal());
            data[5] = AllObjectModel07096.barangKeluarModel.showDataBarang(i).getKota();
            dtmbarangkeluar.addRow(data);
        }
        return dtmbarangkeluar;
    }
}

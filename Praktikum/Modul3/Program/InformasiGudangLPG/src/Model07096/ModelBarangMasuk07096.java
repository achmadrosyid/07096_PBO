/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model07096;
import Entity07096.BarangMasuk07096;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class ModelBarangMasuk07096 implements Interfaces07096 {
    private ArrayList<BarangMasuk07096> BarangMasuk07096ArrayList;

    public ModelBarangMasuk07096() {
        BarangMasuk07096ArrayList = new ArrayList<BarangMasuk07096>();
    }

   
    public void insertBarang(BarangMasuk07096 Barang ) {
        BarangMasuk07096ArrayList.add(Barang);
    }
    
    public void update(int index, BarangMasuk07096 barangMasuk07096) {
        BarangMasuk07096ArrayList.set(index,(BarangMasuk07096) barangMasuk07096);
    }

    public void remove(int index) {
        BarangMasuk07096ArrayList.remove(index);
    }

    @Override
    public void view() {
        if(BarangMasuk07096ArrayList.isEmpty()) {
            System.out.println("Data Barang Masuk Kosong!");
        } else {
            int i=0;
            for (BarangMasuk07096 barangmasuk07096 : BarangMasuk07096ArrayList) {
                System.out.println("\nData Barang Ke "+i);
                System.out.println("===============================================================");
                System.out.println(" Kode Barang : " + barangmasuk07096.getKode()
                        + "\n Jenis Barang : " + barangmasuk07096.getJenis()
                        + "\n Harga Barang : " + barangmasuk07096.getHarga()
                        + "\n Tanggal Barang : " + new SimpleDateFormat("dd-MM-yyyy").format(barangmasuk07096.getTanggal())
                        + "\n Gudang : " + barangmasuk07096.getGudang());
                System.out.println("===============================================================");
                i++;
            }
        }
    }

    @Override
    public int cekData(String kode) {
        int loop = 0;
        for (BarangMasuk07096 barangmasuk07096 : BarangMasuk07096ArrayList) {
            if (barangmasuk07096.getKode().equals(kode)) {
                break;
            } else {
                loop++;
            }
        }
        return loop;
    }
    
    public BarangMasuk07096 showDataBarang(int index){
        return BarangMasuk07096ArrayList.get(index);
    }
}

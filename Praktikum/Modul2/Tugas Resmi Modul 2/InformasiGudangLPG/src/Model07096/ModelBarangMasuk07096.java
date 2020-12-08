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

    public ModelBarangMasuk07096(String kodeAdmin, String passwordAdmin, String namaAdmin, String notelpAdmin, Date date, String gudang) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void insertBarang(BarangMasuk07096 Barang ) {
        BarangMasuk07096ArrayList.add(Barang);
    }

    @Override
    public void view() {
        for (BarangMasuk07096 barangmasuk07096 : BarangMasuk07096ArrayList) {
            System.out.print(barangmasuk07096.getKode());
            System.out.print(barangmasuk07096.getJenis());
            System.out.print(barangmasuk07096.getHarga());
            System.out.print(new SimpleDateFormat("dd-mm-yyyy").format(barangmasuk07096.getTanggal()));
            System.out.println();

        }
    }

    //@Override
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
    
    public BarangMasuk07096 showDataBarnag(int index){
        return BarangMasuk07096ArrayList.get(index);
    }

    public void insert(BarangMasuk07096 barangMasuk07096) {
        
    }
        

    public void set(BarangMasuk07096 barangMasuk07096) {
        
    }
       

    public void remove(int index) {
        
    }

}

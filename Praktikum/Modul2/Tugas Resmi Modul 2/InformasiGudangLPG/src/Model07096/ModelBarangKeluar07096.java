/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model07096;
import Entity07096.BarangKeluar07096;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class ModelBarangKeluar07096 implements Interfaces07096 {
    private ArrayList<BarangKeluar07096> BarangKeluar07096ArrayList;

    public ModelBarangKeluar07096() {
        BarangKeluar07096ArrayList = new ArrayList<BarangKeluar07096>();
    }

    public void insert(BarangKeluar07096 barangkeluar07096) {
        BarangKeluar07096ArrayList.add(barangkeluar07096);
    }

    @Override
    public void view() {
        for (BarangKeluar07096 barangkeluar07096 : BarangKeluar07096ArrayList) {
            System.out.println("===============================================================");
            System.out.println(" Kode Barang : " + barangkeluar07096.getKode()
                    + "\n Jenis Barang : " + barangkeluar07096.getJenis()
                    + "\n Harga Barang : " + barangkeluar07096.getHarga()
                    + "\n Tanggal Barang : " + barangkeluar07096.getTanggal());
            System.out.println("===============================================================");
        }
    }

    //@Override
    public int cekData(String kode) {
        int loop = 0;
        while (!BarangKeluar07096ArrayList.get(loop).getKode().equals(kode)) {
            loop++;
        }
        return loop;
    }
    
    public BarangKeluar07096 getBarangKeluarArrayList(int index){
        return BarangKeluar07096ArrayList.get(index);
    } 

    public void set(BarangKeluar07096 barangKeluar07096) {
        
    }
      

    public void remove(int index) {
        
    }
        

   
}

package informasigudanglpg;

import Entity07096.*;
import Model07096.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

public class AchmadMaulana07096_Main {
    private static ModelBarangMasuk07096 datamasuk = new ModelBarangMasuk07096();
    private static Scanner input = new Scanner(System.in);
    private static ModelBarangKeluar07096 datakeluar = new ModelBarangKeluar07096();
    private static ModelNamaAdmin07096 namaadmin = new ModelNamaAdmin07096();
    private static ModelDaftarBarang07096 daftarprakModel = new ModelDaftarBarang07096();

    public static void main(String[] args) {
        int loop = 0;
        boolean isLogin = false;
        int pilih = 0;
        System.out.println("Selamat Datang Di Informasi Gudang LPG !! ");
        System.out.print("Masukkan Nama Admin = ");
        String Admin = input.next();
        System.out.print("Masukkan Password Admin = ");
        String Password = input.next();
        
        namaadmin.DataAdmin();

        for (int i = 0; i < namaadmin.getListNamaAdmin07096().size(); i++) {
            if(Admin.equals(namaadmin.getListNamaAdmin07096().get(i).getAdmin()) && Password.equals(namaadmin.getListNamaAdmin07096().get(i).getPassword())){
                isLogin = true;
                break;
            } else {
                System.out.println("Username Atau Password Salah\n");
                isLogin = false;
            }
        }
        do {
            if(isLogin){
              // System.out.println(namaadmin.getListNamaAdmin07096().get(i).getAdmin());
            System.out.print("\nHai.. Admin !!"
                       + "\n 1. Input Daftar Barang Masuk"
                       + "\n 2. Input Daftar Barang Keluar"
                       + "\n 3. Cek Daftar Barang Masuk"
                       + "\n 4. Cek Daftar Barang Keluar"
                       + "\n 5. Update Daftar Barang Masuk"
                       + "\n 6. Update Daftar Barang Keluar"
                       + "\n 7. Hapus Daftar Barang Masuk"
                       + "\n 8. Hapus Daftar Barang Keluar"
                       + "\n 0. Stop"
                       + "\n Masukkan Pilihan Anda : ");
               pilih = input.nextInt();
               if (pilih == 1) {
                   BarangMasuk();
               } else if (pilih == 2) {
                   BarangKeluar();
               } else if (pilih == 3) {
                  datamasuk.view();
               } else if (pilih == 4) {
                  datakeluar.view();
               } else if (pilih == 5) {
                   UpdateBarangMasuk();
               } else if (pilih == 6) {
                   UpdateBarangKeluar();
               } else if (pilih == 7) {
                  HapusBarangMasuk();
               } else if (pilih == 8) {
                  HapusBarangKeluar();
               } else {
                   break;
               }  
            }else{
               System.out.println("Username Atau Password Salah\n");
            }
        } while (loop != 1);
    }

    static void BarangMasuk() {
        System.out.print("Input Kode = ");
        String kode = input.next();
        System.out.print("Input Jenis = ");
        String jenis = input.next();
        System.out.print("Input Harga = ");
        String harga = input.next();
        System.out.print("Input Tanggal (dd/mm/yyyy) = ");
        Date tanggal = new Date(input.next());
        System.out.print("Gudang = ");
        String gudang = input.next();
        datamasuk.insertBarang(new BarangMasuk07096(kode, jenis, harga,tanggal,gudang));
    }
     static void BarangKeluar() {
        System.out.print("Input Kode = ");
        String kode = input.next();
        System.out.print("Input Jenis = ");
        String jenis = input.next();
        System.out.print("Input Harga = ");
        String harga = input.next();
        System.out.print("Input Tanggal (dd/mm/yyyy) = ");
        Date tanggal = new Date(input.next());
        System.out.print("Kota = ");
        String kota = input.next();
        datakeluar.insert(new BarangKeluar07096(kode, jenis, harga,tanggal, kota));
    } 
     
    static void UpdateBarangMasuk(){
        datamasuk.view();
        System.out.print("Index Barang Ke : ");
        int index = input.nextInt();
        System.out.print("Input Kode = ");
        String kode = input.next();
        System.out.print("Input Jenis = ");
        String jenis = input.next();
        System.out.print("Input Harga = ");
        String harga = input.next();
        System.out.print("Input Tanggal (dd/mm/yyyy) = ");
        Date tanggal = new Date(input.next());
        System.out.print("Gudang = ");
        String gudang = input.next();
        datamasuk.update(index, new BarangMasuk07096(kode, jenis, harga,tanggal,gudang)); 
    }
     
    static void UpdateBarangKeluar(){
        datakeluar.view();
        System.out.print("Index Barang Ke : ");
        int index = input.nextInt();
        System.out.print("Input Kode = ");
        String kode = input.next();
        System.out.print("Input Jenis = ");
        String jenis = input.next();
        System.out.print("Input Harga = ");
        String harga = input.next();
        System.out.print("Input Tanggal (dd/mm/yyyy) = ");
        Date tanggal = new Date(input.next());
        System.out.print("Kota = ");
        String kota = input.next();
        datakeluar.update(index, new BarangKeluar07096(kode, jenis, harga,tanggal,kota)); 
    }
    
    static void HapusBarangMasuk() {
        datamasuk.view();
        System.out.print("Index Barang Ke : ");
        int index = input.nextInt();
        datamasuk.remove(index);
    } 
    static void HapusBarangKeluar() {
        datakeluar.view();
        System.out.print("Index Barang Ke : ");
        int index = input.nextInt();
        datakeluar.remove(index);
    }
}
package informasigudanglpg;

import Controller07096.*;
import Model07096.*;
import Entity07096.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AchmadMaulana07096_Main {
    // inisialisasi object baru dari controller (admin, barang masuk, barang keluar, daftar barang)
    private static NamaAdminController07096 admin = new NamaAdminController07096();
    private static BarangMasukController07096 barangMasuk = new BarangMasukController07096();
    private static BarangKeluarController07096 barangKeluar = new BarangKeluarController07096();
    private static DaftarBarangController07096 daftarBarang = new DaftarBarangController07096();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int loop = 0;
        boolean isLogin = false;
        int pilih = 0;
        System.out.println("Selamat Datang Di Informasi Gudang LPG !! ");
        System.out.print("Masukkan Nama Admin = ");
        String Admin = input.next();
        System.out.print("Masukkan Password Admin = ");
        String Password = input.next();
        // insert data admin melalui controller admin
        admin.DataAdmin();

        // perulangan untuk menentukan banyak data admin
        for (int i = 0; i < AllObjectModel07096.adminModel.getListNamaAdmin07096().size(); i++) {
            // penerapan exception handling (try catch)
            try {
                // pengujian untuk mencari apakah data yang login sudah sesuai atau belum dengan data admin yang sudah ada
                if(Admin.equals(AllObjectModel07096.adminModel.getListNamaAdmin07096().get(i).getAdmin()) && Password.equals(AllObjectModel07096.adminModel.getListNamaAdmin07096().get(i).getPassword())){
                    isLogin = true;
                    break;
                } else {
                    System.out.println("Username Atau Password Salah\n");
                    isLogin = false;
                }
            } catch (Exception exception) {
                System.out.println("Username Atau Password Salah\n");
                isLogin = false;
            }
        }
        
        // perulangan (do-while) untuk menampilkan menu
        // perulangan akan berhenti jika attribut isLogin bernilai false
        do {
            // pengujian jika attribut isLogin bernilai true
            if(isLogin){
            System.out.print("\nHai.... Admin"
                        +"\nPilihan Menu : "
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
                   // memanggil method view barang masuk melalui controller
                  barangMasuk.viewBarang();
               } else if (pilih == 4) {
                   // memanggil method view barang keluar melalui controller
                  barangKeluar.viewBarang();
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
        } while (isLogin == true);
    }

    // method insert data barang masuk
    static void BarangMasuk() {
        System.out.print("Input Kode = ");
        String kode = input.next();
        System.out.print("Input Jenis = ");
        String jenis = input.next();
        System.out.print("Input Harga = ");
        String harga = input.next();
        System.out.print("Input Tanggal (mm/dd/yyyy) = ");
        Date tanggal = new Date(input.next());
        System.out.print("Gudang = ");
        String gudang = input.next();
        barangMasuk.insertBarang(new BarangMasuk07096(kode, jenis, harga,tanggal,gudang));
    }
    
    // method insert data barang keluar
    static void BarangKeluar() {
       System.out.print("Input Kode = ");
       String kode = input.next();
       System.out.print("Input Jenis = ");
       String jenis = input.next();
       System.out.print("Input Harga = ");
       String harga = input.next();
       System.out.print("Input Tanggal (mm/dd/yyyy) = ");
       Date tanggal = new Date(input.next());
       System.out.print("Kota = ");
       String kota = input.next();
       barangKeluar.insertBarang(new BarangKeluar07096(kode, jenis, harga,tanggal, kota));
    } 
     
    // method update data barang masuk
    static void UpdateBarangMasuk(){
        barangMasuk.viewBarang();
        System.out.print("Index Barang Ke : ");
        int index = input.nextInt();
        System.out.print("Input Kode = ");
        String kode = input.next();
        System.out.print("Input Jenis = ");
        String jenis = input.next();
        System.out.print("Input Harga = ");
        String harga = input.next();
        System.out.print("Input Tanggal (mm/dd/yyyy) = ");
        Date tanggal = new Date(input.next());
        System.out.print("Gudang = ");
        String gudang = input.next();
        barangMasuk.updateBarang(index, new BarangMasuk07096(kode, jenis, harga,tanggal,gudang)); 
    }
     
    // method update data barang keluar
    static void UpdateBarangKeluar(){
        barangKeluar.viewBarang();
        System.out.print("Index Barang Ke : ");
        int index = input.nextInt();
        System.out.print("Input Kode = ");
        String kode = input.next();
        System.out.print("Input Jenis = ");
        String jenis = input.next();
        System.out.print("Input Harga = ");
        String harga = input.next();
        System.out.print("Input Tanggal (mm/dd/yyyy) = ");
        Date tanggal = new Date(input.next());
        System.out.print("Kota = ");
        String kota = input.next();
        barangKeluar.updateBarang(index, new BarangKeluar07096(kode, jenis, harga,tanggal,kota)); 
    }
    
    // method delete data barang masuk
    static void HapusBarangMasuk() {
        barangMasuk.viewBarang();
        System.out.print("Index Barang Ke : ");
        int index = input.nextInt();
        barangMasuk.removeBarang(index);
    } 
    
    // method delete data barang keluar
    static void HapusBarangKeluar() {
        barangKeluar.viewBarang();
        System.out.print("Index Barang Ke : ");
        int index = input.nextInt();
        barangKeluar.removeBarang(index);
    }
}
package informasigudanglpg;


import Entity07096.*;
import Model07096.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AchmadMaulana07096_Main {

    private static ModelBarangMasuk07096 datamasuk = new ModelBarangMasuk07096();
    private static Scanner input = new Scanner(System.in);
    private static ModelBarangKeluar07096 datakeluar = new ModelBarangKeluar07096();
    private static ModelNamaAdmin07096 namaadmin = new ModelNamaAdmin07096();
    private static ModelDaftarBarang07096 daftarprakModel = new ModelDaftarBarang07096();
    private static Iterable<BarangMasuk07096> BarangMasuk07096ArrayList;
    private static Iterable<BarangKeluar07096> BarangKeluar07096ArrayList;
    

    public static void main(String[] args) {
        // TODO code application logic here
        int loop = 0;
        boolean isLogin = false;
        int pilih = 0;
            System.out.print("\nSelamat Datang Di Informasi Gudang LPG !! ");
            System.out.print("\nMasukkan Nama Admin = ");
            String Admin = input.next();
            System.out.print("\nMasukksn Password Admin = ");
            String Password = input.next();
            
            namaadmin.DataAdmin();
            
            for (int i = 0; i < namaadmin.getListNamaAdmin07096().size(); i++) {
            if(Admin.equals(namaadmin.getListNamaAdmin07096().get(i).getAdmin()) && 
                    Password.equals(namaadmin.getListNamaAdmin07096().get(i).getPassword())){
                isLogin = true;
                break;
            }else{
                System.out.println("Username Atau Password Salah\n");
                isLogin = false;
            }
        }
        do {
            
           
            
         if(isLogin){
            System.out.println("");
           // System.out.println(namaadmin.getListNamaAdmin07096().get(i).getAdmin());
         System.out.print("Hai.. Admin !!"
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
               viewMasuk();
            } else if (pilih == 4) {
               viewKeluar();
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
        datamasuk.insert(new BarangMasuk07096(kode, jenis, harga,tanggal,gudang));
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
    
     static void viewMasuk() {
        for (BarangMasuk07096 barangmasuk07096 : BarangMasuk07096ArrayList) {
            System.out.print(barangmasuk07096.getKode());
            System.out.print(barangmasuk07096.getJenis());
            System.out.print(barangmasuk07096.getHarga());
            System.out.print(new SimpleDateFormat("dd-mm-yyyy").format(barangmasuk07096.getTanggal()));
            System.out.println();

        }
    }
    
     static void viewKeluar() {
        for (BarangKeluar07096 barangkeluar07096 : BarangKeluar07096ArrayList) {
            System.out.print(barangkeluar07096.getKode());
            System.out.print(barangkeluar07096.getJenis());
            System.out.print(barangkeluar07096.getHarga());
            System.out.print(new SimpleDateFormat("dd-mm-yyyy").format(barangkeluar07096.getTanggal()));
            System.out.println();

        }
    }
     
     
     static void UpdateBarangMasuk(){
        System.out.println("index ke ");
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
        datamasuk.set(new BarangMasuk07096(kode, jenis, harga,tanggal,gudang)); 
     }
     
     static void UpdateBarangKeluar(){
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
        datakeluar.set(new BarangKeluar07096(kode, jenis, harga,tanggal,gudang)); 
     }
    static void HapusBarangMasuk() {
        System.out.println("index ke ");
        int index = input.nextInt();
        datamasuk.remove(index);
    } 
    static void HapusBarangKeluar() {
        System.out.println("index ke ");
        int index = input.nextInt();
        datakeluar.remove(index);
    } 

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manajemen.puskesma;

/**
 *
 * @author Bariq Qushoyyi
 */
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    static ArrayList <Orang> datauser = new ArrayList();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Selamat Datang Di Aplikasi Sistem Informasi Manajemen Puskesmas");
        int menu;
        do {
            System.out.println("Daftar Menu : ");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Pilih Menu : ");
            menu = input.nextInt();
            switch(menu) {
                case 1 :
                    register();
                    break;
                case 2 :
                    System.out.print("NIK : ");
                    int nik = input.nextInt();
                    System.out.print("Password : ");
                    String pass = input.next();
                    login(nik,pass);
                    break;
                default :
                    break;
            }
        } while(menu!=3);
    }

    static void register() {
        System.out.print("Input NIK = ");
        int nik = input.nextInt();
        System.out.print("Input Nama = ");
        String nama = input.next();
        System.out.print("Input Password = ");
        String pass = input.next();
        System.out.print("Input Tanggal Lahir (dd/mm/yyyy) = ");
        Date tanggal = new Date(input.next());
        for(int i=0;i<Type.TypeUser.length;i++) {
            System.out.println(i+". "+Type.TypeUser[i]);
        }
        System.out.print("Type = ");
        int type = input.nextInt();
        System.out.print("Alamat = ");
        String alamat = input.next();
        for(int i=0;i<Type.Gender.length;i++) {
            System.out.println(i+". "+Type.Gender[i]);
        }
        System.out.print("Jenis Kelamin = ");
        int jenisKelamin = input.nextInt();
        datauser.add(new Orang(nik,nama,pass,tanggal,type,alamat,jenisKelamin));
    }

    static void login(int nik, String password) {
        for(int i=0;i<datauser.size();i++) {
            if(nik == datauser.get(i).getNik() && password.equals(datauser.get(i).getPassword())) {
                System.out.println("NIK : "+datauser.get(i).getNik());
                System.out.println("Nama : "+datauser.get(i).getNama());
                System.out.println("Tanggal Lahir = "+new SimpleDateFormat("dd-MM-yyyy").format(datauser.get(i).getDate()));
                System.out.println("Alamat : "+datauser.get(i).getAlamat());
                int gender = datauser.get(i).isJenisKelamin();
                if(gender == 0) System.out.println("Jenis Kelamin : Laki-Laki");
                else System.out.println("Jenis Kelamin : Perempuan");
                int dataType = datauser.get(i).getType();
                if(dataType == 0) System.out.println("Type User : Dokter");
                else if(dataType == 1) System.out.println("Type User : Perawat");
                else System.out.println("Type User : Pasien");
            } else {
                System.out.println("Username atau Password salah");
            }
        }
    }
}

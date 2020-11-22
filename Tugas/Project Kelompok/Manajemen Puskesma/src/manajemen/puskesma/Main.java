/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manajemen.puskesma;

import Entity.*;
import Model.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    private static DokterModel dataDokter = new DokterModel();
    private static PasienModel dataPasien = new PasienModel();
    private static DaftarpasienModel dataDaftarpasien = new DaftarpasienModel();
    static Scanner input = new Scanner(System.in);
    static int cekDokter;

    public static void main(String[] args) {
        int loop = 0;
        do {
            int pilih = 0;
            System.out.println("Selamat Datang Di Aplikasi Sistem Informasi Manajemen Puskesmas"
                    + "\n 1. Login"
                    + "\n 2. Register"
                    + "\n 0. Stop");
            System.out.print("Masukkan Pilihan Anda : ");
            pilih = input.nextInt();
            if (pilih == 1) {
                int pilLogin = 0;
                System.out.print(" 1. Login Dokter"
                        + "\n 2. Login Pasien"
                        + "\n Pilih : ");
                pilLogin = input.nextInt();
                if (pilLogin == 1) {
                    loginDokter();
                } else {
                    login();
                }
            } else if (pilih == 2) {
                int pilRegister = 0;
                System.out.print(" 1. Register Dokter"
                        + "\n 2. Register Pasien"
                        + "\n Pilih : ");
                pilRegister = input.nextInt();
                if (pilRegister == 1) {
                    registerDokter();
                } else {
                    register();
                }
            } else if (pilih == 3) {
                dataDokter.view();
            } else {
                break;
            }
        } while (loop != 1);
    }

    static void register() {
        System.out.print("Input NIK = ");
        int nik = input.nextInt();
        System.out.print("Input Nama = ");
        String nama = input.next();
        System.out.print("Input Password = ");
        String pass = input.next();
        System.out.print("Input Alamat = ");
        String alamat = input.next();
        System.out.print("Jenis Kelamin = ");
        String jeniskelamin = input.next();
        System.out.print("Input Tanggal Lahir (dd/mm/yyyy) = ");
        Date tanggal = new Date(input.next());
        System.out.print("Sakit Apa = ");
        String penyakit = input.next();
        dataPasien.insertPasien(new PasienEntity(penyakit, nama, pass, alamat, jeniskelamin, tanggal, nik));
    }

    static void login() {
        System.out.print("NIK : ");
        int nik = input.nextInt();
        System.out.print("Password : ");
        String password = input.next();
        cekDokter = dataPasien.cekData(nik, password);
        System.out.println("Selamat Datang " + dataPasien.getPasienArrayList(cekDokter).getNama());
        dataPasien.view();
    }

    static void loginDokter() {
        System.out.print("NIK : ");
        int nik = input.nextInt();
        System.out.print("Password : ");
        String password = input.next();
        cekDokter = dataDokter.cekData(nik, password);
        System.out.println("Selamat Datang " + dataDokter.showDataDokter(cekDokter).getNama());
        dataDokter.view();
    }

    static void registerDokter() {
        System.out.print("Input NIK = ");
        int nik = input.nextInt();
        System.out.print("Input Nama = ");
        String nama = input.next();
        System.out.print("Input Password = ");
        String pass = input.next();
        System.out.print("Input Alamat = ");
        String alamat = input.next();
        System.out.print("Jenis Kelamin = ");
        String jeniskelamin = input.next();
        System.out.print("Input Tanggal Lahir (dd/mm/yyyy) = ");
        Date tanggal = new Date(input.next());
        System.out.print("Spesialis = ");
        String spesialis = input.next();
        for (int i = 0; i < PoliEntity.namaPoli.length; i++) {
            System.out.println(i + ". " + PoliEntity.namaPoli[i]);
        }
        System.out.print("Pilih Poli = ");
        int indexPoli = input.nextInt();
        dataDokter.insertDokter(new DokterEntity(spesialis, nama, pass, alamat, jeniskelamin, tanggal, nik, indexPoli));
    }
}

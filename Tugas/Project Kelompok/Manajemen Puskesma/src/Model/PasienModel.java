/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import Entity.PasienEntity;
import java.text.SimpleDateFormat;

public class PasienModel implements Interfaces {
    
    private ArrayList<PasienEntity> pasienArrayList;
    
    public PasienModel() {
        pasienArrayList = new ArrayList<PasienEntity>();
    }
    
    public void insertPasien(PasienEntity pasien) {
        pasienArrayList.add(pasien);
    }
    
    @Override
    public void view() {
        for (PasienEntity pasien : pasienArrayList) {
            System.out.println("========================================================");
            System.out.println(" NIK : " + pasien.getNIK()
                    + "\n Nama : " + pasien.getNama()
                    + "\n Alamat : " + pasien.getAlamat()
                    + "\n Jenis Kelamin : " + pasien.getJenisKelamin()
                    + "\n Tanggal Lahir : " + new SimpleDateFormat("dd-MM-yyyy").format(pasien.getTanggalLahir()));
            System.out.println("========================================================");
            System.out.println();
        }
    }
    
    @Override
    public int cekData(int nik, String password) {
        int loop = 0;
        for (PasienEntity pasienEntity : pasienArrayList) {
            if (pasienEntity.getNIK() == nik && pasienEntity.getPassword().equals(password)) {
                break;
            } else {
                loop++;
            }
        }
        return loop;
    }
    
    public PasienEntity getPasienArrayList(int index) {
        return pasienArrayList.get(index);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.DokterEntity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class DokterModel implements Interfaces {

    private ArrayList<DokterEntity> DokterArrayList;

    public DokterModel() {
        DokterArrayList = new ArrayList<DokterEntity>();
    }

    public void insertDokter(DokterEntity dokter) {
        DokterArrayList.add(dokter);
    }

    @Override
    public void view() {
        for (DokterEntity dokter : DokterArrayList) {
            System.out.println("========================================================");
            System.out.println("NIK : "+dokter.getNIK());
            System.out.println("NAMA : "+dokter.getNama());
            System.out.println("Alamat : "+dokter.getAlamat());
            System.out.println("Jenis Kelamin : "+dokter.getJenisKelamin());
            System.out.println("Tanggal Lahir : "+new SimpleDateFormat("dd-MM-yyyy").format(dokter.getTanggalLahir()));
            System.out.println("Spesialis : "+dokter.getSpesialis());
            System.out.println("========================================================");
            System.out.println();
        }
    }

    @Override
    public int cekData(int nik, String password) {
        int loop = 0;
        for (DokterEntity aslabEntity07171 : DokterArrayList) {
            if (aslabEntity07171.getNIK() == nik && aslabEntity07171.getPassword().equals(password)) {
                break;
            } else {
                loop++;
            }
        }
        return loop;
    }

    public DokterEntity showDataDokter(int index) {
        return DokterArrayList.get(index);
    }

}

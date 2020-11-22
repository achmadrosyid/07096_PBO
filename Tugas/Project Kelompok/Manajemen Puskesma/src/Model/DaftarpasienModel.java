/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.DaftarpasienEntity;
import Entity.PoliEntity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class DaftarpasienModel implements Interfaces {

    private ArrayList<DaftarpasienEntity> DaftarpasienArrayList;

    public DaftarpasienModel() {
        DaftarpasienArrayList = new ArrayList<DaftarpasienEntity>();
    }

    public void insertDataDaftarpasien(DaftarpasienEntity daftarPasien) {
        DaftarpasienArrayList.add(daftarPasien);
    }

    public ArrayList<DaftarpasienEntity> getDaftarpasienArrayList() {
        return DaftarpasienArrayList;
    }

    public DaftarpasienEntity showDaftarpasien(int index) {
        return DaftarpasienArrayList.get(index);
    }

    @Override
    public int cekData(int nik, String password) {
        int loop = 0;
        if (DaftarpasienArrayList.size() == 0) {
            loop = -1;//data kosong
        } else {
            for (int i = 0; i < DaftarpasienArrayList.size(); i++) {
                if (DaftarpasienArrayList.get(i).getPasien().getNIK() == nik) {
                    loop = i;
                    break;
                } else {
                    loop = -2;
                }
            }
        }
        return loop;
    }

    @Override
    public void view() {
        for (DaftarpasienEntity daftarpasien : DaftarpasienArrayList) {
            System.out.println("===============================================================");
            System.out.println(" NIK : " + daftarpasien.getPasien().getNIK()
                    + "\n Nama : " + daftarpasien.getPasien().getNama()
                    + "\n Password : " + daftarpasien.getPasien().getPassword()
                    + "\n Alamat : " + daftarpasien.getPasien().getAlamat()
                    + "\n Tanggal Lahir : " + new SimpleDateFormat("dd-MM-yyyy").format(daftarpasien.getPasien().getTanggalLahir())
                    + "\n Jenis Kelamin : " + daftarpasien.getPasien().getJenisKelamin());
            System.out.println("===============================================================");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.*;
import java.util.Date;

public class DokterController {
    
    int indexLogin = 0;
    
    public DokterController() {
    }
    
    public void dataDokter() {
        int nikDokter[] = {12, 34, 56};
        String passDokter[] = {"12", "34", "56"};
        String namaDokter[] = {"Yuli", "Farid", "Ananda"};
        String notelpDokter[] = {"01", "02", "03"};
        int poli[] = {0, 1, 2};
        String jenis[] = {"Perempuan", "Pria", "Perempuan"};
        String alamatDokter[] = {"Kemayoran", "Dupak", "TP"};
        String tglLahirDokter[] = {"04/05/2000", "01/12/2000", "03/03/2000"};
        for (int i = 0; i < nikDokter.length; i++) {
            AllObjectModel.dokterModel.insertDokter(new DokterEntity(poli[i], 
                    passDokter[i], namaDokter[i],
                    notelpDokter[i], alamatDokter[i], 
                    jenis[i], nikDokter[i], new Date(tglLahirDokter[i])));
        };
    }
    
    public void viewDokter() {
        AllObjectModel.dokterModel.view();
    }
    
    public String showPoliDokter(int indexPoli) {
        return AllObjectModel.dokterModel.showPoliDokter(indexPoli);
    }
    
    public void listAntrianPoli(int indexPoli) {
        AllObjectModel.daftarPasienModel.view(indexPoli);
    }
    
    public void login(int nik, String password) {
        indexLogin = AllObjectModel.dokterModel.cekData(nik, password);
    }
    
    public DokterEntity dokterEntity() {
        return AllObjectModel.dokterModel.showDataDokter(indexLogin);
    }
    
    public void deleteListAntrianPasien(int indexPasien) {
        AllObjectModel.daftarPasienModel.deleteListPasien(indexPasien);
    }
    
}

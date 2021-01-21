package Controller;

import Entity.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class PasienController {

    int indexLogin = 0;

    public PasienController() {
    }

    public PasienEntity pasienEntity() {
        return AllObjectModel.pasienModel.getPasienArrayList(indexLogin);
    }

    public void dataPasien() {
        int nik[] = {123, 456, 789};
        String pass[] = {"123", "456", "789"};
        String nama[] = {"Bariq", "Qushoyyi", "Shobriy"};
        String no_telp[] = {"01", "02", "03"};
        String jeniskelamin[] = {"Perempuan", "Pria", "Perempuan"};
        String alamat[] = {"Kemayoran", "Dupak", "TP"};
        String tanggal[] = {"04/05/2000", "01/12/2000", "03/03/2000"};
        for (int i = 0; i < nik.length; i++) {
            AllObjectModel.pasienModel.insertPasien(new PasienEntity(pass[i],
                    nama[i], no_telp[i], alamat[i], jeniskelamin[i], nik[i], new Date(tanggal[i])));
        };
    }

    public void login(int nik, String password) {
        indexLogin = AllObjectModel.pasienModel.cekData(nik, password);
    }

    public void viewPasien() {
        AllObjectModel.pasienModel.view();
    }

    public String showNamePoli(int indexPoli) {
        return AllObjectModel.daftarPasienModel.showNamePoli(indexPoli);
    }

    public void postData(String password, String nama, String no_telp,
            String alamat, String jeniskelamin, int nik, Date tgllahir, String inAction) {
        if (inAction == "editPasien") {
            AllObjectModel.pasienModel.updatePasien(indexLogin,
                    new PasienEntity(password, nama, no_telp, alamat,
                            jeniskelamin, nik, tgllahir));
        } else if (inAction == "newPasien") {
            AllObjectModel.pasienModel.insertPasien(new PasienEntity(password, nama, no_telp, alamat, jeniskelamin, nik, tgllahir));
        }
    }

    public void registerAntrian(int indexPoli, PasienEntity pasienEntity) {
        AllObjectModel.daftarPasienModel.insertDataDaftarpasien(new DaftarPasienEntity(pasienEntity, indexPoli));
    }

    public DefaultTableModel antrianPasien(int IndexPoli) {
        DefaultTableModel tblAntrianPasien = new DefaultTableModel();
        Object[] kolom = {"NIK", "Nama", "No Telp", "Tgl Lahir", "Alamat", "Jenis Kelamin", "Poli"};
        tblAntrianPasien.setColumnIdentifiers(kolom);
        int size = AllObjectModel.daftarPasienModel.allDataAntrian().size();
        String verif = null;
        for (int i = 0; i < size; i++) {
            if (IndexPoli == AllObjectModel.daftarPasienModel.allDataAntrian().
                    get(i).getIndexPoli()) {
                Object[] data = new Object[7];
                data[0] = AllObjectModel.daftarPasienModel.allDataAntrian().
                        get(i).getPasien().getNik();
                data[1] = AllObjectModel.daftarPasienModel.allDataAntrian().
                        get(i).getPasien().getNama();
                data[2] = AllObjectModel.daftarPasienModel.allDataAntrian().
                        get(i).getPasien().getNo_telp();
                data[3] = new SimpleDateFormat("dd-mm-yyy").format(AllObjectModel.
                        daftarPasienModel.allDataAntrian().get(i).getPasien().getTgllahir());
                data[4] = AllObjectModel.daftarPasienModel.allDataAntrian().
                        get(i).getPasien().getAlamat();
                data[5] = AllObjectModel.daftarPasienModel.allDataAntrian().
                        get(i).getPasien().getJeniskelamin();
                data[6] = AllObjectModel.daftarPasienModel.showNamePoli(IndexPoli);
                tblAntrianPasien.addRow(data);
            }
        }
        return tblAntrianPasien;
    }
}

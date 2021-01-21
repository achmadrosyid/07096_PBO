package Model;

import Entity.DaftarPasienEntity;
import Entity.PoliEntity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class DaftarPasienModel {

    private ArrayList<DaftarPasienEntity> daftarPasienArrayList;

    public DaftarPasienModel() {
        daftarPasienArrayList = new ArrayList<DaftarPasienEntity>();
    }

    public void insertDataDaftarpasien(DaftarPasienEntity daftarPasien) {
        daftarPasienArrayList.add(daftarPasien);
    }

    public ArrayList<DaftarPasienEntity> allDataAntrian() {
        return daftarPasienArrayList;
    }

    public void deleteListPasien(int indexPasien) {
        daftarPasienArrayList.remove(indexPasien);
    }

    public String showNamePoli(int indexPoli) {
        return PoliEntity.nama[indexPoli];
    }

    public void view(int IndexPoli) {
        int index = 0;
        for (DaftarPasienEntity daftarPasien : daftarPasienArrayList) {
            if (daftarPasienArrayList.size() == 0) {
                System.out.println("Data Kosong !!!");
            } else {
                if (IndexPoli == daftarPasien.getIndexPoli()) {
                    System.out.println("===============================================================");
                    System.out.println("No : " + (index++)
                            + "\nNIK : " + daftarPasien.getPasien().getNik()
                            + "\nNama : " + daftarPasien.getPasien().getNama()
                            + "\nNo Telp : " + daftarPasien.getPasien().getNo_telp()
                            + "\nJenis Kelamin : " + daftarPasien.getPasien().getJeniskelamin()
                            + "\nAlamat : " + daftarPasien.getPasien().getAlamat()
                            + "\nPoli : " + PoliEntity.nama[daftarPasien.getIndexPoli()]
                            + "\nTanggal Lahir : " + new SimpleDateFormat("dd-MM-yyyy").format(daftarPasien.getPasien().getTgllahir()));
                    System.out.println("===============================================================");
                }
            }
        }
    }
}

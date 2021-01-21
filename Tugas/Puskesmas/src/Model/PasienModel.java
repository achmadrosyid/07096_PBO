package Model;

import java.util.ArrayList;
import Entity.PasienEntity;
import java.text.SimpleDateFormat;

public class PasienModel implements ModelInterfaces {

    private ArrayList<PasienEntity> pasienArrayList;

    public PasienModel() {
        pasienArrayList = new ArrayList<PasienEntity>();
    }

    public void insertPasien(PasienEntity pasien) {
        pasienArrayList.add(pasien);
    }

    public void updatePasien(int indexUser, PasienEntity pasien) {
        pasienArrayList.set(indexUser, pasien);
    }

    public PasienEntity getPasienArrayList(int index) {
        return pasienArrayList.get(index);
    }

    @Override
    public void view() {
        for (PasienEntity pasien : pasienArrayList) {
            System.out.println("========================================================");
            System.out.println(" NIK : " + pasien.getNik()
                    + "\n Nama : " + pasien.getNama()
                    + "\n Alamat : " + pasien.getAlamat()
                    + "\n Jenis Kelamin : " + pasien.getJeniskelamin()
                    + "\n Tanggal Lahir : " + new SimpleDateFormat("dd-MM-yyyy")
                            .format(pasien.getTgllahir()));
            System.out.println("========================================================");
            System.out.println();
        }
    }

    @Override
    public int cekData(int nik, String password) {
        int loop = 0;
        for (PasienEntity pasienEntity : pasienArrayList) {
            if (pasienEntity.getNik() == nik && pasienEntity.getPassword().equals(password)) {
                break;
            } else {
                loop++;
            }
        }
        return loop;
    }

}

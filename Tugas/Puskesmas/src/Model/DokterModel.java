package Model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import Entity.DokterEntity;
import Entity.PoliEntity;
public class DokterModel implements ModelInterfaces {

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
            System.out.println("NIK : " + dokter.getNik());
            System.out.println("NAMA : " + dokter.getNama());
            System.out.println("No Telephone : " + dokter.getNo_telp());
            System.out.println("Jenis Kelamin : " + dokter.getJeniskelamin());
            System.out.println("Tanggal Lahir : " + new SimpleDateFormat("dd-MM-yyyy").format(dokter.getTgllahir()));
            System.out.println("Alamat : " + dokter.getAlamat());
            System.out.println("========================================================");
            System.out.println();
        }
    }

    @Override
    public int cekData(int nik, String password) {
        int loop = 0;
        for (DokterEntity dokterEntity : DokterArrayList) {
            if (dokterEntity.getNik() == nik && dokterEntity.getPassword().equals(password)) {
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

    public String showPoliDokter(int indexPoli) {
        return PoliEntity.nama[indexPoli];
    }
}

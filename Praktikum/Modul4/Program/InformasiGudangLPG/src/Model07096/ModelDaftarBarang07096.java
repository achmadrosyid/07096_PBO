package Model07096;
import Entity07096.DaftarBarang07096;
import Entity07096.NamaAdmin07096;
import Model07096.ModelNamaAdmin07096;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */
public class ModelDaftarBarang07096 implements Interfaces07096 {
    private ArrayList<DaftarBarang07096> daftarBarang07096ArrayList;
    private DaftarBarang07096 daftarprak07096;
    
    ModelNamaAdmin07096 modeladmin = new ModelNamaAdmin07096();

    public ModelDaftarBarang07096() {
        daftarBarang07096ArrayList = new ArrayList<DaftarBarang07096>();
    }

    public void insertDataDaftar(DaftarBarang07096 daftarBarang07096) {
        daftarBarang07096ArrayList.add(daftarBarang07096);
    }

    public ArrayList<DaftarBarang07096> getDaftarBarangArrayList() {
        return daftarBarang07096ArrayList;
    }

    @Override
    public void view() {
         for (DaftarBarang07096 daftarBarang07096 : daftarBarang07096ArrayList) {
            System.out.println("===============================================================");
            System.out.println(" Kode Barang : " + daftarBarang07096.getKeluar().getKode()
                    + "\n Jenis Barang : " + daftarBarang07096.getKeluar().getJenis()
                    + "\n Harga Barang : " + daftarBarang07096.getKeluar().getHarga()
                    + "\n Tanggal Barang : " + new SimpleDateFormat("dd-MM-yyyy").format(daftarBarang07096.getKeluar().getTanggal())
                    + "\n Nama Admin : " + modeladmin.getListNamaAdmin07096().get(daftarBarang07096.getIndexBarang())
                    + "\n IsVerified : ");
            if (daftarBarang07096.isVerified() == false) {
                System.out.println("Belum Di Verifikasi Admin");
            } else {
                System.out.println("Telah Di Verifikasi");
            }
            System.out.println("===============================================================");
        }
    }

    @Override
    
        public int cekData(String kode) {
        int loop = 0;
        if (daftarBarang07096ArrayList.size() == 0) {
            loop = -1;//data kosong
        } else {
            for (int i = 0; i < daftarBarang07096ArrayList.size(); i++) {
                if (daftarBarang07096ArrayList.get(i).getKeluar().getKode().equals(kode)) {
                    loop = i;
                    break;
                } else {
                    loop = -2;
                }
            }
        }
        return loop;
    }

    public DaftarBarang07096 showDaftarBarang(int index) {
        return daftarBarang07096ArrayList.get(index);
    }
    
    public void updateIsVerified(int index,DaftarBarang07096 daftarBarang07096){
        daftarBarang07096ArrayList.set(index,daftarBarang07096);
    }
    
    }
        

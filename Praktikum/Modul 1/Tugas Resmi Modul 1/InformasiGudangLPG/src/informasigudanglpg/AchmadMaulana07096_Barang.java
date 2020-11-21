package InformasiGudangLPG;
import java.util.Date;
public class AchmadMaulana07096_Barang {
    String jenis;
    double harga,kode;
    Date tanggal;

    public double getKode() {
        return kode;
    }
     
    public String getJenis() {
        return jenis;
    }

    public double getHarga() {
        return harga;
    }
 
    public Date getTanggal() {
        return tanggal;
    }

    public AchmadMaulana07096_Barang(String jenis, double harga,double kode,Date Tanggal) {
        this.kode     = kode;
        this.jenis    = jenis;
        this.harga    = harga;
        this.tanggal  = Tanggal;
    }
}

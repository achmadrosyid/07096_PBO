package Entity;
import java.util.Date;
public class PasienEntity extends WargaAbstractEntity{

    public PasienEntity(String password, String nama, String no_telp, 
            String alamat, String jeniskelamin, int nik, Date tgllahir) {
        super(password, nama, no_telp, alamat, jeniskelamin, nik, tgllahir);
    }
}

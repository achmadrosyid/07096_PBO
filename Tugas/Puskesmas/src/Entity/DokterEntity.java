package Entity;

import java.util.Date;
public class DokterEntity extends WargaAbstractEntity {

    private int Poli;

    public DokterEntity(int Poli, String password, String nama, String no_telp, String alamat, String jeniskelamin, int nik, Date tgllahir) {
        super(password, nama, no_telp, alamat, jeniskelamin, nik, tgllahir);
        this.Poli = Poli;
    }

    public int getPoli() {
        return Poli;
    }
    
    public void setPoli(int Poli){
        this.Poli = Poli;
    }
}

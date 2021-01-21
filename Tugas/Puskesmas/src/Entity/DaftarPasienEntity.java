package Entity;
public class DaftarPasienEntity {

    private PasienEntity pasien;
    private int Poli;

    public DaftarPasienEntity(PasienEntity pasien, int Poli) {
        this.pasien = pasien;
        this.Poli = Poli;
    }

    public void setPasien(PasienEntity pasien) {
        this.pasien = pasien;
    }

    public PasienEntity getPasien() {
        return pasien;
    }

    public int getIndexPoli() {
        return Poli;
    }

    public void setIndexPoli(int Poli) {
        this.Poli = Poli;
    }
   
}

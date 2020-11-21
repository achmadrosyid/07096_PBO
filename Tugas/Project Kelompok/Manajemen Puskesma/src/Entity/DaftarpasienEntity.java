/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Bariq Qushoyyi
 */
public class DaftarpasienEntity {
    private PasienEntity pasien;
    private PoliEntity poli;
    private int indexPoli;

    public DaftarpasienEntity(PasienEntity pasien, PoliEntity poli, int indexPoli) {
        this.pasien = pasien;
        this.poli = poli;
        this.indexPoli = indexPoli;
    }

    public void setPasien(PasienEntity pasien) {
        this.pasien = pasien;
    }

    public void setPoli(PoliEntity poli) {
        this.poli = poli;
    }

    public void setIndexPoli(int indexPoli) {
        this.indexPoli = indexPoli;
    }

    public PasienEntity getPasien() {
        return pasien;
    }

    public PoliEntity getPoli() {
        return poli;
    }

    public int getIndexPoli() {
        return indexPoli;
    }
}

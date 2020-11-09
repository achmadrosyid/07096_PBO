/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manajemen.puskesma;

/**
 *
 * @author Bariq Qushoyyi
 */

public class Pasien extends Orang {
    String Penyakit;

    public Pasien(String Penyakit) {
        this.Penyakit = Penyakit;
    }

    String getPenyakit() {
        return this.Penyakit;
    }
}

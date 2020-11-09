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

public class Dokter extends Orang {
    String Spesialis;

    public Dokter(String Spesialis) {
        this.Spesialis = Spesialis;
    }

    String getSpesialis() {
        return this.Spesialis;
    }
}

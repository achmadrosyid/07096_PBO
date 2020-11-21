package InformasiGudangLPG;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class AchmadMaulana07096_Main {

    static Scanner inp = new Scanner(System.in);
    static ArrayList<AchmadMaulana07096_Barang> data = new ArrayList<>();

    public static void main(String[] args) {
        AchmadMaulana07096_Main achmad = new AchmadMaulana07096_Main();
        achmad.Tampil();
    }

    public void Tampil() {
        int pil;
        do {
            System.out.println("1. create");
            System.out.println("2. read");
            System.out.println("3. update");
            System.out.println("4. delete");
            System.out.println("0. exit");
            System.out.print("pilih ");
            pil = inp.nextInt();
            switch (pil) {
                case 1:
                    create();
                    break;
                case 2:
                    read();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
            }
        } while (pil != 0);
    }

    public void create() {
        System.out.print("Kode barang = ");
        double kode = inp.nextDouble();
        System.out.print("Jenis barang = ");
        String jenis = inp.next();
        System.out.print("harga barang = ");
        double harga = inp.nextDouble();
        System.out.print("Tanggal barang = ");
        Date tanggal = new Date(inp.next());
        data.add(new AchmadMaulana07096_Barang(jenis, harga, kode, tanggal));
    }

    public void read() {
        System.out.println(data.size());
        for (int i = 0; i < data.size(); i++) {
            System.out.println("Kode    = " + data.get(i).getKode());
            System.out.println("Jenis   = " + data.get(i).getJenis());
            System.out.println("Harga   = " + data.get(i).getHarga());
            System.out.println("Tanggal (dd/mm/yyyy) = " + data.get(i).getTanggal());
        }
    }

    public void update() {
        System.out.println("index ke ");
        int index = inp.nextInt();
        System.out.print("Kode barang = ");
        double kode = inp.nextDouble();
        System.out.print("Jenis barang = ");
        String jenis = inp.next();
        System.out.print("harga barang = ");
        double harga = inp.nextDouble();
        System.out.print("Tanggal barang (dd/mm/yyyy) = ");
        Date tanggal = new Date(inp.next());
        data.set(index, new AchmadMaulana07096_Barang(jenis, harga, kode, tanggal));
    }

    public void delete() {
        System.out.println("index ke ");
        int index = inp.nextInt();
        data.remove(index);
    }
}


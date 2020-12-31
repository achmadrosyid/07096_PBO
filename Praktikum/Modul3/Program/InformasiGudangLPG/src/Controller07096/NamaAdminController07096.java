package Controller07096;

import Entity07096.NamaAdmin07096;
import Entity07096.BarangKeluar07096;
import java.util.Date;
import java.util.ArrayList;

public class NamaAdminController07096 implements ControllerInterface07096{    
    public NamaAdminController07096(){
    }
    
    // insert data admin
    public void DataAdmin(){
        String Admin []    = {"Achmad","Maulana","Irman","Rosyid"};
        String Password [] = {"01","02","03","04"};

        for(int i = 0; i < Admin.length; i++) {
            // proses insert data dari view(main) -> controller -> model
            AllObjectModel07096.adminModel.insertAdmin(new NamaAdmin07096(Admin[i],Password[i]));
        }
    }

    @Override
    public void login(String Admin, String Password) {
    }

    
}
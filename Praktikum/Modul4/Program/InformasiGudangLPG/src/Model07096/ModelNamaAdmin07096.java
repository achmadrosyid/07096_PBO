/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model07096;
import Entity07096.NamaAdmin07096;
import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */
public class ModelNamaAdmin07096 {
    private ArrayList<NamaAdmin07096> NamaAdmin07096ArrayList;
  
    public ModelNamaAdmin07096() {
        NamaAdmin07096ArrayList = new ArrayList<NamaAdmin07096>();
        
    }
    public ArrayList<NamaAdmin07096> getListNamaAdmin07096(){
       return NamaAdmin07096ArrayList;
    }
//    public void DataAdmin() {
//       String Admin []    = {"Achmad","Maulana","Irman","Rosyid"};
//       String Password [] = {"01","02","03","04"};
//
//        for(int i = 0; i < Admin.length; i++) {
//            NamaAdmin07096ArrayList.add(new NamaAdmin07096(Admin[i],Password[i]));
//        }
//    }
    public int cekData(String admin, String password) {
        int loop = 0;
        boolean isLogin = false;
        for(NamaAdmin07096 adminEntity : NamaAdmin07096ArrayList) {
            if(adminEntity.getAdmin().equals(admin) && adminEntity.getPassword().equals(password)) {
                isLogin = true;
                break;
            } else {
                loop++;
            }
        }
        if(isLogin == false) loop = -1;
        return loop;
    }
     // insert data admin dengan parameter object data admin
    public void insertAdmin(NamaAdmin07096 admin) {
        NamaAdmin07096ArrayList.add(admin);
    }
     public NamaAdmin07096 showData(int index){
        return NamaAdmin07096ArrayList.get(index);
    }
}

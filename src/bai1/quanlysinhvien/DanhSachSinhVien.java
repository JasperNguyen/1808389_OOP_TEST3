
package bai1.quanlysinhvien;
import java.util.ArrayList;

public class DanhSachSinhVien {
    private final ArrayList<SinhVien> dsSv = new ArrayList<>();
    public boolean ktTrungma(String masv){
        for(SinhVien sv : dsSv){
            if(sv.getMasv().equalsIgnoreCase(masv))
            return true;
        }
        return false;
    }
    
    public boolean addSinhvien(SinhVien sv){
        if(ktTrungma(sv.getMasv()))
            return false;
        return dsSv.add(sv);
    }
    
    public SinhVien findSinhvien1(String masv){
        for(SinhVien sv : dsSv) {
            if(sv.getMasv().equalsIgnoreCase(masv))
                return sv;
        }
        return null;
    }
    
    public int findSinhvien2(String masv){
        for(int i=0;i<dsSv.size();i++){
            if(dsSv.get(i).getMasv().equalsIgnoreCase(masv))
                return i;
        }
        return -1;
    }
    
    public SinhVien updateSinhvien(int index,SinhVien sv){
        return dsSv.set(index, sv);
    }
    
    public void removeSinhvien(String masv){
        SinhVien sv=findSinhvien1(masv);
        dsSv.remove(sv);
        //int pos=findSinhvien2(masv);
        //dsSv.remove(pos);
    }
    
    public void sort(boolean sortDescending){
        dsSv.sort((SinhVien sv1, SinhVien sv2)->{
            int result = 0;
            
            result = sv1.getMasv().compareTo(sv2.getMasv());
            if(result != 0) return result;
            
            result = sv1.getTensv().compareTo(sv2.getTensv());
            if(result != 0) return result;
            
            result = sv1.getNamsinh().compareTo(sv2.getNamsinh());
            if(result != 0) return result;
            
            result = sv1.getDiachi().compareTo(sv2.getDiachi());
            if(result != 0) return result;
            
            result = sv1.getLop().compareTo(sv2.getLop());
            
            return result;
        });
    }
    
    
    
    @Override
    public String toString() {
        return dsSv.toString();
    }

}


package bai3;
import java.util.PriorityQueue;

public class QuanLyCongViec {

    public QuanLyCongViec() {
        this.dscv = new PriorityQueue<>();
    }
    
    
    public boolean themCongViec(Task task){
        return this.dscv.add(task);
    }
    
    public boolean xoaCongViec(Task task){
        return this.dscv.remove(task);
    }

    @Override
    public String toString() {
        String result = "";
        
        for(Task item: dscv){
            result += item.toString() + "\n";
        }
        
        return result;
    }
    
    public Integer soLuongCongViecTrongDanhSach(){
        return dscv.size();
    }
    
    PriorityQueue<Task> dscv;
}


package bai3;

import java.util.Iterator;
import java.util.PriorityQueue;


public class TestBai3 {
    public TestBai3(){
        QuanLyCongViec qlcv = new QuanLyCongViec();
        qlcv.themCongViec(new Task("Di Hoc", 15, 0));
        qlcv.themCongViec(new Task("Qua nha ban choi", 10, 0));
        qlcv.themCongViec(new Task("Qua nha co choi", 10, 0));
        qlcv.themCongViec(new Task("Qua nha chu di choi", 10, 0));
        qlcv.themCongViec(new Task("Qua nha thay choi", 12, 0));
        
        System.out.println(qlcv);
        System.out.println("So luong cong viec trong danh sach: " 
                + qlcv.soLuongCongViecTrongDanhSach() + " (cong viec)");
    }
}

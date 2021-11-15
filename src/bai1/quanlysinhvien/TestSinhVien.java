/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1.quanlysinhvien;

/**
 *
 * @author tk1tu
 */
public class TestSinhVien {

    public TestSinhVien() {
        DanhSachSinhVien qlsv=new DanhSachSinhVien();
        
        SinhVien teo=new SinhVien();
        teo.setMasv("115");
        teo.setTensv("Nguyễn Văn Tèo");
        qlsv.addSinhvien(teo);
        
        SinhVien ty=new SinhVien();
        ty.setMasv("113");
        ty.setTensv("Nguyễn Thị Bé");
        qlsv.addSinhvien(ty);
        
        SinhVien ty2=new SinhVien();
        ty2.setMasv("114");
        ty2.setTensv("Nguyễn Thị Tý");
        qlsv.addSinhvien(ty2);
        
        qlsv.sort(false);
        
        System.out.println(qlsv);
    }
    
}

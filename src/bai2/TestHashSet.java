package bai2;

public class TestHashSet {
    public TestHashSet(){
        QuanLySanPham qlsp = new QuanLySanPham();
        
        Product p0=new Product("p0", "Samsung Galaxy",3, 11);
        qlsp.themSanPham(p0);
        
        Product p1=new Product("p1", "Iphone 5", 2, 15);
        qlsp.themSanPham(p1);
        
        Product p2=new Product("p2", "Samsung sII",3, 11);
        qlsp.themSanPham(p2);
        
        System.out.println(qlsp);

    }
}

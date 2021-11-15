
package bai2;

import java.util.LinkedHashSet;


public class QuanLySanPham {
    public QuanLySanPham() {
        this.dssp = new LinkedHashSet<>();
    }
    
    public boolean themSanPham(Product product){
        return dssp.add(product);
    }
    
    public boolean xoaSanPham(Product product){
        return dssp.remove(product);
    }

    @Override
    public String toString() {
        String result = "";
        
        for(Product item: dssp){
            result += item.toString() + "\n";
        }
        
        return result;
    }
    
    LinkedHashSet<Product> dssp;
}

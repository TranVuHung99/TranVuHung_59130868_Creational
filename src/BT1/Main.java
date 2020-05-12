/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

/**
 *
 * @author KimKhanh
 */
import BT1.HoaDon;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HoaDonHeader hdh = new HoaDonHeader("001","10/04/2018","Hùng");
        CTHD ct1 = new CTHD("Tivi","1","1000000");
        CTHD ct2 = new CTHD("Tủ lạnh","1","2000000");
        CTHD ct3 = new CTHD("Máy giặt","1","3000000");
        CTHD ct4 = new CTHD("Điều hòa","1","4000000");
        
        HoaDon hd = new HoaDon.Builder()
                .addHeader(hdh)
                .addCT(ct1)
                .addCT(ct2)
                .addCT(ct3)
                .addCT(ct4)
                .build();
        System.out.println(hd.toString());
    }
    
}

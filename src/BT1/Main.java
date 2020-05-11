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
        
        HoaDon hd = new HoaDon.Build()
                .HoaDonHeader("001","10/04/1999","Hùng")
                .CTHD("Tivi","10","10000000")
                .build();
        System.out.println(hd.toString());
    }
    
}

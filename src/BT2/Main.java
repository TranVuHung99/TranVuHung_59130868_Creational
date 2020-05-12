/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

/**
 *
 * @author KimKhanh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MyStringBuilder mstr = new MyStringBuilder()
                .addString("Chiều cao:")
                .addFloat(1.65f)
                .addBool(true);
                
        System.out.println(mstr.toString());
    }
    
}

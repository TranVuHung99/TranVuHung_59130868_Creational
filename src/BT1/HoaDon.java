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
import java.util.ArrayList;
public class HoaDon {
    HoaDonHeader hdh;
    ArrayList<CTHD> ct = new ArrayList<>();
    
    protected HoaDon(Builder builder)
    {
        this.hdh = builder.hdh;
        this.ct = builder.ct;
    }

       
    public static class Builder
    {
        HoaDonHeader hdh;
        ArrayList<CTHD> ct = new ArrayList<>();

        public Builder() {
            this.ct = new ArrayList<>();
        }
        
        public Builder addHeader(HoaDonHeader hdh){
            this.hdh = hdh;
            return this;
        }
        public Builder addCT(CTHD ct){
            this.ct.add(ct);
            return this;
        }
        public HoaDon build(){
            return new HoaDon(this);
        }
    }

    @Override
    public String toString() {
        String s=hdh.toString();
        for(int i=0;i<ct.size();i++)
            s+="\n"+ct.get(i).toString();
        return s;
    }
    
}
    


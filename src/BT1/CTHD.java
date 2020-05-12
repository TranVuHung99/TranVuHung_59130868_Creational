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
public class CTHD {
    String SP ,SoLuong, DonGia;
    

    public CTHD(String SP, String SoLuong, String DonGia) {
        this.SP = SP;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
    }

    public void setSP(String SP) {
        this.SP = SP;
    }

    public void setSoLuong(String SoLuong) {
        this.SoLuong = SoLuong;
    }

    public void setDonGia(String DonGia) {
        this.DonGia = DonGia;
    }

    
    public String getSP() {
        return SP;
    }

    public String getSoLuong() {
        return SoLuong;
    }

    public String getDonGia() {
        return DonGia;
    }

    @Override
    public String toString() {
        return "CTHD{" + "SP=" + SP + ", SoLuong=" + SoLuong + ", DonGia=" + DonGia + '}';
    }
    
    
}

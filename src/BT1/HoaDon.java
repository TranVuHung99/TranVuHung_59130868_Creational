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
public class HoaDon {
    String MaHD, Ngayban, TenKH, SP, SoLuong, DonGia;

    protected HoaDon(Build build) {
        this.MaHD = build.MaHD;
        this.Ngayban = build.Ngayban;
        this.TenKH = build.TenKH;
        this.SP=build.SP;
        this.SoLuong=build.SoLuong;
        this.DonGia=build.DonGia;
    }


    @Override
    public String toString() {
        return "HoaDon{" + "MaHD=" + MaHD + ", Ngayban=" + Ngayban + ", TenKH=" + TenKH + ", SP=" + SP + ", SoLuong=" + SoLuong + ", DonGia=" + DonGia + '}';
    }
    
    public static class Build{
        String MaHD, Ngayban, TenKH, SP ,SoLuong, DonGia;

        public Build() {
        }
        public Build HoaDonHeader(String MaHD, String Ngayban, String TenKH){
            this.MaHD = MaHD;
            this.Ngayban = Ngayban;
            this.TenKH = TenKH;
            return this;
        }
        
        public Build CTHD(String SP, String SoLuong, String DonGia ){
            this.SP = SP;
            this.SoLuong = SoLuong;
            this.DonGia = DonGia;
            return this;
        }
        
        public HoaDon build(){
            return new HoaDon(this);
        }
    }
}
    


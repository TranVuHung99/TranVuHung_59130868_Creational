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
public class HoaDonHeader {
    String MaHD, Ngayban, TenKH;

    public HoaDonHeader(String MaHD, String Ngayban, String TenKH) {
        this.MaHD = MaHD;
        this.Ngayban = Ngayban;
        this.TenKH = TenKH;
    }

    public String getMaHD() {
        return MaHD;
    }

    public String getNgayban() {
        return Ngayban;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public void setNgayban(String Ngayban) {
        this.Ngayban = Ngayban;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    @Override
    public String toString() {
        return "HoaDonHeader{" + "MaHD=" + MaHD + ", Ngayban=" + Ngayban + ", TenKH=" + TenKH + '}';
    }
    
}

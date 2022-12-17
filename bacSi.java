/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Emilia
 */
public class bacSi {
    int MaBS;
    String HotenBS;
    String GioiTinh;
    String ChuyenMon;
    String KinhNghiem;

    public bacSi(int MaBS, String HotenBS, String GioiTinh, String ChuyenMon, String KinhNghiem) {
        this.MaBS = MaBS;
        this.HotenBS = HotenBS;
        this.GioiTinh = GioiTinh;
        this.ChuyenMon = ChuyenMon;
        this.KinhNghiem = KinhNghiem;
    }

    public int getMaBS() {
        return MaBS;
    }

    public String getHotenBS() {
        return HotenBS;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public String getChuyenMon() {
        return ChuyenMon;
    }

    public String getKinhNghiem() {
        return KinhNghiem;
    }

    public void setMaBS(int MaBS) {
        this.MaBS = MaBS;
    }

    public void setHotenBS(String HotenBS) {
        this.HotenBS = HotenBS;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public void setChuyenMon(String ChuyenMon) {
        this.ChuyenMon = ChuyenMon;
    }

    public void setKinhNghiem(String KinhNghiem) {
        this.KinhNghiem = KinhNghiem;
    }

    public bacSi() {
    }
  
}

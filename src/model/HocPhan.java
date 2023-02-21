/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class HocPhan {
    private String MaHP;
    private String TenHP;
    private int SoTinChi;

    public HocPhan(String MaHP, String TenHP, int SoTinChi) {
        this.MaHP = MaHP;
        this.TenHP = TenHP;
        this.SoTinChi = SoTinChi;
    }

    public String getMaHP() {
        return MaHP;
    }

    public void setMaHP(String MaHP) {
        this.MaHP = MaHP;
    }

    public String getTenHP() {
        return TenHP;
    }

    public void setTenHP(String TenHP) {
        this.TenHP = TenHP;
    }

    public int getSoTinChi() {
        return SoTinChi;
    }

    public void setSoTinChi(int SoTinChi) {
        this.SoTinChi = SoTinChi;
    }
}

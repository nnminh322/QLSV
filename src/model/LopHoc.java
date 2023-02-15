/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nnminh322
 */
public class LopHoc {
    private String MaLop;
    private String MaHP;
    private String MSGV;
    private String PhongHoc;
    private String ThoiGian;

    public LopHoc(String MaLop, String MaHP, String MSGV, String PhongHoc, String ThoiGian) {
        this.MaLop = MaLop;
        this.MaHP = MaHP;
        this.MSGV = MSGV;
        this.PhongHoc = PhongHoc;
        this.ThoiGian = ThoiGian;
    }

    public String getMaLop() {
        return MaLop;
    }

    public void setMaLop(String MaLop) {
        this.MaLop = MaLop;
    }

    public String getMaHP() {
        return MaHP;
    }

    public void setMaHP(String MaHP) {
        this.MaHP = MaHP;
    }

    public String getMSGV() {
        return MSGV;
    }

    public void setMSGV(String MSGV) {
        this.MSGV = MSGV;
    }

    public String getPhongHoc() {
        return PhongHoc;
    }

    public void setPhongHoc(String PhongHoc) {
        this.PhongHoc = PhongHoc;
    }

    public String getThoiGian() {
        return ThoiGian;
    }

    public void setThoiGian(String ThoiGian) {
        this.ThoiGian = ThoiGian;
    }

    @Override
    public String toString() {
        return "LopHoc{" + "MaLop=" + MaLop + ", MaHP=" + MaHP + ", MSGV=" + MSGV + ", PhongHoc=" + PhongHoc + ", ThoiGian=" + ThoiGian + '}';
    }

    
}

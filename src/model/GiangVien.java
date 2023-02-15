/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author nnminh322
 */
public class GiangVien {
    private String MSGV;
    private String HoTen;
    private String GioiTinh;
    private Date NgaySinh;
    private String QueQuan;
    private String SDT;
    private String Email;

    public GiangVien(String MSGV, String HoTen, String GioiTinh, Date NgaySinh, String QueQuan, String SDT, String Email) {
        this.MSGV = MSGV;
        this.HoTen = HoTen;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.QueQuan = QueQuan;
        this.SDT = SDT;
        this.Email = Email;
    }

    public String getMSGV() {
        return MSGV;
    }

    public void setMSGV(String MSGV) {
        this.MSGV = MSGV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String QueQuan) {
        this.QueQuan = QueQuan;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
}

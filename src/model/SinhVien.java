/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

public class SinhVien {
    private String MSSV;
    private String HoTen;
    private String GioiTinh;
    private Date NgaySinh;
    private String QueQuan;
    private String SDT;
    private String Email;

    public SinhVien(String MSSV, String HoTen, String GioiTinh, Date NgaySinh, String QueQuan, String SDT, String Email) {
        this.MSSV = MSSV;
        this.HoTen = HoTen;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.QueQuan = QueQuan;
        this.SDT = SDT;
        this.Email = Email;
    }

    public SinhVien() {
        super();
    }

    
    
    public SinhVien(String MSSV, String HoTen, String GioiTinh, String NgaySinh, String QueQuan, String SDT, String Email) {
        this.MSSV = MSSV;
        this.HoTen = HoTen;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = Date.valueOf(NgaySinh);
        this.QueQuan = QueQuan;
        this.SDT = SDT;
        this.Email = Email;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
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

    @Override
    public String toString() {
        return "SinhVien{" + "MSSV=" + MSSV + ", HoTen=" + HoTen + ", GioiTinh=" + GioiTinh + ", NgaySinh=" + NgaySinh + ", QueQuan=" + QueQuan + ", SDT=" + SDT + ", Email=" + Email + '}';
    }
    
    
}

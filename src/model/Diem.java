/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nnminh322
 */
public class Diem {
  private String maLop;
  private String maHP;
  private String MSSV;
  private float diemQT;
  private float diemCK;
  private float trongSoQT;

    public Diem(String maLop, String maHP, String MSSV, float diemQT, float diemCK, float trongSoQT) {
        this.maLop = maLop;
        this.maHP = maHP;
        this.MSSV = MSSV;
        this.diemQT = diemQT;
        this.diemCK = diemCK;
        this.trongSoQT = trongSoQT;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getMaHP() {
        return maHP;
    }

    public void setMaHP(String maHP) {
        this.maHP = maHP;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public float getDiemQT() {
        return diemQT;
    }

    public void setDiemQT(float diemQT) {
        this.diemQT = diemQT;
    }

    public float getDiemCK() {
        return diemCK;
    }

    public void setDiemCK(float diemCK) {
        this.diemCK = diemCK;
    }

    public float getTrongSoQT() {
        return trongSoQT;
    }

    public void setTrongSoQT(float trongSoQT) {
        this.trongSoQT = trongSoQT;
    }
}

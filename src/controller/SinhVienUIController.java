/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.DiemDAO;
import dao.GiangVienDAO;
import dao.HocPhanDAO;
import dao.LopHocDAO;
import dao.SinhVienDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Diem;
import model.GiangVien;
import model.HocPhan;
import model.LopHoc;
import model.SinhVien;
import view.Admin;
import view.SinhVienUI;
import view.ThemSua_Diem;
import view.ThemSua_GvSv;
import view.ThemSua_HocPhan;
import view.ThemSua_LopHoc;
import view.XacNhan;

/**
 *
 * @author nnminh322
 */
public class SinhVienUIController implements ActionListener {

    public SinhVienUI sinhVienUI;
    private ThemSua_GvSv themSua_GvSv;
    private XacNhan xacNhanView;
    private ThemSua_HocPhan themSua_HocPhan;
    private ThemSua_LopHoc themSua_Lop;
    private ThemSua_Diem themSua_Diem;

    public SinhVienUIController() {
        super();
    }

    public SinhVienUIController(SinhVienUI sinhVienUI) {
        this.sinhVienUI = sinhVienUI;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Tìm kiếm học phần")) {
            String Condition = sinhVienUI.getjComboBox_TimKiemHocPhan().getSelectedItem() + " LIKE '%" + sinhVienUI.getjTextField_TuKhoaHocPhan().getText() + "%'";
            sinhVienUI.timKiemHocPhan(this.timKiemHocPhan(Condition));
        }
        if (actionCommand.equals("Tìm kiếm lớp học")) {
            String Condition = sinhVienUI.getjComboBox_TimKiemLopHoc().getSelectedItem() + " LIKE '%" + sinhVienUI.getjTextField_TuKhoaLopHoc().getText() + "%'";
            sinhVienUI.timKiemLopHoc(this.timKiemLopHoc(Condition));
        }
        if (actionCommand.equals("Tìm kiếm điểm")) {
            String Condition = sinhVienUI.getjComboBox_TimKiemDiem().getSelectedItem() + " LIKE '%" + sinhVienUI.getjTextField_TuKhoaDiem().getText() + "%'";
            sinhVienUI.timKiemDiem(this.timKiemDiem(Condition));
        }
    }

    public ArrayList<SinhVien> hienThiSinhVien(String MSSV) {
        String Condition = "`MSSV` LIKE '" + MSSV + "'";
        return SinhVienDAO.getInstance().find(Condition);
    }

    public ArrayList<GiangVien> hienThiGiangVien() {
        return GiangVienDAO.getInstance().selectAll();
    }

    public ArrayList<HocPhan> hienThiHocPhan() {
        return HocPhanDAO.getInstance().selectAll();
    }

    public ArrayList<LopHoc> hienThiLopHoc() {
        return LopHocDAO.getInstance().selectAll();
    }

    public ArrayList<Diem> hienThiDiem(String MSSV) {
        String Condition = "`MSSV` LIKE '" + MSSV + "'";
        return DiemDAO.getInstance().find(Condition);
    }

    public ArrayList<SinhVien> timKiemSinhVien(String Condition) {
        return SinhVienDAO.getInstance().find(Condition);
    }

    public ArrayList<HocPhan> timKiemHocPhan(String Condition) {
        return HocPhanDAO.getInstance().find(Condition);
    }

    public ArrayList<LopHoc> timKiemLopHoc(String Condition) {
        return LopHocDAO.getInstance().find(Condition);
    }

    public ArrayList<Diem> timKiemDiem(String Condition) {
        return DiemDAO.getInstance().find(Condition);
    }

    public ArrayList<Diem> tinhtoanCPA(String MSSV) {
        String Condition = "`MSSV` LIKE '" + MSSV + "'";
        return DiemDAO.getInstance().tinhToanCPA(Condition);
    }
}

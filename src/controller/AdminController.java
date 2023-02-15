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
import javax.swing.Action;
import javax.swing.JOptionPane;
import model.Diem;
import model.GiangVien;
import model.HocPhan;
import model.LopHoc;
import model.SinhVien;
import view.Admin;
import view.ThemSua_Diem;
import view.ThemSua_GvSv;
import view.ThemSua_HocPhan;
import view.ThemSua_LopHoc;
import view.XacNhan;

/**
 *
 * @author nnminh322
 */
public class AdminController implements ActionListener {

    public Admin adminView;
    private ThemSua_GvSv themSua_GvSv;
    private XacNhan xacNhanView;
    private ThemSua_HocPhan themSua_HocPhan;
    private ThemSua_LopHoc themSua_Lop;
    private ThemSua_Diem themSua_Diem;

    public AdminController() {
        super();
    }

    public Admin getAdminView() {
        return adminView;
    }

    public void setAdminView(Admin adminView) {
        this.adminView = adminView;
    }

    public AdminController(Admin adminView) {
        this.adminView = adminView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Thêm mới sinh viên") || actionCommand.equals("Thêm mới giảng viên") || actionCommand.equals("Sửa giảng viên")) {
            themSua_GvSv = new ThemSua_GvSv(this.adminView);
            themSua_GvSv.setTitle(actionCommand);
            this.themSua_GvSv.setVisible(true);
//            JOptionPane.showMessageDialog(adminView, "Bạn vừa thực hiện " + actionCommand);          
        }
        if (actionCommand.equals("Xoá")) {
            xacNhanView = new XacNhan();
            xacNhanView.setVisible(true);
        }

        if (actionCommand.equals("Thêm mới học phần") || actionCommand.equals("Sửa học phần")) {
            themSua_HocPhan = new ThemSua_HocPhan(this.adminView);
            themSua_HocPhan.setTitle(actionCommand);
            this.themSua_HocPhan.setVisible(true);
        }
        if (actionCommand.equals("Thêm mới lớp học") || actionCommand.equals("Sửa lớp học")) {
            themSua_Lop = new ThemSua_LopHoc(this.adminView);
            themSua_Lop.setTitle(actionCommand);
            this.themSua_Lop.setVisible(true);
        }
        if (actionCommand.equals("Thêm mới điểm") || actionCommand.equals("Sửa điểm")) {
            themSua_Diem = new ThemSua_Diem(this.adminView);
            themSua_Diem.setTitle(actionCommand);
            this.themSua_Diem.setVisible(true);
        }
        if (actionCommand.equals("Sửa sinh viên")) {
            int ChonSinhVien = adminView.getjTable_SinhVien().getSelectedRow();
            if (ChonSinhVien == -1) {
                JOptionPane.showMessageDialog(xacNhanView, "Bạn chưa chọn sinh viên!");
            } else {

            }

        }
        if (actionCommand.equals("Xoá sinh viên")) {
            int ChonSinhVien = adminView.getjTable_SinhVien().getSelectedRow();
            if (ChonSinhVien == -1) {
                JOptionPane.showMessageDialog(xacNhanView, "Bạn chưa chọn sinh viên!");
            } else {
                String MSSV = adminView.getjTable_SinhVien().getValueAt(ChonSinhVien, 0).toString();
                String HoTen = adminView.getjTable_SinhVien().getValueAt(ChonSinhVien, 1).toString();
                String GioiTinh = adminView.getjTable_SinhVien().getValueAt(ChonSinhVien, 2).toString();
                java.sql.Date NgaySinh = java.sql.Date.valueOf(adminView.getjTable_SinhVien().getValueAt(ChonSinhVien, 3).toString());
                String QueQuan = adminView.getjTable_SinhVien().getValueAt(ChonSinhVien, 4).toString();
                String SDT = adminView.getjTable_SinhVien().getValueAt(ChonSinhVien, 5).toString();
                String Email = adminView.getjTable_SinhVien().getValueAt(ChonSinhVien, 6).toString();

                SinhVien sinhVien = new SinhVien(MSSV, HoTen, GioiTinh, NgaySinh, QueQuan, SDT, Email);
                xacNhanView = new XacNhan(adminView, sinhVien);
                xacNhanView.setTitle(actionCommand);
                xacNhanView.setVisible(true);
            }
        }
        if (actionCommand.equals("Xoá giảng viên")) {
            int ChonGiangVien = adminView.getjTable_GiangVien().getSelectedRow();
            if (ChonGiangVien == -1) {
                JOptionPane.showMessageDialog(xacNhanView, "Bạn chưa chọn giảng viên!");
            } else {
                String MSGV = adminView.getjTable_GiangVien().getValueAt(ChonGiangVien, 0).toString();
                String HoTen = adminView.getjTable_GiangVien().getValueAt(ChonGiangVien, 1).toString();
                String GioiTinh = adminView.getjTable_GiangVien().getValueAt(ChonGiangVien, 2).toString();
                java.sql.Date NgaySinh = java.sql.Date.valueOf(adminView.getjTable_GiangVien().getValueAt(ChonGiangVien, 3).toString());
                String QueQuan = adminView.getjTable_GiangVien().getValueAt(ChonGiangVien, 4).toString();
                String SDT = adminView.getjTable_GiangVien().getValueAt(ChonGiangVien, 5).toString();
                String Email = adminView.getjTable_GiangVien().getValueAt(ChonGiangVien, 6).toString();

                GiangVien giangVien = new GiangVien(MSGV, HoTen, GioiTinh, NgaySinh, QueQuan, SDT, Email);
                xacNhanView = new XacNhan(adminView, giangVien);
                xacNhanView.setTitle(actionCommand);
                xacNhanView.setVisible(true);
            }
        }

    }

    public ArrayList<SinhVien> hienThiSinhVien() {
        return SinhVienDAO.getInstance().selectAll();
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

    public ArrayList<Diem> hienThiDiem() {
        return DiemDAO.getInstance().selectAll();
    }
}

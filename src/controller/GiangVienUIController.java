/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.DiemDAO;
import dao.GiangVienDAO;
import dao.HocPhanDAO;
import dao.LopHocDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Diem;
import model.GiangVien;
import model.HocPhan;
import model.LopHoc;
import view.GiangVienUI;
import view.ThemSua_Diem;
import view.XacNhan;

public class GiangVienUIController implements ActionListener {

    public GiangVienUI giangVienUI;
    private XacNhan xacNhanView;
    private ThemSua_Diem themSua_Diem;

    public GiangVienUIController() {
        super();
    }

    public GiangVienUIController(GiangVienUI giangVienUI) {
        this.giangVienUI = giangVienUI;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();

        if (actionCommand.equals("Thêm mới điểm")) {
            themSua_Diem = new ThemSua_Diem(this.giangVienUI);
            themSua_Diem.setTitle(actionCommand);
            this.themSua_Diem.setVisible(true);
        }

        if (actionCommand.equals("Xoá điểm")) {
            int ChonDiem = giangVienUI.getjTable_Diem().getSelectedRow();
            if (ChonDiem == -1) {
                JOptionPane.showMessageDialog(xacNhanView, "Bạn chưa chọn điểm!");
            } else {
                String maLop = giangVienUI.getjTable_Diem().getValueAt(ChonDiem, 0).toString();
                String maHP = giangVienUI.getjTable_Diem().getValueAt(ChonDiem, 1).toString();
                String MSSV = giangVienUI.getjTable_Diem().getValueAt(ChonDiem, 2).toString();
                float diemQT = Float.parseFloat(giangVienUI.getjTable_Diem().getValueAt(ChonDiem, 3).toString());
                float diemCK = Float.parseFloat(giangVienUI.getjTable_Diem().getValueAt(ChonDiem, 4).toString());
                float trongSoQT = Float.parseFloat(giangVienUI.getjTable_Diem().getValueAt(ChonDiem, 5).toString());

                Diem diem = new Diem(maLop, maHP, MSSV, diemQT, diemCK, trongSoQT);
                xacNhanView = new XacNhan(giangVienUI, diem);
                xacNhanView.setTitle(actionCommand);
                xacNhanView.setVisible(true);
            }
        }
        if (actionCommand.equals("Sửa điểm")) {
            int ChonDiem = giangVienUI.getjTable_Diem().getSelectedRow();
            if (ChonDiem == -1) {
                JOptionPane.showMessageDialog(xacNhanView, "Bạn chưa chọn điểm!");
            } else {
                String maLop = giangVienUI.getjTable_Diem().getValueAt(ChonDiem, 0).toString();
                String maHP = giangVienUI.getjTable_Diem().getValueAt(ChonDiem, 1).toString();
                String MSSV = giangVienUI.getjTable_Diem().getValueAt(ChonDiem, 2).toString();
                float diemQT = Float.parseFloat(giangVienUI.getjTable_Diem().getValueAt(ChonDiem, 3).toString());
                float diemCK = Float.parseFloat(giangVienUI.getjTable_Diem().getValueAt(ChonDiem, 4).toString());
                float trongSoQT = Float.parseFloat(giangVienUI.getjTable_Diem().getValueAt(ChonDiem, 5).toString());

                Diem diem = new Diem(maLop, maHP, MSSV, diemQT, diemCK, trongSoQT);
                themSua_Diem = new ThemSua_Diem(giangVienUI);
                themSua_Diem.setTitle(actionCommand);
                themSua_Diem.suaDiem(diem);
                themSua_Diem.setVisible(true);

            }
        }

        if (actionCommand.equals("Tìm kiếm học phần")) {
            String Condition = giangVienUI.getjComboBox_TimKiemHocPhan().getSelectedItem() + " LIKE '%" + giangVienUI.getjTextField_TuKhoaHocPhan().getText() + "%'";
            giangVienUI.timKiemHocPhan(this.timKiemHocPhan(Condition));
        }
        if (actionCommand.equals("Tìm kiếm lớp học")) {
            String Condition = giangVienUI.getjComboBox_TimKiemLopHoc().getSelectedItem() + " LIKE '%" + giangVienUI.getjTextField_TuKhoaLopHoc().getText() + "%'";
            giangVienUI.timKiemLopHoc(this.timKiemLopHoc(Condition));
        }
        if (actionCommand.equals("Tìm kiếm điểm")) {
            String Condition = giangVienUI.getjComboBox_TimKiemDiem().getSelectedItem() + " LIKE '%" + giangVienUI.getjTextField_TuKhoaDiem().getText() + "%'";
            giangVienUI.timKiemDiem(this.timKiemDiem(Condition));
        }
    }

    public ArrayList<GiangVien> hienThiGiangVien(String MSGV) {
        String Condition = "`MSGV` LIKE '" + MSGV + "'";
        return GiangVienDAO.getInstance().find(Condition);
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

    public ArrayList<HocPhan> timKiemHocPhan(String Condition) {
        return HocPhanDAO.getInstance().find(Condition);
    }

    public ArrayList<LopHoc> timKiemLopHoc(String Condition) {
        return LopHocDAO.getInstance().find(Condition);
    }

    public ArrayList<Diem> timKiemDiem(String Condition) {
        return DiemDAO.getInstance().find(Condition);
    }
}

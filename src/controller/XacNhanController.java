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
import javax.swing.JOptionPane;
import model.Diem;
import model.GiangVien;
import model.HocPhan;
import model.LopHoc;
import model.SinhVien;
import view.XacNhan;

public class XacNhanController implements ActionListener {

    private SinhVien sinhVien;
    private GiangVien giangVien;
    private HocPhan hocPhan;
    private LopHoc lopHoc;
    private Diem diem;
    public XacNhan xacNhanView;

    public XacNhanController(XacNhan xacNhanView) {
        this.xacNhanView = xacNhanView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Xác nhận")) {
            String tittle = this.xacNhanView.getTitle();
            if (tittle.equals("Xoá sinh viên")) {
                this.delete(xacNhanView.sinhVien);
//                System.out.println(this.xacNhanView.sinhVien.toString());
            }
            if (tittle.equals("Xoá giảng viên")) {
                this.delete(xacNhanView.giangVien);
//                System.out.println(this.xacNhanView.sinhVien.toString());
            }
            if (tittle.equals("Xoá học phần")) {
                this.delete(xacNhanView.hocPhan);
//                System.out.println(this.xacNhanView.sinhVien.toString());
            }
            if (tittle.equals("Xoá lớp học")) {
                this.delete(xacNhanView.lopHoc);
//                System.out.println(this.xacNhanView.sinhVien.toString());
            }
            if (tittle.equals("Xoá điểm")) {
                this.delete(xacNhanView.diem);
//                System.out.println(this.xacNhanView.sinhVien.toString());
            }
            JOptionPane.showMessageDialog(xacNhanView, "Đã xoá");
            this.xacNhanView.dispose();
        }

//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private int delete(SinhVien sinhVien) {
        return SinhVienDAO.getInstance().delete(sinhVien);
    }

    private int delete(GiangVien giangVien) {
        return GiangVienDAO.getInstance().delete(giangVien);
    }
    private int delete(HocPhan hocPhan) {
        return HocPhanDAO.getInstance().delete(hocPhan);
    }
    private int delete(LopHoc lopHoc) {
        return LopHocDAO.getInstance().delete(lopHoc);
    }
    private int delete(Diem diem) {
        return DiemDAO.getInstance().delete(diem);
    }
}

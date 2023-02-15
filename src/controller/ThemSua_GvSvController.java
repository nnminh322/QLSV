package controller;

import dao.GiangVienDAO;
import dao.SinhVienDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import model.GiangVien;
import model.SinhVien;
import view.ThemSua_GvSv;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author nnminh322
 */
public class ThemSua_GvSvController implements ActionListener {

    public ThemSua_GvSv themSua_GvSvView;
    private SinhVien sinhVienCu;
    private GiangVien giangVienCu;

    public ThemSua_GvSvController() {
        super();
    }

    public ThemSua_GvSvController(ThemSua_GvSv themSua_GvSvView) {
        this.themSua_GvSvView = themSua_GvSvView;
    }

    public ThemSua_GvSv getThemSua_GvSvView() {
        return themSua_GvSvView;
    }

    public void setThemSua_GvSvView(ThemSua_GvSv themSua_GvSvView) {
        this.themSua_GvSvView = themSua_GvSvView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Lưu")) {
            String MS = themSua_GvSvView.getjTextField_MS().getText();
            String HoTen = themSua_GvSvView.getjTextField_HoTen().getText();
            String GioiTinh = (String) themSua_GvSvView.getjComboBox_GioiTinh().getSelectedItem();

            java.util.Date selectedDate = themSua_GvSvView.getjDateChooser_NgaySinh().getDate();
            java.sql.Date NgaySinh = java.sql.Date.valueOf(selectedDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());

            String QueQuan = themSua_GvSvView.getjTextField_QueQuan().getText();
            String SDT = themSua_GvSvView.getjTextField_SDT().getText();
            String Email = themSua_GvSvView.getjTextField_Email().getText();
            if (themSua_GvSvView.getTitle().equals("Thêm mới sinh viên")) {
                SinhVien sv = new SinhVien(MS, HoTen, GioiTinh, NgaySinh, QueQuan, SDT, Email);
//            System.out.println(themSua_GvSvView.getTitle());
                this.insert(sv);
            }

            if (themSua_GvSvView.getTitle().equals("Thêm mới giảng viên")) {
                GiangVien gv = new GiangVien(MS, HoTen, GioiTinh, NgaySinh, QueQuan, SDT, Email);
//            System.out.println(themSua_GvSvView.getTitle());
                this.insert(gv);
            }

            JOptionPane.showMessageDialog(themSua_GvSvView, "Đã lưu!");
            themSua_GvSvView.dispose();

        }
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int insert(SinhVien sinhVien) {
        return SinhVienDAO.getInstance().insert(sinhVien);
    }

    public int insert(GiangVien giangVien) {
        return GiangVienDAO.getInstance().insert(giangVien);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.LopHocDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.LopHoc;
import view.ThemSua_LopHoc;

public class ThemSua_LopHocController implements ActionListener {

    public ThemSua_LopHoc themSua_LopHocView;

    public ThemSua_LopHoc getThemSua_LopHocView() {
        return themSua_LopHocView;
    }

    public void setThemSua_LopHocView(ThemSua_LopHoc themSua_LopHocView) {
        this.themSua_LopHocView = themSua_LopHocView;
    }

    public ThemSua_LopHocController(ThemSua_LopHoc themSua_LopHocView) {
        super();
        this.themSua_LopHocView = themSua_LopHocView;
    }

    public ThemSua_LopHocController() {
        super();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Lưu")) {
            String tittle = themSua_LopHocView.getTitle();
            String MaLop = themSua_LopHocView.getjTextField_MaLop().getText();
            String MaHP = themSua_LopHocView.getjTextField_MaHopPhan().getText();
            String MSGV = themSua_LopHocView.getjTextField_MSGV().getText();
            String PhongHoc = themSua_LopHocView.getjTextField_PhongHoc().getText();
            String ThoiGian = themSua_LopHocView.getjTextField_ThoiGian().getText();

            LopHoc lopHoc = new LopHoc(MaLop, MaHP, MSGV, PhongHoc, ThoiGian);
//            System.out.println(lopHoc.toString());
            if (tittle.equals("Thêm mới lớp học")) {
                this.insert(lopHoc);
            }
            if (tittle.equals("Sửa lớp học")) {
                this.update(lopHoc);
            }
            JOptionPane.showMessageDialog(themSua_LopHocView, "Đã lưu");
            this.themSua_LopHocView.dispose();

        }
    }

    public int insert(LopHoc lopHoc) {
        return LopHocDAO.getInstance().insert(lopHoc);
    }

    public int update(LopHoc lopHoc) {
        return LopHocDAO.getInstance().update(lopHoc);
    }
}

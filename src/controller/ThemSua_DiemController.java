/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.DiemDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Diem;
import model.HocPhan;
import view.Admin;
import view.ThemSua_Diem;

/**
 *
 * @author nnminh322
 */
public class ThemSua_DiemController implements ActionListener {

    public ThemSua_Diem themSua_DiemView;

    public ThemSua_DiemController(ThemSua_Diem themSua_DiemView) {
        super();
        this.themSua_DiemView = themSua_DiemView;
    }

    public ThemSua_DiemController() {
        super();
    }

    public ThemSua_Diem getThemSua_DiemView() {
        return themSua_DiemView;
    }

    public void setThemSua_DiemView(ThemSua_Diem themSua_DiemView) {
        this.themSua_DiemView = themSua_DiemView;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Lưu")) {
            String maLop = themSua_DiemView.getjTextField_MaLop().getText();
            String maHP = themSua_DiemView.getjTextField_MaHocPhan().getText();
            String MSSV = themSua_DiemView.getjTextField_MSSV().getText();
            float diemQT = Float.parseFloat(themSua_DiemView.getjTextField_DiemQT().getText());
            float diemCK = Float.parseFloat(themSua_DiemView.getjTextField_DiemCK().getText());
            float trongSoQT = Float.parseFloat(themSua_DiemView.getjTextField_TrongSo().getText());

            Diem diem = new Diem(maLop, maHP, MSSV, diemQT, diemCK, trongSoQT);
            this.insert(diem);
            JOptionPane.showMessageDialog(themSua_DiemView, "Đã lưu");
            themSua_DiemView.dispose();

        }
    }

    public int insert(Diem diem) {
        return DiemDAO.getInstance().insert(diem);
    }

}

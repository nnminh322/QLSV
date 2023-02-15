/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.HocPhanDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.HocPhan;
import view.ThemSua_HocPhan;

/**
 *
 * @author nnminh322
 */
public class ThemSua_HocPhanController implements ActionListener{

    public ThemSua_HocPhan themSua_HocPhanView;

    public ThemSua_HocPhanController(ThemSua_HocPhan themSua_HocPhanView) {
        super();
        this.themSua_HocPhanView = themSua_HocPhanView;
    }

    public ThemSua_HocPhanController() {
        super();
    }

    public ThemSua_HocPhan getThemSua_HocPhanView() {
        return themSua_HocPhanView;
    }

    public void setThemSua_HocPhanView(ThemSua_HocPhan themSua_HocPhanView) {
        this.themSua_HocPhanView = themSua_HocPhanView;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Lưu")) {
            String MaHP = themSua_HocPhanView.getjTextField_MaHP().getText();
            String TenHP = themSua_HocPhanView.getjTextField_TenHP().getText();
            int SoTinChi = Integer.parseInt(themSua_HocPhanView.getjTextField_SoTinChi().getText());
            
            HocPhan hocPhan = new HocPhan(MaHP, TenHP, SoTinChi);
            this.insert(hocPhan);
            JOptionPane.showMessageDialog(themSua_HocPhanView, "Đã lưu");
            themSua_HocPhanView.dispose();
            
        }
    }
    
    public int insert(HocPhan hocPhan){
        return HocPhanDAO.getInstance().insert(hocPhan);
    }
}

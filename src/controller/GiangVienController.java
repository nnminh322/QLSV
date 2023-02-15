/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.GiangVienUI;
import view.ThemSua_Diem;

/**
 *
 * @author nnminh322
 */
public class GiangVienController implements ActionListener{
        public GiangVienUI giangVienView;
        private ThemSua_Diem themSua_Diem;

    public GiangVienController(GiangVienUI giangVienView) {
        this.giangVienView = giangVienView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Thêm mới điểm")) {
            themSua_Diem = new ThemSua_Diem();
            themSua_Diem.setTitle(actionCommand);
            this.themSua_Diem.setVisible(true);
        }
    }
        
        
}

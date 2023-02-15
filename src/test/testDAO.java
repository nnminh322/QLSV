/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import dao.SinhVienDAO;
import java.sql.Date;
import java.util.ArrayList;
import model.SinhVien;

/**
 *
 * @author nnminh322
 */
public class testDAO {

    public static void main(String[] args) {
        SinhVien sv2 = new SinhVien("SV07", "Trần Thị R", "Nữ","2002-03-04", "Hồ Chí Minh", "9876543210", "b@gmail.com");
        ArrayList<SinhVien> listSinhVien = SinhVienDAO.getInstance().selectAll();
        for (SinhVien sinhVien : listSinhVien) {
            System.out.println(sinhVien.toString());
        }
    }

}

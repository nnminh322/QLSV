/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.ConnectionToDB;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.SinhVien;
import java.sql.*;

/**
 *
 * @author nnminh322
 */
public class SinhVienDAO implements DAOInterface<SinhVien> {

    public static SinhVienDAO getInstance() {
        return new SinhVienDAO();
    }

    @Override
    public int insert(SinhVien t) {
        int ketQua;
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "INSERT INTO `SinhVien` (`MSSV`, `HoTen`, `GioiTinh`, `NgaySinh`, `QueQuan`, `SDT`, `Email`) VALUES ('" + t.getMSSV() + "', '" + t.getHoTen() + "', '" + t.getGioiTinh() + "', '" + t.getNgaySinh() + "', '" + t.getQueQuan() + "', '" + t.getSDT() + "', '" + t.getEmail() + "')";

//            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            ConnectionToDB.close(conn);
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }


    @Override
    public int delete(SinhVien t) {
        int ketQua;
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();
            
            String sql = "DELETE FROM SinhVien WHERE `SinhVien`.`MSSV` = '"+t.getMSSV()+"'";

//            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            ConnectionToDB.close(conn);
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public ArrayList<SinhVien> selectAll() {
        ArrayList<SinhVien> listSinhVien = new ArrayList<SinhVien>();
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "SELECT * FROM SinhVien";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String MSSV = rs.getString("MSSV");
                String HoTen = rs.getString("HoTen");
                String GioiTinh = rs.getString("GioiTinh");
                Date NgaySinh = rs.getDate("NgaySinh");
                String QueQuan = rs.getString("QueQuan");
                String SDT = rs.getString("SDT");
                String Email = rs.getString("Email");
                
                SinhVien sinhVien = new SinhVien(MSSV, HoTen, GioiTinh, NgaySinh, QueQuan, SDT, Email);
                listSinhVien.add(sinhVien);
            }

            ConnectionToDB.close(conn);
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return listSinhVien;
    }

    @Override
    public ArrayList<SinhVien> find(String Condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(SinhVien tCu, SinhVien tMoi) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

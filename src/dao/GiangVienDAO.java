/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.ConnectionToDB;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.GiangVien;
import model.SinhVien;

/**
 *
 * @author nnminh322
 */
public class GiangVienDAO implements DAOInterface<GiangVien>{

    public static GiangVienDAO getInstance(){
        return new GiangVienDAO();
    }
    
    @Override
    public int insert(GiangVien t) {
        int ketQua;
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "INSERT INTO `GiangVien` (`MSGV`, `HoTen`, `GioiTinh`, `NgaySinh`, `QueQuan`, `SDT`, `Email`) VALUES ('" + t.getMSGV() + "', '" + t.getHoTen() + "', '" + t.getGioiTinh() + "', '" + t.getNgaySinh() + "', '" + t.getQueQuan() + "', '" + t.getSDT() + "', '" + t.getEmail() + "')";

//            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            ConnectionToDB.close(conn);
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        } catch (SQLException ex) {
            Logger.getLogger(GiangVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }



    @Override
    public int delete(GiangVien t) {
        
        int ketQua;
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();
            
            String sql = "DELETE FROM GiangVien WHERE `GiangVien`.`MSGV` = '"+t.getMSGV()+"'";

//            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            ConnectionToDB.close(conn);
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        } catch (SQLException ex) {
            Logger.getLogger(GiangVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public ArrayList<GiangVien> selectAll() {
        ArrayList<GiangVien> listGiangVien = new ArrayList<GiangVien>();
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "SELECT * FROM GiangVien";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String MSGV = rs.getString("MSGV");
                String HoTen = rs.getString("HoTen");
                String GioiTinh = rs.getString("GioiTinh");
                Date NgaySinh = rs.getDate("NgaySinh");
                String QueQuan = rs.getString("QueQuan");
                String SDT = rs.getString("SDT");
                String Email = rs.getString("Email");
                
                GiangVien giangVien = new GiangVien(MSGV, HoTen, GioiTinh, NgaySinh, QueQuan, SDT, Email);
                listGiangVien.add(giangVien);
            }

            ConnectionToDB.close(conn);
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        } catch (SQLException ex) {
            Logger.getLogger(GiangVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return listGiangVien;
    }

    @Override
    public ArrayList<GiangVien> find(String Condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(GiangVien tCu, GiangVien tMoi) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

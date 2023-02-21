/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.ConnectionToDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.LopHoc;

/**
 *
 * @author nnminh322
 */
public class LopHocDAO implements DAOInterface<LopHoc> {

    public static LopHocDAO getInstance() {
        return new LopHocDAO();
    }

    @Override
    public int insert(LopHoc t) {
        int ketQua;
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "INSERT INTO `LopHoc` (`MaLop`, `MaHP`, `MSGV`, `PhongHoc`, `ThoiGian`) VALUES ('" + t.getMaLop() + "', '" + t.getMaHP() + "', '" + t.getMSGV() + "', '" + t.getPhongHoc() + "', '" + t.getThoiGian() + "');";
//            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            ConnectionToDB.close(conn);
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        } catch (SQLException ex) {
            Logger.getLogger(LopHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public int delete(LopHoc t) {
        int ketQua;
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "DELETE FROM LopHoc WHERE `LopHoc`.`MaLop` = '" + t.getMaLop() + "'";
//            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            ConnectionToDB.close(conn);
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        } catch (SQLException ex) {
            Logger.getLogger(HocPhanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public ArrayList<LopHoc> selectAll() {
        ArrayList<LopHoc> listLopHoc = new ArrayList<LopHoc>();
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "SELECT * FROM LopHoc";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String MaLop = rs.getString("MaLop");

                String MaHP = rs.getString("MaHP");
                String MSGV = rs.getString("MSGV");
                String PhongHoc = rs.getString("PhongHoc");
                String ThoiGian = rs.getString("ThoiGian");

                LopHoc lopHoc = new LopHoc(MaLop, MaHP, MSGV, PhongHoc, ThoiGian);
                listLopHoc.add(lopHoc);
            }

            ConnectionToDB.close(conn);
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        } catch (SQLException ex) {
            Logger.getLogger(LopHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return listLopHoc;
    }

    @Override
    public ArrayList<LopHoc> find(String Condition) {
        ArrayList<LopHoc> listLopHoc = new ArrayList<LopHoc>();
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "SELECT * FROM LopHoc WHERE " + Condition;

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String MaLop = rs.getString("MaLop");

                String MaHP = rs.getString("MaHP");
                String MSGV = rs.getString("MSGV");
                String PhongHoc = rs.getString("PhongHoc");
                String ThoiGian = rs.getString("ThoiGian");

                LopHoc lopHoc = new LopHoc(MaLop, MaHP, MSGV, PhongHoc, ThoiGian);
                listLopHoc.add(lopHoc);
            }

            ConnectionToDB.close(conn);
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        } catch (SQLException ex) {
            Logger.getLogger(LopHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return listLopHoc;
    }

    @Override
    public int update(LopHoc t) {
        int ketQua;
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "UPDATE `LopHoc` SET `MaHP` = '" + t.getMaHP() + "', `MSGV` = '" + t.getMSGV() + "', `PhongHoc` = '" + t.getPhongHoc() + "', `ThoiGian` = '" + t.getThoiGian() + "' WHERE `LopHoc`.`MaLop` = '" + t.getMaLop() + "'";
//            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            ConnectionToDB.close(conn);
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        } catch (SQLException ex) {
            Logger.getLogger(LopHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

}

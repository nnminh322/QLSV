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
import model.HocPhan;

public class HocPhanDAO implements DAOInterface<HocPhan> {

    public static HocPhanDAO getInstance() {
        return new HocPhanDAO();
    }

    @Override
    public int insert(HocPhan t) {
        int ketQua;
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "INSERT INTO `HocPhan` (`MaHP`, `TenHP`, `SoTinChi`) VALUES ('" + t.getMaHP() + "', '" + t.getTenHP() + "', '" + t.getSoTinChi() + "');";

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
    public int delete(HocPhan t) {
        int ketQua;
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "DELETE FROM HocPhan WHERE `HocPhan`.`MaHP` = '" + t.getMaHP() + "'";
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
    public ArrayList<HocPhan> selectAll() {
        ArrayList<HocPhan> listHocPhan = new ArrayList<HocPhan>();
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "SELECT * FROM HocPhan";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String MaHP = rs.getString("MaHP");
                String TenHP = rs.getString("TenHP");
                int SoTinChi = rs.getInt("SoTinChi");

                HocPhan hocPhan = new HocPhan(MaHP, TenHP, SoTinChi);
                listHocPhan.add(hocPhan);
            }

            ConnectionToDB.close(conn);
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        } catch (SQLException ex) {
            Logger.getLogger(HocPhanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return listHocPhan;
    }

    @Override
    public ArrayList<HocPhan> find(String Condition) {
        ArrayList<HocPhan> listHocPhan = new ArrayList<HocPhan>();
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "SELECT * FROM HocPhan WHERE " + Condition;

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String MaHP = rs.getString("MaHP");
                String TenHP = rs.getString("TenHP");
                int SoTinChi = rs.getInt("SoTinChi");

                HocPhan hocPhan = new HocPhan(MaHP, TenHP, SoTinChi);
                listHocPhan.add(hocPhan);
            }

            ConnectionToDB.close(conn);
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        } catch (SQLException ex) {
            Logger.getLogger(HocPhanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return listHocPhan;
    }

    @Override
    public int update(HocPhan t) {
        int ketQua;
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "UPDATE `HocPhan` SET `TenHP` = '" + t.getTenHP() + "', `SoTinChi` = '" + t.getSoTinChi() + "' WHERE `HocPhan`.`MaHP` = '" + t.getMaHP() + "'";
//            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            ConnectionToDB.close(conn);
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        } catch (SQLException ex) {
            Logger.getLogger(HocPhanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

}

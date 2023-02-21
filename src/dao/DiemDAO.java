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
import model.Diem;

/**
 *
 * @author nnminh322
 */
public class DiemDAO implements DAOInterface<Diem> {

    public static DiemDAO getInstance() {
        return new DiemDAO();
    }

    @Override
    public int insert(Diem t) {

        int ketQua;
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "INSERT INTO `Diem` (`MaLop`, `MaHP`, `MSSV`, `DiemQT`, `DiemCK`, `TrongSoQT`) VALUES ('" + t.getMaLop() + "', '" + t.getMaHP() + "', '" + t.getMSSV() + "', '" + t.getDiemQT() + "', '" + t.getDiemCK() + "', '" + t.getTrongSoQT() + "')";
//            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            ConnectionToDB.close(conn);
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        } catch (SQLException ex) {
            Logger.getLogger(DiemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }

    @Override
    public int delete(Diem t) {
        int ketQua;
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "DELETE FROM Diem WHERE `Diem`.`MaLop` = '"+t.getMaLop()+"' AND `Diem`.`MaHP` = '"+t.getMaHP()+"' AND `Diem`.`MSSV` = '"+t.getMSSV()+"'";
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
    public ArrayList<Diem> selectAll() {
        ArrayList<Diem> listDiem = new ArrayList<Diem>();
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "SELECT * FROM Diem";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String MaLop = rs.getString("MaLop");

                String MaHP = rs.getString("MaHP");
                String MSSV = rs.getString("MSSV");
                float DiemQT = rs.getFloat("DiemQT");
                float DiemCK = rs.getFloat("DiemCK");
                float TrongSoQT = rs.getFloat("TrongSoQT");

                Diem diem = new Diem(MaLop, MaHP, MSSV, DiemQT, DiemCK, TrongSoQT);
                listDiem.add(diem);
            }

            ConnectionToDB.close(conn);
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        } catch (SQLException ex) {
            Logger.getLogger(DiemDAO.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return listDiem;
    }

    @Override
    public ArrayList<Diem> find(String Condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Diem tCu, Diem tMoi) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;


import connection.ConnectionToDB;
import java.sql.ResultSet;

public class LoginService {

    public static String checkLogin(String username, String password) {
        try {
            // Kết nối cơ sở dữ liệu
            java.sql.Connection conn = new ConnectionToDB().getConnection();
            java.sql.Statement st = conn.createStatement();
            String query = "SELECT * FROM account WHERE username='" + username + "' AND password='" + password + "'";
            ResultSet rs = st.executeQuery(query);
            // Kiểm tra xem tên đăng nhập và mật khẩu có khớp với bất kỳ bản ghi nào trong bảng users không
            if (rs.next()) {
                return rs.getString("user_type");
            } else {
                return null;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

}

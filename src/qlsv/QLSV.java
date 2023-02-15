/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qlsv;

import com.sun.jdi.connect.spi.Connection;
import connection.ConnectionToDB;
import view.Admin;

/**
 *
 * @author nnminh322
 */
public class QLSV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.sql.Connection conn = ConnectionToDB.getConnection();
    }
    
}

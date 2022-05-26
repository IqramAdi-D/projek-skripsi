/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program_ta;
import java.sql.*;
//import java.sql.Driver;
//import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author adiiq
 */
public class koneksi {

    private static Connection KoneksiDatabse;
    public static Connection koneksiDB() throws SQLException {
        try {
//            String DB ="jdbc:mysql://localhost/datapasien";
            String user="root";
            String pass="";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            KoneksiDatabse = (Connection) DriverManager.getConnection(DB,user,pass);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Tidak ada koneksi","Error",
            JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());
            System.exit(0);
        }
         return KoneksiDatabse;
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

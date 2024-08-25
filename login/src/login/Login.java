/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Login {
    Connection conn;
    Statement stm;
    
    public void config(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/db_login","root","");
        stm = conn.createStatement();
        }catch (Exception e){
    JOptionPane.showMessageDialog(null,"Koneksi Gagal"+ e.getMessage());
    }
}
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

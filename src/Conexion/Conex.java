/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conex {
    Connection con;
    public Conex(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:4306/groovemusic","root","");
        } catch (Exception e) {
            System.err.println("Error:" +e);
        }
    }
    
    public void main(String[] args) {
        Conex cn = new Conex();
        Statement st;
        ResultSet rs;
        try {
            st=cn.con.createStatement();
            rs=st.executeQuery("select * from admin");
            while (rs.next()) {                
                System.out.println(rs.getInt("IDAdmin")+" " +rs.getString("NomAdmin")+" " +rs.getString("PassAdmin"));
            }
            cn.con.close();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }    
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.* ;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import medical.staff;
import medical.staff.Staff;
/**
 *
 * @author honganhberries
 */
public class DBConnect {
        private Connection connection ; 
        public DBConnect() throws SQLException {
        try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver") ; 
        String url = "jdbc:sqlserver://localhost:1433;databasename=baitaplon;" + "encrypt = true; trustServerCertificate=true;sslProtocol=TLSv1.2";
        String user = "sa" ; 
	String password = "honganhberries123" ; 
        connection = DriverManager.getConnection(url, user, password); 
        }catch(ClassNotFoundException ex)	
        {
            ex.printStackTrace(); 
        }
    }
    public boolean  addStaff(Staff nv) {
        String sql = "INSERT INTO nhanvien1(maNV , Hovaten, SDT , tuoi , luong) VALUES(?,?,?,?,?)" ;
        try {
            PreparedStatement ps = connection.prepareStatement(sql) ; 
            ps.setString(1,nv.getMaNV());
            ps.setString(2, nv.getHoten());
            ps.setString(3, nv.getSDT());
            ps.setInt(4,nv.getTuoi());
            ps.setInt(5, nv.getLuong());
            
            return ps.executeUpdate() > 0 ;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false ; 
    }
    
    public ArrayList<Staff> getListStaff(){
        ArrayList<Staff> list = new ArrayList<>() ; 
        String sql = "SELECT *FROM nhanvien1" ; 
        try {
            PreparedStatement ps = connection.prepareStatement(sql) ;
            ResultSet rs = ps.executeQuery() ; 
            while(rs.next()) {
                Staff nv = new staff();
                nv.setMaNV((rs.getString("maNV")));
                nv.setHoten(rs.getString("Hovaten"));
                nv.setSDT(rs.getString("SDT"));
                nv.setTuoi(rs.getInt("Tuoi")); 
                nv.setLuong(rs.getInt("luong"));
                list.add(nv) ;                
             }
        }catch(Exception e) {
            e.printStackTrace(); 
        }
        return list ;
     }
    
    public static  void main(String[] args) throws SQLException {
       new DBConnect() ; 
    }
}

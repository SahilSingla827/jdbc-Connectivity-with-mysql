package com.sahil.singla.Jdbc010;
import java.sql.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws Exception
    {
    	String url = "jdbc:mysql://localhost:3306/sahil";
    	String user = "root";
    	String password = "1234";
    	String qry = "select * from emp";
    	
//        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(qry);
        rs.next();
        System.out.println(rs.getInt(1));
        System.out.println(rs.getString(2));
    }
}

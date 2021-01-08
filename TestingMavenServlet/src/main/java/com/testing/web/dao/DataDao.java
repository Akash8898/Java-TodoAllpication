package com.testing.web.dao;
import java.sql.*;
import com.testing.web.model.Data;

public class DataDao {

	public Data getData(int id) {
		Data d =new Data();
//		d.setId(1);
//		d.setName("akash");
//		d.setTech("java");

		try 
		{
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/full","root","root");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from maventest where id= " + id);
			if(rs.next())
			{
				d.setId(rs.getInt(1));
				d.setName(rs.getString(2));
				d.setTech(rs.getString(3));
				con.close();
				
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return d;
		
	}
	
}

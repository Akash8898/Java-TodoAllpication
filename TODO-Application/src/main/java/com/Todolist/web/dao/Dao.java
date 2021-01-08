package com.Todolist.web.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.Todolist.web.model.DataModel;
import java.util.List;

public class Dao {

	public static Connection fn(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/full","root","root");
			return con;
			
		}
		catch(Exception e) {
			return null;
		}
		
	}
	
	public List<DataModel> getData(String todo) {
		
		List<DataModel> result = new ArrayList<>(); 
		
		ResultSet rs;
		String query = "insert into todo(task,status) values(\"" + todo +  "\",false);";
		
	
		try {
			
			Statement st = fn().createStatement();
			st.executeUpdate(query);
			rs = st.executeQuery("select * from todo"); 
			
			while(rs.next())
			{
				
				DataModel datamod = new DataModel();
				datamod.setId(rs.getInt(1));
				datamod.setTodo(rs.getString(2));
				datamod.setStatus(rs.getBoolean(3));
				System.out.println(datamod.toString());
				result.add(datamod);
			}

			System.out.println("Control back to Controller");
			
		} 
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	public List<DataModel> getUpdate(String string) {
		
		return null;
	}


}

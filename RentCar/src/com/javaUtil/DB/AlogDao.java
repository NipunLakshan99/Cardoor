package com.javaUtil.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.javaClass.Alog;

public class AlogDao {
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static List<Alog> validate(String userName,String password){
		
		ArrayList<Alog> ad = new ArrayList<>();
				
		try {
			con =DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from  agent where username='"+userName+"' and password='"+password+"'";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String userU = rs.getString(5);
				String passU = rs.getString(6);
				
				Alog c = new Alog(id,name,email,phone,userU,passU);
				ad.add(c);			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return ad;
		
	}
	

}


package com.javaUtil.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.javaClass.SystmeU;


public class StystemUDBUtil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

	public static List<SystmeU> validate(String userName, String password) {
		
		ArrayList<SystmeU> sta = new ArrayList<>();
		
		try {
			
			con =DBConnect.getConnection();
			stmt = con.createStatement();
			String sql ="select * from staff where username='"+userName+"' and password='"+password+"'";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String userA = rs.getString(5);
				String passW = rs.getString(6);
				
				SystmeU s = new SystmeU(id,name,email,phone,userA,passW);
				sta.add(s);
			}	
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return sta;
	
		
	}
	
	public static boolean insertSystemU (String name,String email,String phone,String username,String password) {
		
		boolean isSuccess = false;
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into staff values(0,'"+name+"', '"+email+"','"+phone+"','"+username+"','"+password+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		
		
		
		return isSuccess;
	}
	
	 public static int save(SystmeU u) {
	        int status = 0;

	        try {
	        	con = DBConnect.getConnection();
	            PreparedStatement ps = con.prepareStatement("insert into staff(name,email,phone,username,password) values(?,?,?,?,?)");
	            ps.setString(1, u.getName());
	            ps.setString(2, u.getEmail());
	            ps.setString(3, u.getPhone());
	            ps.setString(4, u.getUserName());
	            ps.setString(5, u.getPassword());
	            status = ps.executeUpdate();
	        } catch (Exception var4) {
	            System.out.println(var4);
	        }

	        return status;
	    }
	 
	
	public static int update(SystmeU u) {
        int status = 0;

        try {
        	con = DBConnect.getConnection();
            PreparedStatement ps = con.prepareStatement("update staff set name=?,email=?,phone=?,username=?,password=? where id=?");
            ps.setString(1, u.getName());
            ps.setString(2, u.getEmail());
            ps.setString(3, u.getPhone());
            ps.setString(4, u.getUserName());
            ps.setString(5, u.getPassword());
            ps.setInt(6, u.getId());
            status = ps.executeUpdate();
        } catch (Exception var4) {
            System.out.println(var4);
        }

        return status;
    }
	
	public static int delete(SystmeU u) {
        int status = 0;

        try {
        	con = DBConnect.getConnection();
            PreparedStatement ps = con.prepareStatement("delete from staff where id=?");
            ps.setInt(1, u.getId());
            status = ps.executeUpdate();
        } catch (Exception var4) {
            System.out.println(var4);
        }

        return status;
    }
	
	public static List<SystmeU> getAllRecords() {
        ArrayList<SystmeU> list = new ArrayList<SystmeU>();

        try {
        	con = DBConnect.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from staff");
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
            	SystmeU u = new SystmeU(0, null, null, null, null, null);
                u.setId(rs.getInt("id"));
                u.setName(rs.getString("name"));
                u.setEmail(rs.getString("email"));
                u.setPhone(rs.getString("phone"));
                u.setUserName(rs.getString("userName"));
                u.setPassword(rs.getString("password"));
                list.add(u);
            }
        } catch (Exception var5) {
            System.out.println(var5);
        }

        return list;
    }


}
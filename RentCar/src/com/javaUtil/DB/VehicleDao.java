package com.javaUtil.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.javaClass.vehicle;

public class VehicleDao {
	public VehicleDao() {
    }

    public static Connection getConnection() {
        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "2226");
        } catch (Exception var2) {
            System.out.println(var2);
        }

        return con;
    }

    public static int save(vehicle u) {
        int status = 0;

        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("insert into vehicle(ownername,vehicletype,vehiclebrand,rateper1km,rateper1day) values(?,?,?,?,?)");
            ps.setString(1, u.getOwnername());
            ps.setString(2, u.getVehicletype());
            ps.setString(3, u.getVehiclebrand());
            ps.setString(4, u.getRateper1km());
            ps.setString(5, u.getRateper1day());
            status = ps.executeUpdate();
        } catch (Exception var4) {
            System.out.println(var4);
        }

        return status;
    }

    public static int update(vehicle u) {
        int status = 0;

        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("update vehicle set ownername=?,vehicletype=?,vehiclebrand=?,rateper1km=?,rateper1day=? where id=?");
            ps.setString(1, u.getOwnername());
            ps.setString(2, u.getVehicletype());
            ps.setString(3, u.getVehiclebrand());
            ps.setString(4, u.getRateper1km());
            ps.setString(5, u.getRateper1day());
            ps.setInt(6, u.getId());
            status = ps.executeUpdate();
        } catch (Exception var4) {
            System.out.println(var4);
        }

        return status;
    }

    public static int delete(vehicle u) {
        int status = 0;

        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("delete from vehicle where id=?");
            ps.setInt(1, u.getId());
            status = ps.executeUpdate();
        } catch (Exception var4) {
            System.out.println(var4);
        }

        return status;
    }

    public static List<vehicle> getAllRecords() {
        ArrayList<vehicle> list = new ArrayList<vehicle>();

        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("select * from vehicle");
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                vehicle u = new vehicle();
                u.setId(rs.getInt("id"));
                u.setOwnername(rs.getString("ownername"));
                u.setVehicletype(rs.getString("vehicletype"));
                u.setVehiclebrand(rs.getString("vehiclebrand"));
                u.setRateper1km(rs.getString("rateper1km"));
                u.setRateper1day(rs.getString("rateper1day"));
                list.add(u);
            }
        } catch (Exception var5) {
            System.out.println(var5);
        }

        return list;
    }

    public static vehicle getRecordById(int id) {
        vehicle u = null;

        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("select * from vehicle where id=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                u = new vehicle();
                u.setId(rs.getInt("id"));
                u.setOwnername(rs.getString("ownername"));
                u.setVehicletype(rs.getString("vehicletype"));
                u.setVehiclebrand(rs.getString("vehiclebrand"));
                u.setRateper1km(rs.getString("rateper1km"));
                u.setRateper1day(rs.getString("rateper1day"));
            }
        } catch (Exception var5) {
            System.out.println(var5);
        }

        return u;
    }
}


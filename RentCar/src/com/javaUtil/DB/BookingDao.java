package com.javaUtil.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.javaClass.Booking;

public class BookingDao {
    public BookingDao() {
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

    public static int save(Booking u) {
        int status = 0;

        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("insert into booking(pickupdate,returndate,vehiclemodel,submodel) values(?,?,?,?)");
            ps.setString(1, u.getPickupdate());
            ps.setString(2, u.getReturndate());
            ps.setString(3, u.getVehiclemodel());
            ps.setString(4, u.getSubmodel());
            status = ps.executeUpdate();
        } catch (Exception var4) {
            System.out.println(var4);
        }

        return status;
    }

    public static int update(Booking u) {
        int status = 0;

        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("update booking set pickupdate=?,returndate=?,vehiclemodel=?,submodel=? where id=?");
            ps.setString(1, u.getPickupdate());
            ps.setString(2, u.getReturndate());
            ps.setString(3, u.getVehiclemodel());
            ps.setString(4, u.getSubmodel());
            ps.setInt(5, u.getId());
            status = ps.executeUpdate();
        } catch (Exception var4) {
            System.out.println(var4);
        }

        return status;
    }

    public static int delete(Booking u) {
        int status = 0;

        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("delete from booking where id=?");
            ps.setInt(1, u.getId());
            status = ps.executeUpdate();
        } catch (Exception var4) {
            System.out.println(var4);
        }

        return status;
    }

    public static List<Booking> getAllRecords() {
        ArrayList<Booking> list = new ArrayList<Booking>();

        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("select * from booking");
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                Booking u = new Booking();
                u.setId(rs.getInt("id"));
                u.setPickupdate(rs.getString("pickupdate"));
                u.setReturndate(rs.getString("returndate"));
                u.setVehiclemodel(rs.getString("vehiclemodel"));
                u.setSubmodel(rs.getString("submodel"));
                list.add(u);
            }
        } catch (Exception var5) {
            System.out.println(var5);
        }

        return list;
    }

    public static Booking getRecordById(int id) {
        Booking u = null;

        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("select * from booking where id=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                u = new Booking();
                u.setId(rs.getInt("id"));
                u.setPickupdate(rs.getString("pickupdate"));
                u.setReturndate(rs.getString("returndate"));
                u.setVehiclemodel(rs.getString("vehiclemodel"));
                u.setSubmodel(rs.getString("submodel"));
            }
        } catch (Exception var5) {
            System.out.println(var5);
        }

        return u;
    }
}

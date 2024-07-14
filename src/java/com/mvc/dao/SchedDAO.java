package com.mvc.dao;

import com.mvc.bean.Schedule;
import util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SchedDAO {

    public SchedDAO() {
    }
    
    public Connection con = DBConnection.createConnection();
 
    // Method to add a new schedule
    public void addSchedule(Schedule bean) {
        int sched_id = bean.getSchedId();        
        String depart = bean.getDepart();
        String arrival = bean.getArrival();
        String departDate = bean.getDepartDate();
        String departTime = bean.getDepartTime();
        // Prepare the SQL statement
        String sql = "insert into schedule (sched_id, departDate, departTime, arrival, depart ) " +
                            " values ( ?, ?, ?, ?, ?)";
        
        PreparedStatement ps;            
        try {ps = con.prepareStatement(sql);
            // Set the parameter values
            ps.setInt(1, sched_id);
            ps.setString(2, departDate);
            ps.setString(3, departTime);
            ps.setString(4, arrival);
            ps.setString(5, depart);
            
            // Execute the query
            ps.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
        public Schedule getSchedule(int sched_id) {            
            try {
                String sql = "Select * from schedule where sched_id = "+sched_id;
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                rs.next();
                String depart = rs.getString("depart");
                String arrival = rs.getString("arrival");
                String departDate = rs.getString("departDate");
                String departTime = rs.getString("departTime");
                Schedule sched = new Schedule(sched_id,depart,arrival,departDate,departTime);
                con.close();
                return sched;
            } catch (Exception ex) {
                System.out.println(ex);
            }
            return null;
        }

    // Method to update an existing schedule
    public void updateSchedule(Schedule bean) {
        int sched_id = bean.getSchedId();
        String depart = bean.getDepart();
        String arrival = bean.getArrival();
        String departDate = bean.getDepartDate();
        String departTime = bean.getDepartTime();
        // Prepare the SQL statement
        String sql = "update schedule set depart=?,arrival=?,departDate=?,departTime=?"
                + " where sched_id = " +sched_id;
        PreparedStatement ps;            
        try {
            ps = con.prepareStatement(sql);
            // Set the parameter values
            ps.setInt(1, sched_id );
            ps.setString(1, depart);
            ps.setString(2, arrival);
            ps.setString(3, departDate);
            ps.setString(4, departTime);
            
            // Execute the query
            ps.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    // Method to delete a schedule
    public void deleteSchedule(int sched_id) {
        String sql = "delete from schedule where sched_id = "+sched_id;
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            con.close();
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }

    // Method to retrieve all schedules
    public List<Schedule> getAllSchedules() {
        List<Schedule> Schedule = new ArrayList<>();
       try {
            String sql = "select * from schedule";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                int sched_id = rs.getInt("sched_id");
                String depart = rs.getString("depart");
                String arrival = rs.getString("arrival");
                String departDate = rs.getString("departDate");
                String departTime = rs.getString("departTime");
                Schedule sched = new Schedule(sched_id,depart,arrival,departDate,departTime);
                Schedule.add(sched);
            }
            con.close();
            return Schedule;
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        return null;
    }
}
           

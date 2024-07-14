/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.bean;
import java.util.Date;
import java.io.Serializable;
import java.sql.Time;
import java.time.LocalTime;

/**
 *
 * @author HANIPUTERI
 */
public class Schedule implements Serializable{
    private int sched_id;
    private String depart;
    private String arrival;
    private String departDate;
    private String departTime;

    public Schedule() {
        // Default constructor
    }

    public Schedule(int sched_id, String depart, String arrival, String departDate, String departTime) {
        this.sched_id = sched_id;
        this.depart = depart;
        this.arrival = arrival;
        this.departDate = departDate;
        this.departTime = departTime;
    }

    // Getters and Setters
    public int getSchedId() {
        return sched_id;
    }

    public void setSchedId(int schedId) {
        this.sched_id = sched_id;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getDepartDate() {
        return departDate;
    }

    public void setDepartDate(String departDate) {
        this.departDate = departDate;
    }

    public String getDepartTime() {
        return departTime;
    }

    public void setDepartTime(String departTime) {
        this.departTime = departTime;
    }


}

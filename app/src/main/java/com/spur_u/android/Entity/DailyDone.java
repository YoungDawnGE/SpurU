package com.spur_u.android.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
用于表示一天内完成的Tasks
*/
public class DailyDone {
    private Date date;
    private List<Task> dailyTasks;

    public DailyDone(Date date) {
        this.date = date;
        dailyTasks = new ArrayList<>();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Task> getDailyTasks() {
        return dailyTasks;
    }

    public void setDailyTasks(List<Task> dailyTasks) {
        this.dailyTasks = dailyTasks;
    }



}

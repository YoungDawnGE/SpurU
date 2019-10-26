package com.spur_u.android.Entity;

import org.litepal.crud.LitePalSupport;

public class FinishedTask extends LitePalSupport {
    private String name;
    private int score;
    private String date;//记录完成日期

    public FinishedTask(Task task, String date) {
        name = task.getName();
        score = task.getScore();
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

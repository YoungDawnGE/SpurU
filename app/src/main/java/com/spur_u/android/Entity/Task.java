package com.spur_u.android.Entity;

import org.litepal.crud.LitePalSupport;

public class Task extends LitePalSupport {
    private String name;
    private int score;

    public Task(String name, int score) {
        this.name = name;
        this.score = score;
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

    @Override
    public boolean save() {
        return super.save();
    }

}

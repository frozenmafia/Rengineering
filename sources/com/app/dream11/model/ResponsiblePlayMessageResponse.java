package com.app.dream11.model;

import java.io.Serializable;
/* loaded from: classes6.dex */
public class ResponsiblePlayMessageResponse implements Serializable {
    private int amount;
    private int level;
    private String message;
    private String time;
    private String title;
    private int year;

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String str) {
        this.time = str;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int i) {
        this.year = i;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setAmount(int i) {
        this.amount = i;
    }
}

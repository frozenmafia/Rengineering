package com.app.dream11.model;

import java.io.Serializable;
/* loaded from: classes3.dex */
public class LineupStatus implements Serializable {
    private String color;
    private Status status;
    private String text;

    /* loaded from: classes3.dex */
    public enum Status {
        PLAYING,
        BENCHED,
        NOT_PLAYING,
        X_FACTOR_SUBSTITUTE
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String str) {
        this.color = str;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String str) {
        this.text = str;
    }
}

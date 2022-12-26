package com.app.dream11.model;

import java.io.Serializable;
/* loaded from: classes3.dex */
public class PlayerRole implements Serializable {
    private static final long serialVersionUID = 1;
    private String color;
    private int id;
    private String name;
    private float pointMultiplier;
    private String shortName;

    public void setId(int i) {
        this.id = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPointMultiplier(float f) {
        this.pointMultiplier = f;
    }

    public void setShortName(String str) {
        this.shortName = str;
    }

    public void setColor(String str) {
        this.color = str;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public float getPointMultiplier() {
        return this.pointMultiplier;
    }

    public String getShortName() {
        return this.shortName;
    }

    public String getColor() {
        return this.color;
    }
}

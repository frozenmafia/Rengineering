package com.app.dream11.model;

import java.io.Serializable;
import java.util.List;
/* loaded from: classes3.dex */
public class Matches implements Serializable {
    private static final long serialVersionUID = 121;
    private List<Squads> squads;

    public List<Squads> getSquads() {
        return this.squads;
    }

    public void setSquads(List<Squads> list) {
        this.squads = list;
    }
}

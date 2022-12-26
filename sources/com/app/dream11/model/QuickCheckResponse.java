package com.app.dream11.model;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class QuickCheckResponse {
    private String bannedStatesMess;
    private List<States> banned_states;
    private List<States> states = new ArrayList();

    public void setStates(List<States> list) {
        this.states = list;
    }

    public List<States> getStates() {
        return this.states;
    }

    public void setBanned(List<States> list) {
        this.banned_states = list;
    }

    public List<States> getBanned() {
        return this.banned_states;
    }

    public String getBannedStatesMess() {
        return this.bannedStatesMess;
    }
}

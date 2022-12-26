package com.app.dream11.model;

import java.util.ArrayList;
/* loaded from: classes3.dex */
public class UserPref {
    private ArrayList<UserPrefData> user_preference;
    private ArrayList<TeamPrefSel> user_selected;

    public ArrayList<UserPrefData> getUser_preference() {
        return this.user_preference;
    }

    public void setUser_preference(ArrayList<UserPrefData> arrayList) {
        this.user_preference = arrayList;
    }

    public ArrayList<TeamPrefSel> getUser_selected() {
        return this.user_selected;
    }

    public void setUser_selected(ArrayList<TeamPrefSel> arrayList) {
        this.user_selected = arrayList;
    }
}

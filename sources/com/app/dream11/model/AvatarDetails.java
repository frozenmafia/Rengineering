package com.app.dream11.model;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes6.dex */
public class AvatarDetails {
    private String avatarTitle;
    private String avatarUrl;
    private int id;
    private boolean selected;

    public int getId() {
        return this.id;
    }

    public String getAvatarTitle() {
        return this.avatarTitle;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public boolean isSelected() {
        return this.selected;
    }

    public void setSelected(boolean z) {
        this.selected = z;
    }

    public void setAvatarTitle(String str) {
        this.avatarTitle = str;
    }

    public void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public void setId(int i) {
        this.id = i;
    }

    public static List<AvatarDetails> cloneList(List<AvatarDetails> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (AvatarDetails avatarDetails : list) {
            arrayList.add(cloneAvatarDetail(avatarDetails));
        }
        return arrayList;
    }

    public static AvatarDetails cloneAvatarDetail(AvatarDetails avatarDetails) {
        AvatarDetails avatarDetails2 = new AvatarDetails();
        avatarDetails2.setId(avatarDetails.getId());
        avatarDetails2.setAvatarUrl(avatarDetails.getAvatarTitle());
        avatarDetails2.setAvatarUrl(avatarDetails.getAvatarUrl());
        avatarDetails2.setSelected(avatarDetails.isSelected());
        return avatarDetails2;
    }
}

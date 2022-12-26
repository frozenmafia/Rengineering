package com.app.dream11.newmycontests;
/* loaded from: classes3.dex */
public enum MyMatchesTab {
    UPCOMING(0),
    LIVE(1),
    COMPLETED(2);
    
    private int index;

    MyMatchesTab(int i) {
        this.index = i;
    }

    public int getIndex() {
        return this.index;
    }
}

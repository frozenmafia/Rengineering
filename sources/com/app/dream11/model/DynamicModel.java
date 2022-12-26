package com.app.dream11.model;
/* loaded from: classes3.dex */
public class DynamicModel {
    private boolean apiCaching;
    private boolean expandCashContests;
    private FirebaseProfileNode profile;

    public boolean isApiCaching() {
        return this.apiCaching;
    }

    public void setApiCaching(boolean z) {
        this.apiCaching = z;
    }

    public boolean isExpandCashContests() {
        return this.expandCashContests;
    }

    public void setExpandCashContests(boolean z) {
        this.expandCashContests = z;
    }

    public FirebaseProfileNode getProfile() {
        return this.profile;
    }

    public void setProfile(FirebaseProfileNode firebaseProfileNode) {
        this.profile = firebaseProfileNode;
    }
}

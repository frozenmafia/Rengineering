package com.app.dream11.model;

import o.runAnimators;
/* loaded from: classes3.dex */
public final class MyProfile {
    private final UserInfo UserInfo;

    public static /* synthetic */ MyProfile copy$default(MyProfile myProfile, UserInfo userInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            userInfo = myProfile.UserInfo;
        }
        return myProfile.copy(userInfo);
    }

    public final UserInfo component1() {
        return this.UserInfo;
    }

    public final MyProfile copy(UserInfo userInfo) {
        runAnimators.ag$a(userInfo, "UserInfo");
        return new MyProfile(userInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MyProfile) && runAnimators.values(this.UserInfo, ((MyProfile) obj).UserInfo);
    }

    public int hashCode() {
        return this.UserInfo.hashCode();
    }

    public String toString() {
        UserInfo userInfo = this.UserInfo;
        return "MyProfile(UserInfo=" + userInfo + ")";
    }

    public MyProfile(UserInfo userInfo) {
        runAnimators.ag$a(userInfo, "UserInfo");
        this.UserInfo = userInfo;
    }

    public final UserInfo getUserInfo() {
        return this.UserInfo;
    }
}

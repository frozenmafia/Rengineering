package com.app.dream11.model;

import o.runAnimators;
/* loaded from: classes3.dex */
public final class MyProfileLiteResponse {
    private final MyProfile user;
    private final UserAttributes userAttributes;

    public static /* synthetic */ MyProfileLiteResponse copy$default(MyProfileLiteResponse myProfileLiteResponse, MyProfile myProfile, UserAttributes userAttributes, int i, Object obj) {
        if ((i & 1) != 0) {
            myProfile = myProfileLiteResponse.user;
        }
        if ((i & 2) != 0) {
            userAttributes = myProfileLiteResponse.userAttributes;
        }
        return myProfileLiteResponse.copy(myProfile, userAttributes);
    }

    public final MyProfile component1() {
        return this.user;
    }

    public final UserAttributes component2() {
        return this.userAttributes;
    }

    public final MyProfileLiteResponse copy(MyProfile myProfile, UserAttributes userAttributes) {
        runAnimators.ag$a(myProfile, "user");
        runAnimators.ag$a(userAttributes, "userAttributes");
        return new MyProfileLiteResponse(myProfile, userAttributes);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MyProfileLiteResponse) {
            MyProfileLiteResponse myProfileLiteResponse = (MyProfileLiteResponse) obj;
            return runAnimators.values(this.user, myProfileLiteResponse.user) && runAnimators.values(this.userAttributes, myProfileLiteResponse.userAttributes);
        }
        return false;
    }

    public int hashCode() {
        return (this.user.hashCode() * 31) + this.userAttributes.hashCode();
    }

    public String toString() {
        MyProfile myProfile = this.user;
        UserAttributes userAttributes = this.userAttributes;
        return "MyProfileLiteResponse(user=" + myProfile + ", userAttributes=" + userAttributes + ")";
    }

    public MyProfileLiteResponse(MyProfile myProfile, UserAttributes userAttributes) {
        runAnimators.ag$a(myProfile, "user");
        runAnimators.ag$a(userAttributes, "userAttributes");
        this.user = myProfile;
        this.userAttributes = userAttributes;
    }

    public final MyProfile getUser() {
        return this.user;
    }

    public final UserAttributes getUserAttributes() {
        return this.userAttributes;
    }
}

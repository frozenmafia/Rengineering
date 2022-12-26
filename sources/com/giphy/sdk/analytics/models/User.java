package com.giphy.sdk.analytics.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.sendbird.android.constant.StringSet;
import o.getTargetTypes;
import o.isFullSpan;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class User implements Parcelable {
    public static final Parcelable.Creator<User> CREATOR = new Creator();
    @isFullSpan(valueOf = "logged_in_user_id")
    private String loggedInUserId;
    @isFullSpan(valueOf = StringSet.user_id)
    private String userId;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<User> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final User createFromParcel(Parcel parcel) {
            runAnimators.ag$a(parcel, "in");
            return new User(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final User[] newArray(int i) {
            return new User[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "parcel");
        parcel.writeString(this.userId);
        parcel.writeString(this.loggedInUserId);
    }

    public User(String str, String str2) {
        runAnimators.ag$a(str, "userId");
        this.userId = str;
        this.loggedInUserId = str2;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final void setUserId(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.userId = str;
    }

    public /* synthetic */ User(String str, String str2, int i, getTargetTypes gettargettypes) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    public final String getLoggedInUserId() {
        return this.loggedInUserId;
    }

    public final void setLoggedInUserId(String str) {
        this.loggedInUserId = str;
    }
}

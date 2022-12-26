package com.giphy.sdk.core.models;

import android.os.Parcel;
import android.os.Parcelable;
import o.getTargetTypes;
import o.isFullSpan;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class Meta implements Parcelable {
    public static final Parcelable.Creator<Meta> CREATOR = new Creator();
    private String msg;
    @isFullSpan(valueOf = "response_id")
    private final String responseId;
    private int status;

    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<Meta> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Meta createFromParcel(Parcel parcel) {
            runAnimators.ag$a(parcel, "in");
            return new Meta(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Meta[] newArray(int i) {
            return new Meta[i];
        }
    }

    public Meta() {
        this(0, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "parcel");
        parcel.writeInt(this.status);
        parcel.writeString(this.msg);
        parcel.writeString(this.responseId);
    }

    public Meta(int i, String str, String str2) {
        this.status = i;
        this.msg = str;
        this.responseId = str2;
    }

    public final int getStatus() {
        return this.status;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public /* synthetic */ Meta(int i, String str, String str2, int i2, getTargetTypes gettargettypes) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2);
    }

    public final String getMsg() {
        return this.msg;
    }

    public final void setMsg(String str) {
        this.msg = str;
    }

    public final String getResponseId() {
        return this.responseId;
    }
}

package com.giphy.sdk.core.models;

import android.os.Parcel;
import android.os.Parcelable;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class VideoCaption implements Parcelable {
    public static final Parcelable.Creator<VideoCaption> CREATOR = new Creator();
    private final String srt;
    private final String vtt;

    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<VideoCaption> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VideoCaption createFromParcel(Parcel parcel) {
            runAnimators.ag$a(parcel, "in");
            return new VideoCaption(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VideoCaption[] newArray(int i) {
            return new VideoCaption[i];
        }
    }

    public VideoCaption() {
        this(null, null, 3, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "parcel");
        parcel.writeString(this.srt);
        parcel.writeString(this.vtt);
    }

    public VideoCaption(String str, String str2) {
        this.srt = str;
        this.vtt = str2;
    }

    public /* synthetic */ VideoCaption(String str, String str2, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public final String getSrt() {
        return this.srt;
    }

    public final String getVtt() {
        return this.vtt;
    }
}

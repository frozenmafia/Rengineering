package com.giphy.sdk.core.models;

import android.os.Parcel;
import android.os.Parcelable;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class Cta implements Parcelable {
    public static final Parcelable.Creator<Cta> CREATOR = new Creator();
    private String link;
    private String text;

    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<Cta> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Cta createFromParcel(Parcel parcel) {
            runAnimators.ag$a(parcel, "in");
            return new Cta(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Cta[] newArray(int i) {
            return new Cta[i];
        }
    }

    public Cta() {
        this(null, null, 3, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "parcel");
        parcel.writeString(this.link);
        parcel.writeString(this.text);
    }

    public Cta(String str, String str2) {
        this.link = str;
        this.text = str2;
    }

    public /* synthetic */ Cta(String str, String str2, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public final String getLink() {
        return this.link;
    }

    public final void setLink(String str) {
        this.link = str;
    }

    public final String getText() {
        return this.text;
    }

    public final void setText(String str) {
        this.text = str;
    }
}

package com.facebook.share.model;

import android.os.Parcel;
import o.runAnimators;
/* loaded from: classes6.dex */
public abstract class ShareMessengerActionButton implements ShareModel {
    private final String values;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ShareMessengerActionButton(Parcel parcel) {
        runAnimators.ag$a(parcel, "parcel");
        this.values = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "dest");
        parcel.writeString(this.values);
    }
}

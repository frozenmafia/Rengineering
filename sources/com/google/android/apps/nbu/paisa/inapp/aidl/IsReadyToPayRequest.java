package com.google.android.apps.nbu.paisa.inapp.aidl;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes4.dex */
public final class IsReadyToPayRequest implements Parcelable {
    public static final Parcelable.Creator<IsReadyToPayRequest> CREATOR = new Parcelable.Creator<IsReadyToPayRequest>() { // from class: com.google.android.apps.nbu.paisa.inapp.aidl.IsReadyToPayRequest.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: values */
        public IsReadyToPayRequest createFromParcel(Parcel parcel) {
            return new IsReadyToPayRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ag$a */
        public IsReadyToPayRequest[] newArray(int i) {
            return new IsReadyToPayRequest[i];
        }
    };
    private final String ag$a;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private IsReadyToPayRequest(Parcel parcel) {
        this.ag$a = parcel.readString();
    }

    public IsReadyToPayRequest(String str) {
        this.ag$a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ag$a);
    }
}

package com.giphy.sdk.analytics.models;

import android.os.Parcel;
import android.os.Parcelable;
import o.isFullSpan;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class RandomId implements Parcelable {
    public static final Parcelable.Creator<RandomId> CREATOR = new Creator();
    @isFullSpan(valueOf = "random_id")
    private final String randomId;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<RandomId> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RandomId createFromParcel(Parcel parcel) {
            runAnimators.ag$a(parcel, "in");
            return new RandomId(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RandomId[] newArray(int i) {
            return new RandomId[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "parcel");
        parcel.writeString(this.randomId);
    }

    public RandomId(String str) {
        runAnimators.ag$a(str, "randomId");
        this.randomId = str;
    }

    public final String getRandomId() {
        return this.randomId;
    }
}

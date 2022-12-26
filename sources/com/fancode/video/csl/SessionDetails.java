package com.fancode.video.csl;

import android.os.Parcel;
import android.os.Parcelable;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class SessionDetails implements Parcelable {
    public static final Parcelable.Creator<SessionDetails> CREATOR = new toString();
    private final int ag$a;
    private final String valueOf;
    private final String values;

    /* loaded from: classes4.dex */
    public static final class toString implements Parcelable.Creator<SessionDetails> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: ag$a */
        public final SessionDetails createFromParcel(Parcel parcel) {
            runAnimators.ag$a(parcel, "parcel");
            return new SessionDetails(parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ah$a */
        public final SessionDetails[] newArray(int i) {
            return new SessionDetails[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SessionDetails) {
            SessionDetails sessionDetails = (SessionDetails) obj;
            return runAnimators.values((Object) this.values, (Object) sessionDetails.values) && runAnimators.values((Object) this.valueOf, (Object) sessionDetails.valueOf) && this.ag$a == sessionDetails.ag$a;
        }
        return false;
    }

    public int hashCode() {
        return (((this.values.hashCode() * 31) + this.valueOf.hashCode()) * 31) + this.ag$a;
    }

    public String toString() {
        String str = this.values;
        String str2 = this.valueOf;
        int i = this.ag$a;
        return "SessionDetails(baseUrl=" + str + ", sessionId=" + str2 + ", ttl=" + i + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "out");
        parcel.writeString(this.values);
        parcel.writeString(this.valueOf);
        parcel.writeInt(this.ag$a);
    }

    public SessionDetails(String str, String str2, int i) {
        runAnimators.ag$a(str, "baseUrl");
        runAnimators.ag$a(str2, "sessionId");
        this.values = str;
        this.valueOf = str2;
        this.ag$a = i;
    }

    public final int ag$a() {
        return this.ag$a;
    }

    public final String ah$a() {
        return this.values;
    }

    public final String valueOf() {
        return this.valueOf;
    }
}

package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;
/* loaded from: classes4.dex */
public final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new m(0);
    public final UUID a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1180b;
    public final String c;
    public final byte[] d;
    private int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(Parcel parcel) {
        this.a = new UUID(parcel.readLong(), parcel.readLong());
        this.f1180b = parcel.readString();
        String readString = parcel.readString();
        int i = cp.a;
        this.c = readString;
        this.d = parcel.createByteArray();
    }

    public final n a(byte[] bArr) {
        return new n(this.a, this.f1180b, this.c, bArr);
    }

    public final boolean b() {
        return this.d != null;
    }

    public final boolean c(UUID uuid) {
        return i.a.equals(this.a) || uuid.equals(this.a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            if (obj == this) {
                return true;
            }
            n nVar = (n) obj;
            return cp.V(this.f1180b, nVar.f1180b) && cp.V(this.c, nVar.c) && cp.V(this.a, nVar.a) && Arrays.equals(this.d, nVar.d);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        if (i == 0) {
            int hashCode = this.a.hashCode();
            String str = this.f1180b;
            int hashCode2 = (((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode()) * 31) + Arrays.hashCode(this.d);
            this.e = hashCode2;
            return hashCode2;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a.getMostSignificantBits());
        parcel.writeLong(this.a.getLeastSignificantBits());
        parcel.writeString(this.f1180b);
        parcel.writeString(this.c);
        parcel.writeByteArray(this.d);
    }

    public n(UUID uuid, String str, String str2, byte[] bArr) {
        af.s(uuid);
        this.a = uuid;
        this.f1180b = str;
        af.s(str2);
        this.c = str2;
        this.d = bArr;
    }

    public n(UUID uuid, String str, byte[] bArr) {
        this(uuid, null, str, bArr);
    }
}

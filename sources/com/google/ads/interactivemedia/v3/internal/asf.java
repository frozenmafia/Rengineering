package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
/* loaded from: classes4.dex */
public final class asf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<asf> CREATOR = new arz(2);
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final int f697b;
    public final String c;
    public final String d;
    public final int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public asf(int i, int i2, int i3, String str, String str2) {
        this.a = i;
        this.f697b = i2;
        this.c = str;
        this.d = str2;
        this.e = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeInt(parcel, 2, this.f697b);
        SafeParcelWriter.writeString(parcel, 3, this.c, false);
        SafeParcelWriter.writeString(parcel, 4, this.d, false);
        SafeParcelWriter.writeInt(parcel, 5, this.e);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public asf(int i, String str, String str2) {
        this(1, 1, aoy.b(i), str, str2);
    }
}

package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
/* loaded from: classes4.dex */
public final class arx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<arx> CREATOR = new arz(1);
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final String f691b;
    public final String c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public arx(int i, String str, String str2) {
        this.a = i;
        this.f691b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeString(parcel, 2, this.f691b, false);
        SafeParcelWriter.writeString(parcel, 3, this.c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public arx(String str, String str2) {
        this(1, str, str2);
    }
}

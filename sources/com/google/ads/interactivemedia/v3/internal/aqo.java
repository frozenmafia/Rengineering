package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
/* loaded from: classes4.dex */
public final class aqo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<aqo> CREATOR = new aqq(1);
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private final int f677b;
    private final String c;

    public aqo(String str, int i, String str2) {
        this.a = str;
        this.f677b = i;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.a, false);
        SafeParcelWriter.writeInt(parcel, 2, this.f677b);
        SafeParcelWriter.writeString(parcel, 3, this.c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

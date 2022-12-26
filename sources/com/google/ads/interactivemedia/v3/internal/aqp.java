package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
/* loaded from: classes4.dex */
public final class aqp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<aqp> CREATOR = new aqq(0);
    private final String a;

    public aqp(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, a(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;
/* loaded from: classes4.dex */
public final class asg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<asg> CREATOR = new arz(3);
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f698b;
    public final int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public asg(int i, byte[] bArr, int i2) {
        this.a = i;
        this.f698b = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeByteArray(parcel, 2, this.f698b, false);
        SafeParcelWriter.writeInt(parcel, 3, this.c);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public asg() {
        this(1, null, 1);
    }
}

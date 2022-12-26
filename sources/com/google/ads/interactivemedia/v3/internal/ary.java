package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
/* loaded from: classes4.dex */
public final class ary extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ary> CREATOR = new arz(0);
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    private afv f692b = null;
    private byte[] c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ary(int i, byte[] bArr) {
        this.a = i;
        this.c = bArr;
        b();
    }

    public final afv a() {
        if (this.f692b == null) {
            try {
                this.f692b = afv.c(this.c, boy.a());
                this.c = null;
            } catch (bpt | NullPointerException e) {
                throw new IllegalStateException(e);
            }
        }
        b();
        return this.f692b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        byte[] bArr = this.c;
        if (bArr == null) {
            bArr = this.f692b.aw();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArr, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private final void b() {
        afv afvVar = this.f692b;
        if (afvVar != null || this.c == null) {
            if (afvVar == null || this.c != null) {
                if (afvVar == null || this.c == null) {
                    if (afvVar != null || this.c != null) {
                        throw new IllegalStateException("Impossible");
                    }
                    throw new IllegalStateException("Invalid internal representation - empty");
                }
                throw new IllegalStateException("Invalid internal representation - full");
            }
        }
    }
}

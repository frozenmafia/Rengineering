package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes4.dex */
final class ph implements Parcelable.Creator {
    private final /* synthetic */ int a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ph(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a != 0 ? new pj(parcel) : new pi(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return this.a != 0 ? new pj[i] : new pi[i];
    }
}

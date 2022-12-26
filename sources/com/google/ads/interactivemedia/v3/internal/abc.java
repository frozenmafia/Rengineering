package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes4.dex */
final class abc implements Parcelable.Creator {
    private final /* synthetic */ int a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abc(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = this.a;
        if (i != 0) {
            return i != 1 ? new abe(parcel) : new abb(parcel);
        }
        return new abd(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        int i2 = this.a;
        if (i2 != 0) {
            return i2 != 1 ? new abe[i] : new abb[i];
        }
        return new abd[i];
    }
}

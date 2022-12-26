package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes4.dex */
final class m implements Parcelable.Creator {
    private final /* synthetic */ int a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                return i != 2 ? new ba(parcel) : new ao(parcel);
            }
            return new o(parcel);
        }
        return new n(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 != 1) {
                return i2 != 2 ? new ba[i] : new ao[i];
            }
            return new o[i];
        }
        return new n[i];
    }
}

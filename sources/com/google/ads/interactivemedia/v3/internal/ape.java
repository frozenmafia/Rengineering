package com.google.ads.interactivemedia.v3.internal;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes4.dex */
public final class ape {
    static {
        ape.class.getClassLoader();
    }

    private ape() {
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        throw new BadParcelableException("Parcel data not fully consumed, unread size: " + dataAvail);
    }

    public static void c(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static void d(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e(Parcel parcel, IInterface iInterface) {
        if (iInterface == 0) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface);
        }
    }

    public static boolean f(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}

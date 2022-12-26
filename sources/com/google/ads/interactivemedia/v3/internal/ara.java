package com.google.ads.interactivemedia.v3.internal;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes4.dex */
public class ara extends apd implements arb {
    public ara() {
        super("com.google.android.gms.dynamic.IObjectWrapper");
    }

    public static arb b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return queryLocalInterface instanceof arb ? (arb) queryLocalInterface : new aqz(iBinder);
    }
}

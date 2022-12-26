package com.google.ads.interactivemedia.v3.internal;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes4.dex */
public abstract class aqm extends apd implements aqn {
    public static aqn b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.signalsdk.ISignalSdkService");
        return queryLocalInterface instanceof aqn ? (aqn) queryLocalInterface : new aql(iBinder);
    }
}

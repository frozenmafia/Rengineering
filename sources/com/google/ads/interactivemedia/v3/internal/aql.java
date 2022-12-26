package com.google.ads.interactivemedia.v3.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes4.dex */
public final class aql extends apc implements aqn {
    /* JADX INFO: Access modifiers changed from: package-private */
    public aql(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.signalsdk.ISignalSdkService");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqn
    public final void e(aqo aqoVar, aqk aqkVar) throws RemoteException {
        Parcel a = a();
        ape.d(a, aqoVar);
        ape.e(a, aqkVar);
        x(a);
    }
}

package com.google.ads.interactivemedia.v3.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes4.dex */
public final class asa extends apc implements asb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public asa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asb
    public final ary e(arx arxVar) throws RemoteException {
        Parcel a = a();
        ape.d(a, arxVar);
        Parcel v = v(1, a);
        ary aryVar = (ary) ape.a(v, ary.CREATOR);
        v.recycle();
        return aryVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asb
    public final asg f(asf asfVar) throws RemoteException {
        Parcel a = a();
        ape.d(a, asfVar);
        Parcel v = v(3, a);
        asg asgVar = (asg) ape.a(v, asg.CREATOR);
        v.recycle();
        return asgVar;
    }
}

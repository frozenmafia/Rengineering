package com.google.ads.interactivemedia.v3.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes4.dex */
public final class apl extends apc implements apm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public apl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apm
    public final IBinder e(arb arbVar, arb arbVar2, byte[] bArr) throws RemoteException {
        Parcel a = a();
        ape.e(a, arbVar);
        ape.e(a, arbVar2);
        a.writeByteArray(bArr);
        Parcel v = v(3, a);
        IBinder readStrongBinder = v.readStrongBinder();
        v.recycle();
        return readStrongBinder;
    }
}

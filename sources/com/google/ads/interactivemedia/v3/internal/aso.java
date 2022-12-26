package com.google.ads.interactivemedia.v3.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes4.dex */
public final class aso extends apc implements asq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public aso(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asq
    public final void e() throws RemoteException {
        w(3, a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asq
    public final void f(int i) throws RemoteException {
        Parcel a = a();
        a.writeInt(i);
        w(7, a);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asq
    public final void g(int i) throws RemoteException {
        Parcel a = a();
        a.writeInt(i);
        w(6, a);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asq
    public final void h(byte[] bArr) throws RemoteException {
        Parcel a = a();
        a.writeByteArray(bArr);
        w(5, a);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asq
    public final void i(arb arbVar, String str) throws RemoteException {
        Parcel a = a();
        ape.e(a, arbVar);
        a.writeString(str);
        a.writeString(null);
        w(8, a);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asq
    public final void j() throws RemoteException {
        Parcel a = a();
        a.writeIntArray(null);
        w(4, a);
    }
}

package com.google.ads.interactivemedia.v3.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes4.dex */
public final class api extends apc implements apk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public api(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.adshield.internal.IAdShieldClient");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apk
    public final int b() throws RemoteException {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apk
    public final arb c(arb arbVar, arb arbVar2) throws RemoteException {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apk
    public final arb d(arb arbVar, arb arbVar2) throws RemoteException {
        Parcel a = a();
        ape.e(a, arbVar);
        ape.e(a, arbVar2);
        Parcel v = v(6, a);
        arb b2 = ara.b(v.readStrongBinder());
        v.recycle();
        return b2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apk
    public final String e(arb arbVar, String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apk
    public final String f(arb arbVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apk
    public final String g(arb arbVar, byte[] bArr) throws RemoteException {
        Parcel a = a();
        ape.e(a, arbVar);
        a.writeByteArray(null);
        Parcel v = v(12, a);
        String readString = v.readString();
        v.recycle();
        return readString;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apk
    public final String h(arb arbVar, arb arbVar2, arb arbVar3, arb arbVar4) throws RemoteException {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apk
    public final String i(arb arbVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apk
    public final String j() throws RemoteException {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apk
    public final String k(arb arbVar, arb arbVar2, arb arbVar3) throws RemoteException {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apk
    public final void l(arb arbVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apk
    public final void m(arb arbVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apk
    public final void n(String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apk
    public final void o(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apk
    public final boolean p(arb arbVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apk
    public final boolean q(arb arbVar) throws RemoteException {
        Parcel a = a();
        ape.e(a, arbVar);
        Parcel v = v(4, a);
        boolean f = ape.f(v);
        v.recycle();
        return f;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apk
    public final boolean r() throws RemoteException {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apk
    public final boolean s(String str, boolean z) throws RemoteException {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apk
    public final boolean t() throws RemoteException {
        throw null;
    }
}

package com.google.ads.interactivemedia.v3.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes4.dex */
public final class asp extends apd implements asq {
    public asp() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    public static asq b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
        return queryLocalInterface instanceof asq ? (asq) queryLocalInterface : new aso(iBinder);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apd
    protected final boolean a(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        switch (i) {
            case 2:
                ara.b(parcel.readStrongBinder());
                parcel.readString();
                ape.b(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                ape.b(parcel);
                break;
            case 5:
                parcel.createByteArray();
                ape.b(parcel);
                break;
            case 6:
                parcel.readInt();
                ape.b(parcel);
                break;
            case 7:
                parcel.readInt();
                ape.b(parcel);
                break;
            case 8:
                ara.b(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                ape.b(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asq
    public final void e() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asq
    public final void f(int i) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asq
    public final void g(int i) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asq
    public final void h(byte[] bArr) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asq
    public final void i(arb arbVar, String str) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asq
    public final void j() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public asp(byte[] bArr) {
        this();
    }
}

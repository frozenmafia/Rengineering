package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes4.dex */
public abstract class aqj extends apd implements aqk {
    public aqj() {
        super("com.google.android.gms.ads.signalsdk.INetworkRequestCallback");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apd
    protected final boolean a(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            ape.b(parcel);
            c((aqp) ape.a(parcel, aqp.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            int readInt = parcel.readInt();
            ape.b(parcel);
            b(readInt);
        }
        return true;
    }
}

package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
/* loaded from: classes4.dex */
public class apn {
    protected apk a;

    @Deprecated
    public final Uri a(Uri uri, Context context) throws apo, RemoteException {
        arb d = this.a.d(arc.c(uri), arc.c(context));
        if (d == null) {
            throw new apo();
        }
        return (Uri) arc.d(d);
    }

    @Deprecated
    public final String b(Context context) throws RemoteException {
        return this.a.g(arc.c(context), null);
    }

    @Deprecated
    public final boolean c(Uri uri) throws RemoteException {
        return this.a.q(arc.c(uri));
    }
}

package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
/* loaded from: classes4.dex */
public final class asn {
    final asq a;

    /* renamed from: b  reason: collision with root package name */
    final boolean f702b;

    private asn(asq asqVar) {
        this.a = asqVar;
        this.f702b = asqVar != null;
    }

    public static asn b() {
        asp aspVar = new asp(null);
        Log.d("GASS", "Clearcut logging disabled");
        return new asn(aspVar);
    }

    public static asn c(Context context, String str) {
        try {
            try {
                try {
                    asq b2 = asp.b(DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.ads.dynamite").instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger"));
                    b2.i(arc.c(context), str);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new asn(b2);
                } catch (Exception e) {
                    throw new arv(e);
                }
            } catch (Exception e2) {
                throw new arv(e2);
            }
        } catch (RemoteException | arv | NullPointerException | SecurityException unused) {
            Log.d("GASS", "Cannot dynamite load clearcut");
            return new asn(new asp(null));
        }
    }

    public final asm a(byte[] bArr) {
        return new asm(this, bArr);
    }
}

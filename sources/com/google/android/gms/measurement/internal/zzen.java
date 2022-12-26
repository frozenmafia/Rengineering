package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
/* loaded from: classes7.dex */
public final class zzen extends zzkh {
    public zzen(zzkt zzktVar) {
        super(zzktVar);
    }

    public final boolean zza() {
        NetworkInfo activeNetworkInfo;
        zzW();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.zzt.zzau().getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        }
        activeNetworkInfo = null;
        if (activeNetworkInfo != null) {
            return false;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzkh
    protected final boolean zzb() {
        return false;
    }
}

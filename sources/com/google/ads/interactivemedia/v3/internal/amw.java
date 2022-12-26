package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
/* loaded from: classes4.dex */
public final class amw {
    private NetworkCapabilities a;

    amw(ConnectivityManager connectivityManager) {
        if (connectivityManager == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        try {
            connectivityManager.registerDefaultNetworkCallback(new amv(this));
        } catch (RuntimeException unused) {
            synchronized (amw.class) {
                this.a = null;
            }
        }
    }

    public static amw c(Context context) {
        if (context != null) {
            return new amw((ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }

    public final long a() {
        synchronized (amw.class) {
            NetworkCapabilities networkCapabilities = this.a;
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(4)) {
                    return 2L;
                }
                if (this.a.hasTransport(1)) {
                    return 1L;
                }
                if (this.a.hasTransport(0)) {
                    return 0L;
                }
            }
            return -1L;
        }
    }

    public final NetworkCapabilities b() {
        return this.a;
    }
}

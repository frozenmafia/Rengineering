package com.google.ads.interactivemedia.v3.internal;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class amv extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ amw a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public amv(amw amwVar) {
        this.a = amwVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (amw.class) {
            this.a.a = networkCapabilities;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (amw.class) {
            this.a.a = null;
        }
    }
}

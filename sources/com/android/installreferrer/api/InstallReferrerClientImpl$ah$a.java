package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.android.installreferrer.commons.InstallReferrerCommons;
import o.shouldPersist;
/* loaded from: classes.dex */
final class InstallReferrerClientImpl$ah$a implements ServiceConnection {
    private final InstallReferrerStateListener ah$a;
    final /* synthetic */ InstallReferrerClientImpl values;

    private InstallReferrerClientImpl$ah$a(InstallReferrerClientImpl installReferrerClientImpl, InstallReferrerStateListener installReferrerStateListener) {
        this.values = installReferrerClientImpl;
        if (installReferrerStateListener == null) {
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }
        this.ah$a = installReferrerStateListener;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
        this.values.ah$a = shouldPersist.values.ah$a(iBinder);
        this.values.toString = 2;
        this.ah$a.onInstallReferrerSetupFinished(0);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
        this.values.ah$a = null;
        this.values.toString = 0;
        this.ah$a.onInstallReferrerServiceDisconnected();
    }
}

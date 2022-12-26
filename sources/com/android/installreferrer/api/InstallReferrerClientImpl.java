package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import com.android.installreferrer.commons.InstallReferrerCommons;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import o.shouldPersist;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class InstallReferrerClientImpl extends InstallReferrerClient {
    private shouldPersist ah$a;
    private int toString = 0;
    private ServiceConnection valueOf;
    private final Context values;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ClientState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    public InstallReferrerClientImpl(Context context) {
        this.values = context.getApplicationContext();
    }

    private boolean valueOf() {
        try {
            return this.values.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void endConnection() {
        this.toString = 3;
        if (this.valueOf != null) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Unbinding from service.");
            this.values.unbindService(this.valueOf);
            this.valueOf = null;
        }
        this.ah$a = null;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public ReferrerDetails getInstallReferrer() throws RemoteException {
        if (!isReady()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.values.getPackageName());
        try {
            return new ReferrerDetails(this.ah$a.ag$a(bundle));
        } catch (RemoteException e) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "RemoteException getting install referrer information");
            this.toString = 0;
            throw e;
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public boolean isReady() {
        return (this.toString != 2 || this.ah$a == null || this.valueOf == null) ? false : true;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void startConnection(InstallReferrerStateListener installReferrerStateListener) {
        if (isReady()) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.onInstallReferrerSetupFinished(0);
            return;
        }
        int i = this.toString;
        if (i == 1) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
        } else if (i == 3) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
        } else {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Starting install referrer service setup.");
            Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
            intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
            List<ResolveInfo> queryIntentServices = this.values.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                ResolveInfo resolveInfo = queryIntentServices.get(0);
                if (resolveInfo.serviceInfo != null) {
                    String str = resolveInfo.serviceInfo.packageName;
                    String str2 = resolveInfo.serviceInfo.name;
                    if (!"com.android.vending".equals(str) || str2 == null || !valueOf()) {
                        InstallReferrerCommons.logWarn("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
                        this.toString = 0;
                        installReferrerStateListener.onInstallReferrerSetupFinished(2);
                        return;
                    }
                    Intent intent2 = new Intent(intent);
                    InstallReferrerClientImpl$ah$a installReferrerClientImpl$ah$a = new InstallReferrerClientImpl$ah$a(this, installReferrerStateListener);
                    this.valueOf = installReferrerClientImpl$ah$a;
                    try {
                        if (this.values.bindService(intent2, installReferrerClientImpl$ah$a, 1)) {
                            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service was bonded successfully.");
                            return;
                        }
                        InstallReferrerCommons.logWarn("InstallReferrerClient", "Connection to service is blocked.");
                        this.toString = 0;
                        installReferrerStateListener.onInstallReferrerSetupFinished(1);
                        return;
                    } catch (SecurityException unused) {
                        InstallReferrerCommons.logWarn("InstallReferrerClient", "No permission to connect to service.");
                        this.toString = 0;
                        installReferrerStateListener.onInstallReferrerSetupFinished(4);
                        return;
                    }
                }
            }
            this.toString = 0;
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service unavailable on device.");
            installReferrerStateListener.onInstallReferrerSetupFinished(2);
        }
    }
}

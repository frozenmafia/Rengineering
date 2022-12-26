package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import com.appsflyer.AFLogger;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes3.dex */
public abstract class av<T> {
    public final FutureTask<T> AFInAppEventParameterName = new FutureTask<>(new Callable<T>() { // from class: com.appsflyer.internal.av.1
        @Override // java.util.concurrent.Callable
        public final T call() {
            if (av.this.AFKeystoreWrapper()) {
                return (T) av.this.AFInAppEventParameterName();
            }
            return null;
        }
    });
    private final String[] AFInAppEventType;
    public final String valueOf;
    public final Context values;

    protected abstract T AFInAppEventParameterName();

    public av(Context context, String str, String... strArr) {
        this.values = context;
        this.valueOf = str;
        this.AFInAppEventType = strArr;
    }

    public T values() {
        try {
            return this.AFInAppEventParameterName.get(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            AFLogger.values(e.getMessage(), e);
            return null;
        }
    }

    public final boolean AFKeystoreWrapper() {
        try {
            ProviderInfo resolveContentProvider = this.values.getPackageManager().resolveContentProvider(this.valueOf, 128);
            if (resolveContentProvider != null) {
                return Arrays.asList(this.AFInAppEventType).contains(aa.AFInAppEventParameterName(this.values.getPackageManager(), ((PackageItemInfo) resolveContentProvider).packageName));
            }
            return false;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.values(e.getMessage(), e);
            return false;
        }
    }
}

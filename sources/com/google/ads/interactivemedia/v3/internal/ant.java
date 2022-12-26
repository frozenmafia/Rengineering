package com.google.ads.interactivemedia.v3.internal;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;
/* loaded from: classes4.dex */
public final class ant {
    private static final String[] a = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* renamed from: b  reason: collision with root package name */
    private long f659b = 0;
    private long c = 0;
    private long d = -1;
    private boolean e = false;

    ant(Context context, Executor executor, String[] strArr) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        try {
            ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new ans(this));
        } catch (IllegalArgumentException | NoSuchMethodError unused) {
        }
    }

    public static ant d(Context context, Executor executor) {
        return new ant(context, executor, a);
    }

    public final long b() {
        long j = this.d;
        this.d = -1L;
        return j;
    }

    public final long c() {
        if (this.e) {
            return this.c - this.f659b;
        }
        return -1L;
    }

    public final void h() {
        if (this.e) {
            this.c = System.currentTimeMillis();
        }
    }
}

package com.apxor.androidsdk.core.utils.application;

import android.app.Activity;
import android.os.SystemClock;
import com.apxor.androidsdk.core.Constants;
import com.apxor.androidsdk.core.SDKController;
import com.apxor.androidsdk.core.Utilities;
import com.apxor.androidsdk.core.models.g;
import java.util.concurrent.TimeUnit;
/* loaded from: classes3.dex */
public class b extends ActivityChangeListener {
    private static final String a = "b";

    /* renamed from: b  reason: collision with root package name */
    private long f286b = 0;
    private int c = 0;
    private boolean d;
    private boolean e;

    private void a() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            this.f286b = SystemClock.elapsedRealtime();
            SDKController.getInstance().saveEvent(new g(Constants.BACKGROUND, Utilities.getElapsedTime(SDKController.getInstance().getSdkUpTimeMillis(), SystemClock.elapsedRealtime())));
            this.e = false;
        }
    }

    private void b() {
        if (this.c == 0) {
            SDKController.getInstance().saveEvent(new g(Constants.FOREGROUND, Utilities.getElapsedTime(SDKController.getInstance().getSdkUpTimeMillis(), SystemClock.elapsedRealtime()), this.f286b > 0 ? TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - this.f286b) : 0.0d));
            this.e = true;
        }
        this.c++;
    }

    public void c() {
        this.d = true;
        SDKController.getInstance().registerForActivityCallbacks(this);
    }

    public boolean d() {
        return this.e;
    }

    @Override // com.apxor.androidsdk.core.utils.application.ActivityChangeListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        if (this.d) {
            b();
        }
    }

    @Override // com.apxor.androidsdk.core.utils.application.ActivityChangeListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (this.d) {
            a();
        }
    }
}

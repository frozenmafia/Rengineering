package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public final class aky implements Application.ActivityLifecycleCallbacks {
    private final Application a;

    /* renamed from: b  reason: collision with root package name */
    private final List f612b = new ArrayList();

    public aky(Application application) {
        this.a = application;
        application.registerActivityLifecycleCallbacks(this);
    }

    public final void a(akx akxVar) {
        this.f612b.add(akxVar);
    }

    public final void b() {
        this.a.unregisterActivityLifecycleCallbacks(this);
        this.f612b.clear();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        for (akx akxVar : this.f612b) {
            akxVar.d();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        for (akx akxVar : this.f612b) {
            akxVar.e();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}

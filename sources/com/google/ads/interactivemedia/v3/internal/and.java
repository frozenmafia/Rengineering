package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class and implements Application.ActivityLifecycleCallbacks {
    private final Application a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference f648b;
    private boolean c = false;

    public and(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f648b = new WeakReference(activityLifecycleCallbacks);
        this.a = application;
    }

    protected final void a(anc ancVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f648b.get();
            if (activityLifecycleCallbacks != null) {
                ancVar.a(activityLifecycleCallbacks);
            } else if (this.c) {
            } else {
                this.a.unregisterActivityLifecycleCallbacks(this);
                this.c = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new anb(activity, bundle, 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(new ana(activity, 4));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(new ana(activity, 2));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(new ana(activity, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new anb(activity, bundle, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(new ana(activity, 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(new ana(activity, 3));
    }
}

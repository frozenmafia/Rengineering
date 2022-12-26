package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ahv implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ ahw a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ahv(ahw ahwVar) {
        this.a = ahwVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Activity activity2;
        ahw ahwVar = this.a;
        activity2 = ahwVar.e;
        if (activity2 == activity) {
            ahwVar.e = null;
            this.a.k();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Activity activity2;
        ajq ajqVar;
        String str;
        Activity activity3;
        ahw ahwVar = this.a;
        activity2 = ahwVar.e;
        if (activity2 != null) {
            activity3 = ahwVar.e;
            if (activity3 != activity) {
                return;
            }
        }
        ahwVar.e = activity;
        com.google.ads.interactivemedia.v3.impl.data.b c = this.a.c("", "", "inactive");
        ajqVar = this.a.a;
        aji ajiVar = aji.activityMonitor;
        ajj ajjVar = ajj.appStateChanged;
        str = this.a.f564b;
        ajqVar.o(new ajk(ajiVar, ajjVar, str, c));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Activity activity2;
        ajq ajqVar;
        String str;
        ahw ahwVar = this.a;
        activity2 = ahwVar.e;
        if (activity2 == activity) {
            com.google.ads.interactivemedia.v3.impl.data.b c = ahwVar.c("", "", "active");
            ajqVar = this.a.a;
            aji ajiVar = aji.activityMonitor;
            ajj ajjVar = ajj.appStateChanged;
            str = this.a.f564b;
            ajqVar.o(new ajk(ajiVar, ajjVar, str, c));
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

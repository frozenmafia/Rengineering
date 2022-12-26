package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.app.Application;
/* loaded from: classes4.dex */
final class ana implements anc {
    final /* synthetic */ Activity a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f646b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ana(Activity activity, int i) {
        this.f646b = i;
        this.a = activity;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anc
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        int i = this.f646b;
        if (i == 0) {
            activityLifecycleCallbacks.onActivityResumed(this.a);
        } else if (i == 1) {
            activityLifecycleCallbacks.onActivityStarted(this.a);
        } else if (i == 2) {
            activityLifecycleCallbacks.onActivityPaused(this.a);
        } else if (i != 3) {
            activityLifecycleCallbacks.onActivityDestroyed(this.a);
        } else {
            activityLifecycleCallbacks.onActivityStopped(this.a);
        }
    }
}

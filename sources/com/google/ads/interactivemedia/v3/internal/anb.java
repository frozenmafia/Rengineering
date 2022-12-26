package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
/* loaded from: classes4.dex */
final class anb implements anc {
    final /* synthetic */ Activity a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Bundle f647b;
    private final /* synthetic */ int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public anb(Activity activity, Bundle bundle, int i) {
        this.c = i;
        this.a = activity;
        this.f647b = bundle;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anc
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        if (this.c != 0) {
            activityLifecycleCallbacks.onActivityCreated(this.a, this.f647b);
        } else {
            activityLifecycleCallbacks.onActivitySaveInstanceState(this.a, this.f647b);
        }
    }
}

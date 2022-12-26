package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import java.util.concurrent.Executor;
/* loaded from: classes4.dex */
public final /* synthetic */ class vr implements Executor {
    public final /* synthetic */ Handler a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f1319b;

    public /* synthetic */ vr(Handler handler, int i) {
        this.f1319b = i;
        this.a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.f1319b != 0) {
            this.a.post(runnable);
        } else {
            this.a.post(runnable);
        }
    }
}

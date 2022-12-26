package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import com.google.ads.interactivemedia.v3.api.esp.EspAdapter;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class alb {
    private final EspAdapter a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f616b;
    private final String c;
    private final TaskCompletionSource d = new TaskCompletionSource();

    /* JADX INFO: Access modifiers changed from: package-private */
    public alb(EspAdapter espAdapter, String str, Context context) {
        this.a = espAdapter;
        this.c = str;
        this.f616b = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Task b() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.collectSignals(this.f616b, new ala(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Task c() {
        this.a.initialize(this.f616b, new akz(this));
        return this.d.getTask();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String e() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String f() {
        return this.a.getVersion().toString();
    }
}

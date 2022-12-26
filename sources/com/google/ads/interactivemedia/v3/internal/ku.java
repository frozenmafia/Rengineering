package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes4.dex */
public final /* synthetic */ class ku implements Runnable {
    public final /* synthetic */ Object a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f1142b;

    public /* synthetic */ ku(il ilVar, int i) {
        this.f1142b = i;
        this.a = ilVar;
    }

    public /* synthetic */ ku(ld ldVar, int i) {
        this.f1142b = i;
        this.a = ldVar;
    }

    public /* synthetic */ ku(pc pcVar, int i) {
        this.f1142b = i;
        this.a = pcVar;
    }

    public /* synthetic */ ku(TaskCompletionSource taskCompletionSource, int i) {
        this.f1142b = i;
        this.a = taskCompletionSource;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, com.google.ads.interactivemedia.v3.internal.pc] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1142b;
        if (i == 0) {
            ((ld) this.a).U();
        } else if (i == 1) {
            il.V((il) this.a);
        } else if (i == 2) {
            ((ld) this.a).g();
        } else if (i == 3) {
            this.a.n();
        } else {
            ((TaskCompletionSource) this.a).setResult(asn.b());
        }
    }
}

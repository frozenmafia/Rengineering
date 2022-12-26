package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.internal.axm;
/* loaded from: classes4.dex */
final class ays extends axm.i implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f769b;

    public ays(Runnable runnable) {
        atc.k(runnable);
        this.f769b = runnable;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.ads.interactivemedia.v3.internal.axm
    public final String e() {
        return "task=[" + this.f769b + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f769b.run();
        } catch (Error | RuntimeException e) {
            o(e);
            throw e;
        }
    }
}

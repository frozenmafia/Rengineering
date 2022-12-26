package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Executor;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
final class aya implements Executor {
    public static final aya a;

    /* renamed from: b  reason: collision with root package name */
    private static final /* synthetic */ aya[] f764b;

    static {
        aya ayaVar = new aya();
        a = ayaVar;
        f764b = new aya[]{ayaVar};
    }

    private aya() {
    }

    public static aya[] values() {
        return (aya[]) f764b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}

package com.google.ads.interactivemedia.v3.internal;

import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ayj implements ayi {
    public static final ayj a;

    /* renamed from: b  reason: collision with root package name */
    private static final Set f767b;
    private static final /* synthetic */ ayj[] c;

    static {
        ayj ayjVar = new ayj();
        a = ayjVar;
        c = new ayj[]{ayjVar};
        f767b = new CopyOnWriteArraySet();
    }

    private ayj() {
    }

    public static ayj[] values() {
        return (ayj[]) c.clone();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ayi
    public final void a(Class cls) {
        for (WeakReference weakReference : f767b) {
            if (cls.equals(weakReference.get())) {
                return;
            }
        }
        ayl.c(cls);
        Set set = f767b;
        if (set.size() > 1000) {
            set.clear();
        }
        set.add(new WeakReference(cls));
    }
}

package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
/* loaded from: classes4.dex */
public final class ags {
    private static final ags a = new ags();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList f549b = new ArrayList();
    private final ArrayList c = new ArrayList();

    private ags() {
    }

    public static ags a() {
        return a;
    }

    public final Collection b() {
        return Collections.unmodifiableCollection(this.c);
    }

    public final Collection c() {
        return Collections.unmodifiableCollection(this.f549b);
    }

    public final void d(agm agmVar) {
        this.f549b.add(agmVar);
    }

    public final void e(agm agmVar) {
        boolean g = g();
        this.f549b.remove(agmVar);
        this.c.remove(agmVar);
        if (!g || g()) {
            return;
        }
        agy.b().f();
    }

    public final void f(agm agmVar) {
        boolean g = g();
        this.c.add(agmVar);
        if (g) {
            return;
        }
        agy.b().e();
    }

    public final boolean g() {
        return this.c.size() > 0;
    }
}

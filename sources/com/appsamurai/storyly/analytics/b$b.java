package com.appsamurai.storyly.analytics;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.reserveEndViewTransition;
/* loaded from: classes3.dex */
public final class b$b extends Lambda implements Styleable.ArcMotion<List<? extends a>> {
    public static final b$b a = new b$b();

    public b$b() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public List<? extends a> invoke() {
        return reserveEndViewTransition.valueOf(a.f85b, a.d, a.c);
    }
}

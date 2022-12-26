package com.appsamurai.storyly.analytics;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.reserveEndViewTransition;
/* loaded from: classes3.dex */
public final class b$a extends Lambda implements Styleable.ArcMotion<List<? extends a>> {
    public static final b$a a = new b$a();

    public b$a() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public List<? extends a> invoke() {
        return reserveEndViewTransition.valueOf(a.i, a.f);
    }
}

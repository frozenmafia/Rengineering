package com.appsamurai.storyly.data;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.ViewPager2;
import o.onSetOrientation;
/* loaded from: classes3.dex */
public final class o$l extends Lambda implements Styleable.ArcMotion<onSetOrientation> {
    public static final o$l a = new o$l();

    public o$l() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public onSetOrientation invoke() {
        return ViewPager2.PageAwareAccessibilityProvider.AnonymousClass2.toString(null, p.a, 1, null);
    }
}

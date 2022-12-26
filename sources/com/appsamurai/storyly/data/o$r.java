package com.appsamurai.storyly.data;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.TypefaceCompatApi28Impl;
import o.freeze;
/* loaded from: classes3.dex */
public final class o$r extends Lambda implements Styleable.ArcMotion<freeze> {
    public final /* synthetic */ TypefaceCompatApi28Impl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o$r(TypefaceCompatApi28Impl typefaceCompatApi28Impl) {
        super(0);
        this.a = typefaceCompatApi28Impl;
    }

    @Override // o.Styleable.ArcMotion
    public freeze invoke() {
        return new freeze(this.a.ah$a, "stryly-moments-report-status");
    }
}

package com.appsamurai.storyly.data;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.TypefaceCompatApi28Impl;
import o.getStartFraction;
import o.isUsable;
/* loaded from: classes3.dex */
public final class o$n extends Lambda implements Styleable.ArcMotion<isUsable> {
    public final /* synthetic */ TypefaceCompatApi28Impl a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ getStartFraction f103b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o$n(TypefaceCompatApi28Impl typefaceCompatApi28Impl, getStartFraction getstartfraction) {
        super(0);
        this.a = typefaceCompatApi28Impl;
        this.f103b = getstartfraction;
    }

    @Override // o.Styleable.ArcMotion
    public isUsable invoke() {
        return new isUsable(this.a.ah$a, this.f103b);
    }
}

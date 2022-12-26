package com.appsamurai.storyly.data;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.TypefaceCompatApi28Impl;
import o.isFontFamilyPrivateAPIAvailable;
/* loaded from: classes3.dex */
public final class o$m extends Lambda implements Styleable.ArcMotion<isFontFamilyPrivateAPIAvailable> {
    public final /* synthetic */ TypefaceCompatApi28Impl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o$m(TypefaceCompatApi28Impl typefaceCompatApi28Impl) {
        super(0);
        this.a = typefaceCompatApi28Impl;
    }

    @Override // o.Styleable.ArcMotion
    public isFontFamilyPrivateAPIAvailable invoke() {
        return new isFontFamilyPrivateAPIAvailable(this.a.ah$a, "stryly-moments-like-status");
    }
}

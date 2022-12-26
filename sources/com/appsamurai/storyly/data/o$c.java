package com.appsamurai.storyly.data;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.TypefaceCompatApi24Impl;
import o.TypefaceCompatApi28Impl;
/* loaded from: classes3.dex */
public final class o$c extends Lambda implements Styleable.ArcMotion<TypefaceCompatApi24Impl> {
    public final /* synthetic */ TypefaceCompatApi28Impl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o$c(TypefaceCompatApi28Impl typefaceCompatApi28Impl) {
        super(0);
        this.a = typefaceCompatApi28Impl;
    }

    @Override // o.Styleable.ArcMotion
    public TypefaceCompatApi24Impl invoke() {
        return new TypefaceCompatApi24Impl(this.a.ah$a, "stryly-ab-sets");
    }
}

package com.appsamurai.storyly.data;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.TypefaceCompatApi28Impl;
import o.obtainAddFontFromBufferMethod;
/* loaded from: classes3.dex */
public final class o$s extends Lambda implements Styleable.ArcMotion<obtainAddFontFromBufferMethod> {
    public final /* synthetic */ TypefaceCompatApi28Impl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o$s(TypefaceCompatApi28Impl typefaceCompatApi28Impl) {
        super(0);
        this.a = typefaceCompatApi28Impl;
    }

    @Override // o.Styleable.ArcMotion
    public obtainAddFontFromBufferMethod invoke() {
        return new obtainAddFontFromBufferMethod(this.a.ah$a, "stryly-seen-state");
    }
}

package com.appsamurai.storyly.util.ui.blur;

import android.content.Context;
import android.renderscript.RenderScript;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes3.dex */
public final class e$b extends Lambda implements Styleable.ArcMotion<RenderScript> {
    public final /* synthetic */ Context a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e$b(Context context) {
        super(0);
        this.a = context;
    }

    @Override // o.Styleable.ArcMotion
    public RenderScript invoke() {
        return RenderScript.create(this.a);
    }
}

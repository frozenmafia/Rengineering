package com.appsamurai.storyly.util.ui.blur;

import android.renderscript.Element;
import android.renderscript.ScriptIntrinsicBlur;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.ensureAccessibilityDelegateCompat;
/* loaded from: classes3.dex */
public final class e$a extends Lambda implements Styleable.ArcMotion<ScriptIntrinsicBlur> {
    public final /* synthetic */ ensureAccessibilityDelegateCompat a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e$a(ensureAccessibilityDelegateCompat ensureaccessibilitydelegatecompat) {
        super(0);
        this.a = ensureaccessibilitydelegatecompat;
    }

    @Override // o.Styleable.ArcMotion
    public ScriptIntrinsicBlur invoke() {
        return ScriptIntrinsicBlur.create(this.a.ag$a(), Element.U8_4(this.a.ag$a()));
    }
}

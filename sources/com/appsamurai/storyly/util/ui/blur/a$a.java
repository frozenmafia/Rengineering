package com.appsamurai.storyly.util.ui.blur;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.dispatchApplyWindowInsets;
import o.ensureAccessibilityDelegateCompat;
/* loaded from: classes3.dex */
public final class a$a extends Lambda implements Styleable.ArcMotion<ensureAccessibilityDelegateCompat> {
    public final /* synthetic */ dispatchApplyWindowInsets a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a$a(dispatchApplyWindowInsets dispatchapplywindowinsets) {
        super(0);
        this.a = dispatchapplywindowinsets;
    }

    @Override // o.Styleable.ArcMotion
    public ensureAccessibilityDelegateCompat invoke() {
        return new ensureAccessibilityDelegateCompat(this.a.valueOf.getContext());
    }
}

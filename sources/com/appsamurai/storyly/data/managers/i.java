package com.appsamurai.storyly.data.managers;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getFontFamily;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class i extends Lambda implements Styleable.ChangeBounds<getFontFamily, Comparable<?>> {
    public static final i a = new i();

    public i() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public Comparable<?> invoke(getFontFamily getfontfamily) {
        getFontFamily getfontfamily2 = getfontfamily;
        runAnimators.ag$a(getfontfamily2, "it");
        return Boolean.valueOf(!getfontfamily2.getSignupData);
    }
}

package com.appsamurai.storyly.data;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getFontFamily;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class s extends Lambda implements Styleable.ChangeBounds<getFontFamily, Boolean> {
    public static final s a = new s();

    public s() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public Boolean invoke(getFontFamily getfontfamily) {
        getFontFamily getfontfamily2 = getfontfamily;
        runAnimators.ag$a(getfontfamily2, "it");
        return Boolean.valueOf(getfontfamily2.HaptikSDK$e != null);
    }
}

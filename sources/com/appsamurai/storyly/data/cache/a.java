package com.appsamurai.storyly.data.cache;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getFontFamily;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class a extends Lambda implements Styleable.ChangeBounds<getFontFamily, Boolean> {
    public final /* synthetic */ getFontFamily a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(getFontFamily getfontfamily) {
        super(1);
        this.a = getfontfamily;
    }

    @Override // o.Styleable.ChangeBounds
    public Boolean invoke(getFontFamily getfontfamily) {
        getFontFamily getfontfamily2 = getfontfamily;
        runAnimators.ag$a(getfontfamily2, "it");
        return Boolean.valueOf(runAnimators.values((Object) getfontfamily2.toString, (Object) this.a.toString));
    }
}

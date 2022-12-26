package com.appsamurai.storyly.storylypresenter.storylyfooter;

import android.content.Context;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.isFontFamilyPrivateAPIAvailable;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class a$b$a extends Lambda implements Styleable.ArcMotion<isFontFamilyPrivateAPIAvailable> {
    public final /* synthetic */ a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a$b$a(a aVar) {
        super(0);
        this.a = aVar;
    }

    @Override // o.Styleable.ArcMotion
    public isFontFamilyPrivateAPIAvailable invoke() {
        Context context = this.a.toString.getContext();
        runAnimators.ah$a(context, "holder.context");
        return new isFontFamilyPrivateAPIAvailable(context, "stryly-moments-like-status");
    }
}

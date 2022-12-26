package com.appsamurai.storyly.storylypresenter.storylylayer;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.TypefaceCompat;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class e extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    public final /* synthetic */ f a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TypefaceCompat f130b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, TypefaceCompat typefaceCompat) {
        super(0);
        this.a = fVar;
        this.f130b = typefaceCompat;
    }

    @Override // o.Styleable.ArcMotion
    public setAnimationMatrix invoke() {
        this.a.HaptikSDK$b().invoke(this.f130b, "Click");
        return setAnimationMatrix.ag$a;
    }
}

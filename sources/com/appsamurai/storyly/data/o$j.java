package com.appsamurai.storyly.data;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.TypefaceCompatApi28Impl;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class o$j extends Lambda implements Styleable.ChangeBounds<String, setAnimationMatrix> {
    public final /* synthetic */ Styleable.ChangeBounds<String, setAnimationMatrix> a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TypefaceCompatApi28Impl f102b;
    public final /* synthetic */ Styleable.ArcMotion<setAnimationMatrix> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o$j(Styleable.ChangeBounds<? super String, setAnimationMatrix> changeBounds, TypefaceCompatApi28Impl typefaceCompatApi28Impl, Styleable.ArcMotion<setAnimationMatrix> arcMotion) {
        super(1);
        this.a = changeBounds;
        this.f102b = typefaceCompatApi28Impl;
        this.c = arcMotion;
    }

    @Override // o.Styleable.ChangeBounds
    public setAnimationMatrix invoke(String str) {
        String str2 = str;
        runAnimators.ag$a(str2, "it");
        this.a.invoke(str2);
        TypefaceCompatApi28Impl typefaceCompatApi28Impl = this.f102b;
        typefaceCompatApi28Impl.values(typefaceCompatApi28Impl.ah$a().valueOf());
        Styleable.ArcMotion<setAnimationMatrix> arcMotion = this.c;
        if (arcMotion != null) {
            arcMotion.invoke();
        }
        return setAnimationMatrix.ag$a;
    }
}

package com.appsamurai.storyly.data;

import kotlin.jvm.internal.Lambda;
import o.PorterDuffKt;
import o.Styleable;
import o.Transition;
import o.getFontFamily;
import o.not;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class o$d extends Lambda implements Styleable.ArcMotion<not> {
    public final /* synthetic */ Styleable.ChangeBounds<PorterDuffKt, setAnimationMatrix> a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Transition<getFontFamily, getFontFamily, setAnimationMatrix> f98b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o$d(Styleable.ChangeBounds<? super PorterDuffKt, setAnimationMatrix> changeBounds, Transition<? super getFontFamily, ? super getFontFamily, setAnimationMatrix> transition) {
        super(0);
        this.a = changeBounds;
        this.f98b = transition;
    }

    @Override // o.Styleable.ArcMotion
    public not invoke() {
        return new not(this.a, this.f98b);
    }
}

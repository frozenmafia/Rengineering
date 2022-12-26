package com.giphy.sdk.ui.universallist;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes4.dex */
public final class SmartGifViewHolder$hasMediaLoaded$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ Styleable.ArcMotion $onLoad;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartGifViewHolder$hasMediaLoaded$1(Styleable.ArcMotion arcMotion) {
        super(0);
        this.$onLoad = arcMotion;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onLoad.invoke();
    }
}

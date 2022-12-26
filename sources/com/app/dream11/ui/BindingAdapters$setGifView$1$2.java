package com.app.dream11.ui;

import android.graphics.drawable.Drawable;
import com.giphy.sdk.ui.views.GifView;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class BindingAdapters$setGifView$1$2 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ GifView $gifView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BindingAdapters$setGifView$1$2(GifView gifView) {
        super(0);
        this.$gifView = gifView;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$gifView.getHierarchy().toString((Drawable) null);
    }
}

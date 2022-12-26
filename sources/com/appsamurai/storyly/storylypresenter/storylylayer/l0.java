package com.appsamurai.storyly.storylypresenter.storylylayer;

import android.view.View;
import androidx.core.view.ViewGroupKt;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.dispatchNestedScroll;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class l0 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    public final /* synthetic */ dispatchNestedScroll a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(dispatchNestedScroll dispatchnestedscroll) {
        super(0);
        this.a = dispatchnestedscroll;
    }

    @Override // o.Styleable.ArcMotion
    public setAnimationMatrix invoke() {
        for (View view : ViewGroupKt.getChildren(this.a.ag$a)) {
            if (view instanceof h1) {
                ((h1) view).HaptikSDK$e();
            }
        }
        return setAnimationMatrix.ag$a;
    }
}

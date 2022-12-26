package com.appsamurai.storyly.storylypresenter.storylyfooter;

import android.animation.ObjectAnimator;
import kotlin.jvm.internal.Lambda;
import o.DragStartHelper;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class f extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    public final /* synthetic */ DragStartHelper.AnonymousClass1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(DragStartHelper.AnonymousClass1 anonymousClass1) {
        super(0);
        this.a = anonymousClass1;
    }

    @Override // o.Styleable.ArcMotion
    public setAnimationMatrix invoke() {
        this.a.ag$a().setVisibility(0);
        this.a.valueOf().setVisibility(0);
        this.a.valueOf().setY(this.a.values.getHeight());
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.a.valueOf(), "y", this.a.values.getHeight() - this.a.valueOf().getHeight());
        ofFloat.setDuration(300L);
        ofFloat.start();
        return setAnimationMatrix.ag$a;
    }
}

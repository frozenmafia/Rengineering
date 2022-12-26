package com.appsamurai.storyly.storylylist;

import kotlin.jvm.internal.Lambda;
import o.ContentInfoCompat;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class e extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    public final /* synthetic */ ContentInfoCompat.BuilderCompat a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ContentInfoCompat.BuilderCompat builderCompat) {
        super(0);
        this.a = builderCompat;
    }

    @Override // o.Styleable.ArcMotion
    public setAnimationMatrix invoke() {
        this.a.ah$a = false;
        return setAnimationMatrix.ag$a;
    }
}

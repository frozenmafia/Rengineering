package com.appsamurai.storyly.storylypresenter;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.ContentInfoCompat;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final /* synthetic */ class a$j extends FunctionReferenceImpl implements Styleable.ArcMotion<setAnimationMatrix> {
    public a$j(Object obj) {
        super(0, obj, ContentInfoCompat.CompatImpl.values.class, "onTouchUp", "onTouchUp()V", 0);
    }

    @Override // o.Styleable.ArcMotion
    public setAnimationMatrix invoke() {
        ((ContentInfoCompat.CompatImpl.values) this.receiver).ag$a();
        return setAnimationMatrix.ag$a;
    }
}

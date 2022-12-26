package com.appsamurai.storyly.storylypresenter;

import android.view.View;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.Styleable;
import o.bindTempDetach;
/* loaded from: classes3.dex */
public final /* synthetic */ class r extends FunctionReferenceImpl implements Styleable.ArcMotion<Boolean> {
    public r(Object obj) {
        super(0, obj, bindTempDetach.class, "isLayoutDirectionLtr", "isLayoutDirectionLtr(Landroid/view/View;)Z", 1);
    }

    @Override // o.Styleable.ArcMotion
    public Boolean invoke() {
        return Boolean.valueOf(bindTempDetach.values((View) this.receiver));
    }
}

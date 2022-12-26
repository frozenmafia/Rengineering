package com.appsamurai.storyly.storylypresenter;

import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.ContentInfoCompat;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final /* synthetic */ class a$g extends FunctionReferenceImpl implements Styleable.ChangeBounds<Pair<? extends Float, ? extends Float>, setAnimationMatrix> {
    public a$g(Object obj) {
        super(1, obj, ContentInfoCompat.CompatImpl.values.class, "onDoubleClick", "onDoubleClick(Lkotlin/Pair;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.Styleable.ChangeBounds
    public setAnimationMatrix invoke(Pair<? extends Float, ? extends Float> pair) {
        Pair<? extends Float, ? extends Float> pair2 = pair;
        runAnimators.ag$a(pair2, "p0");
        ((ContentInfoCompat.CompatImpl.values) this.receiver).toString(pair2);
        return setAnimationMatrix.ag$a;
    }
}

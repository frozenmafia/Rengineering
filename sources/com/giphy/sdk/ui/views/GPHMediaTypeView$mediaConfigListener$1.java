package com.giphy.sdk.ui.views;

import com.giphy.sdk.ui.GPHContentType;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes7.dex */
final class GPHMediaTypeView$mediaConfigListener$1 extends Lambda implements Styleable.ChangeBounds<GPHContentType, setAnimationMatrix> {
    public static final GPHMediaTypeView$mediaConfigListener$1 INSTANCE = new GPHMediaTypeView$mediaConfigListener$1();

    GPHMediaTypeView$mediaConfigListener$1() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(GPHContentType gPHContentType) {
        runAnimators.ag$a(gPHContentType, "it");
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(GPHContentType gPHContentType) {
        invoke2(gPHContentType);
        return setAnimationMatrix.ag$a;
    }
}

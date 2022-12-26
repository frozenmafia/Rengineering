package com.giphy.sdk.ui.views;

import com.giphy.sdk.ui.views.GPHMediaTypeView;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.runAnimators;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class GPHMediaTypeView$layoutTypeListener$1 extends Lambda implements Transition<GPHMediaTypeView.LayoutType, GPHMediaTypeView.LayoutType, setAnimationMatrix> {
    public static final GPHMediaTypeView$layoutTypeListener$1 INSTANCE = new GPHMediaTypeView$layoutTypeListener$1();

    GPHMediaTypeView$layoutTypeListener$1() {
        super(2);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(GPHMediaTypeView.LayoutType layoutType, GPHMediaTypeView.LayoutType layoutType2) {
        runAnimators.ag$a(layoutType, "old");
        runAnimators.ag$a(layoutType2, "new");
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(GPHMediaTypeView.LayoutType layoutType, GPHMediaTypeView.LayoutType layoutType2) {
        invoke2(layoutType, layoutType2);
        return setAnimationMatrix.ag$a;
    }
}

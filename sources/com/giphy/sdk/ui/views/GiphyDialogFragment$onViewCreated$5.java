package com.giphy.sdk.ui.views;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes7.dex */
final /* synthetic */ class GiphyDialogFragment$onViewCreated$5 extends FunctionReferenceImpl implements Styleable.ArcMotion<setAnimationMatrix> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public GiphyDialogFragment$onViewCreated$5(GiphyDialogFragment giphyDialogFragment) {
        super(0, giphyDialogFragment, GiphyDialogFragment.class, "dismiss", "dismiss()V", 0);
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((GiphyDialogFragment) this.receiver).dismiss();
    }
}

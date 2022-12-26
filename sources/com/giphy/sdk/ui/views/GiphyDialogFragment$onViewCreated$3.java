package com.giphy.sdk.ui.views;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes7.dex */
final /* synthetic */ class GiphyDialogFragment$onViewCreated$3 extends FunctionReferenceImpl implements Styleable.ChangeBounds<Float, setAnimationMatrix> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public GiphyDialogFragment$onViewCreated$3(GiphyDialogFragment giphyDialogFragment) {
        super(1, giphyDialogFragment, GiphyDialogFragment.class, "accumulateDrag", "accumulateDrag(F)V", 0);
    }

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ setAnimationMatrix invoke(Float f) {
        invoke(f.floatValue());
        return setAnimationMatrix.ag$a;
    }

    public final void invoke(float f) {
        ((GiphyDialogFragment) this.receiver).accumulateDrag(f);
    }
}

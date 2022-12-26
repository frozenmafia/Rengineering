package com.giphy.sdk.ui.views;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.Styleable;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final /* synthetic */ class GiphyDialogFragment$setupGifsRecycler$1 extends FunctionReferenceImpl implements Styleable.ChangeBounds<Integer, setAnimationMatrix> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public GiphyDialogFragment$setupGifsRecycler$1(GiphyDialogFragment giphyDialogFragment) {
        super(1, giphyDialogFragment, GiphyDialogFragment.class, "updateResultsCount", "updateResultsCount(I)V", 0);
    }

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ setAnimationMatrix invoke(Integer num) {
        invoke(num.intValue());
        return setAnimationMatrix.ag$a;
    }

    public final void invoke(int i) {
        ((GiphyDialogFragment) this.receiver).updateResultsCount(i);
    }
}

package com.giphy.sdk.ui.views;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.Styleable;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final /* synthetic */ class GiphyDialogFragment$onGifPressed$2 extends FunctionReferenceImpl implements Styleable.ChangeBounds<String, setAnimationMatrix> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public GiphyDialogFragment$onGifPressed$2(GiphyDialogFragment giphyDialogFragment) {
        super(1, giphyDialogFragment, GiphyDialogFragment.class, "onRemoveRecentGif", "onRemoveRecentGif(Ljava/lang/String;)V", 0);
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(String str) {
        invoke2(str);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        ((GiphyDialogFragment) this.receiver).onRemoveRecentGif(str);
    }
}

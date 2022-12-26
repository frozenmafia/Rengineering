package com.giphy.sdk.ui.views;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.Styleable;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final /* synthetic */ class GiphyGridView$onLongPressGif$4 extends FunctionReferenceImpl implements Styleable.ChangeBounds<String, setAnimationMatrix> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public GiphyGridView$onLongPressGif$4(GiphyGridView giphyGridView) {
        super(1, giphyGridView, GiphyGridView.class, "onRemoveRecentGif", "onRemoveRecentGif(Ljava/lang/String;)V", 0);
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(String str) {
        invoke2(str);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        ((GiphyGridView) this.receiver).onRemoveRecentGif(str);
    }
}

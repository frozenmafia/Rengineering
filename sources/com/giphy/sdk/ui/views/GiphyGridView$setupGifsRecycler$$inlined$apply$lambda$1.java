package com.giphy.sdk.ui.views;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class GiphyGridView$setupGifsRecycler$$inlined$apply$lambda$1 extends Lambda implements Styleable.ChangeBounds<Integer, setAnimationMatrix> {
    final /* synthetic */ GiphyGridView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiphyGridView$setupGifsRecycler$$inlined$apply$lambda$1(GiphyGridView giphyGridView) {
        super(1);
        this.this$0 = giphyGridView;
    }

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ setAnimationMatrix invoke(Integer num) {
        invoke(num.intValue());
        return setAnimationMatrix.ag$a;
    }

    public final void invoke(int i) {
        GPHGridCallback callback = this.this$0.getCallback();
        if (callback != null) {
            callback.contentDidUpdate(i);
        }
    }
}

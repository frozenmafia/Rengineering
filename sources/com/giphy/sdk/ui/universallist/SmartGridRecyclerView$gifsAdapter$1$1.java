package com.giphy.sdk.ui.universallist;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.Styleable;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final /* synthetic */ class SmartGridRecyclerView$gifsAdapter$1$1 extends FunctionReferenceImpl implements Styleable.ChangeBounds<Integer, setAnimationMatrix> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public SmartGridRecyclerView$gifsAdapter$1$1(SmartGridRecyclerView smartGridRecyclerView) {
        super(1, smartGridRecyclerView, SmartGridRecyclerView.class, "loadNextPage", "loadNextPage(I)V", 0);
    }

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ setAnimationMatrix invoke(Integer num) {
        invoke(num.intValue());
        return setAnimationMatrix.ag$a;
    }

    public final void invoke(int i) {
        ((SmartGridRecyclerView) this.receiver).valueOf(i);
    }
}

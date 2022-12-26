package com.giphy.sdk.ui.universallist;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes4.dex */
final /* synthetic */ class SmartGridRecyclerView$loadGifs$1$onComplete$3$1$1 extends FunctionReferenceImpl implements Styleable.ArcMotion<setAnimationMatrix> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public SmartGridRecyclerView$loadGifs$1$onComplete$3$1$1(SmartGridRecyclerView smartGridRecyclerView) {
        super(0, smartGridRecyclerView, SmartGridRecyclerView.class, "refresh", "refresh()V", 0);
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((SmartGridRecyclerView) this.receiver).HaptikWebView();
    }
}

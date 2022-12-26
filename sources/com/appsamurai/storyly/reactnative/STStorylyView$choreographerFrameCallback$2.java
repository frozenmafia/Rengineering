package com.appsamurai.storyly.reactnative;

import android.view.Choreographer;
import com.appsamurai.storyly.reactnative.STStorylyView;
import com.appsamurai.storyly.reactnative.STStorylyView$choreographerFrameCallback$2;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class STStorylyView$choreographerFrameCallback$2 extends Lambda implements Styleable.ArcMotion<Choreographer.FrameCallback> {
    final /* synthetic */ STStorylyView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public STStorylyView$choreographerFrameCallback$2(STStorylyView sTStorylyView) {
        super(0);
        this.this$0 = sTStorylyView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final Choreographer.FrameCallback invoke() {
        final STStorylyView sTStorylyView = this.this$0;
        return new Choreographer.FrameCallback() { // from class: o.toContentInfo
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                STStorylyView$choreographerFrameCallback$2.m1088invoke$lambda0(STStorylyView.this, j);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-0  reason: not valid java name */
    public static final void m1088invoke$lambda0(STStorylyView sTStorylyView, long j) {
        runAnimators.ag$a(sTStorylyView, "this$0");
        if (sTStorylyView.isAttachedToWindow() && sTStorylyView.values().isAttachedToWindow()) {
            STStorylyView.ag$a(sTStorylyView);
            sTStorylyView.getViewTreeObserver().dispatchOnGlobalLayout();
            Choreographer.getInstance().postFrameCallback(STStorylyView.valueOf(sTStorylyView));
        }
    }
}

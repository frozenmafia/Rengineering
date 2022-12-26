package com.app.dream11.contest.ui.mynetwork;

import com.app.dream11.model.FlowState;
import kotlin.jvm.internal.Lambda;
import o.AnimatedStateListDrawableCompat;
import o.Styleable;
/* loaded from: classes2.dex */
public final class MyNetworkPresenter$matchId$2 extends Lambda implements Styleable.ArcMotion<Integer> {
    final /* synthetic */ AnimatedStateListDrawableCompat.AnimatedVectorDrawableTransition this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyNetworkPresenter$matchId$2(AnimatedStateListDrawableCompat.AnimatedVectorDrawableTransition animatedVectorDrawableTransition) {
        super(0);
        this.this$0 = animatedVectorDrawableTransition;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final Integer invoke() {
        FlowState ag$a = AnimatedStateListDrawableCompat.AnimatedVectorDrawableTransition.ag$a(this.this$0);
        MyNetworkFlowState myNetworkFlowState = ag$a instanceof MyNetworkFlowState ? (MyNetworkFlowState) ag$a : null;
        return Integer.valueOf(myNetworkFlowState == null ? -1 : myNetworkFlowState.getMatchId());
    }
}

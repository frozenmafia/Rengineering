package com.app.dream11.contest.ui.mynetwork;

import com.app.dream11.core.service.graphql.api.type.MatchStatus;
import com.app.dream11.model.FlowState;
import kotlin.jvm.internal.Lambda;
import o.AnimatedStateListDrawableCompat;
import o.Styleable;
/* loaded from: classes2.dex */
public final class MyNetworkPresenter$matchStatus$2 extends Lambda implements Styleable.ArcMotion<MatchStatus> {
    final /* synthetic */ AnimatedStateListDrawableCompat.AnimatedVectorDrawableTransition this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyNetworkPresenter$matchStatus$2(AnimatedStateListDrawableCompat.AnimatedVectorDrawableTransition animatedVectorDrawableTransition) {
        super(0);
        this.this$0 = animatedVectorDrawableTransition;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final MatchStatus invoke() {
        FlowState ag$a = AnimatedStateListDrawableCompat.AnimatedVectorDrawableTransition.ag$a(this.this$0);
        MyNetworkFlowState myNetworkFlowState = ag$a instanceof MyNetworkFlowState ? (MyNetworkFlowState) ag$a : null;
        if (myNetworkFlowState == null) {
            return null;
        }
        return myNetworkFlowState.getMatchStatus();
    }
}

package com.app.dream11.contest.ui;

import com.app.dream11.core.service.graphql.api.type.MatchStatus;
import com.app.dream11.model.FlowState;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class CommentaryPresenter$matchStatus$2 extends Lambda implements Styleable.ArcMotion<MatchStatus> {
    final /* synthetic */ CommentaryPresenter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentaryPresenter$matchStatus$2(CommentaryPresenter commentaryPresenter) {
        super(0);
        this.this$0 = commentaryPresenter;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final MatchStatus invoke() {
        FlowState flowState;
        flowState = this.this$0.flowState;
        CommentaryFlowState commentaryFlowState = flowState instanceof CommentaryFlowState ? (CommentaryFlowState) flowState : null;
        if (commentaryFlowState != null) {
            return MatchStatus.Companion.safeValueOf(commentaryFlowState.getMatchStatus());
        }
        return MatchStatus.UNKNOWN__;
    }
}

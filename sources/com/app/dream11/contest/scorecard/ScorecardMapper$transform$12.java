package com.app.dream11.contest.scorecard;

import com.app.dream11.core.service.graphql.api.postroundlock.FullScoreCardQuery;
import kotlin.jvm.internal.Lambda;
import o.AppCompatDelegateImpl;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ScorecardMapper$transform$12 extends Lambda implements Styleable.ChangeBounds<FullScoreCardQuery.Batsmen, CharSequence> {
    final /* synthetic */ AppCompatDelegateImpl.PanelFeatureState.SavedState.AnonymousClass1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScorecardMapper$transform$12(AppCompatDelegateImpl.PanelFeatureState.SavedState.AnonymousClass1 anonymousClass1) {
        super(1);
        this.this$0 = anonymousClass1;
    }

    @Override // o.Styleable.ChangeBounds
    public final CharSequence invoke(FullScoreCardQuery.Batsmen batsmen) {
        String ag$a;
        runAnimators.ag$a(batsmen, "it");
        String name = batsmen.getFragments().getGCricketPlayer().getName();
        ag$a = this.this$0.ag$a(batsmen.getFragments().getGCricketPlayer());
        String str = name + ag$a;
        if (str != null) {
            return str;
        }
        return "";
    }
}

package com.app.dream11.contest.ui.postroundlock;

import com.app.dream11.model.FlowState;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.updatePreDraw;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestsPostLockPresenter$wlsSlug$2 extends Lambda implements Styleable.ArcMotion<String> {
    final /* synthetic */ updatePreDraw $leagueListingFeature;
    final /* synthetic */ ContestsPostLockPresenter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContestsPostLockPresenter$wlsSlug$2(ContestsPostLockPresenter contestsPostLockPresenter, updatePreDraw updatepredraw) {
        super(0);
        this.this$0 = contestsPostLockPresenter;
        this.$leagueListingFeature = updatepredraw;
    }

    @Override // o.Styleable.ArcMotion
    public final String invoke() {
        FlowState flowState;
        flowState = this.this$0.flowState;
        String wlsSlug = flowState == null ? null : flowState.getWlsSlug();
        return wlsSlug == null ? this.$leagueListingFeature.getActiveGameConfig().getWLSSlug() : wlsSlug;
    }
}

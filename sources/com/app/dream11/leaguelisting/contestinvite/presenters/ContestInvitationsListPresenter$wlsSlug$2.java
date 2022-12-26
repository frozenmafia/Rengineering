package com.app.dream11.leaguelisting.contestinvite.presenters;

import com.app.dream11.model.FlowState;
import kotlin.jvm.internal.Lambda;
import o.SetDimensions;
import o.Styleable;
import o.updatePreDraw;
/* loaded from: classes3.dex */
public final class ContestInvitationsListPresenter$wlsSlug$2 extends Lambda implements Styleable.ArcMotion<String> {
    final /* synthetic */ updatePreDraw $leagueListingFeature;
    final /* synthetic */ SetDimensions this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContestInvitationsListPresenter$wlsSlug$2(SetDimensions setDimensions, updatePreDraw updatepredraw) {
        super(0);
        this.this$0 = setDimensions;
        this.$leagueListingFeature = updatepredraw;
    }

    @Override // o.Styleable.ArcMotion
    public final String invoke() {
        FlowState flowState;
        flowState = this.this$0.flowState;
        String wlsSlug = flowState.getWlsSlug();
        return wlsSlug == null ? this.$leagueListingFeature.getActiveGameConfig().getWLSSlug() : wlsSlug;
    }
}

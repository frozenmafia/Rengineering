package com.app.dream11.model.viewmodel;

import com.app.dream11.core.service.graphql.api.MyPromotionsQuery;
import o.SplineSet;
/* loaded from: classes3.dex */
public final /* synthetic */ class RegisterPageVM$$ExternalSyntheticLambda0 implements SplineSet {
    public static final /* synthetic */ RegisterPageVM$$ExternalSyntheticLambda0 INSTANCE = new RegisterPageVM$$ExternalSyntheticLambda0();

    private /* synthetic */ RegisterPageVM$$ExternalSyntheticLambda0() {
    }

    @Override // o.SplineSet
    public final void onPromotionClicked(MyPromotionsQuery.PromotionFeedBanner promotionFeedBanner, int i) {
        RegisterPageVM.m1016getPromotionsCustomClickListener$lambda1(promotionFeedBanner, i);
    }
}

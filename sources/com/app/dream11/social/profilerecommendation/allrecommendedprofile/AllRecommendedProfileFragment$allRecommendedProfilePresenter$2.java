package com.app.dream11.social.profilerecommendation.allrecommendedprofile;

import kotlin.jvm.internal.Lambda;
import o.ActionMenuItem;
import o.Styleable;
import o.getBundleArrayForMessages;
/* loaded from: classes3.dex */
final class AllRecommendedProfileFragment$allRecommendedProfilePresenter$2 extends Lambda implements Styleable.ArcMotion<getBundleArrayForMessages> {
    public static final AllRecommendedProfileFragment$allRecommendedProfilePresenter$2 INSTANCE = new AllRecommendedProfileFragment$allRecommendedProfilePresenter$2();

    AllRecommendedProfileFragment$allRecommendedProfilePresenter$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final getBundleArrayForMessages invoke() {
        return ActionMenuItem.valueOf().getSignupData();
    }
}

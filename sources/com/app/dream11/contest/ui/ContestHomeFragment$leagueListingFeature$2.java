package com.app.dream11.contest.ui;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.onAttachedToWindow;
import o.updatePreDraw;
/* loaded from: classes2.dex */
final class ContestHomeFragment$leagueListingFeature$2 extends Lambda implements Styleable.ArcMotion<updatePreDraw> {
    public static final ContestHomeFragment$leagueListingFeature$2 INSTANCE = new ContestHomeFragment$leagueListingFeature$2();

    ContestHomeFragment$leagueListingFeature$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final updatePreDraw invoke() {
        return onAttachedToWindow.values.values().isLogoutPending();
    }
}

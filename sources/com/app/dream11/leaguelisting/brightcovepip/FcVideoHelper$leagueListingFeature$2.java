package com.app.dream11.leaguelisting.brightcovepip;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.onAttachedToWindow;
import o.updatePreDraw;
/* loaded from: classes3.dex */
public final class FcVideoHelper$leagueListingFeature$2 extends Lambda implements Styleable.ArcMotion<updatePreDraw> {
    public static final FcVideoHelper$leagueListingFeature$2 INSTANCE = new FcVideoHelper$leagueListingFeature$2();

    FcVideoHelper$leagueListingFeature$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final updatePreDraw invoke() {
        return onAttachedToWindow.values.values().isLogoutPending();
    }
}

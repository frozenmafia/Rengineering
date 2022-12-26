package com.app.dream11.matchcentre;

import kotlin.jvm.internal.Lambda;
import o.ActionMenuItem;
import o.Styleable;
import o.TimeCycleSplineSet;
/* loaded from: classes3.dex */
final class MatchCentreFragment$homePresenter$2 extends Lambda implements Styleable.ArcMotion<TimeCycleSplineSet> {
    public static final MatchCentreFragment$homePresenter$2 INSTANCE = new MatchCentreFragment$homePresenter$2();

    MatchCentreFragment$homePresenter$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final TimeCycleSplineSet invoke() {
        return ActionMenuItem.valueOf().cancelAll();
    }
}

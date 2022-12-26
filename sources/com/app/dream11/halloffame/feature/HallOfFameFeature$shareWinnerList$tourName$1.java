package com.app.dream11.halloffame.feature;

import com.app.dream11.core.service.graphql.api.fragment.HallOfFameMatchGFragment;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class HallOfFameFeature$shareWinnerList$tourName$1 extends Lambda implements Styleable.ChangeBounds<HallOfFameMatchGFragment.Squad, CharSequence> {
    public static final HallOfFameFeature$shareWinnerList$tourName$1 INSTANCE = new HallOfFameFeature$shareWinnerList$tourName$1();

    HallOfFameFeature$shareWinnerList$tourName$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final CharSequence invoke(HallOfFameMatchGFragment.Squad squad) {
        runAnimators.ag$a(squad, "it");
        return squad.getShortName();
    }
}

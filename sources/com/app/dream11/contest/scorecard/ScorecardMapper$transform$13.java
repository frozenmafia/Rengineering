package com.app.dream11.contest.scorecard;

import com.app.dream11.core.service.graphql.api.postroundlock.FullScoreCardQuery;
import com.dreampay.commons.constants.Constants;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ScorecardMapper$transform$13 extends Lambda implements Styleable.ChangeBounds<FullScoreCardQuery.Extra, CharSequence> {
    public static final ScorecardMapper$transform$13 INSTANCE = new ScorecardMapper$transform$13();

    ScorecardMapper$transform$13() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final CharSequence invoke(FullScoreCardQuery.Extra extra) {
        runAnimators.ag$a(extra, "it");
        String displayText = extra.getDisplayText();
        if (displayText == null) {
            displayText = "";
        }
        int value = extra.getValue();
        if (value == null) {
            value = 0;
        }
        return displayText + Constants.WHITE_SPACE + value;
    }
}

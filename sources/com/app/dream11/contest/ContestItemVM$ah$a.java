package com.app.dream11.contest;

import com.app.dream11.contest.ContestItemVM;
import com.app.dream11.core.service.graphql.api.type.MatchStatus;
/* loaded from: classes.dex */
public final /* synthetic */ class ContestItemVM$ah$a {
    public static final /* synthetic */ int[] ag$a;
    public static final /* synthetic */ int[] ah$a;
    public static final /* synthetic */ int[] valueOf;

    static {
        int[] iArr = new int[ContestUpdateType.values().length];
        iArr[ContestUpdateType.QUICK_JOIN_SELECTED.ordinal()] = 1;
        iArr[ContestUpdateType.JOINED.ordinal()] = 2;
        iArr[ContestUpdateType.QUICK_JOIN_TOGGLE.ordinal()] = 3;
        ah$a = iArr;
        int[] iArr2 = new int[MatchStatus.values().length];
        iArr2[MatchStatus.NOT_STARTED.ordinal()] = 1;
        iArr2[MatchStatus.UP_COMING.ordinal()] = 2;
        ag$a = iArr2;
        int[] iArr3 = new int[ContestItemVM.ContestCardTypes.values().length];
        iArr3[ContestItemVM.ContestCardTypes.UNFILLED_CONTESTS.ordinal()] = 1;
        iArr3[ContestItemVM.ContestCardTypes.VIEW_ALL.ordinal()] = 2;
        iArr3[ContestItemVM.ContestCardTypes.CONTEST_DETAIL.ordinal()] = 3;
        iArr3[ContestItemVM.ContestCardTypes.MY_CONTESTS_PRE_RL.ordinal()] = 4;
        iArr3[ContestItemVM.ContestCardTypes.MY_CONTEST_POST_RL.ordinal()] = 5;
        iArr3[ContestItemVM.ContestCardTypes.CONTEST_SECTION.ordinal()] = 6;
        valueOf = iArr3;
    }
}

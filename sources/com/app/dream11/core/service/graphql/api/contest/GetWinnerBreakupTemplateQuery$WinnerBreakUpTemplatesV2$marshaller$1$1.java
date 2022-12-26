package com.app.dream11.core.service.graphql.api.contest;

import com.app.dream11.core.service.graphql.api.contest.GetWinnerBreakupTemplateQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class GetWinnerBreakupTemplateQuery$WinnerBreakUpTemplatesV2$marshaller$1$1 extends Lambda implements Transition<List<? extends GetWinnerBreakupTemplateQuery.WinnerTemplateList>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GetWinnerBreakupTemplateQuery$WinnerBreakUpTemplatesV2$marshaller$1$1 INSTANCE = new GetWinnerBreakupTemplateQuery$WinnerBreakUpTemplatesV2$marshaller$1$1();

    GetWinnerBreakupTemplateQuery$WinnerBreakUpTemplatesV2$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GetWinnerBreakupTemplateQuery.WinnerTemplateList> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GetWinnerBreakupTemplateQuery.WinnerTemplateList>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GetWinnerBreakupTemplateQuery.WinnerTemplateList> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GetWinnerBreakupTemplateQuery.WinnerTemplateList winnerTemplateList : list) {
            valueof.values(winnerTemplateList == null ? null : winnerTemplateList.marshaller());
        }
    }
}

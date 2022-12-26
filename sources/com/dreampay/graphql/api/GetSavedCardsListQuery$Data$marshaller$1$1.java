package com.dreampay.graphql.api;

import com.dreampay.graphql.api.GetSavedCardsListQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes4.dex */
final class GetSavedCardsListQuery$Data$marshaller$1$1 extends Lambda implements Transition<List<? extends GetSavedCardsListQuery.SavedCard>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GetSavedCardsListQuery$Data$marshaller$1$1 INSTANCE = new GetSavedCardsListQuery$Data$marshaller$1$1();

    GetSavedCardsListQuery$Data$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GetSavedCardsListQuery.SavedCard> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GetSavedCardsListQuery.SavedCard>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GetSavedCardsListQuery.SavedCard> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GetSavedCardsListQuery.SavedCard savedCard : list) {
            valueof.values(savedCard.marshaller());
        }
    }
}

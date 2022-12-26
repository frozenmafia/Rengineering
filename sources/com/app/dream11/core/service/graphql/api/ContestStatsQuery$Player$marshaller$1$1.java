package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestStatsQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class ContestStatsQuery$Player$marshaller$1$1 extends Lambda implements Transition<List<? extends ContestStatsQuery.Artwork>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final ContestStatsQuery$Player$marshaller$1$1 INSTANCE = new ContestStatsQuery$Player$marshaller$1$1();

    ContestStatsQuery$Player$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends ContestStatsQuery.Artwork> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<ContestStatsQuery.Artwork>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<ContestStatsQuery.Artwork> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (ContestStatsQuery.Artwork artwork : list) {
            valueof.values(artwork.marshaller());
        }
    }
}

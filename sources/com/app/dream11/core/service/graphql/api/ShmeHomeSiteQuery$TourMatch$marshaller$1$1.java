package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ShmeHomeSiteQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class ShmeHomeSiteQuery$TourMatch$marshaller$1$1 extends Lambda implements Transition<List<? extends ShmeHomeSiteQuery.Match>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final ShmeHomeSiteQuery$TourMatch$marshaller$1$1 INSTANCE = new ShmeHomeSiteQuery$TourMatch$marshaller$1$1();

    ShmeHomeSiteQuery$TourMatch$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends ShmeHomeSiteQuery.Match> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<ShmeHomeSiteQuery.Match>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<ShmeHomeSiteQuery.Match> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (ShmeHomeSiteQuery.Match match : list) {
            valueof.values(match.marshaller());
        }
    }
}

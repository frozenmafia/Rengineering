package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ShmeHomeSiteQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class ShmeHomeSiteQuery$Site$marshaller$1$1 extends Lambda implements Transition<List<? extends ShmeHomeSiteQuery.TourMatch>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final ShmeHomeSiteQuery$Site$marshaller$1$1 INSTANCE = new ShmeHomeSiteQuery$Site$marshaller$1$1();

    ShmeHomeSiteQuery$Site$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends ShmeHomeSiteQuery.TourMatch> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<ShmeHomeSiteQuery.TourMatch>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<ShmeHomeSiteQuery.TourMatch> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (ShmeHomeSiteQuery.TourMatch tourMatch : list) {
            valueof.values(tourMatch.marshaller());
        }
    }
}

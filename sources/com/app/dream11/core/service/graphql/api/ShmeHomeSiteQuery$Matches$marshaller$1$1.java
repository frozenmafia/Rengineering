package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ShmeHomeSiteQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class ShmeHomeSiteQuery$Matches$marshaller$1$1 extends Lambda implements Transition<List<? extends ShmeHomeSiteQuery.Edge>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final ShmeHomeSiteQuery$Matches$marshaller$1$1 INSTANCE = new ShmeHomeSiteQuery$Matches$marshaller$1$1();

    ShmeHomeSiteQuery$Matches$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends ShmeHomeSiteQuery.Edge> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<ShmeHomeSiteQuery.Edge>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<ShmeHomeSiteQuery.Edge> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (ShmeHomeSiteQuery.Edge edge : list) {
            valueof.values(edge == null ? null : edge.marshaller());
        }
    }
}

package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GFeed;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class GFeed$marshaller$1$1 extends Lambda implements Transition<List<? extends GFeed.Edge>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GFeed$marshaller$1$1 INSTANCE = new GFeed$marshaller$1$1();

    GFeed$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GFeed.Edge> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GFeed.Edge>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GFeed.Edge> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GFeed.Edge edge : list) {
            valueof.values(edge == null ? null : edge.marshaller());
        }
    }
}

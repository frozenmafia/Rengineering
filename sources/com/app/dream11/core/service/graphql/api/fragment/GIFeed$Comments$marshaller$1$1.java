package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GIFeed;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class GIFeed$Comments$marshaller$1$1 extends Lambda implements Transition<List<? extends GIFeed.TopComment>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GIFeed$Comments$marshaller$1$1 INSTANCE = new GIFeed$Comments$marshaller$1$1();

    GIFeed$Comments$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GIFeed.TopComment> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GIFeed.TopComment>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GIFeed.TopComment> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GIFeed.TopComment topComment : list) {
            valueof.values(topComment.marshaller());
        }
    }
}

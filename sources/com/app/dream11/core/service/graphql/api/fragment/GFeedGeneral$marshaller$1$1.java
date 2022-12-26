package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GFeedGeneral;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class GFeedGeneral$marshaller$1$1 extends Lambda implements Transition<List<? extends GFeedGeneral.Medium>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GFeedGeneral$marshaller$1$1 INSTANCE = new GFeedGeneral$marshaller$1$1();

    GFeedGeneral$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GFeedGeneral.Medium> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GFeedGeneral.Medium>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GFeedGeneral.Medium> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GFeedGeneral.Medium medium : list) {
            valueof.values(medium == null ? null : medium.marshaller());
        }
    }
}

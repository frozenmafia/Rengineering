package com.app.dream11.core.service.graphql.api.Social.chat;

import com.app.dream11.core.service.graphql.api.Social.chat.GlRanksQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class GlRanksQuery$GlBand$marshaller$1$1 extends Lambda implements Transition<List<? extends GlRanksQuery.GlRank>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GlRanksQuery$GlBand$marshaller$1$1 INSTANCE = new GlRanksQuery$GlBand$marshaller$1$1();

    GlRanksQuery$GlBand$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GlRanksQuery.GlRank> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GlRanksQuery.GlRank>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GlRanksQuery.GlRank> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GlRanksQuery.GlRank glRank : list) {
            valueof.values(glRank.marshaller());
        }
    }
}

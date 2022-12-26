package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.AnnouncedLineUpsQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class AnnouncedLineUpsQuery$PlayingStyleLegend$marshaller$1$1 extends Lambda implements Transition<List<? extends AnnouncedLineUpsQuery.IconUrl>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final AnnouncedLineUpsQuery$PlayingStyleLegend$marshaller$1$1 INSTANCE = new AnnouncedLineUpsQuery$PlayingStyleLegend$marshaller$1$1();

    AnnouncedLineUpsQuery$PlayingStyleLegend$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends AnnouncedLineUpsQuery.IconUrl> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<AnnouncedLineUpsQuery.IconUrl>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<AnnouncedLineUpsQuery.IconUrl> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (AnnouncedLineUpsQuery.IconUrl iconUrl : list) {
            valueof.values(iconUrl.marshaller());
        }
    }
}

package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.AnnouncedLineUpsQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class AnnouncedLineUpsQuery$Squad$marshaller$1$2 extends Lambda implements Transition<List<? extends AnnouncedLineUpsQuery.FlagWithName>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final AnnouncedLineUpsQuery$Squad$marshaller$1$2 INSTANCE = new AnnouncedLineUpsQuery$Squad$marshaller$1$2();

    AnnouncedLineUpsQuery$Squad$marshaller$1$2() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends AnnouncedLineUpsQuery.FlagWithName> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<AnnouncedLineUpsQuery.FlagWithName>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<AnnouncedLineUpsQuery.FlagWithName> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (AnnouncedLineUpsQuery.FlagWithName flagWithName : list) {
            valueof.values(flagWithName.marshaller());
        }
    }
}

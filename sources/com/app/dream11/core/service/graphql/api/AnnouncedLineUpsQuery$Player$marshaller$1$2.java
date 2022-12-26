package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.AnnouncedLineUpsQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class AnnouncedLineUpsQuery$Player$marshaller$1$2 extends Lambda implements Transition<List<? extends AnnouncedLineUpsQuery.PlayingStyleIcon>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final AnnouncedLineUpsQuery$Player$marshaller$1$2 INSTANCE = new AnnouncedLineUpsQuery$Player$marshaller$1$2();

    AnnouncedLineUpsQuery$Player$marshaller$1$2() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends AnnouncedLineUpsQuery.PlayingStyleIcon> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<AnnouncedLineUpsQuery.PlayingStyleIcon>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<AnnouncedLineUpsQuery.PlayingStyleIcon> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (AnnouncedLineUpsQuery.PlayingStyleIcon playingStyleIcon : list) {
            valueof.values(playingStyleIcon.marshaller());
        }
    }
}

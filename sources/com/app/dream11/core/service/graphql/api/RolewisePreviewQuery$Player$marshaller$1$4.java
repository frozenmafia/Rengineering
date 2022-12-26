package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.RolewisePreviewQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class RolewisePreviewQuery$Player$marshaller$1$4 extends Lambda implements Transition<List<? extends RolewisePreviewQuery.PlayingStyleIcon>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final RolewisePreviewQuery$Player$marshaller$1$4 INSTANCE = new RolewisePreviewQuery$Player$marshaller$1$4();

    RolewisePreviewQuery$Player$marshaller$1$4() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends RolewisePreviewQuery.PlayingStyleIcon> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<RolewisePreviewQuery.PlayingStyleIcon>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<RolewisePreviewQuery.PlayingStyleIcon> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (RolewisePreviewQuery.PlayingStyleIcon playingStyleIcon : list) {
            valueof.values(playingStyleIcon.marshaller());
        }
    }
}

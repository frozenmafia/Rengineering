package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.PlayerPreviewQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class PlayerPreviewQuery$Player$marshaller$1$4 extends Lambda implements Transition<List<? extends PlayerPreviewQuery.PlayingStyleIcon>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final PlayerPreviewQuery$Player$marshaller$1$4 INSTANCE = new PlayerPreviewQuery$Player$marshaller$1$4();

    PlayerPreviewQuery$Player$marshaller$1$4() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends PlayerPreviewQuery.PlayingStyleIcon> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<PlayerPreviewQuery.PlayingStyleIcon>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<PlayerPreviewQuery.PlayingStyleIcon> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (PlayerPreviewQuery.PlayingStyleIcon playingStyleIcon : list) {
            valueof.values(playingStyleIcon.marshaller());
        }
    }
}

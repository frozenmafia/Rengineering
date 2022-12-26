package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ShmeCreateTeamQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class ShmeCreateTeamQuery$Site$marshaller$1$1 extends Lambda implements Transition<List<? extends ShmeCreateTeamQuery.TeamPreviewArtwork>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final ShmeCreateTeamQuery$Site$marshaller$1$1 INSTANCE = new ShmeCreateTeamQuery$Site$marshaller$1$1();

    ShmeCreateTeamQuery$Site$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends ShmeCreateTeamQuery.TeamPreviewArtwork> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<ShmeCreateTeamQuery.TeamPreviewArtwork>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<ShmeCreateTeamQuery.TeamPreviewArtwork> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (ShmeCreateTeamQuery.TeamPreviewArtwork teamPreviewArtwork : list) {
            valueof.values(teamPreviewArtwork.marshaller());
        }
    }
}

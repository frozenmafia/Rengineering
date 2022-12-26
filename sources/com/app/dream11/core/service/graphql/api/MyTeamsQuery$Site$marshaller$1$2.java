package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MyTeamsQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class MyTeamsQuery$Site$marshaller$1$2 extends Lambda implements Transition<List<? extends MyTeamsQuery.TeamPreviewArtwork>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final MyTeamsQuery$Site$marshaller$1$2 INSTANCE = new MyTeamsQuery$Site$marshaller$1$2();

    MyTeamsQuery$Site$marshaller$1$2() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends MyTeamsQuery.TeamPreviewArtwork> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<MyTeamsQuery.TeamPreviewArtwork>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<MyTeamsQuery.TeamPreviewArtwork> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (MyTeamsQuery.TeamPreviewArtwork teamPreviewArtwork : list) {
            valueof.values(teamPreviewArtwork.marshaller());
        }
    }
}

package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.RolewisePreviewQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class RolewisePreviewQuery$Player$marshaller$1$3 extends Lambda implements Transition<List<? extends RolewisePreviewQuery.TeamsToRole>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final RolewisePreviewQuery$Player$marshaller$1$3 INSTANCE = new RolewisePreviewQuery$Player$marshaller$1$3();

    RolewisePreviewQuery$Player$marshaller$1$3() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends RolewisePreviewQuery.TeamsToRole> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<RolewisePreviewQuery.TeamsToRole>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<RolewisePreviewQuery.TeamsToRole> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (RolewisePreviewQuery.TeamsToRole teamsToRole : list) {
            valueof.values(teamsToRole == null ? null : teamsToRole.marshaller());
        }
    }
}

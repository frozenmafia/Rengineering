package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.RolewisePreviewQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class RolewisePreviewQuery$Site$marshaller$1$1 extends Lambda implements Transition<List<? extends RolewisePreviewQuery.Role>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final RolewisePreviewQuery$Site$marshaller$1$1 INSTANCE = new RolewisePreviewQuery$Site$marshaller$1$1();

    RolewisePreviewQuery$Site$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends RolewisePreviewQuery.Role> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<RolewisePreviewQuery.Role>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<RolewisePreviewQuery.Role> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (RolewisePreviewQuery.Role role : list) {
            valueof.values(role.marshaller());
        }
    }
}

package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MatchCenterFabQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class MatchCenterFabQuery$FabIconDetails$marshaller$1$1 extends Lambda implements Transition<List<? extends MatchCenterFabQuery.Icon>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final MatchCenterFabQuery$FabIconDetails$marshaller$1$1 INSTANCE = new MatchCenterFabQuery$FabIconDetails$marshaller$1$1();

    MatchCenterFabQuery$FabIconDetails$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends MatchCenterFabQuery.Icon> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<MatchCenterFabQuery.Icon>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<MatchCenterFabQuery.Icon> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (MatchCenterFabQuery.Icon icon : list) {
            valueof.values(icon.marshaller());
        }
    }
}

package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestsPostLockQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class ContestsPostLockQuery$Edge1$marshaller$1$1 extends Lambda implements Transition<List<? extends ContestsPostLockQuery.MyTeam1>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final ContestsPostLockQuery$Edge1$marshaller$1$1 INSTANCE = new ContestsPostLockQuery$Edge1$marshaller$1$1();

    ContestsPostLockQuery$Edge1$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends ContestsPostLockQuery.MyTeam1> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<ContestsPostLockQuery.MyTeam1>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<ContestsPostLockQuery.MyTeam1> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (ContestsPostLockQuery.MyTeam1 myTeam1 : list) {
            valueof.values(myTeam1.marshaller());
        }
    }
}

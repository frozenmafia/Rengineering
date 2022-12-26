package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.JoinWithInviteCodeQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class JoinWithInviteCodeQuery$LeagueDetailsFromInviteCode$marshaller$1$1 extends Lambda implements Transition<List<? extends JoinWithInviteCodeQuery.Squad>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final JoinWithInviteCodeQuery$LeagueDetailsFromInviteCode$marshaller$1$1 INSTANCE = new JoinWithInviteCodeQuery$LeagueDetailsFromInviteCode$marshaller$1$1();

    JoinWithInviteCodeQuery$LeagueDetailsFromInviteCode$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends JoinWithInviteCodeQuery.Squad> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<JoinWithInviteCodeQuery.Squad>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<JoinWithInviteCodeQuery.Squad> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (JoinWithInviteCodeQuery.Squad squad : list) {
            valueof.values(squad == null ? null : squad.marshaller());
        }
    }
}

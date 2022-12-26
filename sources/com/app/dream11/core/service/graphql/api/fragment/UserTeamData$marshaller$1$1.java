package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.UserTeamData;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class UserTeamData$marshaller$1$1 extends Lambda implements Transition<List<? extends UserTeamData.Player>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final UserTeamData$marshaller$1$1 INSTANCE = new UserTeamData$marshaller$1$1();

    UserTeamData$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends UserTeamData.Player> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<UserTeamData.Player>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<UserTeamData.Player> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (UserTeamData.Player player : list) {
            valueof.values(player.marshaller());
        }
    }
}

package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.UserFollowFollowerData;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class UserFollowFollowerData$marshaller$1$1 extends Lambda implements Transition<List<? extends UserFollowFollowerData.OfficialTick>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final UserFollowFollowerData$marshaller$1$1 INSTANCE = new UserFollowFollowerData$marshaller$1$1();

    UserFollowFollowerData$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends UserFollowFollowerData.OfficialTick> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<UserFollowFollowerData.OfficialTick>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<UserFollowFollowerData.OfficialTick> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (UserFollowFollowerData.OfficialTick officialTick : list) {
            valueof.values(officialTick == null ? null : officialTick.marshaller());
        }
    }
}

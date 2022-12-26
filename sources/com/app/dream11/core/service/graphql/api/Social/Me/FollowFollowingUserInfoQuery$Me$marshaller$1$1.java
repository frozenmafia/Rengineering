package com.app.dream11.core.service.graphql.api.Social.Me;

import com.app.dream11.core.service.graphql.api.Social.Me.FollowFollowingUserInfoQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class FollowFollowingUserInfoQuery$Me$marshaller$1$1 extends Lambda implements Transition<List<? extends FollowFollowingUserInfoQuery.OfficialTick>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final FollowFollowingUserInfoQuery$Me$marshaller$1$1 INSTANCE = new FollowFollowingUserInfoQuery$Me$marshaller$1$1();

    FollowFollowingUserInfoQuery$Me$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends FollowFollowingUserInfoQuery.OfficialTick> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<FollowFollowingUserInfoQuery.OfficialTick>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<FollowFollowingUserInfoQuery.OfficialTick> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (FollowFollowingUserInfoQuery.OfficialTick officialTick : list) {
            valueof.values(officialTick == null ? null : officialTick.marshaller());
        }
    }
}

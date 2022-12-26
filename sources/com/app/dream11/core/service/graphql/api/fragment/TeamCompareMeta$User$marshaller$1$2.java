package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.TeamCompareMeta;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class TeamCompareMeta$User$marshaller$1$2 extends Lambda implements Transition<List<? extends TeamCompareMeta.ProfilePic>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final TeamCompareMeta$User$marshaller$1$2 INSTANCE = new TeamCompareMeta$User$marshaller$1$2();

    TeamCompareMeta$User$marshaller$1$2() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends TeamCompareMeta.ProfilePic> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<TeamCompareMeta.ProfilePic>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<TeamCompareMeta.ProfilePic> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (TeamCompareMeta.ProfilePic profilePic : list) {
            valueof.values(profilePic == null ? null : profilePic.marshaller());
        }
    }
}

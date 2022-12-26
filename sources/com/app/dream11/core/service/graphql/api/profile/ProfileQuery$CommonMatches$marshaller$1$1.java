package com.app.dream11.core.service.graphql.api.profile;

import com.app.dream11.core.service.graphql.api.profile.ProfileQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class ProfileQuery$CommonMatches$marshaller$1$1 extends Lambda implements Transition<List<? extends ProfileQuery.Edge>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final ProfileQuery$CommonMatches$marshaller$1$1 INSTANCE = new ProfileQuery$CommonMatches$marshaller$1$1();

    ProfileQuery$CommonMatches$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends ProfileQuery.Edge> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<ProfileQuery.Edge>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<ProfileQuery.Edge> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (ProfileQuery.Edge edge : list) {
            valueof.values(edge.marshaller());
        }
    }
}

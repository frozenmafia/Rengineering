package com.app.dream11.core.service.graphql.api.profile;

import com.app.dream11.core.service.graphql.api.profile.ProfileQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class ProfileQuery$CommonMatchesStats$marshaller$1$1 extends Lambda implements Transition<List<? extends ProfileQuery.CommonStat>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final ProfileQuery$CommonMatchesStats$marshaller$1$1 INSTANCE = new ProfileQuery$CommonMatchesStats$marshaller$1$1();

    ProfileQuery$CommonMatchesStats$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends ProfileQuery.CommonStat> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<ProfileQuery.CommonStat>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<ProfileQuery.CommonStat> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (ProfileQuery.CommonStat commonStat : list) {
            valueof.values(commonStat.marshaller());
        }
    }
}

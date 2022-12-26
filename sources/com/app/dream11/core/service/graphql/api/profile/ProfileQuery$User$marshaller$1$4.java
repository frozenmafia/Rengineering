package com.app.dream11.core.service.graphql.api.profile;

import com.app.dream11.core.service.graphql.api.profile.ProfileQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class ProfileQuery$User$marshaller$1$4 extends Lambda implements Transition<List<? extends ProfileQuery.CareerStat>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final ProfileQuery$User$marshaller$1$4 INSTANCE = new ProfileQuery$User$marshaller$1$4();

    ProfileQuery$User$marshaller$1$4() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends ProfileQuery.CareerStat> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<ProfileQuery.CareerStat>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<ProfileQuery.CareerStat> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (ProfileQuery.CareerStat careerStat : list) {
            valueof.values(careerStat == null ? null : careerStat.marshaller());
        }
    }
}

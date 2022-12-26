package com.app.dream11.core.service.graphql.api.profile;

import com.app.dream11.core.service.graphql.api.profile.ProfileQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class ProfileQuery$AwardEdge$marshaller$1$2 extends Lambda implements Transition<List<? extends ProfileQuery.Image>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final ProfileQuery$AwardEdge$marshaller$1$2 INSTANCE = new ProfileQuery$AwardEdge$marshaller$1$2();

    ProfileQuery$AwardEdge$marshaller$1$2() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends ProfileQuery.Image> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<ProfileQuery.Image>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<ProfileQuery.Image> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (ProfileQuery.Image image : list) {
            valueof.values(image.marshaller());
        }
    }
}

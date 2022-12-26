package com.app.dream11.core.service.graphql.api.profile.myprofile;

import com.app.dream11.core.service.graphql.api.profile.myprofile.NewMyProfileQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class NewMyProfileQuery$AwardEdge$marshaller$1$1 extends Lambda implements Transition<List<? extends NewMyProfileQuery.Tag>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final NewMyProfileQuery$AwardEdge$marshaller$1$1 INSTANCE = new NewMyProfileQuery$AwardEdge$marshaller$1$1();

    NewMyProfileQuery$AwardEdge$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends NewMyProfileQuery.Tag> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<NewMyProfileQuery.Tag>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<NewMyProfileQuery.Tag> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (NewMyProfileQuery.Tag tag : list) {
            valueof.values(tag.marshaller());
        }
    }
}

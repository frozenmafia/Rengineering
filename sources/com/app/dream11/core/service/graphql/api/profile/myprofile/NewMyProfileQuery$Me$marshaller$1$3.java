package com.app.dream11.core.service.graphql.api.profile.myprofile;

import com.app.dream11.core.service.graphql.api.profile.myprofile.NewMyProfileQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class NewMyProfileQuery$Me$marshaller$1$3 extends Lambda implements Transition<List<? extends NewMyProfileQuery.CoverPic>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final NewMyProfileQuery$Me$marshaller$1$3 INSTANCE = new NewMyProfileQuery$Me$marshaller$1$3();

    NewMyProfileQuery$Me$marshaller$1$3() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends NewMyProfileQuery.CoverPic> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<NewMyProfileQuery.CoverPic>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<NewMyProfileQuery.CoverPic> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (NewMyProfileQuery.CoverPic coverPic : list) {
            valueof.values(coverPic == null ? null : coverPic.marshaller());
        }
    }
}

package com.app.dream11.core.service.graphql.api.profile.myprofile;

import com.app.dream11.core.service.graphql.api.profile.myprofile.NewMyProfileQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class NewMyProfileQuery$Edge$marshaller$1$1 extends Lambda implements Transition<List<? extends NewMyProfileQuery.Artwork>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final NewMyProfileQuery$Edge$marshaller$1$1 INSTANCE = new NewMyProfileQuery$Edge$marshaller$1$1();

    NewMyProfileQuery$Edge$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends NewMyProfileQuery.Artwork> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<NewMyProfileQuery.Artwork>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<NewMyProfileQuery.Artwork> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (NewMyProfileQuery.Artwork artwork : list) {
            valueof.values(artwork.marshaller());
        }
    }
}

package com.app.dream11.core.service.graphql.api.profile.myprofile;

import com.app.dream11.core.service.graphql.api.profile.myprofile.NewMyProfileQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class NewMyProfileQuery$Edge$marshaller$1$2 extends Lambda implements Transition<List<? extends NewMyProfileQuery.MiniArtwork1>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final NewMyProfileQuery$Edge$marshaller$1$2 INSTANCE = new NewMyProfileQuery$Edge$marshaller$1$2();

    NewMyProfileQuery$Edge$marshaller$1$2() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends NewMyProfileQuery.MiniArtwork1> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<NewMyProfileQuery.MiniArtwork1>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<NewMyProfileQuery.MiniArtwork1> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (NewMyProfileQuery.MiniArtwork1 miniArtwork1 : list) {
            valueof.values(miniArtwork1.marshaller());
        }
    }
}

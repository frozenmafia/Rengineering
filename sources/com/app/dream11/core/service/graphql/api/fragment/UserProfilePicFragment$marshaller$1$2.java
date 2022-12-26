package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.UserProfilePicFragment;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class UserProfilePicFragment$marshaller$1$2 extends Lambda implements Transition<List<? extends UserProfilePicFragment.Artwork>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final UserProfilePicFragment$marshaller$1$2 INSTANCE = new UserProfilePicFragment$marshaller$1$2();

    UserProfilePicFragment$marshaller$1$2() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends UserProfilePicFragment.Artwork> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<UserProfilePicFragment.Artwork>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<UserProfilePicFragment.Artwork> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (UserProfilePicFragment.Artwork artwork : list) {
            valueof.values(artwork == null ? null : artwork.marshaller());
        }
    }
}

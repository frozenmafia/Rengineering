package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.ProfilePicFragment;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class ProfilePicFragment$marshaller$1$1 extends Lambda implements Transition<List<? extends ProfilePicFragment.ProfilePic>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final ProfilePicFragment$marshaller$1$1 INSTANCE = new ProfilePicFragment$marshaller$1$1();

    ProfilePicFragment$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends ProfilePicFragment.ProfilePic> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<ProfilePicFragment.ProfilePic>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<ProfilePicFragment.ProfilePic> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (ProfilePicFragment.ProfilePic profilePic : list) {
            valueof.values(profilePic == null ? null : profilePic.marshaller());
        }
    }
}

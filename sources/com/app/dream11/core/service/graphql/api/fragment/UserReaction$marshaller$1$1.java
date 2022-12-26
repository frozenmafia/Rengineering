package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.UserReaction;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class UserReaction$marshaller$1$1 extends Lambda implements Transition<List<? extends UserReaction.Artwork>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final UserReaction$marshaller$1$1 INSTANCE = new UserReaction$marshaller$1$1();

    UserReaction$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends UserReaction.Artwork> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<UserReaction.Artwork>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<UserReaction.Artwork> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (UserReaction.Artwork artwork : list) {
            valueof.values(artwork == null ? null : artwork.marshaller());
        }
    }
}

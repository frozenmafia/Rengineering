package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GUser;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class GUser$marshaller$1$2 extends Lambda implements Transition<List<? extends GUser.ProfilePicUrl>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GUser$marshaller$1$2 INSTANCE = new GUser$marshaller$1$2();

    GUser$marshaller$1$2() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GUser.ProfilePicUrl> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GUser.ProfilePicUrl>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GUser.ProfilePicUrl> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GUser.ProfilePicUrl profilePicUrl : list) {
            valueof.values(profilePicUrl == null ? null : profilePicUrl.marshaller());
        }
    }
}

package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.NewSectionInfoFragment;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class NewSectionInfoFragment$marshaller$1$1 extends Lambda implements Transition<List<? extends NewSectionInfoFragment.UserTeam>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final NewSectionInfoFragment$marshaller$1$1 INSTANCE = new NewSectionInfoFragment$marshaller$1$1();

    NewSectionInfoFragment$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends NewSectionInfoFragment.UserTeam> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<NewSectionInfoFragment.UserTeam>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<NewSectionInfoFragment.UserTeam> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (NewSectionInfoFragment.UserTeam userTeam : list) {
            valueof.values(userTeam.marshaller());
        }
    }
}

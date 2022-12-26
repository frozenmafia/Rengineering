package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.SectionInfoFragment;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class SectionInfoFragment$marshaller$1$1 extends Lambda implements Transition<List<? extends SectionInfoFragment.Player>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final SectionInfoFragment$marshaller$1$1 INSTANCE = new SectionInfoFragment$marshaller$1$1();

    SectionInfoFragment$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends SectionInfoFragment.Player> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<SectionInfoFragment.Player>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<SectionInfoFragment.Player> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (SectionInfoFragment.Player player : list) {
            valueof.values(player.marshaller());
        }
    }
}

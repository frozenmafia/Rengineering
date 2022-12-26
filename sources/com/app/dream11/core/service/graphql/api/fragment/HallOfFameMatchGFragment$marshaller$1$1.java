package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.HallOfFameMatchGFragment;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class HallOfFameMatchGFragment$marshaller$1$1 extends Lambda implements Transition<List<? extends HallOfFameMatchGFragment.Squad>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final HallOfFameMatchGFragment$marshaller$1$1 INSTANCE = new HallOfFameMatchGFragment$marshaller$1$1();

    HallOfFameMatchGFragment$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends HallOfFameMatchGFragment.Squad> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<HallOfFameMatchGFragment.Squad>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<HallOfFameMatchGFragment.Squad> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (HallOfFameMatchGFragment.Squad squad : list) {
            valueof.values(squad.marshaller());
        }
    }
}

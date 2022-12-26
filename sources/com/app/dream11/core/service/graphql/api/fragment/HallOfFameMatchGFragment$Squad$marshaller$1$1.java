package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.HallOfFameMatchGFragment;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class HallOfFameMatchGFragment$Squad$marshaller$1$1 extends Lambda implements Transition<List<? extends HallOfFameMatchGFragment.Flag>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final HallOfFameMatchGFragment$Squad$marshaller$1$1 INSTANCE = new HallOfFameMatchGFragment$Squad$marshaller$1$1();

    HallOfFameMatchGFragment$Squad$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends HallOfFameMatchGFragment.Flag> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<HallOfFameMatchGFragment.Flag>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<HallOfFameMatchGFragment.Flag> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (HallOfFameMatchGFragment.Flag flag : list) {
            valueof.values(flag.marshaller());
        }
    }
}

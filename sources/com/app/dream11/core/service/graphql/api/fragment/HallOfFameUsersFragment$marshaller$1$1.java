package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.HallOfFameUsersFragment;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class HallOfFameUsersFragment$marshaller$1$1 extends Lambda implements Transition<List<? extends HallOfFameUsersFragment.OfficialTick>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final HallOfFameUsersFragment$marshaller$1$1 INSTANCE = new HallOfFameUsersFragment$marshaller$1$1();

    HallOfFameUsersFragment$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends HallOfFameUsersFragment.OfficialTick> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<HallOfFameUsersFragment.OfficialTick>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<HallOfFameUsersFragment.OfficialTick> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (HallOfFameUsersFragment.OfficialTick officialTick : list) {
            valueof.values(officialTick == null ? null : officialTick.marshaller());
        }
    }
}

package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.NetworkInfoFragment;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class NetworkInfoFragment$marshaller$1$1 extends Lambda implements Transition<List<? extends NetworkInfoFragment.NetworkMemberTeam>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final NetworkInfoFragment$marshaller$1$1 INSTANCE = new NetworkInfoFragment$marshaller$1$1();

    NetworkInfoFragment$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends NetworkInfoFragment.NetworkMemberTeam> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<NetworkInfoFragment.NetworkMemberTeam>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<NetworkInfoFragment.NetworkMemberTeam> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (NetworkInfoFragment.NetworkMemberTeam networkMemberTeam : list) {
            valueof.values(networkMemberTeam == null ? null : networkMemberTeam.marshaller());
        }
    }
}

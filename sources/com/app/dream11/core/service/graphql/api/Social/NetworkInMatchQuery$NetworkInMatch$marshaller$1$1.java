package com.app.dream11.core.service.graphql.api.Social;

import com.app.dream11.core.service.graphql.api.Social.NetworkInMatchQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class NetworkInMatchQuery$NetworkInMatch$marshaller$1$1 extends Lambda implements Transition<List<? extends NetworkInMatchQuery.Edge>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final NetworkInMatchQuery$NetworkInMatch$marshaller$1$1 INSTANCE = new NetworkInMatchQuery$NetworkInMatch$marshaller$1$1();

    NetworkInMatchQuery$NetworkInMatch$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends NetworkInMatchQuery.Edge> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<NetworkInMatchQuery.Edge>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<NetworkInMatchQuery.Edge> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (NetworkInMatchQuery.Edge edge : list) {
            valueof.values(edge.marshaller());
        }
    }
}

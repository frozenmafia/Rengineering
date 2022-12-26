package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GCricketPlayer;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class GCricketPlayer$marshaller$1$1 extends Lambda implements Transition<List<? extends GCricketPlayer.AttributesV2>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GCricketPlayer$marshaller$1$1 INSTANCE = new GCricketPlayer$marshaller$1$1();

    GCricketPlayer$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GCricketPlayer.AttributesV2> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GCricketPlayer.AttributesV2>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GCricketPlayer.AttributesV2> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GCricketPlayer.AttributesV2 attributesV2 : list) {
            valueof.values(attributesV2.marshaller());
        }
    }
}

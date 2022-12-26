package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.WatchFanCodeLiveQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class WatchFanCodeLiveQuery$WatchNowPayLater$marshaller$1$1 extends Lambda implements Transition<List<? extends WatchFanCodeLiveQuery.WnplDisplayImg>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final WatchFanCodeLiveQuery$WatchNowPayLater$marshaller$1$1 INSTANCE = new WatchFanCodeLiveQuery$WatchNowPayLater$marshaller$1$1();

    WatchFanCodeLiveQuery$WatchNowPayLater$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends WatchFanCodeLiveQuery.WnplDisplayImg> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<WatchFanCodeLiveQuery.WnplDisplayImg>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<WatchFanCodeLiveQuery.WnplDisplayImg> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (WatchFanCodeLiveQuery.WnplDisplayImg wnplDisplayImg : list) {
            valueof.values(wnplDisplayImg.marshaller());
        }
    }
}

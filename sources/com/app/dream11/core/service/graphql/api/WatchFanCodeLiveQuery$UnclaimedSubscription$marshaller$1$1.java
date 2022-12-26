package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.WatchFanCodeLiveQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class WatchFanCodeLiveQuery$UnclaimedSubscription$marshaller$1$1 extends Lambda implements Transition<List<? extends WatchFanCodeLiveQuery.ImageUrl>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final WatchFanCodeLiveQuery$UnclaimedSubscription$marshaller$1$1 INSTANCE = new WatchFanCodeLiveQuery$UnclaimedSubscription$marshaller$1$1();

    WatchFanCodeLiveQuery$UnclaimedSubscription$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends WatchFanCodeLiveQuery.ImageUrl> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<WatchFanCodeLiveQuery.ImageUrl>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<WatchFanCodeLiveQuery.ImageUrl> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (WatchFanCodeLiveQuery.ImageUrl imageUrl : list) {
            valueof.values(imageUrl.marshaller());
        }
    }
}

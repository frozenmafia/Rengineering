package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FetchUserNotificationsQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class FetchUserNotificationsQuery$FetchNotifications$marshaller$1$1 extends Lambda implements Transition<List<? extends FetchUserNotificationsQuery.Data1>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final FetchUserNotificationsQuery$FetchNotifications$marshaller$1$1 INSTANCE = new FetchUserNotificationsQuery$FetchNotifications$marshaller$1$1();

    FetchUserNotificationsQuery$FetchNotifications$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends FetchUserNotificationsQuery.Data1> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<FetchUserNotificationsQuery.Data1>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<FetchUserNotificationsQuery.Data1> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (FetchUserNotificationsQuery.Data1 data1 : list) {
            valueof.values(data1 == null ? null : data1.marshaller());
        }
    }
}

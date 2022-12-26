package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.NotificationsFilterTypesQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class NotificationsFilterTypesQuery$Data$marshaller$1$1 extends Lambda implements Transition<List<? extends NotificationsFilterTypesQuery.FetchNotificationFilter>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final NotificationsFilterTypesQuery$Data$marshaller$1$1 INSTANCE = new NotificationsFilterTypesQuery$Data$marshaller$1$1();

    NotificationsFilterTypesQuery$Data$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends NotificationsFilterTypesQuery.FetchNotificationFilter> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<NotificationsFilterTypesQuery.FetchNotificationFilter>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<NotificationsFilterTypesQuery.FetchNotificationFilter> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (NotificationsFilterTypesQuery.FetchNotificationFilter fetchNotificationFilter : list) {
            valueof.values(fetchNotificationFilter.marshaller());
        }
    }
}

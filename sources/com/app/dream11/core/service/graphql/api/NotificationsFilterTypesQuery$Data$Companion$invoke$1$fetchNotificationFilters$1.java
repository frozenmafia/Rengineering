package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.NotificationsFilterTypesQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class NotificationsFilterTypesQuery$Data$Companion$invoke$1$fetchNotificationFilters$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, NotificationsFilterTypesQuery.FetchNotificationFilter> {
    public static final NotificationsFilterTypesQuery$Data$Companion$invoke$1$fetchNotificationFilters$1 INSTANCE = new NotificationsFilterTypesQuery$Data$Companion$invoke$1$fetchNotificationFilters$1();

    NotificationsFilterTypesQuery$Data$Companion$invoke$1$fetchNotificationFilters$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.NotificationsFilterTypesQuery$Data$Companion$invoke$1$fetchNotificationFilters$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, NotificationsFilterTypesQuery.FetchNotificationFilter> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final NotificationsFilterTypesQuery.FetchNotificationFilter invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return NotificationsFilterTypesQuery.FetchNotificationFilter.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final NotificationsFilterTypesQuery.FetchNotificationFilter invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (NotificationsFilterTypesQuery.FetchNotificationFilter) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}

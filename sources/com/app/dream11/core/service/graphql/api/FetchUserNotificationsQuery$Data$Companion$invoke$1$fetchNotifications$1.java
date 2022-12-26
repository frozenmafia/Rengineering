package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FetchUserNotificationsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FetchUserNotificationsQuery$Data$Companion$invoke$1$fetchNotifications$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FetchUserNotificationsQuery.FetchNotifications> {
    public static final FetchUserNotificationsQuery$Data$Companion$invoke$1$fetchNotifications$1 INSTANCE = new FetchUserNotificationsQuery$Data$Companion$invoke$1$fetchNotifications$1();

    FetchUserNotificationsQuery$Data$Companion$invoke$1$fetchNotifications$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FetchUserNotificationsQuery.FetchNotifications invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FetchUserNotificationsQuery.FetchNotifications.Companion.invoke(removecancellable);
    }
}

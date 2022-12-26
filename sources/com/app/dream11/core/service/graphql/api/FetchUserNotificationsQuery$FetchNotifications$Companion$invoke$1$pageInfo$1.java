package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FetchUserNotificationsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FetchUserNotificationsQuery$FetchNotifications$Companion$invoke$1$pageInfo$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FetchUserNotificationsQuery.PageInfo> {
    public static final FetchUserNotificationsQuery$FetchNotifications$Companion$invoke$1$pageInfo$1 INSTANCE = new FetchUserNotificationsQuery$FetchNotifications$Companion$invoke$1$pageInfo$1();

    FetchUserNotificationsQuery$FetchNotifications$Companion$invoke$1$pageInfo$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FetchUserNotificationsQuery.PageInfo invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FetchUserNotificationsQuery.PageInfo.Companion.invoke(removecancellable);
    }
}

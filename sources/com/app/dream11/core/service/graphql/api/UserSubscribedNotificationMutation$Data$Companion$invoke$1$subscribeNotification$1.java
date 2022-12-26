package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.UserSubscribedNotificationMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class UserSubscribedNotificationMutation$Data$Companion$invoke$1$subscribeNotification$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, UserSubscribedNotificationMutation.SubscribeNotification> {
    public static final UserSubscribedNotificationMutation$Data$Companion$invoke$1$subscribeNotification$1 INSTANCE = new UserSubscribedNotificationMutation$Data$Companion$invoke$1$subscribeNotification$1();

    UserSubscribedNotificationMutation$Data$Companion$invoke$1$subscribeNotification$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final UserSubscribedNotificationMutation.SubscribeNotification invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return UserSubscribedNotificationMutation.SubscribeNotification.Companion.invoke(removecancellable);
    }
}

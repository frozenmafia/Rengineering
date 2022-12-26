package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.UserNotificationKeyQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class UserNotificationKeyQuery$Data$Companion$invoke$1$userNotificationKey$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, UserNotificationKeyQuery.UserNotificationKey> {
    public static final UserNotificationKeyQuery$Data$Companion$invoke$1$userNotificationKey$1 INSTANCE = new UserNotificationKeyQuery$Data$Companion$invoke$1$userNotificationKey$1();

    UserNotificationKeyQuery$Data$Companion$invoke$1$userNotificationKey$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final UserNotificationKeyQuery.UserNotificationKey invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return UserNotificationKeyQuery.UserNotificationKey.Companion.invoke(removecancellable);
    }
}

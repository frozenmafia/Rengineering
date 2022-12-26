package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GUserSubscribedNotification;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GUserSubscribedNotification$NotificationSubscription$Companion$invoke$1$notificationSubscriptionOptions$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GUserSubscribedNotification.NotificationSubscriptionOption> {
    public static final GUserSubscribedNotification$NotificationSubscription$Companion$invoke$1$notificationSubscriptionOptions$1 INSTANCE = new GUserSubscribedNotification$NotificationSubscription$Companion$invoke$1$notificationSubscriptionOptions$1();

    GUserSubscribedNotification$NotificationSubscription$Companion$invoke$1$notificationSubscriptionOptions$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.fragment.GUserSubscribedNotification$NotificationSubscription$Companion$invoke$1$notificationSubscriptionOptions$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GUserSubscribedNotification.NotificationSubscriptionOption> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GUserSubscribedNotification.NotificationSubscriptionOption invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GUserSubscribedNotification.NotificationSubscriptionOption.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GUserSubscribedNotification.NotificationSubscriptionOption invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GUserSubscribedNotification.NotificationSubscriptionOption) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}

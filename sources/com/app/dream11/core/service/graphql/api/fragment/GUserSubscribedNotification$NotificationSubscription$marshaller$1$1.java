package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GUserSubscribedNotification;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class GUserSubscribedNotification$NotificationSubscription$marshaller$1$1 extends Lambda implements Transition<List<? extends GUserSubscribedNotification.NotificationSubscriptionOption>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GUserSubscribedNotification$NotificationSubscription$marshaller$1$1 INSTANCE = new GUserSubscribedNotification$NotificationSubscription$marshaller$1$1();

    GUserSubscribedNotification$NotificationSubscription$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GUserSubscribedNotification.NotificationSubscriptionOption> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GUserSubscribedNotification.NotificationSubscriptionOption>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GUserSubscribedNotification.NotificationSubscriptionOption> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GUserSubscribedNotification.NotificationSubscriptionOption notificationSubscriptionOption : list) {
            valueof.values(notificationSubscriptionOption.marshaller());
        }
    }
}

package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FetchUserNotificationsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FetchUserNotificationsQuery$Data1$Companion$invoke$1$unReadImage$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, FetchUserNotificationsQuery.UnReadImage> {
    public static final FetchUserNotificationsQuery$Data1$Companion$invoke$1$unReadImage$1 INSTANCE = new FetchUserNotificationsQuery$Data1$Companion$invoke$1$unReadImage$1();

    FetchUserNotificationsQuery$Data1$Companion$invoke$1$unReadImage$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.FetchUserNotificationsQuery$Data1$Companion$invoke$1$unReadImage$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FetchUserNotificationsQuery.UnReadImage> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final FetchUserNotificationsQuery.UnReadImage invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return FetchUserNotificationsQuery.UnReadImage.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final FetchUserNotificationsQuery.UnReadImage invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (FetchUserNotificationsQuery.UnReadImage) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}

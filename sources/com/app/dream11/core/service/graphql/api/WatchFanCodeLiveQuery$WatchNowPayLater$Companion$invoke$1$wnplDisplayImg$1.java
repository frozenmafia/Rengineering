package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.WatchFanCodeLiveQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class WatchFanCodeLiveQuery$WatchNowPayLater$Companion$invoke$1$wnplDisplayImg$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, WatchFanCodeLiveQuery.WnplDisplayImg> {
    public static final WatchFanCodeLiveQuery$WatchNowPayLater$Companion$invoke$1$wnplDisplayImg$1 INSTANCE = new WatchFanCodeLiveQuery$WatchNowPayLater$Companion$invoke$1$wnplDisplayImg$1();

    WatchFanCodeLiveQuery$WatchNowPayLater$Companion$invoke$1$wnplDisplayImg$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.WatchFanCodeLiveQuery$WatchNowPayLater$Companion$invoke$1$wnplDisplayImg$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, WatchFanCodeLiveQuery.WnplDisplayImg> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final WatchFanCodeLiveQuery.WnplDisplayImg invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return WatchFanCodeLiveQuery.WnplDisplayImg.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final WatchFanCodeLiveQuery.WnplDisplayImg invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (WatchFanCodeLiveQuery.WnplDisplayImg) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}

package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FetchHallOfFameToursQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FetchHallOfFameToursQuery$HallOfFame$Companion$invoke$1$tours$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, FetchHallOfFameToursQuery.Tour> {
    public static final FetchHallOfFameToursQuery$HallOfFame$Companion$invoke$1$tours$1 INSTANCE = new FetchHallOfFameToursQuery$HallOfFame$Companion$invoke$1$tours$1();

    FetchHallOfFameToursQuery$HallOfFame$Companion$invoke$1$tours$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.FetchHallOfFameToursQuery$HallOfFame$Companion$invoke$1$tours$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FetchHallOfFameToursQuery.Tour> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final FetchHallOfFameToursQuery.Tour invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return FetchHallOfFameToursQuery.Tour.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final FetchHallOfFameToursQuery.Tour invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (FetchHallOfFameToursQuery.Tour) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}

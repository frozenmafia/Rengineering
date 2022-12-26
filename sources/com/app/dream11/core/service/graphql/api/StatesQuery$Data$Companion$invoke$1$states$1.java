package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.StatesQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class StatesQuery$Data$Companion$invoke$1$states$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, StatesQuery.State> {
    public static final StatesQuery$Data$Companion$invoke$1$states$1 INSTANCE = new StatesQuery$Data$Companion$invoke$1$states$1();

    StatesQuery$Data$Companion$invoke$1$states$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.StatesQuery$Data$Companion$invoke$1$states$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, StatesQuery.State> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final StatesQuery.State invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return StatesQuery.State.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final StatesQuery.State invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (StatesQuery.State) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}

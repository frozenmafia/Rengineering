package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.GetWeeksOfTourQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GetWeeksOfTourQuery$Tour$Companion$invoke$1$weeks$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GetWeeksOfTourQuery.Week> {
    public static final GetWeeksOfTourQuery$Tour$Companion$invoke$1$weeks$1 INSTANCE = new GetWeeksOfTourQuery$Tour$Companion$invoke$1$weeks$1();

    GetWeeksOfTourQuery$Tour$Companion$invoke$1$weeks$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.GetWeeksOfTourQuery$Tour$Companion$invoke$1$weeks$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetWeeksOfTourQuery.Week> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GetWeeksOfTourQuery.Week invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GetWeeksOfTourQuery.Week.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GetWeeksOfTourQuery.Week invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GetWeeksOfTourQuery.Week) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}

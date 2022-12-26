package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.DiscountDetailsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class DiscountDetailsQuery$Data$Companion$invoke$1$discountDetails$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, DiscountDetailsQuery.DiscountDetail> {
    public static final DiscountDetailsQuery$Data$Companion$invoke$1$discountDetails$1 INSTANCE = new DiscountDetailsQuery$Data$Companion$invoke$1$discountDetails$1();

    DiscountDetailsQuery$Data$Companion$invoke$1$discountDetails$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.DiscountDetailsQuery$Data$Companion$invoke$1$discountDetails$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, DiscountDetailsQuery.DiscountDetail> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final DiscountDetailsQuery.DiscountDetail invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return DiscountDetailsQuery.DiscountDetail.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final DiscountDetailsQuery.DiscountDetail invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (DiscountDetailsQuery.DiscountDetail) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}

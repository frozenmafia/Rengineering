package com.dreampay.graphql.api;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes6.dex */
final class PaymentSectionsQuery$Type$Companion$invoke$1$cvvLength$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, Integer> {
    public static final PaymentSectionsQuery$Type$Companion$invoke$1$cvvLength$1 INSTANCE = new PaymentSectionsQuery$Type$Companion$invoke$1$cvvLength$1();

    PaymentSectionsQuery$Type$Companion$invoke$1$cvvLength$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ Integer invoke(removeCancellable.values valuesVar) {
        return Integer.valueOf(invoke2(valuesVar));
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final int invoke2(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return valuesVar.values();
    }
}

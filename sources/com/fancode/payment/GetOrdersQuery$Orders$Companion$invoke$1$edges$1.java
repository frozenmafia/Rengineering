package com.fancode.payment;

import com.fancode.payment.GetOrdersQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes4.dex */
final class GetOrdersQuery$Orders$Companion$invoke$1$edges$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GetOrdersQuery.valueOf> {
    public static final GetOrdersQuery$Orders$Companion$invoke$1$edges$1 INSTANCE = new GetOrdersQuery$Orders$Companion$invoke$1$edges$1();

    GetOrdersQuery$Orders$Companion$invoke$1$edges$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fancode.payment.GetOrdersQuery$Orders$Companion$invoke$1$edges$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetOrdersQuery.valueOf> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GetOrdersQuery.valueOf invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GetOrdersQuery.valueOf.toString.values(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GetOrdersQuery.valueOf invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GetOrdersQuery.valueOf) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}

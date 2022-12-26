package com.dreampay.graphql.api;

import com.dreampay.graphql.api.PaymentSectionsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PaymentSectionsQuery$PaymentType$Companion$invoke$1$actions$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, PaymentSectionsQuery.Action> {
    public static final PaymentSectionsQuery$PaymentType$Companion$invoke$1$actions$1 INSTANCE = new PaymentSectionsQuery$PaymentType$Companion$invoke$1$actions$1();

    PaymentSectionsQuery$PaymentType$Companion$invoke$1$actions$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.dreampay.graphql.api.PaymentSectionsQuery$PaymentType$Companion$invoke$1$actions$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PaymentSectionsQuery.Action> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final PaymentSectionsQuery.Action invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return PaymentSectionsQuery.Action.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final PaymentSectionsQuery.Action invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (PaymentSectionsQuery.Action) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}

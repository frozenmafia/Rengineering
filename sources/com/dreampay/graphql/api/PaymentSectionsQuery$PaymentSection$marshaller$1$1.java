package com.dreampay.graphql.api;

import com.dreampay.graphql.api.PaymentSectionsQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class PaymentSectionsQuery$PaymentSection$marshaller$1$1 extends Lambda implements Transition<List<? extends PaymentSectionsQuery.PaymentType>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final PaymentSectionsQuery$PaymentSection$marshaller$1$1 INSTANCE = new PaymentSectionsQuery$PaymentSection$marshaller$1$1();

    PaymentSectionsQuery$PaymentSection$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends PaymentSectionsQuery.PaymentType> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<PaymentSectionsQuery.PaymentType>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<PaymentSectionsQuery.PaymentType> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (PaymentSectionsQuery.PaymentType paymentType : list) {
            valueof.values(paymentType.marshaller());
        }
    }
}

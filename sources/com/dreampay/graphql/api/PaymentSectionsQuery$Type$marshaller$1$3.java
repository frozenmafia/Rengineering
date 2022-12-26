package com.dreampay.graphql.api;

import com.dreampay.graphql.api.PaymentSectionsQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class PaymentSectionsQuery$Type$marshaller$1$3 extends Lambda implements Transition<List<? extends PaymentSectionsQuery.Artwork>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final PaymentSectionsQuery$Type$marshaller$1$3 INSTANCE = new PaymentSectionsQuery$Type$marshaller$1$3();

    PaymentSectionsQuery$Type$marshaller$1$3() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends PaymentSectionsQuery.Artwork> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<PaymentSectionsQuery.Artwork>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<PaymentSectionsQuery.Artwork> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (PaymentSectionsQuery.Artwork artwork : list) {
            valueof.values(artwork.marshaller());
        }
    }
}

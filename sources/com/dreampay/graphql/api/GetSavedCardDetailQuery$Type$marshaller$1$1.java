package com.dreampay.graphql.api;

import com.dreampay.graphql.api.GetSavedCardDetailQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes4.dex */
final class GetSavedCardDetailQuery$Type$marshaller$1$1 extends Lambda implements Transition<List<? extends GetSavedCardDetailQuery.Artwork>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GetSavedCardDetailQuery$Type$marshaller$1$1 INSTANCE = new GetSavedCardDetailQuery$Type$marshaller$1$1();

    GetSavedCardDetailQuery$Type$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GetSavedCardDetailQuery.Artwork> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GetSavedCardDetailQuery.Artwork>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GetSavedCardDetailQuery.Artwork> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GetSavedCardDetailQuery.Artwork artwork : list) {
            valueof.values(artwork.marshaller());
        }
    }
}

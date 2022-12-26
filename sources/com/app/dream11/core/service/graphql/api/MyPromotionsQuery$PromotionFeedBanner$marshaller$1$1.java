package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MyPromotionsQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class MyPromotionsQuery$PromotionFeedBanner$marshaller$1$1 extends Lambda implements Transition<List<? extends MyPromotionsQuery.Artwork>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final MyPromotionsQuery$PromotionFeedBanner$marshaller$1$1 INSTANCE = new MyPromotionsQuery$PromotionFeedBanner$marshaller$1$1();

    MyPromotionsQuery$PromotionFeedBanner$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends MyPromotionsQuery.Artwork> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<MyPromotionsQuery.Artwork>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<MyPromotionsQuery.Artwork> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (MyPromotionsQuery.Artwork artwork : list) {
            valueof.values(artwork.marshaller());
        }
    }
}

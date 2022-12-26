package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.BankData;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class BankData$Bank$marshaller$1$1 extends Lambda implements Transition<List<? extends BankData.Artwork>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final BankData$Bank$marshaller$1$1 INSTANCE = new BankData$Bank$marshaller$1$1();

    BankData$Bank$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends BankData.Artwork> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<BankData.Artwork>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<BankData.Artwork> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (BankData.Artwork artwork : list) {
            valueof.values(artwork.marshaller());
        }
    }
}

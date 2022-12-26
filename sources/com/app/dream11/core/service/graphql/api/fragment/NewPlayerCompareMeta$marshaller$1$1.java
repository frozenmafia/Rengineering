package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.NewPlayerCompareMeta;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class NewPlayerCompareMeta$marshaller$1$1 extends Lambda implements Transition<List<? extends NewPlayerCompareMeta.Artwork>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final NewPlayerCompareMeta$marshaller$1$1 INSTANCE = new NewPlayerCompareMeta$marshaller$1$1();

    NewPlayerCompareMeta$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends NewPlayerCompareMeta.Artwork> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<NewPlayerCompareMeta.Artwork>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<NewPlayerCompareMeta.Artwork> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (NewPlayerCompareMeta.Artwork artwork : list) {
            valueof.values(artwork.marshaller());
        }
    }
}

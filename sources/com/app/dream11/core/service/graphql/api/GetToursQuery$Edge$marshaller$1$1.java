package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.GetToursQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class GetToursQuery$Edge$marshaller$1$1 extends Lambda implements Transition<List<? extends GetToursQuery.Artwork>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GetToursQuery$Edge$marshaller$1$1 INSTANCE = new GetToursQuery$Edge$marshaller$1$1();

    GetToursQuery$Edge$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GetToursQuery.Artwork> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GetToursQuery.Artwork>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GetToursQuery.Artwork> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GetToursQuery.Artwork artwork : list) {
            valueof.values(artwork == null ? null : artwork.marshaller());
        }
    }
}

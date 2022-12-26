package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GPlayerRole;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class GPlayerRole$marshaller$1$1 extends Lambda implements Transition<List<? extends GPlayerRole.Artwork>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GPlayerRole$marshaller$1$1 INSTANCE = new GPlayerRole$marshaller$1$1();

    GPlayerRole$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GPlayerRole.Artwork> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GPlayerRole.Artwork>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GPlayerRole.Artwork> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GPlayerRole.Artwork artwork : list) {
            valueof.values(artwork == null ? null : artwork.marshaller());
        }
    }
}

package com.app.dream11.core.service.graphql.api.Social.recentsearch;

import com.app.dream11.core.service.graphql.api.Social.recentsearch.GetRecentSearchesQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class GetRecentSearchesQuery$Edge$marshaller$1$2 extends Lambda implements Transition<List<? extends GetRecentSearchesQuery.Artwork>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GetRecentSearchesQuery$Edge$marshaller$1$2 INSTANCE = new GetRecentSearchesQuery$Edge$marshaller$1$2();

    GetRecentSearchesQuery$Edge$marshaller$1$2() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GetRecentSearchesQuery.Artwork> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GetRecentSearchesQuery.Artwork>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GetRecentSearchesQuery.Artwork> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GetRecentSearchesQuery.Artwork artwork : list) {
            valueof.values(artwork == null ? null : artwork.marshaller());
        }
    }
}

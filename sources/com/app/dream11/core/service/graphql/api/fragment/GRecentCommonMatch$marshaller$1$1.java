package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GRecentCommonMatch;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class GRecentCommonMatch$marshaller$1$1 extends Lambda implements Transition<List<? extends GRecentCommonMatch.Squad>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GRecentCommonMatch$marshaller$1$1 INSTANCE = new GRecentCommonMatch$marshaller$1$1();

    GRecentCommonMatch$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GRecentCommonMatch.Squad> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GRecentCommonMatch.Squad>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GRecentCommonMatch.Squad> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GRecentCommonMatch.Squad squad : list) {
            valueof.values(squad.marshaller());
        }
    }
}

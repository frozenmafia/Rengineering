package com.app.dream11.core.service.graphql.api.postroundlock;

import com.app.dream11.core.service.graphql.api.postroundlock.HeadToHeadRematchQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class HeadToHeadRematchQuery$ChannelInfo$marshaller$1$1 extends Lambda implements Transition<List<? extends HeadToHeadRematchQuery.Member>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final HeadToHeadRematchQuery$ChannelInfo$marshaller$1$1 INSTANCE = new HeadToHeadRematchQuery$ChannelInfo$marshaller$1$1();

    HeadToHeadRematchQuery$ChannelInfo$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends HeadToHeadRematchQuery.Member> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<HeadToHeadRematchQuery.Member>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<HeadToHeadRematchQuery.Member> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (HeadToHeadRematchQuery.Member member : list) {
            valueof.values(member == null ? null : member.marshaller());
        }
    }
}

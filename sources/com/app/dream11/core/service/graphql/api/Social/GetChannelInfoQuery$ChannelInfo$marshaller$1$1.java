package com.app.dream11.core.service.graphql.api.Social;

import com.app.dream11.core.service.graphql.api.Social.GetChannelInfoQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class GetChannelInfoQuery$ChannelInfo$marshaller$1$1 extends Lambda implements Transition<List<? extends GetChannelInfoQuery.Member>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GetChannelInfoQuery$ChannelInfo$marshaller$1$1 INSTANCE = new GetChannelInfoQuery$ChannelInfo$marshaller$1$1();

    GetChannelInfoQuery$ChannelInfo$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GetChannelInfoQuery.Member> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GetChannelInfoQuery.Member>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GetChannelInfoQuery.Member> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GetChannelInfoQuery.Member member : list) {
            valueof.values(member == null ? null : member.marshaller());
        }
    }
}

package com.app.dream11.core.service.graphql.api.Social;

import com.app.dream11.core.service.graphql.api.Social.GetMappedChatOfContestQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class GetMappedChatOfContestQuery$Data$marshaller$1$1 extends Lambda implements Transition<List<? extends GetMappedChatOfContestQuery.ContestChannelInfo>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GetMappedChatOfContestQuery$Data$marshaller$1$1 INSTANCE = new GetMappedChatOfContestQuery$Data$marshaller$1$1();

    GetMappedChatOfContestQuery$Data$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GetMappedChatOfContestQuery.ContestChannelInfo> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GetMappedChatOfContestQuery.ContestChannelInfo>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GetMappedChatOfContestQuery.ContestChannelInfo> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GetMappedChatOfContestQuery.ContestChannelInfo contestChannelInfo : list) {
            valueof.values(contestChannelInfo == null ? null : contestChannelInfo.marshaller());
        }
    }
}

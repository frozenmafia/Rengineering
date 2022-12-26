package com.app.dream11.core.service.graphql.api.Social;

import com.app.dream11.core.service.graphql.api.Social.ChallengeCtaQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class ChallengeCtaQuery$ChannelInfo$marshaller$1$1 extends Lambda implements Transition<List<? extends ChallengeCtaQuery.Member>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final ChallengeCtaQuery$ChannelInfo$marshaller$1$1 INSTANCE = new ChallengeCtaQuery$ChannelInfo$marshaller$1$1();

    ChallengeCtaQuery$ChannelInfo$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends ChallengeCtaQuery.Member> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<ChallengeCtaQuery.Member>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<ChallengeCtaQuery.Member> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (ChallengeCtaQuery.Member member : list) {
            valueof.values(member == null ? null : member.marshaller());
        }
    }
}

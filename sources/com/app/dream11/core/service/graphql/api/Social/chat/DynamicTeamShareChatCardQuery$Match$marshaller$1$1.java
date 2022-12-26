package com.app.dream11.core.service.graphql.api.Social.chat;

import com.app.dream11.core.service.graphql.api.Social.chat.DynamicTeamShareChatCardQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class DynamicTeamShareChatCardQuery$Match$marshaller$1$1 extends Lambda implements Transition<List<? extends DynamicTeamShareChatCardQuery.Squad>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final DynamicTeamShareChatCardQuery$Match$marshaller$1$1 INSTANCE = new DynamicTeamShareChatCardQuery$Match$marshaller$1$1();

    DynamicTeamShareChatCardQuery$Match$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends DynamicTeamShareChatCardQuery.Squad> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<DynamicTeamShareChatCardQuery.Squad>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<DynamicTeamShareChatCardQuery.Squad> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (DynamicTeamShareChatCardQuery.Squad squad : list) {
            valueof.values(squad.marshaller());
        }
    }
}

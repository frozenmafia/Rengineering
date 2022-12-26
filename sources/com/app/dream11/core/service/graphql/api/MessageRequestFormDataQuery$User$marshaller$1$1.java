package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MessageRequestFormDataQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class MessageRequestFormDataQuery$User$marshaller$1$1 extends Lambda implements Transition<List<? extends MessageRequestFormDataQuery.ProfilePic>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final MessageRequestFormDataQuery$User$marshaller$1$1 INSTANCE = new MessageRequestFormDataQuery$User$marshaller$1$1();

    MessageRequestFormDataQuery$User$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends MessageRequestFormDataQuery.ProfilePic> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<MessageRequestFormDataQuery.ProfilePic>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<MessageRequestFormDataQuery.ProfilePic> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (MessageRequestFormDataQuery.ProfilePic profilePic : list) {
            valueof.values(profilePic == null ? null : profilePic.marshaller());
        }
    }
}

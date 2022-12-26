package com.app.dream11.chat.viewmodels;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ChatMessageVM$viewAttachedCallbackFun$1 extends Lambda implements Styleable.ChangeBounds<Boolean, setAnimationMatrix> {
    final /* synthetic */ ChatMessageVM this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessageVM$viewAttachedCallbackFun$1(ChatMessageVM chatMessageVM) {
        super(1);
        this.this$0 = chatMessageVM;
    }

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ setAnimationMatrix invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return setAnimationMatrix.ag$a;
    }

    public final void invoke(boolean z) {
        if (z) {
            DynamicChatContestCardVM chatDynamicContestCard = this.this$0.getChatDynamicContestCard();
            if (chatDynamicContestCard != null) {
                chatDynamicContestCard.onAttached();
            }
            DynamicChatContestCardVM chatDynamicContestCard2 = this.this$0.getChatDynamicContestCard();
            if (chatDynamicContestCard2 == null) {
                return;
            }
            chatDynamicContestCard2.fetchDynamicData();
            return;
        }
        DynamicChatContestCardVM chatDynamicContestCard3 = this.this$0.getChatDynamicContestCard();
        if (chatDynamicContestCard3 == null) {
            return;
        }
        chatDynamicContestCard3.onDetached();
    }
}

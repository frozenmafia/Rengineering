package com.app.dream11.chat.viewmodels;

import com.app.dream11.chat.models.ChatContestCard;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ChatMessageVM$onLeagueCardClicked$1 extends Lambda implements Styleable.ChangeBounds<ChatContestCard, setAnimationMatrix> {
    final /* synthetic */ ChatMessageVM this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessageVM$onLeagueCardClicked$1(ChatMessageVM chatMessageVM) {
        super(1);
        this.this$0 = chatMessageVM;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(ChatContestCard chatContestCard) {
        invoke2(chatContestCard);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ChatContestCard chatContestCard) {
        runAnimators.ag$a(chatContestCard, "contestCard");
        IMessageHandler messageHandler = this.this$0.getMessageHandler();
        if (messageHandler == null) {
            return;
        }
        messageHandler.onContestCardClicked(chatContestCard);
    }
}

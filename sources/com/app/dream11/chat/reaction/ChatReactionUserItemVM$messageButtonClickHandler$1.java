package com.app.dream11.chat.reaction;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ChatReactionUserItemVM$messageButtonClickHandler$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ IChatReactionUserItemHandler $handler;
    final /* synthetic */ ChatReactionUserItemVM this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatReactionUserItemVM$messageButtonClickHandler$1(IChatReactionUserItemHandler iChatReactionUserItemHandler, ChatReactionUserItemVM chatReactionUserItemVM) {
        super(0);
        this.$handler = iChatReactionUserItemHandler;
        this.this$0 = chatReactionUserItemVM;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IChatReactionUserItemHandler iChatReactionUserItemHandler = this.$handler;
        if (iChatReactionUserItemHandler == null) {
            return;
        }
        iChatReactionUserItemHandler.onMessageCTAClicked(this.this$0);
    }
}

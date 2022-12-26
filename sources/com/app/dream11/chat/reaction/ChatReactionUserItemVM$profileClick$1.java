package com.app.dream11.chat.reaction;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ChatReactionUserItemVM$profileClick$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ IChatReactionUserItemHandler $handler;
    final /* synthetic */ ChatReactionUserItemVM this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatReactionUserItemVM$profileClick$1(ChatReactionUserItemVM chatReactionUserItemVM, IChatReactionUserItemHandler iChatReactionUserItemHandler) {
        super(0);
        this.this$0 = chatReactionUserItemVM;
        this.$handler = iChatReactionUserItemHandler;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IChatReactionUserItemHandler iChatReactionUserItemHandler;
        if (this.this$0.isSelfUser() || (iChatReactionUserItemHandler = this.$handler) == null) {
            return;
        }
        iChatReactionUserItemHandler.onProfileClicked(this.this$0.getUserId());
    }
}

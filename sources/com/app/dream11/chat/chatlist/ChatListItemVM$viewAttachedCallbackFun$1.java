package com.app.dream11.chat.chatlist;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ChatListItemVM$viewAttachedCallbackFun$1 extends Lambda implements Styleable.ChangeBounds<Boolean, setAnimationMatrix> {
    final /* synthetic */ ChatListItemVM this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatListItemVM$viewAttachedCallbackFun$1(ChatListItemVM chatListItemVM) {
        super(1);
        this.this$0 = chatListItemVM;
    }

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ setAnimationMatrix invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return setAnimationMatrix.ag$a;
    }

    public final void invoke(boolean z) {
        if (z) {
            this.this$0.onAttached();
            ChatListItemVM.fetchDynamicData$default(this.this$0, 0L, 1, null);
            return;
        }
        ChatListItemVM chatListItemVM = this.this$0;
        chatListItemVM.onDetached(chatListItemVM.getGroup().isGroupChannel());
    }
}

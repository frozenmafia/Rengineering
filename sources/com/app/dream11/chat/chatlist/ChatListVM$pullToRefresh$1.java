package com.app.dream11.chat.chatlist;

import com.app.dream11.chat.chatlist.ChatListVM;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ChatListVM$pullToRefresh$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ ChatListVM this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatListVM$pullToRefresh$1(ChatListVM chatListVM) {
        super(0);
        this.this$0 = chatListVM;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ChatListVM.ChatListHandler handler = this.this$0.getHandler();
        if (handler == null) {
            return;
        }
        handler.onPullToRefresh();
    }
}

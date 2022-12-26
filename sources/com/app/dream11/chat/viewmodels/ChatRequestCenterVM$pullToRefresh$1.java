package com.app.dream11.chat.viewmodels;

import com.app.dream11.chat.viewmodels.ChatRequestCenterVM;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ChatRequestCenterVM$pullToRefresh$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ ChatRequestCenterVM.RequestCenterHandler $handler;
    final /* synthetic */ ChatRequestCenterVM this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRequestCenterVM$pullToRefresh$1(ChatRequestCenterVM chatRequestCenterVM, ChatRequestCenterVM.RequestCenterHandler requestCenterHandler) {
        super(0);
        this.this$0 = chatRequestCenterVM;
        this.$handler = requestCenterHandler;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ChatRequestCenterVM.RequestCenterHandler requestCenterHandler;
        if (!(!this.this$0.getRequestList().isEmpty()) || (requestCenterHandler = this.$handler) == null) {
            return;
        }
        requestCenterHandler.onPullToRefresh();
    }
}

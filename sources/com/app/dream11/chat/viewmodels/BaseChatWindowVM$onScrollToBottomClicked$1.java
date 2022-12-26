package com.app.dream11.chat.viewmodels;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BaseChatWindowVM$onScrollToBottomClicked$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ BaseChatWindowVM this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseChatWindowVM$onScrollToBottomClicked$1(BaseChatWindowVM baseChatWindowVM) {
        super(0);
        this.this$0 = baseChatWindowVM;
    }

    @Override // o.Styleable.ArcMotion
    public final setAnimationMatrix invoke() {
        IChatWindowHandler chatWindowHandler = this.this$0.getChatWindowHandler();
        if (chatWindowHandler == null) {
            return null;
        }
        chatWindowHandler.onScrollBottomButtonClick();
        return setAnimationMatrix.ag$a;
    }
}

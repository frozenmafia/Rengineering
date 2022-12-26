package com.app.dream11.chat.viewmodels;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ChatWindowInputBarVM$onCreateContestClicked$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ ChatWindowInputBarVM this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatWindowInputBarVM$onCreateContestClicked$1(ChatWindowInputBarVM chatWindowInputBarVM) {
        super(0);
        this.this$0 = chatWindowInputBarVM;
    }

    @Override // o.Styleable.ArcMotion
    public final setAnimationMatrix invoke() {
        IChatInputBarHandler chatInputBarHandler = this.this$0.getChatInputBarHandler();
        if (chatInputBarHandler == null) {
            return null;
        }
        chatInputBarHandler.onCreateContestClick();
        return setAnimationMatrix.ag$a;
    }
}

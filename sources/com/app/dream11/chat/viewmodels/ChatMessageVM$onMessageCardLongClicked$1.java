package com.app.dream11.chat.viewmodels;

import android.view.MotionEvent;
import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ChatMessageVM$onMessageCardLongClicked$1 extends Lambda implements Styleable.ChangeBounds<MotionEvent, setAnimationMatrix> {
    final /* synthetic */ ChatMessageVM this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessageVM$onMessageCardLongClicked$1(ChatMessageVM chatMessageVM) {
        super(1);
        this.this$0 = chatMessageVM;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(MotionEvent motionEvent) {
        invoke2(motionEvent);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MotionEvent motionEvent) {
        runAnimators.ag$a(motionEvent, NotificationCompat.CATEGORY_EVENT);
        IMessageHandler messageHandler = this.this$0.getMessageHandler();
        if (messageHandler == null) {
            return;
        }
        messageHandler.onMessageLongClicked(this.this$0, motionEvent);
    }
}

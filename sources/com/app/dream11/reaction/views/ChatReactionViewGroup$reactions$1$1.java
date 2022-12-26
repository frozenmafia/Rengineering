package com.app.dream11.reaction.views;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setAlarmClock;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ChatReactionViewGroup$reactions$1$1 extends Lambda implements Styleable.ChangeBounds<setAlarmClock, setAnimationMatrix> {
    final /* synthetic */ ChatReactionViewGroup this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatReactionViewGroup$reactions$1$1(ChatReactionViewGroup chatReactionViewGroup) {
        super(1);
        this.this$0 = chatReactionViewGroup;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(setAlarmClock setalarmclock) {
        runAnimators.ag$a(setalarmclock, "reaction");
        Styleable.ChangeBounds<setAlarmClock, Boolean> onXdkEvent = this.this$0.onXdkEvent();
        if (onXdkEvent == null) {
            return;
        }
        onXdkEvent.invoke(setalarmclock);
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(setAlarmClock setalarmclock) {
        invoke2(setalarmclock);
        return setAnimationMatrix.ag$a;
    }
}

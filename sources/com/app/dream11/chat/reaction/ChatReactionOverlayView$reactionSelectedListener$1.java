package com.app.dream11.chat.reaction;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAlarmClock;
/* loaded from: classes6.dex */
final class ChatReactionOverlayView$reactionSelectedListener$1 extends Lambda implements Styleable.ChangeBounds<setAlarmClock, Boolean> {
    final /* synthetic */ ChatReactionOverlayView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatReactionOverlayView$reactionSelectedListener$1(ChatReactionOverlayView chatReactionOverlayView) {
        super(1);
        this.this$0 = chatReactionOverlayView;
    }

    @Override // o.Styleable.ChangeBounds
    public final Boolean invoke(setAlarmClock setalarmclock) {
        IChatReactionOverlayListener overlayListener;
        if (setalarmclock != null && (overlayListener = this.this$0.getOverlayListener()) != null) {
            overlayListener.userReacted(setalarmclock);
        }
        this.this$0.hideReaction(true, setalarmclock == null);
        return true;
    }
}

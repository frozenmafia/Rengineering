package com.app.dream11.chat.models;

import android.view.MotionEvent;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ReactionViewPositionData {
    private final ChatReactionAlignment alignment;
    private final MotionEvent motionEvent;

    public static /* synthetic */ ReactionViewPositionData copy$default(ReactionViewPositionData reactionViewPositionData, MotionEvent motionEvent, ChatReactionAlignment chatReactionAlignment, int i, Object obj) {
        if ((i & 1) != 0) {
            motionEvent = reactionViewPositionData.motionEvent;
        }
        if ((i & 2) != 0) {
            chatReactionAlignment = reactionViewPositionData.alignment;
        }
        return reactionViewPositionData.copy(motionEvent, chatReactionAlignment);
    }

    public final MotionEvent component1() {
        return this.motionEvent;
    }

    public final ChatReactionAlignment component2() {
        return this.alignment;
    }

    public final ReactionViewPositionData copy(MotionEvent motionEvent, ChatReactionAlignment chatReactionAlignment) {
        runAnimators.ag$a(chatReactionAlignment, "alignment");
        return new ReactionViewPositionData(motionEvent, chatReactionAlignment);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReactionViewPositionData) {
            ReactionViewPositionData reactionViewPositionData = (ReactionViewPositionData) obj;
            return runAnimators.values(this.motionEvent, reactionViewPositionData.motionEvent) && this.alignment == reactionViewPositionData.alignment;
        }
        return false;
    }

    public int hashCode() {
        MotionEvent motionEvent = this.motionEvent;
        return ((motionEvent == null ? 0 : motionEvent.hashCode()) * 31) + this.alignment.hashCode();
    }

    public String toString() {
        MotionEvent motionEvent = this.motionEvent;
        ChatReactionAlignment chatReactionAlignment = this.alignment;
        return "ReactionViewPositionData(motionEvent=" + motionEvent + ", alignment=" + chatReactionAlignment + ")";
    }

    public ReactionViewPositionData(MotionEvent motionEvent, ChatReactionAlignment chatReactionAlignment) {
        runAnimators.ag$a(chatReactionAlignment, "alignment");
        this.motionEvent = motionEvent;
        this.alignment = chatReactionAlignment;
    }

    public final MotionEvent getMotionEvent() {
        return this.motionEvent;
    }

    public final ChatReactionAlignment getAlignment() {
        return this.alignment;
    }
}

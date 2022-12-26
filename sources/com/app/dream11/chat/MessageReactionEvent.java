package com.app.dream11.chat;

import com.sendbird.android.ReactionEvent;
import o.runAnimators;
/* loaded from: classes.dex */
public final class MessageReactionEvent {
    private final String channelUrl;
    private final ReactionEvent reactionEvent;

    public static /* synthetic */ MessageReactionEvent copy$default(MessageReactionEvent messageReactionEvent, String str, ReactionEvent reactionEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageReactionEvent.channelUrl;
        }
        if ((i & 2) != 0) {
            reactionEvent = messageReactionEvent.reactionEvent;
        }
        return messageReactionEvent.copy(str, reactionEvent);
    }

    public final String component1() {
        return this.channelUrl;
    }

    public final ReactionEvent component2() {
        return this.reactionEvent;
    }

    public final MessageReactionEvent copy(String str, ReactionEvent reactionEvent) {
        runAnimators.ag$a(str, "channelUrl");
        runAnimators.ag$a(reactionEvent, "reactionEvent");
        return new MessageReactionEvent(str, reactionEvent);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MessageReactionEvent) {
            MessageReactionEvent messageReactionEvent = (MessageReactionEvent) obj;
            return runAnimators.values((Object) this.channelUrl, (Object) messageReactionEvent.channelUrl) && runAnimators.values(this.reactionEvent, messageReactionEvent.reactionEvent);
        }
        return false;
    }

    public int hashCode() {
        return (this.channelUrl.hashCode() * 31) + this.reactionEvent.hashCode();
    }

    public String toString() {
        String str = this.channelUrl;
        ReactionEvent reactionEvent = this.reactionEvent;
        return "MessageReactionEvent(channelUrl=" + str + ", reactionEvent=" + reactionEvent + ")";
    }

    public MessageReactionEvent(String str, ReactionEvent reactionEvent) {
        runAnimators.ag$a(str, "channelUrl");
        runAnimators.ag$a(reactionEvent, "reactionEvent");
        this.channelUrl = str;
        this.reactionEvent = reactionEvent;
    }

    public final String getChannelUrl() {
        return this.channelUrl;
    }

    public final ReactionEvent getReactionEvent() {
        return this.reactionEvent;
    }
}

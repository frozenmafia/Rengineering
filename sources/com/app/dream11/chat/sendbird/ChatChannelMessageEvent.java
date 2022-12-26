package com.app.dream11.chat.sendbird;

import androidx.core.app.NotificationCompat;
import com.app.dream11.chat.interfaces.IMessage;
import com.app.dream11.model.ErrorModel;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ChatChannelMessageEvent {
    private final ErrorModel error;
    private final MessageEvent event;
    private final IMessage message;

    public static /* synthetic */ ChatChannelMessageEvent copy$default(ChatChannelMessageEvent chatChannelMessageEvent, IMessage iMessage, MessageEvent messageEvent, ErrorModel errorModel, int i, Object obj) {
        if ((i & 1) != 0) {
            iMessage = chatChannelMessageEvent.message;
        }
        if ((i & 2) != 0) {
            messageEvent = chatChannelMessageEvent.event;
        }
        if ((i & 4) != 0) {
            errorModel = chatChannelMessageEvent.error;
        }
        return chatChannelMessageEvent.copy(iMessage, messageEvent, errorModel);
    }

    public final IMessage component1() {
        return this.message;
    }

    public final MessageEvent component2() {
        return this.event;
    }

    public final ErrorModel component3() {
        return this.error;
    }

    public final ChatChannelMessageEvent copy(IMessage iMessage, MessageEvent messageEvent, ErrorModel errorModel) {
        runAnimators.ag$a(messageEvent, NotificationCompat.CATEGORY_EVENT);
        return new ChatChannelMessageEvent(iMessage, messageEvent, errorModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatChannelMessageEvent) {
            ChatChannelMessageEvent chatChannelMessageEvent = (ChatChannelMessageEvent) obj;
            return runAnimators.values(this.message, chatChannelMessageEvent.message) && this.event == chatChannelMessageEvent.event && runAnimators.values(this.error, chatChannelMessageEvent.error);
        }
        return false;
    }

    public int hashCode() {
        IMessage iMessage = this.message;
        int hashCode = iMessage == null ? 0 : iMessage.hashCode();
        int hashCode2 = this.event.hashCode();
        ErrorModel errorModel = this.error;
        return (((hashCode * 31) + hashCode2) * 31) + (errorModel != null ? errorModel.hashCode() : 0);
    }

    public String toString() {
        IMessage iMessage = this.message;
        MessageEvent messageEvent = this.event;
        ErrorModel errorModel = this.error;
        return "ChatChannelMessageEvent(message=" + iMessage + ", event=" + messageEvent + ", error=" + errorModel + ")";
    }

    public ChatChannelMessageEvent(IMessage iMessage, MessageEvent messageEvent, ErrorModel errorModel) {
        runAnimators.ag$a(messageEvent, NotificationCompat.CATEGORY_EVENT);
        this.message = iMessage;
        this.event = messageEvent;
        this.error = errorModel;
    }

    public /* synthetic */ ChatChannelMessageEvent(IMessage iMessage, MessageEvent messageEvent, ErrorModel errorModel, int i, getTargetTypes gettargettypes) {
        this(iMessage, messageEvent, (i & 4) != 0 ? null : errorModel);
    }

    public final ErrorModel getError() {
        return this.error;
    }

    public final MessageEvent getEvent() {
        return this.event;
    }

    public final IMessage getMessage() {
        return this.message;
    }
}

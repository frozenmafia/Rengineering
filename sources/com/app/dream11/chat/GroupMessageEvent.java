package com.app.dream11.chat;

import com.app.dream11.chat.interfaces.IMessage;
import o.runAnimators;
/* loaded from: classes.dex */
public final class GroupMessageEvent {
    private final String channelUrl;
    private final IMessage newMessage;

    public static /* synthetic */ GroupMessageEvent copy$default(GroupMessageEvent groupMessageEvent, IMessage iMessage, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            iMessage = groupMessageEvent.newMessage;
        }
        if ((i & 2) != 0) {
            str = groupMessageEvent.channelUrl;
        }
        return groupMessageEvent.copy(iMessage, str);
    }

    public final IMessage component1() {
        return this.newMessage;
    }

    public final String component2() {
        return this.channelUrl;
    }

    public final GroupMessageEvent copy(IMessage iMessage, String str) {
        runAnimators.ag$a(iMessage, "newMessage");
        runAnimators.ag$a(str, "channelUrl");
        return new GroupMessageEvent(iMessage, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GroupMessageEvent) {
            GroupMessageEvent groupMessageEvent = (GroupMessageEvent) obj;
            return runAnimators.values(this.newMessage, groupMessageEvent.newMessage) && runAnimators.values((Object) this.channelUrl, (Object) groupMessageEvent.channelUrl);
        }
        return false;
    }

    public int hashCode() {
        return (this.newMessage.hashCode() * 31) + this.channelUrl.hashCode();
    }

    public String toString() {
        IMessage iMessage = this.newMessage;
        String str = this.channelUrl;
        return "GroupMessageEvent(newMessage=" + iMessage + ", channelUrl=" + str + ")";
    }

    public GroupMessageEvent(IMessage iMessage, String str) {
        runAnimators.ag$a(iMessage, "newMessage");
        runAnimators.ag$a(str, "channelUrl");
        this.newMessage = iMessage;
        this.channelUrl = str;
    }

    public final String getChannelUrl() {
        return this.channelUrl;
    }

    public final IMessage getNewMessage() {
        return this.newMessage;
    }
}

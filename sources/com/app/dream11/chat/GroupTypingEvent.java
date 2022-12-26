package com.app.dream11.chat;

import com.app.dream11.chat.interfaces.IChatUser;
import java.util.List;
import o.runAnimators;
/* loaded from: classes.dex */
public final class GroupTypingEvent {
    private final String channelUrl;
    private final List<IChatUser> listOfTypingMembers;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupTypingEvent copy$default(GroupTypingEvent groupTypingEvent, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = groupTypingEvent.listOfTypingMembers;
        }
        if ((i & 2) != 0) {
            str = groupTypingEvent.channelUrl;
        }
        return groupTypingEvent.copy(list, str);
    }

    public final List<IChatUser> component1() {
        return this.listOfTypingMembers;
    }

    public final String component2() {
        return this.channelUrl;
    }

    public final GroupTypingEvent copy(List<? extends IChatUser> list, String str) {
        runAnimators.ag$a(list, "listOfTypingMembers");
        runAnimators.ag$a(str, "channelUrl");
        return new GroupTypingEvent(list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GroupTypingEvent) {
            GroupTypingEvent groupTypingEvent = (GroupTypingEvent) obj;
            return runAnimators.values(this.listOfTypingMembers, groupTypingEvent.listOfTypingMembers) && runAnimators.values((Object) this.channelUrl, (Object) groupTypingEvent.channelUrl);
        }
        return false;
    }

    public int hashCode() {
        return (this.listOfTypingMembers.hashCode() * 31) + this.channelUrl.hashCode();
    }

    public String toString() {
        List<IChatUser> list = this.listOfTypingMembers;
        String str = this.channelUrl;
        return "GroupTypingEvent(listOfTypingMembers=" + list + ", channelUrl=" + str + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GroupTypingEvent(List<? extends IChatUser> list, String str) {
        runAnimators.ag$a(list, "listOfTypingMembers");
        runAnimators.ag$a(str, "channelUrl");
        this.listOfTypingMembers = list;
        this.channelUrl = str;
    }

    public final String getChannelUrl() {
        return this.channelUrl;
    }

    public final List<IChatUser> getListOfTypingMembers() {
        return this.listOfTypingMembers;
    }
}

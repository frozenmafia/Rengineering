package com.app.dream11.chat.groups;

import androidx.core.app.NotificationCompat;
import com.app.dream11.chat.interfaces.IChatChannel;
import java.util.List;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ChannelData {
    private final List<IChatChannel> chatChannelList;
    private final ChannelEvent event;

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelData(List<? extends IChatChannel> list, ChannelEvent channelEvent) {
        runAnimators.ag$a(list, "chatChannelList");
        runAnimators.ag$a(channelEvent, NotificationCompat.CATEGORY_EVENT);
        this.chatChannelList = list;
        this.event = channelEvent;
    }

    public final List<IChatChannel> getChatChannelList() {
        return this.chatChannelList;
    }

    public final ChannelEvent getEvent() {
        return this.event;
    }
}

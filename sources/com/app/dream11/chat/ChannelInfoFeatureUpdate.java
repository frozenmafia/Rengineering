package com.app.dream11.chat;

import com.app.dream11.core.event.EventType;
import com.app.dream11.core.service.graphql.api.type.ChannelCustomType;
import com.app.dream11.model.FeatureUpdate;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ChannelInfoFeatureUpdate extends FeatureUpdate {
    private final ChannelCustomType channelCustomType;
    private final String channelUrl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelInfoFeatureUpdate(String str, ChannelCustomType channelCustomType, EventType eventType) {
        super(EventType.CHAT_CHANNEL_CREATED);
        runAnimators.ag$a(str, "channelUrl");
        runAnimators.ag$a(channelCustomType, "channelCustomType");
        runAnimators.ag$a(eventType, "eventType");
        this.channelUrl = str;
        this.channelCustomType = channelCustomType;
    }

    public final ChannelCustomType getChannelCustomType() {
        return this.channelCustomType;
    }

    public final String getChannelUrl() {
        return this.channelUrl;
    }
}

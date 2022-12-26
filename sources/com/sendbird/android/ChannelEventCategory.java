package com.sendbird.android;

import com.google.android.gms.safetynet.SafetyNetStatusCodes;
/* loaded from: classes5.dex */
enum ChannelEventCategory {
    CATEGORY_NONE(0, false),
    CHANNEL_ENTER(10102, false),
    CHANNEL_EXIT(10103, false),
    USER_CHANNEL_MUTE(10201, false),
    USER_CHANNEL_UNMUTE(10200, false),
    USER_CHANNEL_BAN(10601, false),
    USER_CHANNEL_UNBAN(10600, false),
    CHANNEL_FREEZE(10701, false),
    CHANNEL_UNFREEZE(10700, false),
    PROFANITY_MESSAGE_BLOCK(10800, false),
    TYPING_START(10900, false),
    TYPING_END(10901, false),
    CHANNEL_JOIN(10000, false),
    CHANNEL_LEAVE(10001, false),
    CHANNEL_OPERATOR_CHANGED(10002, false),
    CHANNEL_INVITE(10020, false),
    CHANNEL_DECLINE_INVITE(10022, false),
    CHANNEL_PROP_CHANGED(11000, true),
    CHANNEL_DELETED(SafetyNetStatusCodes.SAFE_BROWSING_UNSUPPORTED_THREAT_TYPES, false),
    CHANNEL_META_DATA_CHANGED(11100, false),
    CHANNEL_META_COUNTERS_CHANGED(11200, false),
    CHANNEL_HIDDEN(13000, false),
    CHANNEL_UNHIDDEN(13001, false);
    
    private final int category;
    private final boolean withoutCache;

    ChannelEventCategory(int i, boolean z) {
        this.category = i;
        this.withoutCache = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean useWithoutCache() {
        return this.withoutCache;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ChannelEventCategory from(int i) {
        ChannelEventCategory[] values;
        for (ChannelEventCategory channelEventCategory : values()) {
            if (channelEventCategory.category == i) {
                return channelEventCategory;
            }
        }
        return CATEGORY_NONE;
    }

    public int getCategory() {
        return this.category;
    }
}

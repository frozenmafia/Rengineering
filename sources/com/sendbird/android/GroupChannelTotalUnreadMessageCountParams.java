package com.sendbird.android;

import java.util.List;
/* loaded from: classes.dex */
public class GroupChannelTotalUnreadMessageCountParams {
    List<String> mChannelCustomTypes;
    SuperChannelFilter mSuperChannelFilter = SuperChannelFilter.ALL;

    /* loaded from: classes.dex */
    public enum SuperChannelFilter {
        ALL,
        SUPER_CHANNEL_ONLY,
        NONSUPER_CHANNEL_ONLY
    }

    public GroupChannelTotalUnreadMessageCountParams setSuperChannelFilter(SuperChannelFilter superChannelFilter) {
        this.mSuperChannelFilter = superChannelFilter;
        return this;
    }

    public GroupChannelTotalUnreadMessageCountParams setChannelCustomTypesFilter(List<String> list) {
        this.mChannelCustomTypes = list;
        return this;
    }

    public String toString() {
        return "GroupChannelTotalUnreadMessageCountParams{mSuperChannelFilter=" + this.mSuperChannelFilter + ", mChannelCustomTypes=" + this.mChannelCustomTypes + '}';
    }
}

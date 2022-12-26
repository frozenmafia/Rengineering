package com.app.dream11.chat.interfaces;

import com.app.dream11.chat.groups.ChannelData;
import o.SupportSQLiteQuery;
/* loaded from: classes.dex */
public interface IChatGroupList {
    SupportSQLiteQuery<ChannelData> fetchGroupList();

    boolean hasMoreGroups();
}

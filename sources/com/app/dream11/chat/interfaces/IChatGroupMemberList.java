package com.app.dream11.chat.interfaces;

import java.util.List;
import o.SupportSQLiteQuery;
/* loaded from: classes6.dex */
public interface IChatGroupMemberList {
    SupportSQLiteQuery<List<IGroupUser>> fetchMemberList();

    boolean hasMoreMember();
}

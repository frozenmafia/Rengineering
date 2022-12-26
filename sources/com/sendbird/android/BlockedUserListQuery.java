package com.sendbird.android;

import com.sendbird.android.UserListQuery;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class BlockedUserListQuery extends UserListQuery {
    /* JADX INFO: Access modifiers changed from: package-private */
    public BlockedUserListQuery() {
        super(UserListQuery.QueryType.BLOCKED_USER);
    }

    public void setUserIdsFilter(List<String> list) {
        if (list == null) {
            return;
        }
        this.mUserIds = new ArrayList<>(list);
    }
}

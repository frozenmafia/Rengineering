package com.sendbird.android;

import com.sendbird.android.UserListQuery;
/* loaded from: classes7.dex */
public final class BannedUserListQuery extends UserListQuery {
    /* JADX INFO: Access modifiers changed from: package-private */
    public BannedUserListQuery(BaseChannel baseChannel) {
        super(UserListQuery.QueryType.BANNED_USER, baseChannel);
    }
}

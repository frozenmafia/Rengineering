package com.sendbird.android;

import com.sendbird.android.UserListQuery;
/* loaded from: classes7.dex */
public final class MutedUserListQuery extends UserListQuery {
    /* JADX INFO: Access modifiers changed from: package-private */
    public MutedUserListQuery(BaseChannel baseChannel) {
        super(UserListQuery.QueryType.MUTED_USER, baseChannel);
    }
}

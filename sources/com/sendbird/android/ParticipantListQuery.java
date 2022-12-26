package com.sendbird.android;

import com.sendbird.android.UserListQuery;
/* loaded from: classes7.dex */
public final class ParticipantListQuery extends UserListQuery {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ParticipantListQuery(BaseChannel baseChannel) {
        super(UserListQuery.QueryType.PARTICIPANT, baseChannel);
    }
}

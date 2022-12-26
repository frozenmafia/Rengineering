package com.sendbird.android;

import com.sendbird.android.UserListQuery;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes.dex */
public final class ApplicationUserListQuery extends UserListQuery {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ApplicationUserListQuery() {
        super(UserListQuery.QueryType.FILTERED_USER);
    }

    public void setUserIdsFilter(List<String> list) {
        if (list == null) {
            return;
        }
        this.mUserIds = new ArrayList<>(list);
    }

    @Override // com.sendbird.android.UserListQuery
    public void setMetaDataFilter(String str, List<String> list) {
        if (str == null || list == null) {
            return;
        }
        this.mMetaDataFilter = new HashMap();
        this.mMetaDataFilter.put(str, list);
    }
}

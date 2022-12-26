package com.app.dream11.social.model;

import com.app.dream11.core.service.graphql.api.fragment.UserFollowFollowerListFragment;
import java.io.Serializable;
import java.util.List;
/* loaded from: classes3.dex */
public class FollowersListResponse implements Serializable {
    private boolean isPaginationEnable;
    int pageNo;
    private String teamName;
    double totalCount;
    List<UserFollowFollowerListFragment.Edge> userFollowFollowerData;

    public int getPageNo() {
        return this.pageNo;
    }

    public double getTotalCount() {
        return this.totalCount;
    }

    public void setPageNo(int i) {
        this.pageNo = i;
    }

    public void setTotalCount(double d) {
        this.totalCount = d;
    }

    public boolean isPaginationEnable() {
        return this.isPaginationEnable;
    }

    public void setPaginationEnable(boolean z) {
        this.isPaginationEnable = z;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public void setTeamName(String str) {
        this.teamName = str;
    }

    public void setUserFollowFollowerData(List<UserFollowFollowerListFragment.Edge> list) {
        this.userFollowFollowerData = list;
    }

    public List<UserFollowFollowerListFragment.Edge> getUserFollowFollowerData() {
        return this.userFollowFollowerData;
    }
}

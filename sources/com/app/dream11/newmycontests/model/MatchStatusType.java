package com.app.dream11.newmycontests.model;

import com.app.dream11.core.service.graphql.api.type.MatchStatus;
import com.app.dream11.core.service.graphql.api.type.Sort;
import com.app.dream11Pro.R;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes3.dex */
public enum MatchStatusType {
    Fixture(0, "Upcoming", Sort.ASC, Arrays.asList(MatchStatus.NOT_STARTED, MatchStatus.UP_COMING), R.color.res_0x7f060554, true, R.string.res_0x7f12087a),
    Live(1, "Live", Sort.ASC, Arrays.asList(MatchStatus.IN_PROGRESS, MatchStatus.WAITING_FOR_REVIEW), R.color.res_0x7f060310, false, R.string.res_0x7f12087b),
    Results(2, "Completed", Sort.DESC, Arrays.asList(MatchStatus.COMPLETED, MatchStatus.ABANDONED), R.color.res_0x7f06030d, false, R.string.res_0x7f12087c);
    
    private final int color;
    private final List<MatchStatus> matchStatus;
    private final int pos;
    boolean shouldShowIcon;
    private final Sort sort;
    private final String title;
    private final int titleText;

    MatchStatusType(int i, String str, Sort sort, List list, int i2, boolean z, int i3) {
        this.pos = i;
        this.title = str;
        this.sort = sort;
        this.matchStatus = list;
        this.color = i2;
        this.shouldShowIcon = z;
        this.titleText = i3;
    }

    public int getPos() {
        return this.pos;
    }

    public String getTitle() {
        return this.title;
    }

    public int getTitleText() {
        return this.titleText;
    }

    public Sort getSort() {
        return this.sort;
    }

    public List<MatchStatus> getMatchStatus() {
        return this.matchStatus;
    }

    public int getColor() {
        return this.color;
    }

    public boolean isShouldShowIcon() {
        return this.shouldShowIcon;
    }

    public void setShouldShowIcon(boolean z) {
        this.shouldShowIcon = z;
    }
}

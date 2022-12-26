package com.app.dream11.teampreviewnew;

import com.app.dream11.model.FlowState;
import java.io.Serializable;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class DreamTeamReqData implements Serializable {
    private final int matchId;
    private final String srcScreen;
    private final int tourId;
    private final String wlsSlug;

    public static /* synthetic */ DreamTeamReqData copy$default(DreamTeamReqData dreamTeamReqData, int i, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = dreamTeamReqData.matchId;
        }
        if ((i3 & 2) != 0) {
            i2 = dreamTeamReqData.tourId;
        }
        if ((i3 & 4) != 0) {
            str = dreamTeamReqData.srcScreen;
        }
        if ((i3 & 8) != 0) {
            str2 = dreamTeamReqData.wlsSlug;
        }
        return dreamTeamReqData.copy(i, i2, str, str2);
    }

    public final int component1() {
        return this.matchId;
    }

    public final int component2() {
        return this.tourId;
    }

    public final String component3() {
        return this.srcScreen;
    }

    public final String component4() {
        return this.wlsSlug;
    }

    public final DreamTeamReqData copy(int i, int i2, String str, String str2) {
        runAnimators.ag$a(str, "srcScreen");
        runAnimators.ag$a(str2, FlowState.WLS_SLUG);
        return new DreamTeamReqData(i, i2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DreamTeamReqData) {
            DreamTeamReqData dreamTeamReqData = (DreamTeamReqData) obj;
            return this.matchId == dreamTeamReqData.matchId && this.tourId == dreamTeamReqData.tourId && runAnimators.values((Object) this.srcScreen, (Object) dreamTeamReqData.srcScreen) && runAnimators.values((Object) this.wlsSlug, (Object) dreamTeamReqData.wlsSlug);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.matchId * 31) + this.tourId) * 31) + this.srcScreen.hashCode()) * 31) + this.wlsSlug.hashCode();
    }

    public String toString() {
        int i = this.matchId;
        int i2 = this.tourId;
        String str = this.srcScreen;
        String str2 = this.wlsSlug;
        return "DreamTeamReqData(matchId=" + i + ", tourId=" + i2 + ", srcScreen=" + str + ", wlsSlug=" + str2 + ")";
    }

    public DreamTeamReqData(int i, int i2, String str, String str2) {
        runAnimators.ag$a(str, "srcScreen");
        runAnimators.ag$a(str2, FlowState.WLS_SLUG);
        this.matchId = i;
        this.tourId = i2;
        this.srcScreen = str;
        this.wlsSlug = str2;
    }

    public final int getMatchId() {
        return this.matchId;
    }

    public final String getSrcScreen() {
        return this.srcScreen;
    }

    public final int getTourId() {
        return this.tourId;
    }

    public final String getWlsSlug() {
        return this.wlsSlug;
    }
}

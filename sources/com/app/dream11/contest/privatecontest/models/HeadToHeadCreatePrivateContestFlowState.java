package com.app.dream11.contest.privatecontest.models;

import com.app.dream11.core.service.graphql.api.type.MatchStatus;
import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import java.util.Date;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes.dex */
public final class HeadToHeadCreatePrivateContestFlowState extends CreatePrivateContestFlowState {
    private final String connectionStatus;
    private final String contestType;
    private final String firstMessage;
    private final Integer myUserId;
    private final Integer oppUserId;
    private final String requestActionType;
    private final String userGuid;

    public /* synthetic */ HeadToHeadCreatePrivateContestFlowState(int i, int i2, String str, String str2, MatchStatus matchStatus, Date date, boolean z, String str3, String str4, Integer num, String str5, Double d, String str6, String str7, String str8, Integer num2, Integer num3, String str9, String str10, int i3, getTargetTypes gettargettypes) {
        this(i, i2, str, str2, matchStatus, date, (i3 & 64) != 0 ? false : z, (i3 & 128) != 0 ? "" : str3, (i3 & 256) != 0 ? "" : str4, (i3 & 512) != 0 ? null : num, (i3 & 1024) != 0 ? null : str5, (i3 & 2048) != 0 ? null : d, str6, str7, str8, num2, num3, str9, str10);
    }

    public final String getUserGuid() {
        return this.userGuid;
    }

    public final String getConnectionStatus() {
        return this.connectionStatus;
    }

    public final String getFirstMessage() {
        return this.firstMessage;
    }

    public final Integer getMyUserId() {
        return this.myUserId;
    }

    public final Integer getOppUserId() {
        return this.oppUserId;
    }

    public final String getRequestActionType() {
        return this.requestActionType;
    }

    public final String getContestType() {
        return this.contestType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeadToHeadCreatePrivateContestFlowState(int i, int i2, String str, String str2, MatchStatus matchStatus, Date date, boolean z, String str3, String str4, Integer num, String str5, Double d, String str6, String str7, String str8, Integer num2, Integer num3, String str9, String str10) {
        super(i, i2, str, str2, matchStatus, date, z, str3, str4, num, str5, d, false, false, 12288, null);
        runAnimators.ag$a(str, "slug");
        runAnimators.ag$a(str2, HeadToHeadMatchPickerFlowState.MATCH_NAME);
        runAnimators.ag$a(matchStatus, HeadToHeadMatchPickerFlowState.MATCH_STATUS);
        runAnimators.ag$a(str9, "requestActionType");
        runAnimators.ag$a(str10, "contestType");
        this.userGuid = str6;
        this.connectionStatus = str7;
        this.firstMessage = str8;
        this.myUserId = num2;
        this.oppUserId = num3;
        this.requestActionType = str9;
        this.contestType = str10;
    }
}

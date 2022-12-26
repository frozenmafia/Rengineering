package com.app.dream11.responsibleplay;

import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class ResponsiblePlayFlowState extends FlowState {
    private final String level;
    private final String message;
    private final String netLoss;
    private final String responsiblePlayId;
    private final String time;
    private final String year;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResponsiblePlayFlowState(String str, String str2, String str3, String str4, String str5, String str6) {
        super(FlowStates.RESPONSIBLE_PLAY, null, 2, null);
        runAnimators.ag$a(str, "responsiblePlayId");
        runAnimators.ag$a(str2, "level");
        runAnimators.ag$a(str3, "message");
        runAnimators.ag$a(str4, "time");
        runAnimators.ag$a(str5, "year");
        runAnimators.ag$a(str6, "netLoss");
        this.responsiblePlayId = str;
        this.level = str2;
        this.message = str3;
        this.time = str4;
        this.year = str5;
        this.netLoss = str6;
    }

    public final String getLevel() {
        return this.level;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getNetLoss() {
        return this.netLoss;
    }

    public final String getResponsiblePlayId() {
        return this.responsiblePlayId;
    }

    public final String getTime() {
        return this.time;
    }

    public final String getYear() {
        return this.year;
    }
}

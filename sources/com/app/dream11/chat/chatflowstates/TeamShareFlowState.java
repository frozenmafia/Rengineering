package com.app.dream11.chat.chatflowstates;

import android.os.Process;
import android.view.ViewConfiguration;
import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import o.isLast;
import o.runAnimators;
/* loaded from: classes.dex */
public final class TeamShareFlowState extends FlowState {
    private static int HaptikSDK$a = 1;
    private static char[] ag$a = {308, 304, 310, 307, 292, 294};
    private static boolean ah$a = true;
    private static int toString = 193;
    private static boolean valueOf = true;
    private static int values;
    private final int roundId;
    private final String site;
    private final String source;
    private final int teamId;

    public static /* synthetic */ TeamShareFlowState copy$default(TeamShareFlowState teamShareFlowState, int i, int i2, String str, String str2, int i3, Object obj) {
        if (((i3 & 1) != 0 ? '?' : '\'') == '?') {
            i = teamShareFlowState.teamId;
            try {
                int i4 = values + 33;
                HaptikSDK$a = i4 % 128;
                int i5 = i4 % 2;
            } catch (Exception e) {
                throw e;
            }
        }
        if ((i3 & 2) != 0) {
            int i6 = HaptikSDK$a + 21;
            values = i6 % 128;
            if (i6 % 2 != 0) {
                i2 = teamShareFlowState.roundId;
                Object[] objArr = null;
                int length = objArr.length;
            } else {
                i2 = teamShareFlowState.roundId;
            }
        }
        if ((i3 & 4) != 0) {
            str = teamShareFlowState.site;
        }
        if ((i3 & 8) != 0) {
            str2 = teamShareFlowState.source;
        }
        return teamShareFlowState.copy(i, i2, str, str2);
    }

    public final int component1() {
        int i = HaptikSDK$a + 29;
        values = i % 128;
        try {
            if ((i % 2 != 0 ? 'F' : 'Y') == 'Y') {
                return this.teamId;
            }
            int i2 = this.teamId;
            Object[] objArr = null;
            int length = objArr.length;
            return i2;
        } catch (Exception e) {
            throw e;
        }
    }

    public final int component2() {
        try {
            int i = HaptikSDK$a + 81;
            values = i % 128;
            int i2 = i % 2;
            int i3 = this.roundId;
            int i4 = HaptikSDK$a + 45;
            values = i4 % 128;
            int i5 = i4 % 2;
            return i3;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String component3() {
        int i = values + 105;
        HaptikSDK$a = i % 128;
        int i2 = i % 2;
        String str = this.site;
        int i3 = HaptikSDK$a + 39;
        values = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public final String component4() {
        String str;
        try {
            int i = HaptikSDK$a + 101;
            values = i % 128;
            Object[] objArr = null;
            if ((i % 2 != 0 ? (char) 18 : '(') != 18) {
                str = this.source;
            } else {
                str = this.source;
                int length = objArr.length;
            }
            int i2 = HaptikSDK$a + 9;
            values = i2 % 128;
            if ((i2 % 2 != 0 ? '\n' : '8') != '\n') {
                return str;
            }
            int length2 = objArr.length;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final TeamShareFlowState copy(int i, int i2, String str, String str2) {
        runAnimators.ag$a(str, FlowState.SITE);
        runAnimators.ag$a(str2, ah$a(null, null, (ViewConfiguration.getPressedStateDuration() >> 16) + 127, new byte[]{-122, -123, -124, -125, -126, -127}).intern());
        TeamShareFlowState teamShareFlowState = new TeamShareFlowState(i, i2, str, str2);
        int i3 = HaptikSDK$a + 17;
        values = i3 % 128;
        int i4 = i3 % 2;
        return teamShareFlowState;
    }

    public boolean equals(Object obj) {
        int i = values + 45;
        HaptikSDK$a = i % 128;
        int i2 = i % 2;
        if (this == obj) {
            int i3 = HaptikSDK$a + 77;
            values = i3 % 128;
            return i3 % 2 == 0;
        }
        if ((!(obj instanceof TeamShareFlowState) ? '$' : '\'') != '$') {
            try {
                TeamShareFlowState teamShareFlowState = (TeamShareFlowState) obj;
                if ((this.teamId == teamShareFlowState.teamId) && this.roundId == teamShareFlowState.roundId) {
                    try {
                        if ((!runAnimators.values((Object) this.site, (Object) teamShareFlowState.site) ? (char) 2 : (char) 28) != 2) {
                            return runAnimators.values((Object) this.source, (Object) teamShareFlowState.source);
                        }
                        int i4 = HaptikSDK$a + 101;
                        values = i4 % 128;
                        int i5 = i4 % 2;
                        return false;
                    } catch (Exception e) {
                        throw e;
                    }
                }
                return false;
            } catch (Exception e2) {
                throw e2;
            }
        }
        return false;
    }

    public int hashCode() {
        try {
            int i = HaptikSDK$a + 33;
            values = i % 128;
            int i2 = i % 2;
            int hashCode = (((((this.teamId * 31) + this.roundId) * 31) + this.site.hashCode()) * 31) + this.source.hashCode();
            int i3 = values + 85;
            HaptikSDK$a = i3 % 128;
            int i4 = i3 % 2;
            return hashCode;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.app.dream11.model.FlowState
    public String toString() {
        try {
            int i = this.teamId;
            int i2 = this.roundId;
            try {
                String str = "TeamShareFlowState(teamId=" + i + ", roundId=" + i2 + ", site=" + this.site + ", source=" + this.source + ")";
                int i3 = HaptikSDK$a + 41;
                values = i3 % 128;
                int i4 = i3 % 2;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final int getTeamId() {
        int i = HaptikSDK$a + 117;
        values = i % 128;
        if ((i % 2 != 0 ? ',' : '\f') != '\f') {
            int i2 = this.teamId;
            Object obj = null;
            super.hashCode();
            return i2;
        }
        return this.teamId;
    }

    public final int getRoundId() {
        int i = values + 75;
        HaptikSDK$a = i % 128;
        int i2 = i % 2;
        try {
            int i3 = this.roundId;
            int i4 = HaptikSDK$a + 57;
            values = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 47 / 0;
                return i3;
            }
            return i3;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String getSite() {
        int i = HaptikSDK$a + 7;
        values = i % 128;
        int i2 = i % 2;
        String str = this.site;
        int i3 = HaptikSDK$a + 125;
        values = i3 % 128;
        if ((i3 % 2 != 0 ? (char) 3 : (char) 22) != 22) {
            Object obj = null;
            super.hashCode();
            return str;
        }
        return str;
    }

    public final String getSource() {
        int i = HaptikSDK$a + 83;
        values = i % 128;
        if ((i % 2 != 0 ? '!' : (char) 6) != '!') {
            return this.source;
        }
        int i2 = 51 / 0;
        return this.source;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeamShareFlowState(int i, int i2, String str, String str2) {
        super(FlowStates.TEAM_SHARE_BOTTOM_SHEET, null, 2, null);
        runAnimators.ag$a(str, FlowState.SITE);
        runAnimators.ag$a(str2, ah$a(null, null, (Process.myPid() >> 22) + 127, new byte[]{-122, -123, -124, -125, -126, -127}).intern());
        this.teamId = i;
        this.roundId = i2;
        this.site = str;
        this.source = str2;
    }

    private static String ah$a(char[] cArr, int[] iArr, int i, byte[] bArr) {
        synchronized (isLast.valueOf) {
            char[] cArr2 = ag$a;
            int i2 = toString;
            if (ah$a) {
                int length = bArr.length;
                isLast.values = length;
                char[] cArr3 = new char[length];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr3[isLast.toString] = (char) (cArr2[bArr[(isLast.values - 1) - isLast.toString] + i] - i2);
                    isLast.toString++;
                }
                return new String(cArr3);
            } else if (valueOf) {
                int length2 = cArr.length;
                isLast.values = length2;
                char[] cArr4 = new char[length2];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr4[isLast.toString] = (char) (cArr2[cArr[(isLast.values - 1) - isLast.toString] - i] - i2);
                    isLast.toString++;
                }
                return new String(cArr4);
            } else {
                int length3 = iArr.length;
                isLast.values = length3;
                char[] cArr5 = new char[length3];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr5[isLast.toString] = (char) (cArr2[iArr[(isLast.values - 1) - isLast.toString] - i] - i2);
                    isLast.toString++;
                }
                return new String(cArr5);
            }
        }
    }
}

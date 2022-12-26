package com.app.dream11.contest.winningbreakup;

import android.text.TextUtils;
import android.view.View;
import com.app.dream11.contest.teamcompare.CompareTeamFlowState;
import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import java.io.Serializable;
import o.isBeforeFirst;
import o.runAnimators;
/* loaded from: classes2.dex */
public final class WinningDataFlowState extends FlowState {
    private static int toString = 1;
    private static long valueOf = 9004936680374232757L;
    private static int values;
    private final String wlsSlugVal;

    public WinningDataFlowState() {
        super(FlowStates.WINNING_DETAILED_BREAKUP, null, "");
        this.wlsSlugVal = getString(FlowState.SITE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WinningDataFlowState(int i, int i2, String str, String str2, String str3, String str4, String str5) {
        this();
        runAnimators.ag$a(str, HeadToHeadMatchPickerFlowState.MATCH_STATUS);
        runAnimators.ag$a(str2, "teamsName");
        runAnimators.ag$a(str4, ag$a(new char[]{26310, 8351, 59978, 46088, 32706, 14729}, View.MeasureSpec.getMode(0) + 17989).intern());
        runAnimators.ag$a(str5, "teamName");
        putExtra(HeadToHeadMatchPickerFlowState.ROUND_ID, Integer.valueOf(i));
        putExtra(CompareTeamFlowState.MATCH_ID, Integer.valueOf(i));
        putExtra("tourId", Integer.valueOf(i2));
        putExtra(HeadToHeadMatchPickerFlowState.MATCH_STATUS, str);
        putExtra("teamName", str5);
        putExtra("teamsName", str2);
        String str6 = str3;
        putExtra(FlowState.SITE, str6);
        putExtra("slug", str6);
        putExtra("isPopup", (Serializable) true);
        putExtra(ag$a(new char[]{26310, 8351, 59978, 46088, 32706, 14729}, TextUtils.lastIndexOf("", '0', 0, 0) + 17990).intern(), str4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ WinningDataFlowState(int r11, int r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, int r18, o.getTargetTypes r19) {
        /*
            r10 = this;
            r0 = r18 & 32
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto L2a
            int r0 = com.app.dream11.contest.winningbreakup.WinningDataFlowState.toString
            int r0 = r0 + 13
            int r1 = r0 % 128
            com.app.dream11.contest.winningbreakup.WinningDataFlowState.values = r1
            int r0 = r0 % 2
            r1 = 33
            if (r0 == 0) goto L1a
            r0 = 33
            goto L1c
        L1a:
            r0 = 75
        L1c:
            if (r0 == r1) goto L1f
            goto L23
        L1f:
            r0 = 0
            super.hashCode()     // Catch: java.lang.Throwable -> L27
        L23:
            java.lang.String r0 = ""
            r8 = r0
            goto L2c
        L27:
            r0 = move-exception
            r1 = r0
            throw r1
        L2a:
            r8 = r16
        L2c:
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r9 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.contest.winningbreakup.WinningDataFlowState.<init>(int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, o.getTargetTypes):void");
    }

    public final int getRoundId() {
        int i = toString + 81;
        values = i % 128;
        int i2 = i % 2;
        try {
            Object obj = null;
            int int$default = FlowState.getInt$default(this, CompareTeamFlowState.MATCH_ID, 0, 2, null);
            int i3 = values + 59;
            toString = i3 % 128;
            if (!(i3 % 2 != 0)) {
                super.hashCode();
                return int$default;
            }
            return int$default;
        } catch (Exception e) {
            throw e;
        }
    }

    public final int getTourId() {
        int i = values + 105;
        toString = i % 128;
        int i2 = i % 2;
        int int$default = FlowState.getInt$default(this, "tourId", 0, 2, null);
        int i3 = toString + 99;
        values = i3 % 128;
        int i4 = i3 % 2;
        return int$default;
    }

    public final String getMatchStatus() {
        String string;
        int i = toString + 15;
        values = i % 128;
        Object[] objArr = null;
        if (!(i % 2 == 0)) {
            string = getString(HeadToHeadMatchPickerFlowState.MATCH_STATUS);
            int length = objArr.length;
        } else {
            string = getString(HeadToHeadMatchPickerFlowState.MATCH_STATUS);
        }
        int i2 = values + 3;
        toString = i2 % 128;
        if ((i2 % 2 == 0 ? (char) 29 : 'F') != 'F') {
            int length2 = objArr.length;
            return string;
        }
        return string;
    }

    public final String getTeamsName() {
        String string;
        int i = toString + 11;
        values = i % 128;
        if (i % 2 != 0) {
            string = getString("teamsName");
            Object[] objArr = null;
            int length = objArr.length;
        } else {
            try {
                string = getString("teamsName");
            } catch (Exception e) {
                throw e;
            }
        }
        int i2 = toString + 41;
        values = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public final String getWlsSlugVal() {
        try {
            int i = toString + 121;
            values = i % 128;
            int i2 = i % 2;
            String str = this.wlsSlugVal;
            int i3 = toString + 39;
            values = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String ag$a(char[] cArr, int i) {
        String str;
        synchronized (isBeforeFirst.toString) {
            isBeforeFirst.ah$a = i;
            char[] cArr2 = new char[cArr.length];
            isBeforeFirst.valueOf = 0;
            while (isBeforeFirst.valueOf < cArr.length) {
                cArr2[isBeforeFirst.valueOf] = (char) ((cArr[isBeforeFirst.valueOf] ^ (isBeforeFirst.valueOf * isBeforeFirst.ah$a)) ^ valueOf);
                isBeforeFirst.valueOf++;
            }
            str = new String(cArr2);
        }
        return str;
    }
}

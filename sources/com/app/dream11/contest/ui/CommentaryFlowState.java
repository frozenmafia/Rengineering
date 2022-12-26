package com.app.dream11.contest.ui;

import android.graphics.Color;
import com.app.dream11.contest.teamcompare.CompareTeamFlowState;
import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import o.moveToFirst;
import o.runAnimators;
import org.apache.commons.codec.language.Soundex;
/* loaded from: classes2.dex */
public final class CommentaryFlowState extends FlowState {
    private static int ag$a = 0;
    private static char ah$a = 37036;
    private static int invoke = 1;
    private static char toString = 4041;
    private static char valueOf = 63340;
    private static char values = 16103;
    private final String contestCategory;
    private final String contestId;
    private final double entryFee;
    private final int matchId;
    private final String matchStatus;
    private final String slug;
    private final String source;
    private final int tourId;

    public final int getMatchId() {
        int i = ag$a + 19;
        invoke = i % 128;
        int i2 = i % 2;
        try {
            int i3 = this.matchId;
            int i4 = invoke + 43;
            ag$a = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 43 / 0;
                return i3;
            }
            return i3;
        } catch (Exception e) {
            throw e;
        }
    }

    public final int getTourId() {
        int i = ag$a + 39;
        invoke = i % 128;
        if ((i % 2 == 0 ? (char) 30 : '6') != '6') {
            int i2 = this.tourId;
            Object obj = null;
            super.hashCode();
            return i2;
        }
        return this.tourId;
    }

    public final String getSlug() {
        String str;
        int i = invoke + 31;
        ag$a = i % 128;
        if (i % 2 == 0) {
            try {
                str = this.slug;
            } catch (Exception e) {
                throw e;
            }
        } else {
            str = this.slug;
            Object obj = null;
            super.hashCode();
        }
        int i2 = ag$a + 41;
        invoke = i2 % 128;
        if ((i2 % 2 == 0 ? (char) 29 : Soundex.SILENT_MARKER) != 29) {
            return str;
        }
        int i3 = 5 / 0;
        return str;
    }

    public final String getContestId() {
        try {
            int i = invoke + 99;
            ag$a = i % 128;
            int i2 = i % 2;
            String str = this.contestId;
            int i3 = invoke + 37;
            ag$a = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String getContestCategory() {
        String str;
        try {
            int i = invoke + 37;
            ag$a = i % 128;
            if ((i % 2 != 0 ? '/' : (char) 7) != '/') {
                str = this.contestCategory;
            } else {
                str = this.contestCategory;
                int i2 = 57 / 0;
            }
            int i3 = ag$a + 43;
            invoke = i3 % 128;
            if (!(i3 % 2 != 0)) {
                Object obj = null;
                super.hashCode();
                return str;
            }
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String getMatchStatus() {
        int i = invoke + 25;
        ag$a = i % 128;
        if (!(i % 2 == 0)) {
            int i2 = 2 / 0;
            return this.matchStatus;
        }
        try {
            return this.matchStatus;
        } catch (Exception e) {
            throw e;
        }
    }

    public final double getEntryFee() {
        try {
            int i = invoke + 81;
            try {
                ag$a = i % 128;
                if (!(i % 2 == 0)) {
                    double d = this.entryFee;
                    Object[] objArr = null;
                    int length = objArr.length;
                    return d;
                }
                return this.entryFee;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentaryFlowState(int i, int i2, String str, String str2, String str3, String str4, double d, String str5) {
        super(FlowStates.COMMENTARY, null, str);
        runAnimators.ag$a(str2, CompareTeamFlowState.CONTEST_ID);
        runAnimators.ag$a(str3, "contestCategory");
        runAnimators.ag$a(str4, HeadToHeadMatchPickerFlowState.MATCH_STATUS);
        runAnimators.ag$a(str5, values(new char[]{63687, 31756, 6408, 9351, 41646, 6912}, Color.blue(0) + 6).intern());
        this.matchId = i;
        this.tourId = i2;
        this.slug = str;
        this.contestId = str2;
        this.contestCategory = str3;
        this.matchStatus = str4;
        this.entryFee = d;
        this.source = str5;
    }

    public final String getSource() {
        try {
            int i = ag$a + 45;
            invoke = i % 128;
            int i2 = i % 2;
            String str = this.source;
            int i3 = invoke + 95;
            ag$a = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String values(char[] cArr, int i) {
        String str;
        synchronized (moveToFirst.ah$a) {
            char[] cArr2 = new char[cArr.length];
            moveToFirst.values = 0;
            char[] cArr3 = new char[2];
            while (moveToFirst.values < cArr.length) {
                cArr3[0] = cArr[moveToFirst.values];
                cArr3[1] = cArr[moveToFirst.values + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    cArr3[1] = (char) (cArr3[1] - (((cArr3[0] + i2) ^ ((cArr3[0] << 4) + values)) ^ ((cArr3[0] >>> 5) + toString)));
                    cArr3[0] = (char) (cArr3[0] - (((cArr3[1] + i2) ^ ((cArr3[1] << 4) + valueOf)) ^ ((cArr3[1] >>> 5) + ah$a)));
                    i2 -= 40503;
                }
                cArr2[moveToFirst.values] = cArr3[0];
                cArr2[moveToFirst.values + 1] = cArr3[1];
                moveToFirst.values += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}

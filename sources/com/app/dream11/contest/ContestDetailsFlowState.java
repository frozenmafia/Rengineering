package com.app.dream11.contest;

import android.graphics.ImageFormat;
import android.view.View;
import com.app.dream11.contest.teamcompare.CompareTeamFlowState;
import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import com.sendbird.android.constant.StringSet;
import o.getDouble;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ContestDetailsFlowState extends FlowState {
    private static int toString = 0;
    private static int valueOf = 1;
    private static int[] values = {1653635102, -666845431, -1545522953, 1466568953, 2042111731, 1683784562, 651229917, -488388731, -626364120, 1648410815, -392821327, -1073921894, -1781783986, -961183808, -371287342, 385997415, 204868027, -1626996876};
    private final String argShouldShowGroupsEntryPoint;
    private final String argshouldShowGroupsEntryPoint;

    public ContestDetailsFlowState() {
        super(FlowStates.LEAGUE_DETAILS, null);
        this.argShouldShowGroupsEntryPoint = "shouldHideGroupEntryPoint";
        this.argshouldShowGroupsEntryPoint = "shouldHideGroupEntryPoint";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ContestDetailsFlowState(java.lang.String r14, java.lang.String r15, int r16, int r17, int r18, java.lang.String r19, boolean r20, java.lang.String r21, java.lang.String r22, int r23, o.getTargetTypes r24) {
        /*
            r13 = this;
            r0 = r23
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L13
            int r1 = com.app.dream11.contest.ContestDetailsFlowState.valueOf
            int r1 = r1 + 37
            int r3 = r1 % 128
            com.app.dream11.contest.ContestDetailsFlowState.toString = r3
            int r1 = r1 % 2
            r8 = 0
            goto L15
        L13:
            r8 = r18
        L15:
            r1 = r0 & 64
            r3 = 1
            if (r1 == 0) goto L1c
            r1 = 1
            goto L1d
        L1c:
            r1 = 0
        L1d:
            if (r1 == 0) goto L21
            r10 = 1
            goto L23
        L21:
            r10 = r20
        L23:
            r1 = r0 & 128(0x80, float:1.794E-43)
            r4 = 0
            java.lang.String r5 = ""
            if (r1 == 0) goto L46
            int r1 = com.app.dream11.contest.ContestDetailsFlowState.valueOf     // Catch: java.lang.Exception -> L44
            int r1 = r1 + 13
            int r6 = r1 % 128
            com.app.dream11.contest.ContestDetailsFlowState.toString = r6     // Catch: java.lang.Exception -> L44
            int r1 = r1 % 2
            if (r1 == 0) goto L38
            r1 = 0
            goto L39
        L38:
            r1 = 1
        L39:
            if (r1 == r3) goto L42
            super.hashCode()     // Catch: java.lang.Throwable -> L3f
            goto L42
        L3f:
            r0 = move-exception
            r1 = r0
            throw r1
        L42:
            r11 = r5
            goto L48
        L44:
            r0 = move-exception
            throw r0
        L46:
            r11 = r21
        L48:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L4d
            r2 = 1
        L4d:
            if (r2 == 0) goto L62
            int r0 = com.app.dream11.contest.ContestDetailsFlowState.valueOf
            int r0 = r0 + 53
            int r1 = r0 % 128
            com.app.dream11.contest.ContestDetailsFlowState.toString = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L60
            int r0 = r4.length     // Catch: java.lang.Throwable -> L5d
            goto L60
        L5d:
            r0 = move-exception
            r1 = r0
            throw r1
        L60:
            r12 = r5
            goto L64
        L62:
            r12 = r22
        L64:
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r9 = r19
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.contest.ContestDetailsFlowState.<init>(java.lang.String, java.lang.String, int, int, int, java.lang.String, boolean, java.lang.String, java.lang.String, int, o.getTargetTypes):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContestDetailsFlowState(String str, String str2, int i, int i2, int i3, String str3, boolean z, String str4, String str5) {
        this();
        runAnimators.ag$a(str, "slug");
        runAnimators.ag$a(str2, CompareTeamFlowState.CONTEST_ID);
        runAnimators.ag$a(str3, values(new int[]{-1422221571, 1183065601}, 4 - View.combineMeasuredStates(0, 0)).intern());
        runAnimators.ag$a(str4, "channelUrl");
        runAnimators.ag$a(str5, "previousScreenName");
        putExtra("leagueId", str2);
        putExtra("roundID", Integer.valueOf(i));
        putExtra("tourID", Integer.valueOf(i2));
        putExtra("sectionId", Integer.valueOf(i3));
        putExtra(values(new int[]{-1422221571, 1183065601}, ImageFormat.getBitsPerPixel(0) + 5).intern(), str3);
        putExtra(StringSet.channel_url, str4);
        putExtra(this.argshouldShowGroupsEntryPoint, Boolean.valueOf(z));
        putExtra(FlowState.WLS_SLUG, str);
        putExtra("previousScreenName", str5);
    }

    public final boolean getShouldHideGroupsEntryPoint() {
        int i = valueOf + 117;
        toString = i % 128;
        if (i % 2 != 0) {
            boolean z = getBoolean(this.argShouldShowGroupsEntryPoint);
            Object[] objArr = null;
            int length = objArr.length;
            return z;
        }
        return getBoolean(this.argShouldShowGroupsEntryPoint);
    }

    private static String values(int[] iArr, int i) {
        String str;
        synchronized (getDouble.ag$a) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) values.clone();
            getDouble.toString = 0;
            while (getDouble.toString < iArr.length) {
                cArr[0] = (char) (iArr[getDouble.toString] >> 16);
                cArr[1] = (char) iArr[getDouble.toString];
                cArr[2] = (char) (iArr[getDouble.toString + 1] >> 16);
                cArr[3] = (char) iArr[getDouble.toString + 1];
                getDouble.valueOf = (cArr[0] << 16) + cArr[1];
                getDouble.values = (cArr[2] << 16) + cArr[3];
                getDouble.values(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = getDouble.valueOf ^ iArr2[i2];
                    getDouble.valueOf = i3;
                    getDouble.values = getDouble.toString(i3) ^ getDouble.values;
                    int i4 = getDouble.valueOf;
                    getDouble.valueOf = getDouble.values;
                    getDouble.values = i4;
                }
                int i5 = getDouble.valueOf;
                getDouble.valueOf = getDouble.values;
                getDouble.values = i5;
                getDouble.values = i5 ^ iArr2[16];
                getDouble.valueOf ^= iArr2[17];
                int i6 = getDouble.valueOf;
                int i7 = getDouble.values;
                cArr[0] = (char) (getDouble.valueOf >>> 16);
                cArr[1] = (char) getDouble.valueOf;
                cArr[2] = (char) (getDouble.values >>> 16);
                cArr[3] = (char) getDouble.values;
                getDouble.values(iArr2);
                cArr2[getDouble.toString << 1] = cArr[0];
                cArr2[(getDouble.toString << 1) + 1] = cArr[1];
                cArr2[(getDouble.toString << 1) + 2] = cArr[2];
                cArr2[(getDouble.toString << 1) + 3] = cArr[3];
                getDouble.toString += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}

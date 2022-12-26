package com.app.dream11.contest.privatecontest.models;

import android.view.ViewConfiguration;
import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import o.isLast;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ChoosePrizeBreakupFlowState extends FlowState {
    private static int HaptikSDK$b = 1;
    private static int ag$a = 0;
    private static boolean ah$a = true;
    private static boolean toString = true;
    private static char[] valueOf = {169, 165, 171, 168, 153, 155};
    private static int values = 54;
    private final String channelUrl;
    private final String contestName;
    private final int contestSize;
    private final int entryFee;
    private final boolean isDynamicContest;
    private final boolean isMultipleEntryAllowed;
    private final double prizePool;
    private final int roundId;
    private final boolean shouldReturnResult;
    private final boolean shouldReturnResultBackToRN;
    private final String slug;
    private final String source;
    private final int tourId;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ChoosePrizeBreakupFlowState(int r20, int r21, java.lang.String r22, java.lang.String r23, double r24, int r26, int r27, boolean r28, boolean r29, boolean r30, java.lang.String r31, java.lang.String r32, boolean r33, int r34, o.getTargetTypes r35) {
        /*
            r19 = this;
            r0 = r34
            r1 = r0 & 128(0x80, float:1.794E-43)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            if (r1 == r2) goto L10
            r13 = r28
            goto L1b
        L10:
            int r1 = com.app.dream11.contest.privatecontest.models.ChoosePrizeBreakupFlowState.ag$a
            int r1 = r1 + 105
            int r4 = r1 % 128
            com.app.dream11.contest.privatecontest.models.ChoosePrizeBreakupFlowState.HaptikSDK$b = r4
            int r1 = r1 % 2
            r13 = 0
        L1b:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L21
            r1 = 0
            goto L22
        L21:
            r1 = 1
        L22:
            if (r1 == 0) goto L27
            r15 = r30
            goto L28
        L27:
            r15 = 0
        L28:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            java.lang.String r4 = ""
            if (r1 == 0) goto L3b
            int r1 = com.app.dream11.contest.privatecontest.models.ChoosePrizeBreakupFlowState.ag$a
            int r1 = r1 + 77
            int r5 = r1 % 128
            com.app.dream11.contest.privatecontest.models.ChoosePrizeBreakupFlowState.HaptikSDK$b = r5
            int r1 = r1 % 2
            r16 = r4
            goto L3d
        L3b:
            r16 = r31
        L3d:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L44
            r17 = r4
            goto L46
        L44:
            r17 = r32
        L46:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L4c
            r0 = 1
            goto L4d
        L4c:
            r0 = 0
        L4d:
            if (r0 == r2) goto L52
            r18 = r33
            goto L54
        L52:
            r18 = 0
        L54:
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r11 = r26
            r12 = r27
            r14 = r29
            r4.<init>(r5, r6, r7, r8, r9, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.contest.privatecontest.models.ChoosePrizeBreakupFlowState.<init>(int, int, java.lang.String, java.lang.String, double, int, int, boolean, boolean, boolean, java.lang.String, java.lang.String, boolean, int, o.getTargetTypes):void");
    }

    public final int getRoundId() {
        int i;
        try {
            int i2 = HaptikSDK$b + 61;
            ag$a = i2 % 128;
            if (i2 % 2 == 0) {
                i = this.roundId;
            } else {
                i = this.roundId;
                Object[] objArr = null;
                int length = objArr.length;
            }
            int i3 = HaptikSDK$b + 93;
            ag$a = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 36 / 0;
                return i;
            }
            return i;
        } catch (Exception e) {
            throw e;
        }
    }

    public final int getTourId() {
        int i = ag$a + 27;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        int i3 = this.tourId;
        try {
            int i4 = HaptikSDK$b + 13;
            ag$a = i4 % 128;
            int i5 = i4 % 2;
            return i3;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String getSlug() {
        int i = ag$a + 123;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        try {
            String str = this.slug;
            int i3 = HaptikSDK$b + 63;
            ag$a = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String getContestName() {
        int i = ag$a + 47;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        try {
            String str = this.contestName;
            int i3 = HaptikSDK$b + 63;
            ag$a = i3 % 128;
            if (!(i3 % 2 != 0)) {
                return str;
            }
            Object obj = null;
            super.hashCode();
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final double getPrizePool() {
        int i = ag$a + 47;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        double d = this.prizePool;
        int i3 = ag$a + 21;
        HaptikSDK$b = i3 % 128;
        int i4 = i3 % 2;
        return d;
    }

    public final int getEntryFee() {
        int i = HaptikSDK$b + 51;
        ag$a = i % 128;
        int i2 = i % 2;
        int i3 = this.entryFee;
        int i4 = HaptikSDK$b + 65;
        ag$a = i4 % 128;
        if ((i4 % 2 != 0 ? '[' : 'P') != '[') {
            return i3;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return i3;
    }

    public final int getContestSize() {
        int i = ag$a + 115;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        try {
            int i3 = this.contestSize;
            int i4 = HaptikSDK$b + 63;
            ag$a = i4 % 128;
            if (!(i4 % 2 != 0)) {
                return i3;
            }
            Object[] objArr = null;
            int length = objArr.length;
            return i3;
        } catch (Exception e) {
            throw e;
        }
    }

    public final boolean isMultipleEntryAllowed() {
        try {
            int i = HaptikSDK$b + 37;
            try {
                ag$a = i % 128;
                if (i % 2 == 0) {
                    return this.isMultipleEntryAllowed;
                }
                int i2 = 70 / 0;
                return this.isMultipleEntryAllowed;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final boolean isDynamicContest() {
        int i = ag$a + 31;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        boolean z = this.isDynamicContest;
        try {
            int i3 = ag$a + 27;
            HaptikSDK$b = i3 % 128;
            int i4 = i3 % 2;
            return z;
        } catch (Exception e) {
            throw e;
        }
    }

    public final boolean getShouldReturnResult() {
        boolean z;
        int i = ag$a + 13;
        HaptikSDK$b = i % 128;
        if (!(i % 2 != 0)) {
            z = this.shouldReturnResult;
            Object[] objArr = null;
            int length = objArr.length;
        } else {
            z = this.shouldReturnResult;
        }
        int i2 = HaptikSDK$b + 95;
        ag$a = i2 % 128;
        int i3 = i2 % 2;
        return z;
    }

    public final String getSource() {
        int i = HaptikSDK$b + 85;
        ag$a = i % 128;
        if (!(i % 2 != 0)) {
            return this.source;
        }
        int i2 = 28 / 0;
        return this.source;
    }

    public final String getChannelUrl() {
        String str;
        try {
            int i = HaptikSDK$b + 1;
            try {
                ag$a = i % 128;
                if (i % 2 == 0) {
                    str = this.channelUrl;
                } else {
                    str = this.channelUrl;
                    int i2 = 30 / 0;
                }
                int i3 = ag$a + 65;
                HaptikSDK$b = i3 % 128;
                if ((i3 % 2 == 0 ? (char) 19 : 'L') != 'L') {
                    int i4 = 80 / 0;
                    return str;
                }
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChoosePrizeBreakupFlowState(int i, int i2, String str, String str2, double d, int i3, int i4, boolean z, boolean z2, boolean z3, String str3, String str4, boolean z4) {
        super(FlowStates.SELECT_WINNER_BREAKUP, null, str);
        runAnimators.ag$a(str, "slug");
        runAnimators.ag$a(str2, "contestName");
        runAnimators.ag$a(str3, valueOf(null, null, (ViewConfiguration.getTapTimeout() >> 16) + 127, new byte[]{-122, -123, -124, -125, -126, -127}).intern());
        runAnimators.ag$a(str4, "channelUrl");
        this.roundId = i;
        this.tourId = i2;
        this.slug = str;
        this.contestName = str2;
        this.prizePool = d;
        this.entryFee = i3;
        this.contestSize = i4;
        this.isMultipleEntryAllowed = z;
        this.isDynamicContest = z2;
        this.shouldReturnResult = z3;
        this.source = str3;
        this.channelUrl = str4;
        this.shouldReturnResultBackToRN = z4;
    }

    public final boolean getShouldReturnResultBackToRN() {
        boolean z;
        try {
            int i = HaptikSDK$b + 87;
            ag$a = i % 128;
            if ((i % 2 != 0 ? 'b' : '>') != '>') {
                z = this.shouldReturnResultBackToRN;
                Object obj = null;
                super.hashCode();
            } else {
                z = this.shouldReturnResultBackToRN;
            }
            int i2 = ag$a + 27;
            HaptikSDK$b = i2 % 128;
            if ((i2 % 2 == 0 ? '8' : 'A') != '8') {
                return z;
            }
            int i3 = 42 / 0;
            return z;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String valueOf(char[] cArr, int[] iArr, int i, byte[] bArr) {
        synchronized (isLast.valueOf) {
            char[] cArr2 = valueOf;
            int i2 = values;
            if (toString) {
                int length = bArr.length;
                isLast.values = length;
                char[] cArr3 = new char[length];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr3[isLast.toString] = (char) (cArr2[bArr[(isLast.values - 1) - isLast.toString] + i] - i2);
                    isLast.toString++;
                }
                return new String(cArr3);
            } else if (ah$a) {
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

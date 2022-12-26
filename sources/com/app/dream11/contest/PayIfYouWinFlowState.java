package com.app.dream11.contest;

import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.app.dream11.contest.teamcompare.CompareTeamFlowState;
import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import o.getShort;
import o.runAnimators;
import org.apache.http.message.TokenParser;
/* loaded from: classes6.dex */
public final class PayIfYouWinFlowState extends FlowState {
    private static long ag$a = 5008816584717203730L;
    private static int ah$a = 0;
    private static char toString = 0;
    private static int valueOf = 0;
    private static int values = 1;
    private final String contestId;
    private final int roundId;
    private final String roundStatus;
    private String source;
    private final int tourId;
    private final int userId;
    private final String wnplDisplayImg;
    private final int wnplThresholdAmount;
    private final String wnplTitleText;

    public static /* synthetic */ PayIfYouWinFlowState copy$default(PayIfYouWinFlowState payIfYouWinFlowState, int i, int i2, int i3, String str, String str2, int i4, String str3, String str4, String str5, int i5, Object obj) {
        int i6;
        String str6;
        int i7;
        String str7;
        String str8;
        if ((i5 & 1) != 0) {
            try {
                int i8 = values + 15;
                ah$a = i8 % 128;
                if (i8 % 2 != 0) {
                    i6 = payIfYouWinFlowState.roundId;
                    int i9 = 97 / 0;
                } else {
                    i6 = payIfYouWinFlowState.roundId;
                }
                int i10 = values + 85;
                ah$a = i10 % 128;
                int i11 = i10 % 2;
            } catch (Exception e) {
                throw e;
            }
        } else {
            i6 = i;
        }
        int i12 = (i5 & 2) != 0 ? payIfYouWinFlowState.userId : i2;
        int i13 = (i5 & 4) != 0 ? payIfYouWinFlowState.wnplThresholdAmount : i3;
        if ((i5 & 8) != 0) {
            int i14 = ah$a + 21;
            values = i14 % 128;
            int i15 = i14 % 2;
            str6 = payIfYouWinFlowState.wnplDisplayImg;
        } else {
            str6 = str;
        }
        String str9 = !((i5 & 16) != 0) ? str2 : payIfYouWinFlowState.wnplTitleText;
        if ((i5 & 32) != 0) {
            int i16 = ah$a + 37;
            values = i16 % 128;
            int i17 = i16 % 2;
            i7 = payIfYouWinFlowState.tourId;
        } else {
            i7 = i4;
        }
        if ((i5 & 64) != 0) {
            int i18 = ah$a + 51;
            values = i18 % 128;
            int i19 = i18 % 2;
            str7 = payIfYouWinFlowState.roundStatus;
        } else {
            str7 = str3;
        }
        if (((i5 & 128) != 0 ? '\n' : '.') != '.') {
            int i20 = ah$a + 35;
            values = i20 % 128;
            int i21 = i20 % 2;
            str8 = payIfYouWinFlowState.contestId;
        } else {
            str8 = str4;
        }
        return payIfYouWinFlowState.copy(i6, i12, i13, str6, str9, i7, str7, str8, ((i5 & 256) != 0 ? 'L' : 'T') != 'T' ? payIfYouWinFlowState.source : str5);
    }

    public final int component1() {
        int i = ah$a + 41;
        values = i % 128;
        int i2 = i % 2;
        int i3 = this.roundId;
        int i4 = values + 45;
        ah$a = i4 % 128;
        if ((i4 % 2 != 0 ? 'D' : '*') != 'D') {
            return i3;
        }
        int i5 = 92 / 0;
        return i3;
    }

    public final int component2() {
        int i;
        int i2 = ah$a + 77;
        values = i2 % 128;
        Object[] objArr = null;
        if ((i2 % 2 == 0 ? TokenParser.SP : 'W') != 'W') {
            i = this.userId;
            super.hashCode();
        } else {
            i = this.userId;
        }
        int i3 = values + 51;
        ah$a = i3 % 128;
        if ((i3 % 2 != 0 ? (char) 11 : (char) 17) != 11) {
            return i;
        }
        int length = objArr.length;
        return i;
    }

    public final int component3() {
        int i = values + 81;
        ah$a = i % 128;
        int i2 = i % 2;
        int i3 = this.wnplThresholdAmount;
        int i4 = ah$a + 103;
        values = i4 % 128;
        int i5 = i4 % 2;
        return i3;
    }

    public final String component4() {
        int i = values + 117;
        ah$a = i % 128;
        int i2 = i % 2;
        String str = this.wnplDisplayImg;
        int i3 = ah$a + 53;
        values = i3 % 128;
        if (!(i3 % 2 != 0)) {
            Object obj = null;
            super.hashCode();
            return str;
        }
        return str;
    }

    public final String component5() {
        int i = ah$a + 35;
        values = i % 128;
        int i2 = i % 2;
        try {
            String str = this.wnplTitleText;
            int i3 = ah$a + 111;
            values = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final int component6() {
        int i = values + 91;
        ah$a = i % 128;
        if (i % 2 == 0) {
            return this.tourId;
        }
        int i2 = this.tourId;
        Object[] objArr = null;
        int length = objArr.length;
        return i2;
    }

    public final String component7() {
        int i = ah$a + 89;
        values = i % 128;
        if ((i % 2 == 0 ? TokenParser.ESCAPE : 'U') != '\\') {
            return this.roundStatus;
        }
        try {
            String str = this.roundStatus;
            Object obj = null;
            super.hashCode();
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String component8() {
        int i = ah$a + 115;
        values = i % 128;
        if (!(i % 2 != 0)) {
            int i2 = 18 / 0;
            return this.contestId;
        }
        return this.contestId;
    }

    public final String component9() {
        try {
            int i = values + 69;
            try {
                ah$a = i % 128;
                int i2 = i % 2;
                String str = this.source;
                int i3 = values + 29;
                ah$a = i3 % 128;
                if ((i3 % 2 != 0 ? 'C' : (char) 26) != 26) {
                    int i4 = 1 / 0;
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

    public final PayIfYouWinFlowState copy(int i, int i2, int i3, String str, String str2, int i4, String str3, String str4, String str5) {
        runAnimators.ag$a(str, "wnplDisplayImg");
        runAnimators.ag$a(str2, "wnplTitleText");
        runAnimators.ag$a(str3, "roundStatus");
        runAnimators.ag$a(str4, CompareTeamFlowState.CONTEST_ID);
        runAnimators.ag$a(str5, ah$a(ViewConfiguration.getTapTimeout() >> 16, new char[]{10998, 54580, 11411, 28965}, new char[]{30994, 23847, 58405, 17794}, (char) (9516 - TextUtils.getOffsetAfter("", 0)), new char[]{43546, 34744, 36883, 31903, 11145, 15374}).intern());
        PayIfYouWinFlowState payIfYouWinFlowState = new PayIfYouWinFlowState(i, i2, i3, str, str2, i4, str3, str4, str5);
        int i5 = values + 117;
        ah$a = i5 % 128;
        int i6 = i5 % 2;
        return payIfYouWinFlowState;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PayIfYouWinFlowState) {
            try {
                PayIfYouWinFlowState payIfYouWinFlowState = (PayIfYouWinFlowState) obj;
                try {
                    if (this.roundId != payIfYouWinFlowState.roundId) {
                        return false;
                    }
                    if (this.userId != payIfYouWinFlowState.userId) {
                        int i = ah$a + 69;
                        values = i % 128;
                        int i2 = i % 2;
                        return false;
                    } else if (this.wnplThresholdAmount != payIfYouWinFlowState.wnplThresholdAmount) {
                        return false;
                    } else {
                        if (!runAnimators.values((Object) this.wnplDisplayImg, (Object) payIfYouWinFlowState.wnplDisplayImg)) {
                            int i3 = ah$a + 91;
                            values = i3 % 128;
                            int i4 = i3 % 2;
                            return false;
                        } else if (!runAnimators.values((Object) this.wnplTitleText, (Object) payIfYouWinFlowState.wnplTitleText)) {
                            int i5 = ah$a + 123;
                            values = i5 % 128;
                            int i6 = i5 % 2;
                            return false;
                        } else if (this.tourId != payIfYouWinFlowState.tourId) {
                            int i7 = ah$a + 7;
                            values = i7 % 128;
                            if (i7 % 2 == 0) {
                                Object obj2 = null;
                                super.hashCode();
                                return false;
                            }
                            return false;
                        } else {
                            if ((!runAnimators.values((Object) this.roundStatus, (Object) payIfYouWinFlowState.roundStatus) ? TokenParser.CR : TokenParser.SP) == '\r') {
                                int i8 = ah$a + 5;
                                values = i8 % 128;
                                int i9 = i8 % 2;
                                return false;
                            } else if (runAnimators.values((Object) this.contestId, (Object) payIfYouWinFlowState.contestId)) {
                                if (!(!runAnimators.values((Object) this.source, (Object) payIfYouWinFlowState.source))) {
                                    return true;
                                }
                                int i10 = values + 77;
                                ah$a = i10 % 128;
                                int i11 = i10 % 2;
                                return false;
                            } else {
                                return false;
                            }
                        }
                    }
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = values + 105;
        ah$a = i % 128;
        int i2 = i % 2;
        try {
            int hashCode = (((((((((((((((this.roundId * 31) + this.userId) * 31) + this.wnplThresholdAmount) * 31) + this.wnplDisplayImg.hashCode()) * 31) + this.wnplTitleText.hashCode()) * 31) + this.tourId) * 31) + this.roundStatus.hashCode()) * 31) + this.contestId.hashCode()) * 31) + this.source.hashCode();
            int i3 = values + 87;
            ah$a = i3 % 128;
            int i4 = i3 % 2;
            return hashCode;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.app.dream11.model.FlowState
    public String toString() {
        String str = "PayIfYouWinFlowState(roundId=" + this.roundId + ", userId=" + this.userId + ", wnplThresholdAmount=" + this.wnplThresholdAmount + ", wnplDisplayImg=" + this.wnplDisplayImg + ", wnplTitleText=" + this.wnplTitleText + ", tourId=" + this.tourId + ", roundStatus=" + this.roundStatus + ", contestId=" + this.contestId + ", source=" + this.source + ")";
        int i = values + 27;
        ah$a = i % 128;
        if ((i % 2 != 0 ? (char) 6 : 'Q') != 'Q') {
            int i2 = 84 / 0;
            return str;
        }
        return str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ PayIfYouWinFlowState(int r13, int r14, int r15, java.lang.String r16, java.lang.String r17, int r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, o.getTargetTypes r23) {
        /*
            r12 = this;
            r0 = r22
            r0 = r0 & 256(0x100, float:3.59E-43)
            r1 = 15
            r2 = 77
            if (r0 == 0) goto Ld
            r0 = 15
            goto Lf
        Ld:
            r0 = 77
        Lf:
            if (r0 == r2) goto L31
            int r0 = com.app.dream11.contest.PayIfYouWinFlowState.values
            int r0 = r0 + r1
            int r1 = r0 % 128
            com.app.dream11.contest.PayIfYouWinFlowState.ah$a = r1
            int r0 = r0 % 2
            r1 = 67
            if (r0 == 0) goto L21
            r0 = 67
            goto L23
        L21:
            r0 = 14
        L23:
            if (r0 == r1) goto L26
            goto L2a
        L26:
            r0 = 21
            int r0 = r0 / 0
        L2a:
            java.lang.String r0 = ""
            r11 = r0
            goto L33
        L2e:
            r0 = move-exception
            r1 = r0
            throw r1
        L31:
            r11 = r21
        L33:
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.contest.PayIfYouWinFlowState.<init>(int, int, int, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, o.getTargetTypes):void");
    }

    public final int getRoundId() {
        int i = values + 119;
        ah$a = i % 128;
        int i2 = i % 2;
        int i3 = this.roundId;
        int i4 = ah$a + 85;
        values = i4 % 128;
        if ((i4 % 2 == 0 ? '7' : '5') != '7') {
            return i3;
        }
        Object obj = null;
        super.hashCode();
        return i3;
    }

    public final int getUserId() {
        int i = ah$a + 49;
        values = i % 128;
        if ((i % 2 == 0 ? (char) 16 : '+') != 16) {
            return this.userId;
        }
        try {
            int i2 = 97 / 0;
            return this.userId;
        } catch (Exception e) {
            throw e;
        }
    }

    public final int getWnplThresholdAmount() {
        try {
            int i = ah$a + 41;
            values = i % 128;
            int i2 = i % 2;
            int i3 = this.wnplThresholdAmount;
            int i4 = ah$a + 47;
            values = i4 % 128;
            if ((i4 % 2 == 0 ? (char) 5 : (char) 25) != 5) {
                return i3;
            }
            int i5 = 24 / 0;
            return i3;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String getWnplDisplayImg() {
        int i = ah$a + 121;
        values = i % 128;
        if (i % 2 == 0) {
            String str = this.wnplDisplayImg;
            Object obj = null;
            super.hashCode();
            return str;
        }
        return this.wnplDisplayImg;
    }

    public final String getWnplTitleText() {
        int i = ah$a + 85;
        values = i % 128;
        int i2 = i % 2;
        String str = this.wnplTitleText;
        try {
            int i3 = values + 49;
            ah$a = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final int getTourId() {
        int i = ah$a + 19;
        values = i % 128;
        if (i % 2 != 0) {
            return this.tourId;
        }
        int i2 = this.tourId;
        Object[] objArr = null;
        int length = objArr.length;
        return i2;
    }

    public final String getRoundStatus() {
        try {
            int i = values + 39;
            ah$a = i % 128;
            if (i % 2 != 0) {
                int i2 = 51 / 0;
                return this.roundStatus;
            }
            try {
                return this.roundStatus;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final String getContestId() {
        int i = values + 73;
        ah$a = i % 128;
        int i2 = i % 2;
        String str = this.contestId;
        int i3 = ah$a + 79;
        values = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public final String getSource() {
        int i = values + 69;
        ah$a = i % 128;
        int i2 = i % 2;
        String str = this.source;
        int i3 = values + 85;
        ah$a = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public final void setSource(String str) {
        try {
            int i = values + 7;
            ah$a = i % 128;
            int i2 = i % 2;
            runAnimators.ag$a(str, "<set-?>");
            this.source = str;
            int i3 = values + 69;
            ah$a = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayIfYouWinFlowState(int i, int i2, int i3, String str, String str2, int i4, String str3, String str4, String str5) {
        super(FlowStates.PAY_IF_YOU_WIN, null, 2, null);
        runAnimators.ag$a(str, "wnplDisplayImg");
        runAnimators.ag$a(str2, "wnplTitleText");
        runAnimators.ag$a(str3, "roundStatus");
        runAnimators.ag$a(str4, CompareTeamFlowState.CONTEST_ID);
        runAnimators.ag$a(str5, ah$a(1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new char[]{10998, 54580, 11411, 28965}, new char[]{30994, 23847, 58405, 17794}, (char) (ImageFormat.getBitsPerPixel(0) + 9517), new char[]{43546, 34744, 36883, 31903, 11145, 15374}).intern());
        this.roundId = i;
        this.userId = i2;
        this.wnplThresholdAmount = i3;
        this.wnplDisplayImg = str;
        this.wnplTitleText = str2;
        this.tourId = i4;
        this.roundStatus = str3;
        this.contestId = str4;
        this.source = str5;
    }

    private static String ah$a(int i, char[] cArr, char[] cArr2, char c, char[] cArr3) {
        String str;
        synchronized (getShort.toString) {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr2.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            getShort.valueOf = 0;
            while (getShort.valueOf < length) {
                int i2 = (getShort.valueOf + 2) % 4;
                int i3 = (getShort.valueOf + 3) % 4;
                getShort.values = (char) (((cArr4[getShort.valueOf % 4] * 32718) + cArr5[i2]) % 65535);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                cArr4[i3] = getShort.values;
                cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr3[getShort.valueOf]) ^ ag$a) ^ valueOf) ^ toString);
                getShort.valueOf++;
            }
            str = new String(cArr6);
        }
        return str;
    }
}

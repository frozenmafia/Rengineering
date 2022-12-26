package com.app.dream11.contest;

import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import o.isClosed;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ContestHomeFlowState extends FlowState {
    private static int toString = 0;
    private static int valueOf = 1;
    private static char[] values = {141, 139, 154, 157, 151, 155};
    private final String keyLaunchData;
    private final String keyLiveMatchAvailable;
    private final String keyMatchId;
    private final String keySource;
    private final String keyTourId;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ContestHomeFlowState(java.lang.String r8, java.lang.String r9, int r10, int r11, java.lang.Boolean r12, java.lang.String r13, int r14, o.getTargetTypes r15) {
        /*
            r7 = this;
            r14 = r14 & 32
            r15 = 85
            if (r14 == 0) goto L9
            r14 = 85
            goto Lb
        L9:
            r14 = 64
        Lb:
            if (r14 == r15) goto Lf
        Ld:
            r6 = r13
            goto L25
        Lf:
            int r13 = com.app.dream11.contest.ContestHomeFlowState.valueOf
            int r13 = r13 + 111
            int r14 = r13 % 128
            com.app.dream11.contest.ContestHomeFlowState.toString = r14
            int r13 = r13 % 2
            r13 = 0
            int r14 = com.app.dream11.contest.ContestHomeFlowState.valueOf
            int r14 = r14 + 7
            int r15 = r14 % 128
            com.app.dream11.contest.ContestHomeFlowState.toString = r15
            int r14 = r14 % 2
            goto Ld
        L25:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.contest.ContestHomeFlowState.<init>(java.lang.String, java.lang.String, int, int, java.lang.Boolean, java.lang.String, int, o.getTargetTypes):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContestHomeFlowState(String str, String str2, int i, int i2, Boolean bool, String str3) {
        super(FlowStates.LEAGUE_LIST, null, str);
        runAnimators.ag$a(str, FlowState.WLS_SLUG);
        this.keyTourId = "tourID";
        this.keyMatchId = "roundID";
        this.keyLaunchData = "launchData";
        this.keyLiveMatchAvailable = "isLiveMatchAvailable";
        this.keySource = toString(true, new int[]{0, 6, 40, 6}, null).intern();
        putExtra("tourID", Integer.valueOf(i));
        putExtra("roundID", Integer.valueOf(i2));
        putExtra("launchData", str2);
        putExtra("isLiveMatchAvailable", bool);
        putExtra(toString(true, new int[]{0, 6, 40, 6}, null).intern(), str3);
    }

    private static String toString(boolean z, int[] iArr, byte[] bArr) {
        String str;
        synchronized (isClosed.ah$a) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(values, i, cArr, 0, i2);
            if (bArr != null) {
                char[] cArr2 = new char[i2];
                isClosed.ag$a = 0;
                char c = 0;
                while (isClosed.ag$a < i2) {
                    if (bArr[isClosed.ag$a] == 1) {
                        cArr2[isClosed.ag$a] = (char) (((cArr[isClosed.ag$a] << 1) + 1) - c);
                    } else {
                        cArr2[isClosed.ag$a] = (char) ((cArr[isClosed.ag$a] << 1) - c);
                    }
                    c = cArr2[isClosed.ag$a];
                    isClosed.ag$a++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                isClosed.ag$a = 0;
                while (isClosed.ag$a < i2) {
                    cArr4[isClosed.ag$a] = cArr[(i2 - isClosed.ag$a) - 1];
                    isClosed.ag$a++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                isClosed.ag$a = 0;
                while (isClosed.ag$a < i2) {
                    cArr[isClosed.ag$a] = (char) (cArr[isClosed.ag$a] - iArr[2]);
                    isClosed.ag$a++;
                }
            }
            str = new String(cArr);
        }
        return str;
    }
}

package com.app.dream11.chat.chatflowstates;

import android.graphics.PointF;
import android.text.TextUtils;
import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import o.isLast;
import o.runAnimators;
/* loaded from: classes.dex */
public final class CreateAutomaticContest extends FlowState {
    private static int ag$a = 0;
    private static char[] ah$a = {310, 306, 312, 309, 294, 296};
    private static int invoke = 1;
    private static boolean toString = true;
    private static int valueOf = 195;
    private static boolean values = true;
    private final String groupId;
    private final String source;

    public CreateAutomaticContest() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ CreateAutomaticContest(java.lang.String r3, java.lang.String r4, int r5, o.getTargetTypes r6) {
        /*
            r2 = this;
            r6 = r5 & 1
            if (r6 == 0) goto L6
            r6 = 0
            goto L7
        L6:
            r6 = 1
        L7:
            r0 = 0
            java.lang.String r1 = ""
            if (r6 == 0) goto Ld
            goto L20
        Ld:
            int r3 = com.app.dream11.chat.chatflowstates.CreateAutomaticContest.invoke
            int r3 = r3 + 125
            int r6 = r3 % 128
            com.app.dream11.chat.chatflowstates.CreateAutomaticContest.ag$a = r6
            int r3 = r3 % 2
            if (r3 == 0) goto L1f
            super.hashCode()     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r3 = move-exception
            throw r3
        L1f:
            r3 = r1
        L20:
            r5 = r5 & 2
            if (r5 == 0) goto L41
            int r4 = com.app.dream11.chat.chatflowstates.CreateAutomaticContest.invoke     // Catch: java.lang.Exception -> L3f
            int r4 = r4 + 71
            int r5 = r4 % 128
            com.app.dream11.chat.chatflowstates.CreateAutomaticContest.ag$a = r5     // Catch: java.lang.Exception -> L3f
            int r4 = r4 % 2
            r5 = 10
            if (r4 == 0) goto L35
            r4 = 10
            goto L37
        L35:
            r4 = 28
        L37:
            if (r4 == r5) goto L3a
            goto L3b
        L3a:
            int r4 = r0.length     // Catch: java.lang.Throwable -> L3d
        L3b:
            r4 = r1
            goto L41
        L3d:
            r3 = move-exception
            throw r3
        L3f:
            r3 = move-exception
            throw r3
        L41:
            r2.<init>(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.chat.chatflowstates.CreateAutomaticContest.<init>(java.lang.String, java.lang.String, int, o.getTargetTypes):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateAutomaticContest(String str, String str2) {
        super(FlowStates.CREATE_AUTOMATIC_CONTEST, null, 2, null);
        runAnimators.ag$a(str, "groupId");
        runAnimators.ag$a(str2, ag$a(null, null, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 128, new byte[]{-122, -123, -124, -125, -126, -127}).intern());
        this.groupId = "groupId";
        this.source = ag$a(null, null, 127 - TextUtils.indexOf("", "", 0), new byte[]{-122, -123, -124, -125, -126, -127}).intern();
        putExtra(str, str);
        putExtra(str2, str2);
    }

    public final String getGroupId() {
        int i = ag$a + 103;
        invoke = i % 128;
        int i2 = i % 2;
        String string = getString("groupId", "");
        int i3 = ag$a + 65;
        invoke = i3 % 128;
        if ((i3 % 2 == 0 ? 'M' : '\t') != '\t') {
            Object obj = null;
            super.hashCode();
            return string;
        }
        return string;
    }

    public final String getSource() {
        int i = invoke + 87;
        ag$a = i % 128;
        String string = getString((!(i % 2 != 0) ? ag$a(null, null, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, new byte[]{-122, -123, -124, -125, -126, -127}) : ag$a(null, null, 56 >>> (PointF.length(0.0f, 1.0f) > 2.0f ? 1 : (PointF.length(0.0f, 1.0f) == 2.0f ? 0 : -1)), new byte[]{-122, -123, -124, -125, -126, -127})).intern(), "");
        int i2 = ag$a + 97;
        invoke = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    private static String ag$a(char[] cArr, int[] iArr, int i, byte[] bArr) {
        synchronized (isLast.valueOf) {
            char[] cArr2 = ah$a;
            int i2 = valueOf;
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
            } else if (values) {
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

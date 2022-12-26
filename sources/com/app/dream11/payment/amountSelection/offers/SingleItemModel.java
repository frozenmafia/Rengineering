package com.app.dream11.payment.amountSelection.offers;

import android.os.Process;
import android.view.KeyEvent;
import java.io.Serializable;
import o.getShort;
import o.runAnimators;
import org.apache.http.message.TokenParser;
/* loaded from: classes3.dex */
public final class SingleItemModel implements Serializable {
    private static long ag$a = 0;
    private static int ah$a = 0;
    private static char toString = 58253;
    private static int valueOf = 1;
    private static int values;
    private final Integer iconRsrcId;
    private final String subtitle;
    private final String title;
    private final String tooltipString;
    private final String value;

    public SingleItemModel(String str, String str2, Integer num, String str3, String str4) {
        runAnimators.ag$a(str, valueOf((Process.myPid() >> 22) + 450502210, new char[]{17135, 55838, 22554, 27815}, new char[]{0, 0, 0, 0}, (char) (KeyEvent.getDeadChar(0, 0) + 42840), new char[]{53450, 60067, 35438, 58782, 855}).intern());
        this.title = str;
        this.subtitle = str2;
        this.iconRsrcId = num;
        this.value = str3;
        this.tooltipString = str4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ SingleItemModel(java.lang.String r7, java.lang.String r8, java.lang.Integer r9, java.lang.String r10, java.lang.String r11, int r12, o.getTargetTypes r13) {
        /*
            r6 = this;
            r12 = r12 & 16
            r13 = 0
            r0 = 1
            if (r12 == 0) goto L8
            r12 = 0
            goto L9
        L8:
            r12 = 1
        L9:
            if (r12 == 0) goto Ld
        Lb:
            r5 = r11
            goto L23
        Ld:
            int r11 = com.app.dream11.payment.amountSelection.offers.SingleItemModel.valueOf
            int r11 = r11 + 95
            int r12 = r11 % 128
            com.app.dream11.payment.amountSelection.offers.SingleItemModel.ah$a = r12
            int r11 = r11 % 2
            if (r11 == 0) goto L1a
            goto L1b
        L1a:
            r13 = 1
        L1b:
            if (r13 == 0) goto L1e
            goto L20
        L1e:
            r11 = 0
            int r11 = r11.length     // Catch: java.lang.Throwable -> L2c
        L20:
            java.lang.String r11 = ""
            goto Lb
        L23:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L2c:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.payment.amountSelection.offers.SingleItemModel.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, int, o.getTargetTypes):void");
    }

    public final String getTitle() {
        String str;
        int i = valueOf + 71;
        ah$a = i % 128;
        if (i % 2 != 0) {
            try {
                str = this.title;
                Object obj = null;
                super.hashCode();
            } catch (Exception e) {
                throw e;
            }
        } else {
            str = this.title;
        }
        int i2 = ah$a + 67;
        valueOf = i2 % 128;
        if ((i2 % 2 == 0 ? 'H' : '3') != 'H') {
            return str;
        }
        int i3 = 53 / 0;
        return str;
    }

    public final String getSubtitle() {
        String str;
        int i = valueOf + 121;
        ah$a = i % 128;
        Object[] objArr = null;
        if ((i % 2 != 0 ? 'a' : TokenParser.SP) != 'a') {
            try {
                str = this.subtitle;
            } catch (Exception e) {
                throw e;
            }
        } else {
            str = this.subtitle;
            int length = objArr.length;
        }
        int i2 = ah$a + 91;
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        super.hashCode();
        return str;
    }

    public final Integer getIconRsrcId() {
        int i = ah$a + 19;
        valueOf = i % 128;
        int i2 = i % 2;
        Integer num = this.iconRsrcId;
        try {
            int i3 = ah$a + 65;
            valueOf = i3 % 128;
            if ((i3 % 2 == 0 ? '7' : 'T') != '7') {
                return num;
            }
            Object obj = null;
            super.hashCode();
            return num;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String getValue() {
        int i = ah$a + 17;
        valueOf = i % 128;
        if (i % 2 == 0) {
            int i2 = 25 / 0;
            return this.value;
        }
        try {
            return this.value;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String getTooltipString() {
        String str;
        try {
            int i = valueOf + 83;
            ah$a = i % 128;
            Object[] objArr = null;
            if (i % 2 == 0) {
                str = this.tooltipString;
            } else {
                str = this.tooltipString;
                super.hashCode();
            }
            int i2 = valueOf + 113;
            try {
                ah$a = i2 % 128;
                if (!(i2 % 2 != 0)) {
                    return str;
                }
                int length = objArr.length;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String valueOf(int i, char[] cArr, char[] cArr2, char c, char[] cArr3) {
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
                cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr3[getShort.valueOf]) ^ ag$a) ^ values) ^ toString);
                getShort.valueOf++;
            }
            str = new String(cArr6);
        }
        return str;
    }
}

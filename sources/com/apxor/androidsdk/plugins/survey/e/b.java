package com.apxor.androidsdk.plugins.survey.e;

import android.graphics.Color;
import android.view.KeyEvent;
import o.isFirst;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class b extends JSONObject {
    private static int ag$a = 1;
    private static int ah$a = 0;
    private static char[] valueOf = {13811, 13813, 13822, 13812};
    private static char values = 2;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(String str) {
        super(str);
    }

    public String a() {
        try {
            int i = ag$a + 65;
            ah$a = i % 128;
            int i2 = i % 2;
            String optString = optString("value");
            int i3 = ah$a + 63;
            ag$a = i3 % 128;
            int i4 = i3 % 2;
            return optString;
        } catch (Exception e) {
            throw e;
        }
    }

    public int b() {
        int i = ah$a + 63;
        ag$a = i % 128;
        int i2 = i % 2;
        int optInt = optInt(ah$a((byte) (1 - ((byte) KeyEvent.getModifierMetaStateMask())), new char[]{2, 0}, Color.blue(0) + 2).intern(), -1);
        int i3 = ag$a + 63;
        ah$a = i3 % 128;
        if (!(i3 % 2 == 0)) {
            Object obj = null;
            super.hashCode();
            return optInt;
        }
        return optInt;
    }

    public int c() {
        int optInt;
        int i = ag$a + 105;
        ah$a = i % 128;
        if (i % 2 == 0) {
            optInt = optInt("next_question_id", -1);
        } else {
            optInt = optInt("next_question_id", -1);
            int i2 = 90 / 0;
        }
        int i3 = ag$a + 73;
        ah$a = i3 % 128;
        int i4 = i3 % 2;
        return optInt;
    }

    public boolean d() {
        try {
            int i = ag$a + 59;
            ah$a = i % 128;
            boolean optBoolean = (i % 2 != 0 ? (char) 0 : 'C') != 'C' ? optBoolean("is_other", true) : optBoolean("is_other", false);
            int i2 = ag$a + 33;
            ah$a = i2 % 128;
            int i3 = i2 % 2;
            return optBoolean;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String ah$a(byte b2, char[] cArr, int i) {
        int i2;
        String str;
        synchronized (isFirst.HaptikSDK$b) {
            char[] cArr2 = valueOf;
            char c = values;
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr3[i2] = (char) (cArr[i2] - b2);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                isFirst.valueOf = 0;
                while (isFirst.valueOf < i2) {
                    isFirst.toString = cArr[isFirst.valueOf];
                    isFirst.ah$a = cArr[isFirst.valueOf + 1];
                    if (isFirst.toString == isFirst.ah$a) {
                        cArr3[isFirst.valueOf] = (char) (isFirst.toString - b2);
                        cArr3[isFirst.valueOf + 1] = (char) (isFirst.ah$a - b2);
                    } else {
                        isFirst.ag$a = isFirst.toString / c;
                        isFirst.invoke = isFirst.toString % c;
                        isFirst.values = isFirst.ah$a / c;
                        isFirst.ah$b = isFirst.ah$a % c;
                        if (isFirst.invoke == isFirst.ah$b) {
                            isFirst.ag$a = ((isFirst.ag$a + c) - 1) % c;
                            isFirst.values = ((isFirst.values + c) - 1) % c;
                            int i3 = (isFirst.ag$a * c) + isFirst.invoke;
                            int i4 = (isFirst.values * c) + isFirst.ah$b;
                            cArr3[isFirst.valueOf] = cArr2[i3];
                            cArr3[isFirst.valueOf + 1] = cArr2[i4];
                        } else if (isFirst.ag$a == isFirst.values) {
                            isFirst.invoke = ((isFirst.invoke + c) - 1) % c;
                            isFirst.ah$b = ((isFirst.ah$b + c) - 1) % c;
                            int i5 = (isFirst.ag$a * c) + isFirst.invoke;
                            int i6 = (isFirst.values * c) + isFirst.ah$b;
                            cArr3[isFirst.valueOf] = cArr2[i5];
                            cArr3[isFirst.valueOf + 1] = cArr2[i6];
                        } else {
                            int i7 = (isFirst.ag$a * c) + isFirst.ah$b;
                            int i8 = (isFirst.values * c) + isFirst.invoke;
                            cArr3[isFirst.valueOf] = cArr2[i7];
                            cArr3[isFirst.valueOf + 1] = cArr2[i8];
                        }
                    }
                    isFirst.valueOf += 2;
                }
            }
            for (int i9 = 0; i9 < i; i9++) {
                cArr3[i9] = (char) (cArr3[i9] ^ 13722);
            }
            str = new String(cArr3);
        }
        return str;
    }
}

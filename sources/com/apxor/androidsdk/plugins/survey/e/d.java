package com.apxor.androidsdk.plugins.survey.e;

import o.isClosed;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public abstract class d extends JSONObject {
    private static int toString = 1;
    private static char[] valueOf = {'2', 'f', 140, 274, 274, 276, 268};
    private static int values;
    private boolean a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(String str) {
        super(str);
        this.a = false;
    }

    public abstract int a();

    public void a(boolean z) {
        int i = values + 85;
        toString = i % 128;
        boolean z2 = i % 2 == 0;
        this.a = z;
        if (z2) {
            Object obj = null;
            super.hashCode();
        }
    }

    public int b() {
        int i = toString + 25;
        values = i % 128;
        int optInt = optInt((!(i % 2 != 0) ? ag$a(true, new int[]{0, 2, 0, 0}, new byte[]{0, 1}) : ag$a(true, new int[]{0, 2, 0, 0}, new byte[]{0, 1})).intern(), -1);
        int i2 = values + 49;
        toString = i2 % 128;
        int i3 = i2 % 2;
        return optInt;
    }

    public String c() {
        try {
            int i = values + 15;
            try {
                toString = i % 128;
                Object obj = null;
                if ((i % 2 == 0 ? (char) 20 : (char) 27) != 20) {
                    return optString("submit_text", null);
                }
                String optString = optString("submit_text", null);
                super.hashCode();
                return optString;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public String d() {
        int i = toString + 107;
        values = i % 128;
        int i2 = i % 2;
        String optString = optString(ag$a(false, new int[]{2, 5, 164, 0}, new byte[]{0, 1, 1, 0, 1}).intern(), "");
        int i3 = values + 53;
        toString = i3 % 128;
        int i4 = i3 % 2;
        return optString;
    }

    public boolean e() {
        try {
            if ((!this.a ? 'W' : '&') != 'W') {
                int i = values + 25;
                toString = i % 128;
                int i2 = i % 2;
                return true;
            }
            int i3 = toString + 35;
            values = i3 % 128;
            int i4 = i3 % 2;
            try {
                return optBoolean("is_required", false);
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public abstract boolean f();

    private static String ag$a(boolean z, int[] iArr, byte[] bArr) {
        String str;
        synchronized (isClosed.ah$a) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(valueOf, i, cArr, 0, i2);
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

package com.app.dream11.chat;

import android.graphics.Color;
import android.text.TextUtils;
import o.isFirst;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ChatSenderInfo {
    private static char[] ag$a = {13822, 13823, 13811, 13824};
    private static int ah$a = 0;
    private static int toString = 1;
    private static char valueOf = 2;
    private final String id;
    private final String profilePic;
    private final String teamName;

    public ChatSenderInfo(String str, String str2, String str3) {
        runAnimators.ag$a(str, toString((byte) (34 - Color.red(0)), new char[]{0, 2}, TextUtils.getCapsMode("", 0, 0) + 2).intern());
        runAnimators.ag$a(str2, "teamName");
        runAnimators.ag$a(str3, "profilePic");
        this.id = str;
        this.teamName = str2;
        this.profilePic = str3;
    }

    public final String getId() {
        try {
            int i = toString + 17;
            ah$a = i % 128;
            if ((i % 2 != 0 ? '\"' : 'b') != 'b') {
                try {
                    String str = this.id;
                    Object obj = null;
                    super.hashCode();
                    return str;
                } catch (Exception e) {
                    throw e;
                }
            }
            return this.id;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final String getProfilePic() {
        try {
            int i = ah$a + 55;
            toString = i % 128;
            int i2 = i % 2;
            String str = this.profilePic;
            int i3 = toString + 9;
            ah$a = i3 % 128;
            if (i3 % 2 != 0) {
                Object[] objArr = null;
                int length = objArr.length;
                return str;
            }
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String getTeamName() {
        int i = toString + 51;
        ah$a = i % 128;
        int i2 = i % 2;
        String str = this.teamName;
        try {
            int i3 = toString + 43;
            try {
                ah$a = i3 % 128;
                int i4 = i3 % 2;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String toString(byte b2, char[] cArr, int i) {
        int i2;
        String str;
        synchronized (isFirst.HaptikSDK$b) {
            char[] cArr2 = ag$a;
            char c = valueOf;
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

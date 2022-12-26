package com.app.dream11.chat;

import android.view.ViewConfiguration;
import o.getShort;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ChatChannelInfo {
    private static int ag$a = 0;
    private static int ah$a = 0;
    private static long toString = 3811736915531186514L;
    private static int valueOf = 1;
    private static char values;
    private final String coverUrl;
    private final String customType;
    private final String id;
    private final String name;

    public ChatChannelInfo(String str, String str2, String str3, String str4) {
        runAnimators.ag$a(str, values(ViewConfiguration.getMaximumDrawingCacheSize() >> 24, new char[]{55039, 55277, 31003, 60271}, new char[]{49490, 31610, 647, 13542}, (char) (28537 - (ViewConfiguration.getJumpTapTimeout() >> 16)), new char[]{58305, 62522}).intern());
        runAnimators.ag$a(str2, "name");
        runAnimators.ag$a(str3, "customType");
        runAnimators.ag$a(str4, "coverUrl");
        this.id = str;
        this.name = str2;
        this.customType = str3;
        this.coverUrl = str4;
    }

    public final String getCoverUrl() {
        int i = valueOf + 11;
        ah$a = i % 128;
        if ((i % 2 != 0 ? 'O' : '\f') != 'O') {
            return this.coverUrl;
        }
        String str = this.coverUrl;
        Object obj = null;
        super.hashCode();
        return str;
    }

    public final String getCustomType() {
        int i = ah$a + 59;
        valueOf = i % 128;
        int i2 = i % 2;
        String str = this.customType;
        int i3 = valueOf + 3;
        ah$a = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public final String getId() {
        int i = valueOf + 75;
        ah$a = i % 128;
        int i2 = i % 2;
        String str = this.id;
        try {
            int i3 = valueOf + 25;
            ah$a = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String getName() {
        int i = ah$a + 65;
        valueOf = i % 128;
        if (i % 2 == 0) {
            String str = this.name;
            Object obj = null;
            super.hashCode();
            return str;
        }
        return this.name;
    }

    private static String values(int i, char[] cArr, char[] cArr2, char c, char[] cArr3) {
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
                cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr3[getShort.valueOf]) ^ toString) ^ ag$a) ^ values);
                getShort.valueOf++;
            }
            str = new String(cArr6);
        }
        return str;
    }
}

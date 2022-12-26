package com.app.dream11.model;

import android.graphics.drawable.Drawable;
import o.isBeforeFirst;
/* loaded from: classes3.dex */
public enum LeagueSubType {
    FREEENTRY("freeEntry"),
    GRAND("grand"),
    DEFAULT(valueOf(new char[]{45262, 11134, 34734, 25560, 56859, 47795, 5880}, 39857 - Drawable.resolveOpacity(0, 0)).intern());
    
    private static int ah$a = 0;
    private static int toString = 1;
    private static long values;
    private final String title;

    static void valueOf() {
        values = -4892154848996380502L;
    }

    public static LeagueSubType valueOf(String str) {
        int i = toString + 109;
        ah$a = i % 128;
        int i2 = i % 2;
        try {
            LeagueSubType leagueSubType = (LeagueSubType) Enum.valueOf(LeagueSubType.class, str);
            int i3 = ah$a + 121;
            toString = i3 % 128;
            if ((i3 % 2 == 0 ? '$' : '9') != '$') {
                return leagueSubType;
            }
            Object obj = null;
            super.hashCode();
            return leagueSubType;
        } catch (Exception e) {
            throw e;
        }
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static LeagueSubType[] valuesCustom() {
        try {
            int i = toString + 113;
            try {
                ah$a = i % 128;
                int i2 = i % 2;
                LeagueSubType[] leagueSubTypeArr = (LeagueSubType[]) values().clone();
                int i3 = toString + 53;
                ah$a = i3 % 128;
                int i4 = i3 % 2;
                return leagueSubTypeArr;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    static {
        valueOf();
        int i = toString + 105;
        ah$a = i % 128;
        int i2 = i % 2;
    }

    LeagueSubType(String str) {
        try {
            this.title = str;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = ah$a + 17;
        toString = i % 128;
        if ((i % 2 == 0 ? 'N' : '^') != 'N') {
            return this.title;
        }
        String str = this.title;
        Object[] objArr = null;
        int length = objArr.length;
        return str;
    }

    private static String valueOf(char[] cArr, int i) {
        String str;
        synchronized (isBeforeFirst.toString) {
            isBeforeFirst.ah$a = i;
            char[] cArr2 = new char[cArr.length];
            isBeforeFirst.valueOf = 0;
            while (isBeforeFirst.valueOf < cArr.length) {
                cArr2[isBeforeFirst.valueOf] = (char) ((cArr[isBeforeFirst.valueOf] ^ (isBeforeFirst.valueOf * isBeforeFirst.ah$a)) ^ values);
                isBeforeFirst.valueOf++;
            }
            str = new String(cArr2);
        }
        return str;
    }
}

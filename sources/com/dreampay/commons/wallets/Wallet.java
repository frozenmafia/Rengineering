package com.dreampay.commons.wallets;

import android.os.SystemClock;
import android.view.ViewConfiguration;
import o.getShort;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class Wallet {
    private static final /* synthetic */ Wallet[] $VALUES;
    public static final Wallet AMAZONPAY;
    public static final Wallet MOBIKWIK;
    public static final Wallet PAYTM;
    public static final Wallet PHONEPE;
    private static char ag$a = 0;
    private static int ah$a = 0;
    private static int toString = 1;
    private static long valueOf;
    private static int values;

    private static final /* synthetic */ Wallet[] $values() {
        int i = toString + 43;
        ah$a = i % 128;
        int i2 = i % 2;
        try {
            Wallet[] walletArr = new Wallet[4];
            walletArr[0] = AMAZONPAY;
            walletArr[1] = PAYTM;
            walletArr[2] = MOBIKWIK;
            walletArr[3] = PHONEPE;
            int i3 = ah$a + 5;
            toString = i3 % 128;
            if (i3 % 2 != 0) {
                return walletArr;
            }
            int i4 = 6 / 0;
            return walletArr;
        } catch (Exception e) {
            throw e;
        }
    }

    static void ah$a() {
        values = 0;
        valueOf = -5757388615033843986L;
        ag$a = (char) 0;
    }

    public static Wallet valueOf(String str) {
        try {
            int i = ah$a + 117;
            toString = i % 128;
            int i2 = i % 2;
            Wallet wallet = (Wallet) Enum.valueOf(Wallet.class, str);
            int i3 = ah$a + 105;
            toString = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 84 / 0;
                return wallet;
            }
            return wallet;
        } catch (Exception e) {
            throw e;
        }
    }

    public static Wallet[] values() {
        int i = ah$a + 85;
        toString = i % 128;
        int i2 = i % 2;
        try {
            Wallet[] walletArr = (Wallet[]) $VALUES.clone();
            int i3 = ah$a + 89;
            toString = i3 % 128;
            if ((i3 % 2 == 0 ? '.' : ']') != ']') {
                Object obj = null;
                super.hashCode();
                return walletArr;
            }
            return walletArr;
        } catch (Exception e) {
            throw e;
        }
    }

    private Wallet(String str, int i) {
    }

    static {
        ah$a();
        AMAZONPAY = new Wallet(values((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 752377049, new char[]{10380, 10147, 30419, 56637}, new char[]{36590, 65287, 42382, 45081}, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), new char[]{65331, 51915, 5365, 37565, 36744, 61075, 47325, 7438, 31416}).intern(), 0);
        PAYTM = new Wallet("PAYTM", 1);
        MOBIKWIK = new Wallet("MOBIKWIK", 2);
        PHONEPE = new Wallet("PHONEPE", 3);
        $VALUES = $values();
        int i = ah$a + 57;
        toString = i % 128;
        int i2 = i % 2;
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
                cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr3[getShort.valueOf]) ^ valueOf) ^ values) ^ ag$a);
                getShort.valueOf++;
            }
            str = new String(cArr6);
        }
        return str;
    }
}

package com.dreampay.graphql.type;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import o.getTargetTypes;
import o.isAfterLast;
import org.apache.commons.codec.language.Soundex;
import org.apache.http.message.TokenParser;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class Wallet {
    private static final /* synthetic */ Wallet[] $VALUES;
    public static final Wallet AMAZONPAY;
    public static final Companion Companion;
    public static final Wallet MOBIKWIK;
    public static final Wallet PAYTM;
    public static final Wallet PHONEPE_WALLET;
    public static final Wallet UNKNOWN__;
    private static int toString = 0;
    private static int valueOf = 1;
    private static int values;
    private final String rawValue;

    private static final /* synthetic */ Wallet[] $values() {
        try {
            int i = valueOf + 73;
            values = i % 128;
            int i2 = i % 2;
            Wallet[] walletArr = {AMAZONPAY, PAYTM, MOBIKWIK, PHONEPE_WALLET, UNKNOWN__};
            int i3 = valueOf + 29;
            values = i3 % 128;
            if ((i3 % 2 != 0 ? '2' : 'K') != '2') {
                return walletArr;
            }
            Object[] objArr = null;
            int length = objArr.length;
            return walletArr;
        } catch (Exception e) {
            throw e;
        }
    }

    public static Wallet valueOf(String str) {
        int i = values + 29;
        valueOf = i % 128;
        int i2 = i % 2;
        Wallet wallet = (Wallet) Enum.valueOf(Wallet.class, str);
        int i3 = values + 85;
        valueOf = i3 % 128;
        if ((i3 % 2 == 0 ? (char) 28 : '+') != 28) {
            return wallet;
        }
        Object obj = null;
        super.hashCode();
        return wallet;
    }

    static void valueOf() {
        toString = 48;
    }

    public static Wallet[] values() {
        Wallet[] walletArr;
        int i = valueOf + 77;
        values = i % 128;
        if ((i % 2 != 0 ? 'a' : Soundex.SILENT_MARKER) != 'a') {
            walletArr = (Wallet[]) $VALUES.clone();
        } else {
            walletArr = (Wallet[]) $VALUES.clone();
            Object[] objArr = null;
            int length = objArr.length;
        }
        int i2 = valueOf + 33;
        values = i2 % 128;
        int i3 = i2 % 2;
        return walletArr;
    }

    private Wallet(String str, int i, String str2) {
        try {
            this.rawValue = str2;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String getRawValue() {
        String str;
        int i = valueOf + 83;
        values = i % 128;
        Object[] objArr = null;
        if (i % 2 == 0) {
            try {
                str = this.rawValue;
            } catch (Exception e) {
                throw e;
            }
        } else {
            str = this.rawValue;
            int length = objArr.length;
        }
        int i2 = values + 5;
        valueOf = i2 % 128;
        if ((i2 % 2 == 0 ? '\n' : '9') != '\n') {
            return str;
        }
        super.hashCode();
        return str;
    }

    static {
        valueOf();
        Object obj = null;
        AMAZONPAY = new Wallet(values(2 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 124 - View.resolveSizeAndState(0, 0, 0), true, 9 - Color.argb(0, 0, 0, 0), new char[]{1, 65525, TokenParser.CR, 65525, 4, 2, 3, 14, 65525}).intern(), 0, values(KeyEvent.normalizeMetaState(0) + 2, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 124, true, TextUtils.indexOf("", "", 0) + 9, new char[]{1, 65525, TokenParser.CR, 65525, 4, 2, 3, 14, 65525}).intern());
        PAYTM = new Wallet("PAYTM", 1, "PAYTM");
        MOBIKWIK = new Wallet("MOBIKWIK", 2, "MOBIKWIK");
        PHONEPE_WALLET = new Wallet("PHONEPE_WALLET", 3, "PHONEPE_WALLET");
        UNKNOWN__ = new Wallet("UNKNOWN__", 4, "UNKNOWN__");
        $VALUES = $values();
        Companion = new Companion(null);
        int i = valueOf + 5;
        values = i % 128;
        if (i % 2 == 0) {
            return;
        }
        super.hashCode();
    }

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }
    }

    private static String values(int i, int i2, boolean z, int i3, char[] cArr) {
        String str;
        synchronized (isAfterLast.valueOf) {
            char[] cArr2 = new char[i3];
            isAfterLast.values = 0;
            while (isAfterLast.values < i3) {
                isAfterLast.ag$a = cArr[isAfterLast.values];
                cArr2[isAfterLast.values] = (char) (isAfterLast.ag$a + i2);
                int i4 = isAfterLast.values;
                cArr2[i4] = (char) (cArr2[i4] - toString);
                isAfterLast.values++;
            }
            if (i > 0) {
                isAfterLast.toString = i;
                char[] cArr3 = new char[i3];
                System.arraycopy(cArr2, 0, cArr3, 0, i3);
                System.arraycopy(cArr3, 0, cArr2, i3 - isAfterLast.toString, isAfterLast.toString);
                System.arraycopy(cArr3, isAfterLast.toString, cArr2, 0, i3 - isAfterLast.toString);
            }
            if (z) {
                char[] cArr4 = new char[i3];
                isAfterLast.values = 0;
                while (isAfterLast.values < i3) {
                    cArr4[isAfterLast.values] = cArr2[(i3 - isAfterLast.values) - 1];
                    isAfterLast.values++;
                }
                cArr2 = cArr4;
            }
            str = new String(cArr2);
        }
        return str;
    }
}

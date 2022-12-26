package com.app.dream11.core.service.graphql.api.type;

import android.os.SystemClock;
import android.text.TextUtils;
import o.getTargetTypes;
import o.isBeforeFirst;
import o.runAnimators;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class WithdrawalType {
    private static int toString = 1;
    private static int valueOf;
    private final String rawValue;
    private static long ah$a = 7344233830670972974L;
    public static final WithdrawalType UPI = new WithdrawalType(values(new char[]{47227, 5027, 61405}, (SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 43996).intern(), 0, values(new char[]{47227, 5027, 61405}, 43996 - TextUtils.lastIndexOf("", '0', 0, 0)).intern());
    public static final WithdrawalType BANK = new WithdrawalType("BANK", 1, "BANK");
    public static final WithdrawalType UNKNOWN__ = new WithdrawalType("UNKNOWN__", 2, "UNKNOWN__");
    private static final /* synthetic */ WithdrawalType[] $VALUES = $values();
    public static final Companion Companion = new Companion(null);

    private static final /* synthetic */ WithdrawalType[] $values() {
        int i = toString + 121;
        valueOf = i % 128;
        int i2 = i % 2;
        try {
            WithdrawalType[] withdrawalTypeArr = {UPI, BANK, UNKNOWN__};
            int i3 = toString + 25;
            valueOf = i3 % 128;
            int i4 = i3 % 2;
            return withdrawalTypeArr;
        } catch (Exception e) {
            throw e;
        }
    }

    public static WithdrawalType valueOf(String str) {
        WithdrawalType withdrawalType;
        int i = toString + 19;
        valueOf = i % 128;
        if (!(i % 2 != 0)) {
            try {
                withdrawalType = (WithdrawalType) Enum.valueOf(WithdrawalType.class, str);
            } catch (Exception e) {
                throw e;
            }
        } else {
            withdrawalType = (WithdrawalType) Enum.valueOf(WithdrawalType.class, str);
            int i2 = 79 / 0;
        }
        int i3 = toString + 71;
        valueOf = i3 % 128;
        int i4 = i3 % 2;
        return withdrawalType;
    }

    public static WithdrawalType[] values() {
        int i = toString + 83;
        valueOf = i % 128;
        int i2 = i % 2;
        WithdrawalType[] withdrawalTypeArr = (WithdrawalType[]) $VALUES.clone();
        try {
            int i3 = toString + 87;
            valueOf = i3 % 128;
            int i4 = i3 % 2;
            return withdrawalTypeArr;
        } catch (Exception e) {
            throw e;
        }
    }

    private WithdrawalType(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public final String getRawValue() {
        int i = toString + 39;
        valueOf = i % 128;
        if (i % 2 != 0) {
            try {
                int i2 = 6 / 0;
                return this.rawValue;
            } catch (Exception e) {
                throw e;
            }
        }
        return this.rawValue;
    }

    static {
        int i = toString + 53;
        valueOf = i % 128;
        int i2 = i % 2;
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }

        public final WithdrawalType safeValueOf(String str) {
            WithdrawalType withdrawalType;
            runAnimators.ag$a(str, "rawValue");
            WithdrawalType[] values = WithdrawalType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    withdrawalType = null;
                    break;
                }
                withdrawalType = values[i];
                if (runAnimators.values((Object) withdrawalType.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return withdrawalType == null ? WithdrawalType.UNKNOWN__ : withdrawalType;
        }
    }

    private static String values(char[] cArr, int i) {
        String str;
        synchronized (isBeforeFirst.toString) {
            isBeforeFirst.ah$a = i;
            char[] cArr2 = new char[cArr.length];
            isBeforeFirst.valueOf = 0;
            while (isBeforeFirst.valueOf < cArr.length) {
                cArr2[isBeforeFirst.valueOf] = (char) ((cArr[isBeforeFirst.valueOf] ^ (isBeforeFirst.valueOf * isBeforeFirst.ah$a)) ^ ah$a);
                isBeforeFirst.valueOf++;
            }
            str = new String(cArr2);
        }
        return str;
    }
}

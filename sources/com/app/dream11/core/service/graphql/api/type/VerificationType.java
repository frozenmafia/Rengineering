package com.app.dream11.core.service.graphql.api.type;

import android.text.TextUtils;
import android.view.Gravity;
import o.getTargetTypes;
import o.isBeforeFirst;
import o.runAnimators;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class VerificationType {
    private static int toString = 1;
    private static int valueOf;
    private final String rawValue;
    private static long values = -6278578908992924003L;
    public static final VerificationType PAN = new VerificationType("PAN", 0, "PAN");
    public static final VerificationType BANK = new VerificationType("BANK", 1, "BANK");
    public static final VerificationType MOBILE = new VerificationType("MOBILE", 2, "MOBILE");
    public static final VerificationType EMAIL = new VerificationType("EMAIL", 3, "EMAIL");
    public static final VerificationType UPI = new VerificationType(valueOf(new char[]{38600, 34548, 46758}, 4153 - Gravity.getAbsoluteGravity(0, 0)).intern(), 4, valueOf(new char[]{38600, 34548, 46758}, TextUtils.indexOf("", "", 0) + 4153).intern());
    public static final VerificationType AADHAAR = new VerificationType("AADHAAR", 5, "AADHAAR");
    public static final VerificationType UNKNOWN__ = new VerificationType("UNKNOWN__", 6, "UNKNOWN__");
    private static final /* synthetic */ VerificationType[] $VALUES = $values();
    public static final Companion Companion = new Companion(null);

    private static final /* synthetic */ VerificationType[] $values() {
        int i = toString + 113;
        valueOf = i % 128;
        int i2 = i % 2;
        VerificationType[] verificationTypeArr = {PAN, BANK, MOBILE, EMAIL, UPI, AADHAAR, UNKNOWN__};
        int i3 = valueOf + 33;
        toString = i3 % 128;
        if ((i3 % 2 == 0 ? 'L' : 'G') != 'G') {
            Object obj = null;
            super.hashCode();
            return verificationTypeArr;
        }
        return verificationTypeArr;
    }

    public static VerificationType valueOf(String str) {
        int i = valueOf + 85;
        toString = i % 128;
        int i2 = i % 2;
        try {
            VerificationType verificationType = (VerificationType) Enum.valueOf(VerificationType.class, str);
            int i3 = toString + 45;
            valueOf = i3 % 128;
            int i4 = i3 % 2;
            return verificationType;
        } catch (Exception e) {
            throw e;
        }
    }

    public static VerificationType[] values() {
        int i = toString + 57;
        valueOf = i % 128;
        if ((i % 2 != 0 ? '\"' : (char) 14) != '\"') {
            return (VerificationType[]) $VALUES.clone();
        }
        VerificationType[] verificationTypeArr = (VerificationType[]) $VALUES.clone();
        Object obj = null;
        super.hashCode();
        return verificationTypeArr;
    }

    private VerificationType(String str, int i, String str2) {
        try {
            this.rawValue = str2;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String getRawValue() {
        int i = toString + 97;
        valueOf = i % 128;
        int i2 = i % 2;
        String str = this.rawValue;
        int i3 = toString + 45;
        valueOf = i3 % 128;
        if ((i3 % 2 != 0 ? (char) 0 : '#') != 0) {
            return str;
        }
        int i4 = 57 / 0;
        return str;
    }

    static {
        int i = valueOf + 65;
        toString = i % 128;
        int i2 = i % 2;
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }

        public final VerificationType safeValueOf(String str) {
            VerificationType verificationType;
            runAnimators.ag$a(str, "rawValue");
            VerificationType[] values = VerificationType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    verificationType = null;
                    break;
                }
                verificationType = values[i];
                if (runAnimators.values((Object) verificationType.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return verificationType == null ? VerificationType.UNKNOWN__ : verificationType;
        }
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

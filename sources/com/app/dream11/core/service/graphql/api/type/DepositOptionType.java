package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.isClosed;
import o.runAnimators;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class DepositOptionType {
    private static final /* synthetic */ DepositOptionType[] $VALUES;
    public static final DepositOptionType CARD;
    public static final Companion Companion;
    public static final DepositOptionType NETBANKING;
    public static final DepositOptionType UNKNOWN__;
    public static final DepositOptionType UPI;
    public static final DepositOptionType WALLET;
    private static int ah$a = 1;
    private static int valueOf;
    private static char[] values;
    private final String rawValue;

    private static final /* synthetic */ DepositOptionType[] $values() {
        try {
            int i = ah$a + 63;
            valueOf = i % 128;
            int i2 = i % 2;
            DepositOptionType[] depositOptionTypeArr = {CARD, NETBANKING, UPI, WALLET, UNKNOWN__};
            int i3 = ah$a + 65;
            valueOf = i3 % 128;
            int i4 = i3 % 2;
            return depositOptionTypeArr;
        } catch (Exception e) {
            throw e;
        }
    }

    static void ag$a() {
        values = new char[]{'/', 'd', 'g'};
    }

    public static DepositOptionType valueOf(String str) {
        try {
            int i = ah$a + 93;
            valueOf = i % 128;
            if (!(i % 2 == 0)) {
                try {
                    int i2 = 91 / 0;
                    return (DepositOptionType) Enum.valueOf(DepositOptionType.class, str);
                } catch (Exception e) {
                    throw e;
                }
            }
            return (DepositOptionType) Enum.valueOf(DepositOptionType.class, str);
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static DepositOptionType[] values() {
        try {
            int i = valueOf + 41;
            ah$a = i % 128;
            int i2 = i % 2;
            DepositOptionType[] depositOptionTypeArr = (DepositOptionType[]) $VALUES.clone();
            int i3 = ah$a + 113;
            valueOf = i3 % 128;
            int i4 = i3 % 2;
            return depositOptionTypeArr;
        } catch (Exception e) {
            throw e;
        }
    }

    private DepositOptionType(String str, int i, String str2) {
        try {
            this.rawValue = str2;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String getRawValue() {
        String str;
        try {
            int i = ah$a + 95;
            valueOf = i % 128;
            if (i % 2 != 0) {
                str = this.rawValue;
                int i2 = 17 / 0;
            } else {
                str = this.rawValue;
            }
            int i3 = ah$a + 97;
            valueOf = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    static {
        ag$a();
        CARD = new DepositOptionType("CARD", 0, "CARD");
        NETBANKING = new DepositOptionType("NETBANKING", 1, "NETBANKING");
        UPI = new DepositOptionType(ah$a(false, new int[]{0, 3, 21, 1}, new byte[]{0, 0, 1}).intern(), 2, ah$a(false, new int[]{0, 3, 21, 1}, new byte[]{0, 0, 1}).intern());
        WALLET = new DepositOptionType("WALLET", 3, "WALLET");
        UNKNOWN__ = new DepositOptionType("UNKNOWN__", 4, "UNKNOWN__");
        $VALUES = $values();
        Object[] objArr = null;
        Companion = new Companion(null);
        int i = valueOf + 35;
        ah$a = i % 128;
        if ((i % 2 == 0 ? ';' : (char) 18) != 18) {
            int length = objArr.length;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }

        public final DepositOptionType safeValueOf(String str) {
            DepositOptionType depositOptionType;
            runAnimators.ag$a(str, "rawValue");
            DepositOptionType[] values = DepositOptionType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    depositOptionType = null;
                    break;
                }
                depositOptionType = values[i];
                if (runAnimators.values((Object) depositOptionType.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return depositOptionType == null ? DepositOptionType.UNKNOWN__ : depositOptionType;
        }
    }

    private static String ah$a(boolean z, int[] iArr, byte[] bArr) {
        String str;
        synchronized (isClosed.ah$a) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(values, i, cArr, 0, i2);
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

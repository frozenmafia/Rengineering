package com.dreampay.graphql.type;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import o.getTargetTypes;
import o.moveToLast;
import o.runAnimators;
import org.apache.http.message.TokenParser;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class PaymentInstrumentTypes {
    private static final /* synthetic */ PaymentInstrumentTypes[] $VALUES;
    public static final PaymentInstrumentTypes CARD;
    public static final Companion Companion;
    private static int HaptikSDK$a = 0;
    private static int HaptikSDK$b = 1;
    public static final PaymentInstrumentTypes NETBANKING;
    public static final PaymentInstrumentTypes UNKNOWN__;
    public static final PaymentInstrumentTypes UPI;
    public static final PaymentInstrumentTypes WALLET;
    private static int ag$a;
    private static byte[] ah$a;
    private static short[] toString;
    private static int valueOf;
    private static int values;
    private final String rawValue;

    private static final /* synthetic */ PaymentInstrumentTypes[] $values() {
        int i = HaptikSDK$a + 39;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        PaymentInstrumentTypes[] paymentInstrumentTypesArr = {CARD, NETBANKING, UPI, WALLET, UNKNOWN__};
        int i3 = HaptikSDK$a + 119;
        HaptikSDK$b = i3 % 128;
        int i4 = i3 % 2;
        return paymentInstrumentTypesArr;
    }

    static void ah$a() {
        valueOf = 93;
        values = 161737870;
        ag$a = -421758066;
        ah$a = new byte[]{-90, -7, -5};
    }

    public static PaymentInstrumentTypes valueOf(String str) {
        try {
            int i = HaptikSDK$a + 95;
            HaptikSDK$b = i % 128;
            boolean z = i % 2 == 0;
            PaymentInstrumentTypes paymentInstrumentTypes = (PaymentInstrumentTypes) Enum.valueOf(PaymentInstrumentTypes.class, str);
            if (z) {
                Object obj = null;
                super.hashCode();
            }
            int i2 = HaptikSDK$a + 7;
            HaptikSDK$b = i2 % 128;
            if ((i2 % 2 == 0 ? (char) 26 : (char) 23) != 23) {
                int i3 = 60 / 0;
                return paymentInstrumentTypes;
            }
            return paymentInstrumentTypes;
        } catch (Exception e) {
            throw e;
        }
    }

    public static PaymentInstrumentTypes[] values() {
        int i = HaptikSDK$b + 115;
        HaptikSDK$a = i % 128;
        int i2 = i % 2;
        PaymentInstrumentTypes[] paymentInstrumentTypesArr = (PaymentInstrumentTypes[]) $VALUES.clone();
        int i3 = HaptikSDK$b + 77;
        HaptikSDK$a = i3 % 128;
        int i4 = i3 % 2;
        return paymentInstrumentTypesArr;
    }

    private PaymentInstrumentTypes(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public final String getRawValue() {
        String str;
        try {
            int i = HaptikSDK$a + 113;
            HaptikSDK$b = i % 128;
            if ((i % 2 == 0 ? (char) 4 : TokenParser.ESCAPE) != '\\') {
                str = this.rawValue;
                Object[] objArr = null;
                int length = objArr.length;
            } else {
                str = this.rawValue;
            }
            int i2 = HaptikSDK$b + 91;
            HaptikSDK$a = i2 % 128;
            int i3 = i2 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    static {
        ah$a();
        CARD = new PaymentInstrumentTypes("CARD", 0, "CARD");
        NETBANKING = new PaymentInstrumentTypes("NETBANKING", 1, "NETBANKING");
        UPI = new PaymentInstrumentTypes(toString((byte) KeyEvent.keyCodeFromString(""), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 94, (-161737785) - View.resolveSizeAndState(0, 0, 0), (short) (ViewConfiguration.getKeyRepeatTimeout() >> 16), View.MeasureSpec.getSize(0) + 421758066).intern(), 2, toString((byte) TextUtils.indexOf("", ""), View.resolveSize(0, 0) - 94, (ViewConfiguration.getDoubleTapTimeout() >> 16) - 161737785, (short) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), Color.rgb(0, 0, 0) + 438535282).intern());
        WALLET = new PaymentInstrumentTypes("WALLET", 3, "WALLET");
        UNKNOWN__ = new PaymentInstrumentTypes("UNKNOWN__", 4, "UNKNOWN__");
        $VALUES = $values();
        Companion = new Companion(null);
        int i = HaptikSDK$a + 39;
        HaptikSDK$b = i % 128;
        if (!(i % 2 != 0)) {
            int i2 = 17 / 0;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }

        public final PaymentInstrumentTypes safeValueOf(String str) {
            PaymentInstrumentTypes paymentInstrumentTypes;
            runAnimators.ag$a(str, "rawValue");
            PaymentInstrumentTypes[] values = PaymentInstrumentTypes.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    paymentInstrumentTypes = null;
                    break;
                }
                paymentInstrumentTypes = values[i];
                if (runAnimators.values((Object) paymentInstrumentTypes.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return paymentInstrumentTypes == null ? PaymentInstrumentTypes.UNKNOWN__ : paymentInstrumentTypes;
        }
    }

    private static String toString(byte b2, int i, int i2, short s, int i3) {
        String obj;
        synchronized (moveToLast.ah$a) {
            StringBuilder sb = new StringBuilder();
            int i4 = i + valueOf;
            boolean z = i4 == -1;
            if (z) {
                if (ah$a != null) {
                    i4 = (byte) (ah$a[ag$a + i3] + valueOf);
                } else {
                    i4 = (short) (toString[ag$a + i3] + valueOf);
                }
            }
            if (i4 > 0) {
                moveToLast.values = ((i3 + i4) - 2) + ag$a + (z ? 1 : 0);
                moveToLast.ag$a = (char) (i2 + values);
                sb.append(moveToLast.ag$a);
                moveToLast.toString = moveToLast.ag$a;
                moveToLast.valueOf = 1;
                while (moveToLast.valueOf < i4) {
                    if (ah$a != null) {
                        byte[] bArr = ah$a;
                        int i5 = moveToLast.values;
                        moveToLast.values = i5 - 1;
                        moveToLast.ag$a = (char) (moveToLast.toString + (((byte) (bArr[i5] + s)) ^ b2));
                    } else {
                        short[] sArr = toString;
                        int i6 = moveToLast.values;
                        moveToLast.values = i6 - 1;
                        moveToLast.ag$a = (char) (moveToLast.toString + (((short) (sArr[i6] + s)) ^ b2));
                    }
                    sb.append(moveToLast.ag$a);
                    moveToLast.toString = moveToLast.ag$a;
                    moveToLast.valueOf++;
                }
            }
            obj = sb.toString();
        }
        return obj;
    }
}

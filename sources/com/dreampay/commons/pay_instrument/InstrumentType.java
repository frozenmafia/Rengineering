package com.dreampay.commons.pay_instrument;

import android.text.TextUtils;
import o.getWantsAllOnMoveCalls;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class InstrumentType {
    private static int ah$a = 0;
    private static int values = 1;
    private static long valueOf = 5657002503537068884L;
    public static final InstrumentType WALLET = new InstrumentType("WALLET", 0);
    public static final InstrumentType UPI = new InstrumentType(values(new char[]{61016, 25808, 60941, 48328, 61396, 47033, 43561}, TextUtils.lastIndexOf("", '0', 0) + 1).intern(), 1);
    public static final InstrumentType CARD = new InstrumentType("CARD", 2);
    public static final InstrumentType NET_BANKING = new InstrumentType("NET_BANKING", 3);
    public static final InstrumentType UNKNOWN = new InstrumentType("UNKNOWN", 4);
    private static final /* synthetic */ InstrumentType[] $VALUES = $values();

    private static final /* synthetic */ InstrumentType[] $values() {
        int i = ah$a + 1;
        values = i % 128;
        int i2 = i % 2;
        InstrumentType[] instrumentTypeArr = {WALLET, UPI, CARD, NET_BANKING, UNKNOWN};
        int i3 = ah$a + 103;
        values = i3 % 128;
        if (!(i3 % 2 == 0)) {
            return instrumentTypeArr;
        }
        Object obj = null;
        super.hashCode();
        return instrumentTypeArr;
    }

    public static InstrumentType valueOf(String str) {
        int i = ah$a + 49;
        values = i % 128;
        int i2 = i % 2;
        InstrumentType instrumentType = (InstrumentType) Enum.valueOf(InstrumentType.class, str);
        try {
            int i3 = values + 65;
            try {
                ah$a = i3 % 128;
                if (!(i3 % 2 != 0)) {
                    return instrumentType;
                }
                Object[] objArr = null;
                int length = objArr.length;
                return instrumentType;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static InstrumentType[] values() {
        InstrumentType[] instrumentTypeArr;
        int i = values + 97;
        ah$a = i % 128;
        if (i % 2 != 0) {
            instrumentTypeArr = (InstrumentType[]) $VALUES.clone();
            int i2 = 93 / 0;
        } else {
            instrumentTypeArr = (InstrumentType[]) $VALUES.clone();
        }
        int i3 = ah$a + 55;
        values = i3 % 128;
        int i4 = i3 % 2;
        return instrumentTypeArr;
    }

    private InstrumentType(String str, int i) {
    }

    static {
        int i = values + 115;
        ah$a = i % 128;
        if ((i % 2 != 0 ? 'Y' : 'T') != 'Y') {
            return;
        }
        int i2 = 79 / 0;
    }

    private static String values(char[] cArr, int i) {
        String str;
        synchronized (getWantsAllOnMoveCalls.ag$a) {
            char[] getwantsallonmovecalls = getWantsAllOnMoveCalls.toString(valueOf, cArr, i);
            getWantsAllOnMoveCalls.values = 4;
            while (getWantsAllOnMoveCalls.values < getwantsallonmovecalls.length) {
                getWantsAllOnMoveCalls.toString = getWantsAllOnMoveCalls.values - 4;
                getwantsallonmovecalls[getWantsAllOnMoveCalls.values] = (char) ((getwantsallonmovecalls[getWantsAllOnMoveCalls.values] ^ getwantsallonmovecalls[getWantsAllOnMoveCalls.values % 4]) ^ (getWantsAllOnMoveCalls.toString * valueOf));
                getWantsAllOnMoveCalls.values++;
            }
            str = new String(getwantsallonmovecalls, 4, getwantsallonmovecalls.length - 4);
        }
        return str;
    }
}

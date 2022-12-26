package com.app.dream11.core.service.graphql.api.type;

import android.os.SystemClock;
import android.widget.ExpandableListView;
import o.getTargetTypes;
import o.getWantsAllOnMoveCalls;
import o.runAnimators;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class DepositChannel {
    private static int ah$a = 0;
    private static int values = 1;
    private final String rawValue;
    private static long valueOf = 2019537558200453213L;
    public static final DepositChannel AMAZONPAY = new DepositChannel(toString(new char[]{39823, 39886, 34798, 27961, 27727, 36862, 32194, 29954, 47796, 44657, 24391, 22149, 55614}, ExpandableListView.getPackedPositionType(0) + 1).intern(), 0, toString(new char[]{39823, 39886, 34798, 27961, 27727, 36862, 32194, 29954, 47796, 44657, 24391, 22149, 55614}, (SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1))).intern());
    public static final DepositChannel FREECHARGE = new DepositChannel("FREECHARGE", 1, "FREECHARGE");
    public static final DepositChannel MOBIKWIK = new DepositChannel("MOBIKWIK", 2, "MOBIKWIK");
    public static final DepositChannel GOOGLEPAY = new DepositChannel("GOOGLEPAY", 3, "GOOGLEPAY");
    public static final DepositChannel PAYTM = new DepositChannel("PAYTM", 4, "PAYTM");
    public static final DepositChannel PHONEPE = new DepositChannel("PHONEPE", 5, "PHONEPE");
    public static final DepositChannel UNKNOWN__ = new DepositChannel("UNKNOWN__", 6, "UNKNOWN__");
    private static final /* synthetic */ DepositChannel[] $VALUES = $values();
    public static final Companion Companion = new Companion(null);

    private static final /* synthetic */ DepositChannel[] $values() {
        int i = ah$a + 33;
        values = i % 128;
        int i2 = i % 2;
        DepositChannel[] depositChannelArr = {AMAZONPAY, FREECHARGE, MOBIKWIK, GOOGLEPAY, PAYTM, PHONEPE, UNKNOWN__};
        int i3 = values + 9;
        ah$a = i3 % 128;
        if (!(i3 % 2 != 0)) {
            return depositChannelArr;
        }
        Object obj = null;
        super.hashCode();
        return depositChannelArr;
    }

    public static DepositChannel valueOf(String str) {
        int i = ah$a + 85;
        values = i % 128;
        int i2 = i % 2;
        DepositChannel depositChannel = (DepositChannel) Enum.valueOf(DepositChannel.class, str);
        int i3 = values + 125;
        ah$a = i3 % 128;
        if (!(i3 % 2 != 0)) {
            return depositChannel;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return depositChannel;
    }

    public static DepositChannel[] values() {
        DepositChannel[] depositChannelArr;
        int i = values + 41;
        ah$a = i % 128;
        if ((i % 2 != 0 ? (char) 29 : ']') != ']') {
            try {
                depositChannelArr = (DepositChannel[]) $VALUES.clone();
                int i2 = 35 / 0;
            } catch (Exception e) {
                throw e;
            }
        } else {
            depositChannelArr = (DepositChannel[]) $VALUES.clone();
        }
        int i3 = values + 71;
        ah$a = i3 % 128;
        if ((i3 % 2 != 0 ? 'Q' : 'b') != 'b') {
            int i4 = 17 / 0;
            return depositChannelArr;
        }
        return depositChannelArr;
    }

    private DepositChannel(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public final String getRawValue() {
        int i = values + 39;
        ah$a = i % 128;
        if ((i % 2 != 0 ? 'F' : '@') != '@') {
            try {
                String str = this.rawValue;
                Object obj = null;
                super.hashCode();
                return str;
            } catch (Exception e) {
                throw e;
            }
        }
        return this.rawValue;
    }

    static {
        int i = values + 73;
        ah$a = i % 128;
        if (!(i % 2 != 0)) {
            return;
        }
        Object[] objArr = null;
        int length = objArr.length;
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }

        public final DepositChannel safeValueOf(String str) {
            DepositChannel depositChannel;
            runAnimators.ag$a(str, "rawValue");
            DepositChannel[] values = DepositChannel.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    depositChannel = null;
                    break;
                }
                depositChannel = values[i];
                if (runAnimators.values((Object) depositChannel.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return depositChannel == null ? DepositChannel.UNKNOWN__ : depositChannel;
        }
    }

    private static String toString(char[] cArr, int i) {
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

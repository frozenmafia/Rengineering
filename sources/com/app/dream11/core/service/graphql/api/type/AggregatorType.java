package com.app.dream11.core.service.graphql.api.type;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import o.getTargetTypes;
import o.isAfterLast;
import o.runAnimators;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class AggregatorType {
    private static final /* synthetic */ AggregatorType[] $VALUES;
    public static final Companion Companion;
    public static final AggregatorType DREAMPAY;
    public static final AggregatorType JUSPAY;
    public static final AggregatorType PAYTM;
    public static final AggregatorType UNKNOWN__;
    private static int ag$a = 0;
    private static int ah$a = 0;
    private static int toString = 1;
    private final String rawValue;

    private static final /* synthetic */ AggregatorType[] $values() {
        int i = toString + 97;
        ag$a = i % 128;
        int i2 = i % 2;
        AggregatorType[] aggregatorTypeArr = {DREAMPAY, JUSPAY, PAYTM, UNKNOWN__};
        int i3 = toString + 13;
        ag$a = i3 % 128;
        if (!(i3 % 2 == 0)) {
            Object obj = null;
            super.hashCode();
            return aggregatorTypeArr;
        }
        return aggregatorTypeArr;
    }

    public static AggregatorType valueOf(String str) {
        int i = ag$a + 115;
        toString = i % 128;
        int i2 = i % 2;
        AggregatorType aggregatorType = (AggregatorType) Enum.valueOf(AggregatorType.class, str);
        int i3 = toString + 117;
        ag$a = i3 % 128;
        if (!(i3 % 2 != 0)) {
            return aggregatorType;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return aggregatorType;
    }

    static void valueOf() {
        ah$a = 35;
    }

    public static AggregatorType[] values() {
        int i = ag$a + 95;
        toString = i % 128;
        int i2 = i % 2;
        AggregatorType[] aggregatorTypeArr = (AggregatorType[]) $VALUES.clone();
        int i3 = toString + 95;
        ag$a = i3 % 128;
        if (!(i3 % 2 == 0)) {
            int i4 = 15 / 0;
            return aggregatorTypeArr;
        }
        return aggregatorTypeArr;
    }

    private AggregatorType(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public final String getRawValue() {
        int i = ag$a + 5;
        toString = i % 128;
        int i2 = i % 2;
        String str = this.rawValue;
        int i3 = toString + 21;
        ag$a = i3 % 128;
        if ((i3 % 2 != 0 ? ']' : '8') != '8') {
            Object obj = null;
            super.hashCode();
            return str;
        }
        return str;
    }

    static {
        valueOf();
        DREAMPAY = new AggregatorType(toString((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 5, 109 - (ViewConfiguration.getKeyRepeatDelay() >> 16), true, View.resolveSizeAndState(0, 0, 0) + 8, new char[]{3, 65527, 65531, '\b', 65530, 15, 65527, 6}).intern(), 0, toString((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 5, 109 - Color.alpha(0), true, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 7, new char[]{3, 65527, 65531, '\b', 65530, 15, 65527, 6}).intern());
        JUSPAY = new AggregatorType("JUSPAY", 1, "JUSPAY");
        PAYTM = new AggregatorType("PAYTM", 2, "PAYTM");
        UNKNOWN__ = new AggregatorType("UNKNOWN__", 3, "UNKNOWN__");
        $VALUES = $values();
        Companion = new Companion(null);
        int i = toString + 3;
        ag$a = i % 128;
        if ((i % 2 != 0 ? (char) 31 : 'O') != 'O') {
            int i2 = 1 / 0;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }

        public final AggregatorType safeValueOf(String str) {
            AggregatorType aggregatorType;
            runAnimators.ag$a(str, "rawValue");
            AggregatorType[] values = AggregatorType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    aggregatorType = null;
                    break;
                }
                aggregatorType = values[i];
                if (runAnimators.values((Object) aggregatorType.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return aggregatorType == null ? AggregatorType.UNKNOWN__ : aggregatorType;
        }
    }

    private static String toString(int i, int i2, boolean z, int i3, char[] cArr) {
        String str;
        synchronized (isAfterLast.valueOf) {
            char[] cArr2 = new char[i3];
            isAfterLast.values = 0;
            while (isAfterLast.values < i3) {
                isAfterLast.ag$a = cArr[isAfterLast.values];
                cArr2[isAfterLast.values] = (char) (isAfterLast.ag$a + i2);
                int i4 = isAfterLast.values;
                cArr2[i4] = (char) (cArr2[i4] - ah$a);
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

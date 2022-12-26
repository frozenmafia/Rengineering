package com.google.type;

import o.ViewInfoStore;
import o.ViewInfoStore$ag$a;
import o.ViewInfoStore$ah$a;
/* loaded from: classes7.dex */
public enum CalendarPeriod implements ViewInfoStore$ah$a {
    CALENDAR_PERIOD_UNSPECIFIED(0),
    DAY(1),
    WEEK(2),
    FORTNIGHT(3),
    MONTH(4),
    QUARTER(5),
    HALF(6),
    YEAR(7),
    UNRECOGNIZED(-1);
    
    public static final int CALENDAR_PERIOD_UNSPECIFIED_VALUE = 0;
    public static final int DAY_VALUE = 1;
    public static final int FORTNIGHT_VALUE = 3;
    public static final int HALF_VALUE = 6;
    public static final int MONTH_VALUE = 4;
    public static final int QUARTER_VALUE = 5;
    public static final int WEEK_VALUE = 2;
    public static final int YEAR_VALUE = 7;
    private static final ViewInfoStore.values<CalendarPeriod> internalValueMap = new ViewInfoStore.values<CalendarPeriod>() { // from class: com.google.type.CalendarPeriod.5
        @Override // o.ViewInfoStore.values
        /* renamed from: valueOf */
        public CalendarPeriod ag$a(int i) {
            return CalendarPeriod.forNumber(i);
        }
    };
    private final int value;

    @Override // o.ViewInfoStore$ah$a
    public final int getNumber() {
        if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.value;
    }

    @Deprecated
    public static CalendarPeriod valueOf(int i) {
        return forNumber(i);
    }

    public static CalendarPeriod forNumber(int i) {
        switch (i) {
            case 0:
                return CALENDAR_PERIOD_UNSPECIFIED;
            case 1:
                return DAY;
            case 2:
                return WEEK;
            case 3:
                return FORTNIGHT;
            case 4:
                return MONTH;
            case 5:
                return QUARTER;
            case 6:
                return HALF;
            case 7:
                return YEAR;
            default:
                return null;
        }
    }

    public static ViewInfoStore.values<CalendarPeriod> internalGetValueMap() {
        return internalValueMap;
    }

    public static ViewInfoStore$ag$a internalGetVerifier() {
        return valueOf.toString;
    }

    /* loaded from: classes7.dex */
    static final class valueOf implements ViewInfoStore$ag$a {
        static final ViewInfoStore$ag$a toString = new valueOf();

        private valueOf() {
        }

        @Override // o.ViewInfoStore$ag$a
        public boolean values(int i) {
            return CalendarPeriod.forNumber(i) != null;
        }
    }

    CalendarPeriod(int i) {
        this.value = i;
    }
}

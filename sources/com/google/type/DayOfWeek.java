package com.google.type;

import o.ViewInfoStore;
import o.ViewInfoStore$ag$a;
import o.ViewInfoStore$ah$a;
/* loaded from: classes7.dex */
public enum DayOfWeek implements ViewInfoStore$ah$a {
    DAY_OF_WEEK_UNSPECIFIED(0),
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7),
    UNRECOGNIZED(-1);
    
    public static final int DAY_OF_WEEK_UNSPECIFIED_VALUE = 0;
    public static final int FRIDAY_VALUE = 5;
    public static final int MONDAY_VALUE = 1;
    public static final int SATURDAY_VALUE = 6;
    public static final int SUNDAY_VALUE = 7;
    public static final int THURSDAY_VALUE = 4;
    public static final int TUESDAY_VALUE = 2;
    public static final int WEDNESDAY_VALUE = 3;
    private static final ViewInfoStore.values<DayOfWeek> internalValueMap = new ViewInfoStore.values<DayOfWeek>() { // from class: com.google.type.DayOfWeek.1
        @Override // o.ViewInfoStore.values
        /* renamed from: ah$a */
        public DayOfWeek ag$a(int i) {
            return DayOfWeek.forNumber(i);
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
    public static DayOfWeek valueOf(int i) {
        return forNumber(i);
    }

    public static DayOfWeek forNumber(int i) {
        switch (i) {
            case 0:
                return DAY_OF_WEEK_UNSPECIFIED;
            case 1:
                return MONDAY;
            case 2:
                return TUESDAY;
            case 3:
                return WEDNESDAY;
            case 4:
                return THURSDAY;
            case 5:
                return FRIDAY;
            case 6:
                return SATURDAY;
            case 7:
                return SUNDAY;
            default:
                return null;
        }
    }

    public static ViewInfoStore.values<DayOfWeek> internalGetValueMap() {
        return internalValueMap;
    }

    public static ViewInfoStore$ag$a internalGetVerifier() {
        return values.ag$a;
    }

    /* loaded from: classes7.dex */
    static final class values implements ViewInfoStore$ag$a {
        static final ViewInfoStore$ag$a ag$a = new values();

        private values() {
        }

        @Override // o.ViewInfoStore$ag$a
        public boolean values(int i) {
            return DayOfWeek.forNumber(i) != null;
        }
    }

    DayOfWeek(int i) {
        this.value = i;
    }
}

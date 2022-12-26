package com.facebook.yoga;
/* loaded from: classes6.dex */
public enum YogaPositionType {
    STATIC(0),
    RELATIVE(1),
    ABSOLUTE(2);
    
    private final int mIntValue;

    YogaPositionType(int i) {
        this.mIntValue = i;
    }

    public int intValue() {
        return this.mIntValue;
    }

    public static YogaPositionType fromInt(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return ABSOLUTE;
                }
                throw new IllegalArgumentException("Unknown enum value: " + i);
            }
            return RELATIVE;
        }
        return STATIC;
    }
}

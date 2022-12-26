package com.facebook.yoga;
/* loaded from: classes6.dex */
public enum YogaPrintOptions {
    LAYOUT(1),
    STYLE(2),
    CHILDREN(4);
    
    private final int mIntValue;

    YogaPrintOptions(int i) {
        this.mIntValue = i;
    }

    public int intValue() {
        return this.mIntValue;
    }

    public static YogaPrintOptions fromInt(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i == 4) {
                    return CHILDREN;
                }
                throw new IllegalArgumentException("Unknown enum value: " + i);
            }
            return STYLE;
        }
        return LAYOUT;
    }
}

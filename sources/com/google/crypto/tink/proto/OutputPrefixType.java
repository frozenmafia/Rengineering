package com.google.crypto.tink.proto;

import o.checkSelectForSwipe;
import o.checkSelectForSwipe$ag$a;
import o.checkSelectForSwipe$ah$a;
/* loaded from: classes7.dex */
public enum OutputPrefixType implements checkSelectForSwipe.toString {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    
    public static final int CRUNCHY_VALUE = 4;
    public static final int LEGACY_VALUE = 2;
    public static final int RAW_VALUE = 3;
    public static final int TINK_VALUE = 1;
    public static final int UNKNOWN_PREFIX_VALUE = 0;
    private static final checkSelectForSwipe$ah$a<OutputPrefixType> internalValueMap = new checkSelectForSwipe$ah$a<OutputPrefixType>() { // from class: com.google.crypto.tink.proto.OutputPrefixType.3
        @Override // o.checkSelectForSwipe$ah$a
        /* renamed from: values */
        public OutputPrefixType ah$a(int i) {
            return OutputPrefixType.forNumber(i);
        }
    };
    private final int value;

    @Override // o.checkSelectForSwipe.toString
    public final int getNumber() {
        if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.value;
    }

    @Deprecated
    public static OutputPrefixType valueOf(int i) {
        return forNumber(i);
    }

    public static OutputPrefixType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return CRUNCHY;
                    }
                    return RAW;
                }
                return LEGACY;
            }
            return TINK;
        }
        return UNKNOWN_PREFIX;
    }

    public static checkSelectForSwipe$ah$a<OutputPrefixType> internalGetValueMap() {
        return internalValueMap;
    }

    public static checkSelectForSwipe$ag$a internalGetVerifier() {
        return toString.ah$a;
    }

    /* loaded from: classes7.dex */
    static final class toString implements checkSelectForSwipe$ag$a {
        static final checkSelectForSwipe$ag$a ah$a = new toString();

        private toString() {
        }

        @Override // o.checkSelectForSwipe$ag$a
        public boolean ah$a(int i) {
            return OutputPrefixType.forNumber(i) != null;
        }
    }

    OutputPrefixType(int i) {
        this.value = i;
    }
}

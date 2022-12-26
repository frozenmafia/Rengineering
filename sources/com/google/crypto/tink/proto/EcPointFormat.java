package com.google.crypto.tink.proto;

import o.checkSelectForSwipe;
import o.checkSelectForSwipe$ag$a;
import o.checkSelectForSwipe$ah$a;
/* loaded from: classes7.dex */
public enum EcPointFormat implements checkSelectForSwipe.toString {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    DO_NOT_USE_CRUNCHY_UNCOMPRESSED(3),
    UNRECOGNIZED(-1);
    
    public static final int COMPRESSED_VALUE = 2;
    public static final int DO_NOT_USE_CRUNCHY_UNCOMPRESSED_VALUE = 3;
    public static final int UNCOMPRESSED_VALUE = 1;
    public static final int UNKNOWN_FORMAT_VALUE = 0;
    private static final checkSelectForSwipe$ah$a<EcPointFormat> internalValueMap = new checkSelectForSwipe$ah$a<EcPointFormat>() { // from class: com.google.crypto.tink.proto.EcPointFormat.3
        @Override // o.checkSelectForSwipe$ah$a
        /* renamed from: valueOf */
        public EcPointFormat ah$a(int i) {
            return EcPointFormat.forNumber(i);
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
    public static EcPointFormat valueOf(int i) {
        return forNumber(i);
    }

    public static EcPointFormat forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
                }
                return COMPRESSED;
            }
            return UNCOMPRESSED;
        }
        return UNKNOWN_FORMAT;
    }

    public static checkSelectForSwipe$ah$a<EcPointFormat> internalGetValueMap() {
        return internalValueMap;
    }

    public static checkSelectForSwipe$ag$a internalGetVerifier() {
        return toString.values;
    }

    /* loaded from: classes7.dex */
    static final class toString implements checkSelectForSwipe$ag$a {
        static final checkSelectForSwipe$ag$a values = new toString();

        private toString() {
        }

        @Override // o.checkSelectForSwipe$ag$a
        public boolean ah$a(int i) {
            return EcPointFormat.forNumber(i) != null;
        }
    }

    EcPointFormat(int i) {
        this.value = i;
    }
}

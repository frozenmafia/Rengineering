package com.google.crypto.tink.proto;

import o.checkSelectForSwipe;
import o.checkSelectForSwipe$ag$a;
import o.checkSelectForSwipe$ah$a;
/* loaded from: classes7.dex */
public enum EllipticCurveType implements checkSelectForSwipe.toString {
    UNKNOWN_CURVE(0),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    CURVE25519(5),
    UNRECOGNIZED(-1);
    
    public static final int CURVE25519_VALUE = 5;
    public static final int NIST_P256_VALUE = 2;
    public static final int NIST_P384_VALUE = 3;
    public static final int NIST_P521_VALUE = 4;
    public static final int UNKNOWN_CURVE_VALUE = 0;
    private static final checkSelectForSwipe$ah$a<EllipticCurveType> internalValueMap = new checkSelectForSwipe$ah$a<EllipticCurveType>() { // from class: com.google.crypto.tink.proto.EllipticCurveType.2
        @Override // o.checkSelectForSwipe$ah$a
        /* renamed from: valueOf */
        public EllipticCurveType ah$a(int i) {
            return EllipticCurveType.forNumber(i);
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
    public static EllipticCurveType valueOf(int i) {
        return forNumber(i);
    }

    public static EllipticCurveType forNumber(int i) {
        if (i != 0) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        return CURVE25519;
                    }
                    return NIST_P521;
                }
                return NIST_P384;
            }
            return NIST_P256;
        }
        return UNKNOWN_CURVE;
    }

    public static checkSelectForSwipe$ah$a<EllipticCurveType> internalGetValueMap() {
        return internalValueMap;
    }

    public static checkSelectForSwipe$ag$a internalGetVerifier() {
        return valueOf.ah$a;
    }

    /* loaded from: classes7.dex */
    static final class valueOf implements checkSelectForSwipe$ag$a {
        static final checkSelectForSwipe$ag$a ah$a = new valueOf();

        private valueOf() {
        }

        @Override // o.checkSelectForSwipe$ag$a
        public boolean ah$a(int i) {
            return EllipticCurveType.forNumber(i) != null;
        }
    }

    EllipticCurveType(int i) {
        this.value = i;
    }
}

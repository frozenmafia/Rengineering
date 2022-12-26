package com.google.crypto.tink.proto;

import o.checkSelectForSwipe;
import o.checkSelectForSwipe$ag$a;
import o.checkSelectForSwipe$ah$a;
/* loaded from: classes7.dex */
public enum EcdsaSignatureEncoding implements checkSelectForSwipe.toString {
    UNKNOWN_ENCODING(0),
    IEEE_P1363(1),
    DER(2),
    UNRECOGNIZED(-1);
    
    public static final int DER_VALUE = 2;
    public static final int IEEE_P1363_VALUE = 1;
    public static final int UNKNOWN_ENCODING_VALUE = 0;
    private static final checkSelectForSwipe$ah$a<EcdsaSignatureEncoding> internalValueMap = new checkSelectForSwipe$ah$a<EcdsaSignatureEncoding>() { // from class: com.google.crypto.tink.proto.EcdsaSignatureEncoding.2
        @Override // o.checkSelectForSwipe$ah$a
        /* renamed from: toString */
        public EcdsaSignatureEncoding ah$a(int i) {
            return EcdsaSignatureEncoding.forNumber(i);
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
    public static EcdsaSignatureEncoding valueOf(int i) {
        return forNumber(i);
    }

    public static EcdsaSignatureEncoding forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return DER;
            }
            return IEEE_P1363;
        }
        return UNKNOWN_ENCODING;
    }

    public static checkSelectForSwipe$ah$a<EcdsaSignatureEncoding> internalGetValueMap() {
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
            return EcdsaSignatureEncoding.forNumber(i) != null;
        }
    }

    EcdsaSignatureEncoding(int i) {
        this.value = i;
    }
}

package com.google.crypto.tink.proto;

import o.checkSelectForSwipe;
import o.checkSelectForSwipe$ag$a;
import o.checkSelectForSwipe$ah$a;
/* loaded from: classes7.dex */
public enum HashType implements checkSelectForSwipe.toString {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);
    
    public static final int SHA1_VALUE = 1;
    public static final int SHA256_VALUE = 3;
    public static final int SHA384_VALUE = 2;
    public static final int SHA512_VALUE = 4;
    public static final int UNKNOWN_HASH_VALUE = 0;
    private static final checkSelectForSwipe$ah$a<HashType> internalValueMap = new checkSelectForSwipe$ah$a<HashType>() { // from class: com.google.crypto.tink.proto.HashType.4
        @Override // o.checkSelectForSwipe$ah$a
        /* renamed from: toString */
        public HashType ah$a(int i) {
            return HashType.forNumber(i);
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
    public static HashType valueOf(int i) {
        return forNumber(i);
    }

    public static HashType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return SHA512;
                    }
                    return SHA256;
                }
                return SHA384;
            }
            return SHA1;
        }
        return UNKNOWN_HASH;
    }

    public static checkSelectForSwipe$ah$a<HashType> internalGetValueMap() {
        return internalValueMap;
    }

    public static checkSelectForSwipe$ag$a internalGetVerifier() {
        return HashType$ag$a.ag$a;
    }

    HashType(int i) {
        this.value = i;
    }
}

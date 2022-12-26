package com.google.crypto.tink.proto;

import o.checkSelectForSwipe;
import o.checkSelectForSwipe$ag$a;
import o.checkSelectForSwipe$ah$a;
/* loaded from: classes7.dex */
public enum KeyStatusType implements checkSelectForSwipe.toString {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    
    public static final int DESTROYED_VALUE = 3;
    public static final int DISABLED_VALUE = 2;
    public static final int ENABLED_VALUE = 1;
    public static final int UNKNOWN_STATUS_VALUE = 0;
    private static final checkSelectForSwipe$ah$a<KeyStatusType> internalValueMap = new checkSelectForSwipe$ah$a<KeyStatusType>() { // from class: com.google.crypto.tink.proto.KeyStatusType.1
        @Override // o.checkSelectForSwipe$ah$a
        /* renamed from: toString */
        public KeyStatusType ah$a(int i) {
            return KeyStatusType.forNumber(i);
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
    public static KeyStatusType valueOf(int i) {
        return forNumber(i);
    }

    public static KeyStatusType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return DESTROYED;
                }
                return DISABLED;
            }
            return ENABLED;
        }
        return UNKNOWN_STATUS;
    }

    public static checkSelectForSwipe$ah$a<KeyStatusType> internalGetValueMap() {
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
            return KeyStatusType.forNumber(i) != null;
        }
    }

    KeyStatusType(int i) {
        this.value = i;
    }
}

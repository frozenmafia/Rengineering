package com.google.protobuf;

import o.ViewInfoStore;
import o.ViewInfoStore$ag$a;
import o.ViewInfoStore$ah$a;
/* loaded from: classes7.dex */
public enum Syntax implements ViewInfoStore$ah$a {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    UNRECOGNIZED(-1);
    
    public static final int SYNTAX_PROTO2_VALUE = 0;
    public static final int SYNTAX_PROTO3_VALUE = 1;
    private static final ViewInfoStore.values<Syntax> internalValueMap = new ViewInfoStore.values<Syntax>() { // from class: com.google.protobuf.Syntax.4
        @Override // o.ViewInfoStore.values
        /* renamed from: ah$a */
        public Syntax ag$a(int i) {
            return Syntax.forNumber(i);
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
    public static Syntax valueOf(int i) {
        return forNumber(i);
    }

    public static Syntax forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return SYNTAX_PROTO3;
        }
        return SYNTAX_PROTO2;
    }

    public static ViewInfoStore.values<Syntax> internalGetValueMap() {
        return internalValueMap;
    }

    public static ViewInfoStore$ag$a internalGetVerifier() {
        return values.valueOf;
    }

    /* loaded from: classes7.dex */
    static final class values implements ViewInfoStore$ag$a {
        static final ViewInfoStore$ag$a valueOf = new values();

        private values() {
        }

        @Override // o.ViewInfoStore$ag$a
        public boolean values(int i) {
            return Syntax.forNumber(i) != null;
        }
    }

    Syntax(int i) {
        this.value = i;
    }
}

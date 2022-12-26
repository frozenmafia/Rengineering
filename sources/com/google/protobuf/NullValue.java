package com.google.protobuf;

import o.ViewInfoStore;
import o.ViewInfoStore$ag$a;
import o.ViewInfoStore$ah$a;
/* loaded from: classes7.dex */
public enum NullValue implements ViewInfoStore$ah$a {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);
    
    public static final int NULL_VALUE_VALUE = 0;
    private static final ViewInfoStore.values<NullValue> internalValueMap = new ViewInfoStore.values<NullValue>() { // from class: com.google.protobuf.NullValue.1
        @Override // o.ViewInfoStore.values
        /* renamed from: ah$a */
        public NullValue ag$a(int i) {
            return NullValue.forNumber(i);
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
    public static NullValue valueOf(int i) {
        return forNumber(i);
    }

    public static NullValue forNumber(int i) {
        if (i != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public static ViewInfoStore.values<NullValue> internalGetValueMap() {
        return internalValueMap;
    }

    public static ViewInfoStore$ag$a internalGetVerifier() {
        return NullValue$ag$a.valueOf;
    }

    NullValue(int i) {
        this.value = i;
    }
}

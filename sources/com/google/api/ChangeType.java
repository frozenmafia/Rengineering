package com.google.api;

import o.ViewInfoStore;
import o.ViewInfoStore$ag$a;
import o.ViewInfoStore$ah$a;
/* loaded from: classes7.dex */
public enum ChangeType implements ViewInfoStore$ah$a {
    CHANGE_TYPE_UNSPECIFIED(0),
    ADDED(1),
    REMOVED(2),
    MODIFIED(3),
    UNRECOGNIZED(-1);
    
    public static final int ADDED_VALUE = 1;
    public static final int CHANGE_TYPE_UNSPECIFIED_VALUE = 0;
    public static final int MODIFIED_VALUE = 3;
    public static final int REMOVED_VALUE = 2;
    private static final ViewInfoStore.values<ChangeType> internalValueMap = new ViewInfoStore.values<ChangeType>() { // from class: com.google.api.ChangeType.3
        @Override // o.ViewInfoStore.values
        /* renamed from: ah$a */
        public ChangeType ag$a(int i) {
            return ChangeType.forNumber(i);
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
    public static ChangeType valueOf(int i) {
        return forNumber(i);
    }

    public static ChangeType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return MODIFIED;
                }
                return REMOVED;
            }
            return ADDED;
        }
        return CHANGE_TYPE_UNSPECIFIED;
    }

    public static ViewInfoStore.values<ChangeType> internalGetValueMap() {
        return internalValueMap;
    }

    public static ViewInfoStore$ag$a internalGetVerifier() {
        return values.ag$a;
    }

    /* loaded from: classes7.dex */
    static final class values implements ViewInfoStore$ag$a {
        static final ViewInfoStore$ag$a ag$a = new values();

        private values() {
        }

        @Override // o.ViewInfoStore$ag$a
        public boolean values(int i) {
            return ChangeType.forNumber(i) != null;
        }
    }

    ChangeType(int i) {
        this.value = i;
    }
}

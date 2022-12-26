package com.facebook.common.util;
/* loaded from: classes4.dex */
public enum TriState {
    YES,
    NO,
    UNSET;

    public boolean isSet() {
        return this != UNSET;
    }

    public static TriState valueOf(boolean z) {
        return z ? YES : NO;
    }

    public static TriState valueOf(Boolean bool) {
        return bool != null ? valueOf(bool.booleanValue()) : UNSET;
    }

    /* renamed from: com.facebook.common.util.TriState$5  reason: invalid class name */
    /* loaded from: classes4.dex */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] ag$a;

        static {
            int[] iArr = new int[TriState.values().length];
            ag$a = iArr;
            try {
                iArr[TriState.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ag$a[TriState.NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ag$a[TriState.UNSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean asBoolean() {
        int i = AnonymousClass5.ag$a[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    throw new IllegalStateException("No boolean equivalent for UNSET");
                }
                throw new IllegalStateException("Unrecognized TriState value: " + this);
            }
            return false;
        }
        return true;
    }

    public boolean asBoolean(boolean z) {
        int i = AnonymousClass5.ag$a[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return z;
                }
                throw new IllegalStateException("Unrecognized TriState value: " + this);
            }
            return false;
        }
        return true;
    }

    public Boolean asBooleanObject() {
        int i = AnonymousClass5.ag$a[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return null;
                }
                throw new IllegalStateException("Unrecognized TriState value: " + this);
            }
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    public int getDbValue() {
        int i = AnonymousClass5.ag$a[ordinal()];
        if (i != 1) {
            return i != 2 ? 3 : 2;
        }
        return 1;
    }

    public static TriState fromDbValue(int i) {
        if (i != 1) {
            if (i == 2) {
                return NO;
            }
            return UNSET;
        }
        return YES;
    }
}

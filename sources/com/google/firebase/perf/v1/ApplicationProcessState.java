package com.google.firebase.perf.v1;

import o.ViewInfoStore;
import o.ViewInfoStore$ag$a;
import o.ViewInfoStore$ah$a;
/* loaded from: classes5.dex */
public enum ApplicationProcessState implements ViewInfoStore$ah$a {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);
    
    public static final int APPLICATION_PROCESS_STATE_UNKNOWN_VALUE = 0;
    public static final int BACKGROUND_VALUE = 2;
    public static final int FOREGROUND_BACKGROUND_VALUE = 3;
    public static final int FOREGROUND_VALUE = 1;
    private static final ViewInfoStore.values<ApplicationProcessState> internalValueMap = new ViewInfoStore.values<ApplicationProcessState>() { // from class: com.google.firebase.perf.v1.ApplicationProcessState.1
        @Override // o.ViewInfoStore.values
        /* renamed from: ah$a */
        public ApplicationProcessState ag$a(int i) {
            return ApplicationProcessState.forNumber(i);
        }
    };
    private final int value;

    @Override // o.ViewInfoStore$ah$a
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static ApplicationProcessState valueOf(int i) {
        return forNumber(i);
    }

    public static ApplicationProcessState forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return FOREGROUND_BACKGROUND;
                }
                return BACKGROUND;
            }
            return FOREGROUND;
        }
        return APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    public static ViewInfoStore.values<ApplicationProcessState> internalGetValueMap() {
        return internalValueMap;
    }

    public static ViewInfoStore$ag$a internalGetVerifier() {
        return values.ah$a;
    }

    /* loaded from: classes5.dex */
    static final class values implements ViewInfoStore$ag$a {
        static final ViewInfoStore$ag$a ah$a = new values();

        private values() {
        }

        @Override // o.ViewInfoStore$ag$a
        public boolean values(int i) {
            return ApplicationProcessState.forNumber(i) != null;
        }
    }

    ApplicationProcessState(int i) {
        this.value = i;
    }
}

package com.google.firebase.perf.v1;

import o.ViewInfoStore;
import o.ViewInfoStore$ag$a;
import o.ViewInfoStore$ah$a;
/* loaded from: classes5.dex */
public enum SessionVerbosity implements ViewInfoStore$ah$a {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);
    
    public static final int GAUGES_AND_SYSTEM_EVENTS_VALUE = 1;
    public static final int SESSION_VERBOSITY_NONE_VALUE = 0;
    private static final ViewInfoStore.values<SessionVerbosity> internalValueMap = new ViewInfoStore.values<SessionVerbosity>() { // from class: com.google.firebase.perf.v1.SessionVerbosity.5
        @Override // o.ViewInfoStore.values
        /* renamed from: valueOf */
        public SessionVerbosity ag$a(int i) {
            return SessionVerbosity.forNumber(i);
        }
    };
    private final int value;

    @Override // o.ViewInfoStore$ah$a
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static SessionVerbosity valueOf(int i) {
        return forNumber(i);
    }

    public static SessionVerbosity forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return GAUGES_AND_SYSTEM_EVENTS;
        }
        return SESSION_VERBOSITY_NONE;
    }

    public static ViewInfoStore.values<SessionVerbosity> internalGetValueMap() {
        return internalValueMap;
    }

    public static ViewInfoStore$ag$a internalGetVerifier() {
        return valueOf.ag$a;
    }

    /* loaded from: classes5.dex */
    static final class valueOf implements ViewInfoStore$ag$a {
        static final ViewInfoStore$ag$a ag$a = new valueOf();

        private valueOf() {
        }

        @Override // o.ViewInfoStore$ag$a
        public boolean values(int i) {
            return SessionVerbosity.forNumber(i) != null;
        }
    }

    SessionVerbosity(int i) {
        this.value = i;
    }
}

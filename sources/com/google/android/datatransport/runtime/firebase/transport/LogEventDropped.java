package com.google.android.datatransport.runtime.firebase.transport;

import o.startSmoothScroll;
/* loaded from: classes7.dex */
public final class LogEventDropped {
    private static final LogEventDropped values = new valueOf().valueOf();
    private final long ag$a;
    private final Reason valueOf;

    LogEventDropped(long j, Reason reason) {
        this.ag$a = j;
        this.valueOf = reason;
    }

    public static valueOf valueOf() {
        return new valueOf();
    }

    public long ah$a() {
        return this.ag$a;
    }

    public Reason values() {
        return this.valueOf;
    }

    /* loaded from: classes7.dex */
    public static final class valueOf {
        private long valueOf = 0;
        private Reason ah$a = Reason.REASON_UNKNOWN;

        valueOf() {
        }

        public LogEventDropped valueOf() {
            return new LogEventDropped(this.valueOf, this.ah$a);
        }

        public valueOf values(long j) {
            this.valueOf = j;
            return this;
        }

        public valueOf toString(Reason reason) {
            this.ah$a = reason;
            return this;
        }
    }

    /* loaded from: classes7.dex */
    public enum Reason implements startSmoothScroll {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        
        private final int number_;

        Reason(int i) {
            this.number_ = i;
        }

        @Override // o.startSmoothScroll
        public int getNumber() {
            return this.number_;
        }
    }
}

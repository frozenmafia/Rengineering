package com.google.android.datatransport.runtime.backends;

import o.shouldDisableDependents;
/* loaded from: classes7.dex */
public abstract class BackendResponse {

    /* loaded from: classes7.dex */
    public enum Status {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public abstract long ag$a();

    public abstract Status values();

    public static BackendResponse HaptikSDK$b() {
        return new shouldDisableDependents(Status.TRANSIENT_ERROR, -1L);
    }

    public static BackendResponse valueOf() {
        return new shouldDisableDependents(Status.FATAL_ERROR, -1L);
    }

    public static BackendResponse ah$a() {
        return new shouldDisableDependents(Status.INVALID_PAYLOAD, -1L);
    }

    public static BackendResponse ag$a(long j) {
        return new shouldDisableDependents(Status.OK, j);
    }
}

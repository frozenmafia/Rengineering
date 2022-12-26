package com.google.firebase.installations.remote;

import o.onAnimation;
/* loaded from: classes7.dex */
public abstract class TokenResult {

    /* loaded from: classes7.dex */
    public enum ResponseCode {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public abstract String ag$a();

    public abstract ResponseCode ah$a();

    public abstract long values();

    public static TokenResult$ah$a valueOf() {
        return new onAnimation.values().ag$a(0L);
    }
}

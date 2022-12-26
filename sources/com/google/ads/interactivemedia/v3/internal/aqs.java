package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class aqs extends Exception {
    private final int a;

    public aqs(int i) {
        super("Signal SDK error code: " + i);
        this.a = i;
    }

    public final int a() {
        return this.a;
    }
}

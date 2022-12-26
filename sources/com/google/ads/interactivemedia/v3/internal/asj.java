package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class asj extends Exception {
    private final int a;

    public asj(int i, String str) {
        super(str);
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public asj(int i, Throwable th) {
        super(th);
        this.a = i;
    }
}

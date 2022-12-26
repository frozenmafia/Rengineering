package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
/* loaded from: classes4.dex */
public class cy extends IOException {
    public final int a;

    public cy(int i) {
        this.a = i;
    }

    public cy(String str, Throwable th, int i) {
        super(str, th);
        this.a = i;
    }

    public cy(Throwable th, int i) {
        super(th);
        this.a = i;
    }
}

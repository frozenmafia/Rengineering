package com.google.ads.interactivemedia.v3.internal;

import java.util.Objects;
/* loaded from: classes4.dex */
public final class ari {
    private String a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f685b;
    private boolean c;
    private byte d;

    public ari() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ari(byte[] bArr) {
        this();
    }

    public final arj a() {
        String str;
        if (this.d != 3 || (str = this.a) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" clientVersion");
            }
            if ((this.d & 1) == 0) {
                sb.append(" shouldGetAdvertisingId");
            }
            if ((this.d & 2) == 0) {
                sb.append(" isGooglePlayServicesAvailable");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new arj(str, this.f685b, this.c);
    }

    public final void b(String str) {
        Objects.requireNonNull(str, "Null clientVersion");
        this.a = str;
    }

    public final void c() {
        this.c = true;
        this.d = (byte) (this.d | 2);
    }

    public final void d(boolean z) {
        this.f685b = z;
        this.d = (byte) (this.d | 1);
    }
}

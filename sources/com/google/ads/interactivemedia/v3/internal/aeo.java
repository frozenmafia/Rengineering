package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class aeo {
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private final int f518b;
    private final int c;
    private int d;
    private String e;

    public aeo(int i, int i2) {
        this(Integer.MIN_VALUE, i, i2);
    }

    private final void d() {
        if (this.d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public final int a() {
        d();
        return this.d;
    }

    public final String b() {
        d();
        return this.e;
    }

    public final void c() {
        int i = this.d;
        int i2 = i == Integer.MIN_VALUE ? this.f518b : i + this.c;
        this.d = i2;
        String str = this.a;
        this.e = str + i2;
    }

    public aeo(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + "/";
        } else {
            str = "";
        }
        this.a = str;
        this.f518b = i2;
        this.c = i3;
        this.d = Integer.MIN_VALUE;
        this.e = "";
    }
}

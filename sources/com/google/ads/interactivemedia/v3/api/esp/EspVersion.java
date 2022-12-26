package com.google.ads.interactivemedia.v3.api.esp;
/* loaded from: classes4.dex */
public final class EspVersion {
    private final int a;

    /* renamed from: b  reason: collision with root package name */
    private final int f416b;
    private final int c;

    public EspVersion(int i, int i2, int i3) {
        this.a = i;
        this.f416b = i2;
        this.c = i3;
    }

    public int getMajorVersion() {
        return this.a;
    }

    public int getMicroVersion() {
        return this.c;
    }

    public int getMinorVersion() {
        return this.f416b;
    }

    public String toString() {
        int i = this.a;
        int i2 = this.f416b;
        int i3 = this.c;
        return i + "." + i2 + "." + i3;
    }
}

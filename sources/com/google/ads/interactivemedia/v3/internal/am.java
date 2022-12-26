package com.google.ads.interactivemedia.v3.internal;

import androidx.databinding.library.baseAdapters.BR;
/* loaded from: classes4.dex */
public class am {
    public final Object a;

    /* renamed from: b  reason: collision with root package name */
    public final int f630b;
    public final int c;
    public final long d;
    public final int e;

    /* JADX INFO: Access modifiers changed from: protected */
    public am(am amVar) {
        this.a = amVar.a;
        this.f630b = amVar.f630b;
        this.c = amVar.c;
        this.d = amVar.d;
        this.e = amVar.e;
    }

    public am(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    private am(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.f630b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public final am a(Object obj) {
        return this.a.equals(obj) ? this : new am(obj, this.f630b, this.c, this.d, this.e);
    }

    public final boolean b() {
        return this.f630b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof am) {
            am amVar = (am) obj;
            return this.a.equals(amVar.a) && this.f630b == amVar.f630b && this.c == amVar.c && this.d == amVar.d && this.e == amVar.e;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + BR.userTeamVM) * 31) + this.f630b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public am(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public am(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }
}

package com.google.ads.interactivemedia.v3.internal;

import androidx.databinding.library.baseAdapters.BR;
/* loaded from: classes4.dex */
public final class au {
    public static final au a = new au(1.0f, 1.0f);

    /* renamed from: b  reason: collision with root package name */
    public final float f720b;
    public final float c;
    private final int d;

    public au(float f, float f2) {
        af.u(f > 0.0f);
        af.u(f2 > 0.0f);
        this.f720b = f;
        this.c = f2;
        this.d = Math.round(f * 1000.0f);
    }

    public final long a(long j) {
        return j * this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        au auVar = (au) obj;
        return this.f720b == auVar.f720b && this.c == auVar.c;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f720b) + BR.userTeamVM) * 31) + Float.floatToRawIntBits(this.c);
    }

    public final String toString() {
        return cp.H("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f720b), Float.valueOf(this.c));
    }
}

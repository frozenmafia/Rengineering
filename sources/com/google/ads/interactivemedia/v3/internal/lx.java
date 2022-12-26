package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import androidx.databinding.library.baseAdapters.BR;
/* loaded from: classes4.dex */
public final class lx {
    public final long a;

    /* renamed from: b  reason: collision with root package name */
    public final long f1166b;
    private final String c;
    private int d;

    public lx(String str, long j, long j2) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.f1166b = j2;
    }

    public final Uri a(String str) {
        return af.l(str, this.c);
    }

    public final lx b(lx lxVar, String str) {
        String c = c(str);
        if (lxVar == null || !c.equals(lxVar.c(str))) {
            return null;
        }
        long j = this.f1166b;
        int i = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
        if (i != 0) {
            long j2 = this.a;
            if (j2 + j == lxVar.a) {
                long j3 = lxVar.f1166b;
                return new lx(c, j2, j3 == -1 ? -1L : j + j3);
            }
        }
        long j4 = lxVar.f1166b;
        if (j4 != -1) {
            long j5 = lxVar.a;
            if (j5 + j4 == this.a) {
                return new lx(c, j5, i == 0 ? -1L : j4 + j);
            }
            return null;
        }
        return null;
    }

    public final String c(String str) {
        return af.m(str, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        lx lxVar = (lx) obj;
        return this.a == lxVar.a && this.f1166b == lxVar.f1166b && this.c.equals(lxVar.c);
    }

    public final int hashCode() {
        int i = this.d;
        if (i == 0) {
            int hashCode = ((((((int) this.a) + BR.userTeamVM) * 31) + ((int) this.f1166b)) * 31) + this.c.hashCode();
            this.d = hashCode;
            return hashCode;
        }
        return i;
    }

    public final String toString() {
        String str = this.c;
        long j = this.a;
        long j2 = this.f1166b;
        return "RangedUri(referenceUri=" + str + ", start=" + j + ", length=" + j2 + ")";
    }
}

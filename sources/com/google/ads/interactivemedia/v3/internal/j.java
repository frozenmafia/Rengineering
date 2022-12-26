package com.google.ads.interactivemedia.v3.internal;

import androidx.databinding.library.baseAdapters.BR;
import java.util.Arrays;
/* loaded from: classes4.dex */
public final class j {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1110b;
    public final int c;
    public final byte[] d;
    private int e;

    public j(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.f1110b = i2;
        this.c = i3;
        this.d = bArr;
    }

    public static int a(int i) {
        if (i != 1) {
            if (i != 9) {
                return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
            }
            return 6;
        }
        return 1;
    }

    public static int b(int i) {
        if (i != 1) {
            if (i != 16) {
                if (i != 18) {
                    return (i == 6 || i == 7) ? 3 : -1;
                }
                return 7;
            }
            return 6;
        }
        return 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.a == jVar.a && this.f1110b == jVar.f1110b && this.c == jVar.c && Arrays.equals(this.d, jVar.d);
    }

    public final int hashCode() {
        int i = this.e;
        if (i == 0) {
            int hashCode = ((((((this.a + BR.userTeamVM) * 31) + this.f1110b) * 31) + this.c) * 31) + Arrays.hashCode(this.d);
            this.e = hashCode;
            return hashCode;
        }
        return i;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.f1110b;
        int i3 = this.c;
        boolean z = this.d != null;
        return "ColorInfo(" + i + ", " + i2 + ", " + i3 + ", " + z + ")";
    }
}

package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import com.google.android.exoplayer2.C;
import java.util.Arrays;
/* loaded from: classes4.dex */
public final class a {
    public final long a;

    /* renamed from: b  reason: collision with root package name */
    public final int f417b;
    public final Uri[] c;
    public final int[] d;
    public final long[] e;
    public final long f;
    public final boolean g;

    public a() {
        this(-1, new int[0], new Uri[0], new long[0]);
    }

    public final int a() {
        return b(-1);
    }

    public final int b(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.d;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final a c() {
        int[] iArr = this.d;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = this.e;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, (long) C.TIME_UNSET);
        return new a(0, copyOf, (Uri[]) Arrays.copyOf(this.c, 0), copyOf2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f417b == aVar.f417b && Arrays.equals(this.c, aVar.c) && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.e, aVar.e);
    }

    public final int hashCode() {
        int i = this.f417b;
        int hashCode = Arrays.hashCode(this.c);
        return ((((((i * 961) + hashCode) * 31) + Arrays.hashCode(this.d)) * 31) + Arrays.hashCode(this.e)) * 961;
    }

    private a(int i, int[] iArr, Uri[] uriArr, long[] jArr) {
        af.u(iArr.length == uriArr.length);
        this.a = 0L;
        this.f417b = i;
        this.d = iArr;
        this.c = uriArr;
        this.e = jArr;
        this.f = 0L;
        this.g = false;
    }
}

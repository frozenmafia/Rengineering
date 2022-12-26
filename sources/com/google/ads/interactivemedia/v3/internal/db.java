package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import com.dreampay.commons.constants.Constants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class db {
    public final Uri a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1009b;
    public final byte[] c;
    public final Map d;
    public final long e;
    public final long f;
    public final String g;
    public final int h;

    static {
        aj.b("media3.datasource");
    }

    private db(Uri uri, int i, byte[] bArr, Map map, long j, long j2, String str, int i2) {
        byte[] bArr2 = bArr;
        boolean z = true;
        boolean z2 = j >= 0;
        af.u(z2);
        af.u(z2);
        long j3 = -1;
        if (j2 > 0) {
            j3 = j2;
        } else if (j2 != -1) {
            j3 = j2;
            z = false;
        }
        af.u(z);
        this.a = uri;
        this.f1009b = i;
        this.c = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.d = Collections.unmodifiableMap(new HashMap(map));
        this.e = j;
        this.f = j3;
        this.g = str;
        this.h = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ db(Uri uri, int i, byte[] bArr, Map map, long j, long j2, String str, int i2, byte[] bArr2) {
        this(uri, i, bArr, map, j, j2, str, i2);
    }

    public static String c(int i) {
        if (i != 1) {
            if (i == 2) {
                return "POST";
            }
            throw new IllegalStateException();
        }
        return "GET";
    }

    public final da a() {
        return new da(this);
    }

    public final db b(long j) {
        long j2 = this.f;
        long j3 = j2 != -1 ? j2 - j : -1L;
        long j4 = 0;
        if (j != 0) {
            j4 = j;
        } else if (j2 == j3) {
            return this;
        }
        return new db(this.a, this.f1009b, this.c, this.d, this.e + j4, j3, this.g, this.h);
    }

    public final boolean d(int i) {
        return (this.h & i) == i;
    }

    public final String toString() {
        String c = c(this.f1009b);
        String valueOf = String.valueOf(this.a);
        long j = this.e;
        long j2 = this.f;
        String str = this.g;
        int i = this.h;
        return "DataSpec[" + c + Constants.WHITE_SPACE + valueOf + ", " + j + ", " + j2 + ", " + str + ", " + i + "]";
    }

    public db(Uri uri, long j, long j2) {
        this(uri, 1, null, Collections.emptyMap(), j, j2, null, 0);
    }
}

package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.util.Base64;
import java.io.IOException;
import java.net.URLDecoder;
/* loaded from: classes4.dex */
public final class cv extends cs {
    private db a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f1006b;
    private int c;
    private int d;

    public cv() {
        super(false);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.k
    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.d;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(cp.G(this.f1006b), this.c, bArr, i, min);
        this.c += min;
        this.d -= min;
        g(min);
        return min;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cx
    public final long b(db dbVar) throws IOException {
        i(dbVar);
        this.a = dbVar;
        Uri uri = dbVar.a;
        String scheme = uri.getScheme();
        af.v("data".equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String[] ak = cp.ak(uri.getSchemeSpecificPart(), ",");
        if (ak.length != 2) {
            throw as.b("Unexpected URI format: ".concat(String.valueOf(String.valueOf(uri))), null);
        }
        String str = ak[1];
        if (ak[0].contains(";base64")) {
            try {
                this.f1006b = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw as.b("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e);
            }
        } else {
            this.f1006b = cp.ad(URLDecoder.decode(str, asu.a.name()));
        }
        long j = dbVar.e;
        int length = this.f1006b.length;
        if (j > length) {
            this.f1006b = null;
            throw new cy(2008);
        }
        int i = (int) j;
        this.c = i;
        int i2 = length - i;
        this.d = i2;
        long j2 = dbVar.f;
        if (j2 != -1) {
            this.d = (int) Math.min(i2, j2);
        }
        j(dbVar);
        long j3 = dbVar.f;
        return j3 != -1 ? j3 : this.d;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cx
    public final Uri c() {
        db dbVar = this.a;
        if (dbVar != null) {
            return dbVar.a;
        }
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cx
    public final void d() {
        if (this.f1006b != null) {
            this.f1006b = null;
            h();
        }
        this.a = null;
    }
}

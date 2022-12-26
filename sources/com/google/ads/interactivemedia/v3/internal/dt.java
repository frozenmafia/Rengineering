package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes4.dex */
public final class dt extends cs {
    private final Resources a;

    /* renamed from: b  reason: collision with root package name */
    private final String f1019b;
    private Uri c;
    private AssetFileDescriptor d;
    private InputStream e;
    private long f;
    private boolean g;

    public dt(Context context) {
        super(false);
        this.a = context.getResources();
        this.f1019b = context.getPackageName();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.k
    public final int a(byte[] bArr, int i, int i2) throws ds {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new ds(null, e, 2000);
                }
            }
            InputStream inputStream = this.e;
            int i3 = cp.a;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                if (this.f == -1) {
                    return -1;
                }
                throw new ds("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
            long j2 = this.f;
            if (j2 != -1) {
                this.f = j2 - read;
            }
            g(read);
            return read;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
        if (r3.matches("\\d+") != false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0155  */
    @Override // com.google.ads.interactivemedia.v3.internal.cx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(com.google.ads.interactivemedia.v3.internal.db r18) throws com.google.ads.interactivemedia.v3.internal.ds {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.dt.b(com.google.ads.interactivemedia.v3.internal.db):long");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cx
    public final Uri c() {
        return this.c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cx
    public final void d() throws ds {
        this.c = null;
        try {
            try {
                InputStream inputStream = this.e;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.e = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.d;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.d = null;
                        if (this.g) {
                            this.g = false;
                            h();
                        }
                    }
                } catch (IOException e) {
                    throw new ds(null, e, 2000);
                }
            } catch (IOException e2) {
                throw new ds(null, e2, 2000);
            }
        } catch (Throwable th) {
            this.e = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.d;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.d = null;
                    if (this.g) {
                        this.g = false;
                        h();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new ds(null, e3, 2000);
                }
            } catch (Throwable th2) {
                this.d = null;
                if (this.g) {
                    this.g = false;
                    h();
                }
                throw th2;
            }
        }
    }
}

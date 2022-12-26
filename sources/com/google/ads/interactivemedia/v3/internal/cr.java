package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import o.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda2;
import org.apache.http.message.TokenParser;
/* loaded from: classes4.dex */
public final class cr extends cs {
    private static int ag$a = 0;
    private static int values = 1;
    private final AssetManager a;

    /* renamed from: b  reason: collision with root package name */
    private Uri f1003b;
    private InputStream c;
    private long d;
    private boolean e;

    public cr(Context context) {
        super(false);
        this.a = context.getAssets();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.k
    public final int a(byte[] bArr, int i, int i2) throws cq {
        if (i2 == 0) {
            return 0;
        }
        long j = this.d;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new cq(e, 2000);
                }
            }
            InputStream inputStream = this.c;
            int i3 = cp.a;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            long j2 = this.d;
            if (j2 != -1) {
                this.d = j2 - read;
            }
            g(read);
            return read;
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cx
    public final Uri c() {
        return this.f1003b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cx
    public final void d() throws cq {
        this.f1003b = null;
        try {
            try {
                InputStream inputStream = this.c;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.c = null;
                if (this.e) {
                    this.e = false;
                    h();
                }
            } catch (IOException e) {
                throw new cq(e, 2000);
            }
        } catch (Throwable th) {
            this.c = null;
            if (this.e) {
                this.e = false;
                h();
            }
            throw th;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cx
    public final long b(db dbVar) throws cq {
        int i = ag$a + 63;
        values = i % 128;
        int i2 = i % 2;
        try {
            Uri uri = dbVar.a;
            this.f1003b = uri;
            String path = uri.getPath();
            af.s(path);
            if (((Boolean) String.class.getMethod("startsWith", String.class).invoke(path, "/android_asset/")).booleanValue()) {
                path = (String) String.class.getMethod("substring", Integer.TYPE).invoke(path, 15);
            } else {
                if ((((Boolean) String.class.getMethod("startsWith", String.class).invoke(path, "/")).booleanValue() ? 'R' : 'O') != 'O') {
                    try {
                        int i3 = ag$a + 51;
                        values = i3 % 128;
                        int i4 = i3 % 2;
                        path = (String) String.class.getMethod("substring", Integer.TYPE).invoke(path, 1);
                    } catch (Exception e) {
                        throw e;
                    }
                }
            }
            i(dbVar);
            InputStream inputStream = (InputStream) ((Class) AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda2.valueOf(ViewConfiguration.getTouchSlop() >> 8, (char) TextUtils.indexOf("", ""), (ViewConfiguration.getTouchSlop() >> 8) + 87)).getMethod("ah$a", AssetManager.class, String.class).invoke(null, this.a, path);
            this.c = inputStream;
            if ((inputStream.skip(dbVar.e) >= dbVar.e ? TokenParser.ESCAPE : 'S') != 'S') {
                long j = dbVar.f;
                if ((j != -1 ? (char) 30 : '*') != 30) {
                    long available = this.c.available();
                    this.d = available;
                    if (available == 2147483647L) {
                        this.d = -1L;
                    }
                } else {
                    int i5 = values + 67;
                    ag$a = i5 % 128;
                    int i6 = i5 % 2;
                    this.d = j;
                }
                try {
                    this.e = true;
                    j(dbVar);
                    return this.d;
                } catch (Exception e2) {
                    throw e2;
                }
            }
            throw new cq(null, 2008);
        } catch (cq e3) {
            throw e3;
        } catch (IOException e4) {
            throw new cq(e4, true != (e4 instanceof FileNotFoundException) ? 2000 : 2005);
        }
    }
}

package com.google.ads.interactivemedia.v3.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
/* loaded from: classes4.dex */
public final class cu extends cs {
    private final ContentResolver a;

    /* renamed from: b  reason: collision with root package name */
    private Uri f1005b;
    private AssetFileDescriptor c;
    private FileInputStream d;
    private long e;
    private boolean f;

    public cu(Context context) {
        super(false);
        this.a = context.getContentResolver();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.k
    public final int a(byte[] bArr, int i, int i2) throws ct {
        if (i2 == 0) {
            return 0;
        }
        long j = this.e;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new ct(e, 2000);
                }
            }
            FileInputStream fileInputStream = this.d;
            int i3 = cp.a;
            int read = fileInputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            long j2 = this.e;
            if (j2 != -1) {
                this.e = j2 - read;
            }
            g(read);
            return read;
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cx
    public final long b(db dbVar) throws ct {
        AssetFileDescriptor openAssetFileDescriptor;
        long j;
        try {
            try {
                Uri uri = dbVar.a;
                this.f1005b = uri;
                i(dbVar);
                if ("content".equals(dbVar.a.getScheme())) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = this.a.openTypedAssetFileDescriptor(uri, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = this.a.openAssetFileDescriptor(uri, "r");
                }
                this.c = openAssetFileDescriptor;
                if (openAssetFileDescriptor == null) {
                    try {
                        throw new ct(new IOException("Could not open file descriptor for: " + String.valueOf(uri)), 2000);
                    } catch (IOException e) {
                        e = e;
                        throw new ct(e, true != (e instanceof FileNotFoundException) ? 2000 : 2005);
                    }
                }
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.d = fileInputStream;
                int i = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                if (i != 0 && dbVar.e > length) {
                    throw new ct(null, 2008);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(dbVar.e + startOffset) - startOffset;
                if (skip != dbVar.e) {
                    throw new ct(null, 2008);
                }
                if (i == 0) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.e = -1L;
                        j = -1;
                    } else {
                        j = size - channel.position();
                        this.e = j;
                        if (j < 0) {
                            throw new ct(null, 2008);
                        }
                    }
                } else {
                    j = length - skip;
                    this.e = j;
                    if (j < 0) {
                        throw new ct(null, 2008);
                    }
                }
                long j2 = dbVar.f;
                if (j2 != -1) {
                    if (j != -1) {
                        j2 = Math.min(j, j2);
                    }
                    this.e = j2;
                }
                this.f = true;
                j(dbVar);
                long j3 = dbVar.f;
                return j3 != -1 ? j3 : this.e;
            } catch (ct e2) {
                throw e2;
            }
        } catch (IOException e3) {
            e = e3;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cx
    public final Uri c() {
        return this.f1005b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cx
    public final void d() throws ct {
        this.f1005b = null;
        try {
            try {
                FileInputStream fileInputStream = this.d;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.d = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.c;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.c = null;
                        if (this.f) {
                            this.f = false;
                            h();
                        }
                    }
                } catch (IOException e) {
                    throw new ct(e, 2000);
                }
            } catch (IOException e2) {
                throw new ct(e2, 2000);
            }
        } catch (Throwable th) {
            this.d = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.c;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.c = null;
                    if (this.f) {
                        this.f = false;
                        h();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new ct(e3, 2000);
                }
            } catch (Throwable th2) {
                this.c = null;
                if (this.f) {
                    this.f = false;
                    h();
                }
                throw th2;
            }
        }
    }
}

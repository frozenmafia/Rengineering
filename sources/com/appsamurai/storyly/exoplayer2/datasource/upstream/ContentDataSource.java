package com.appsamurai.storyly.exoplayer2.datasource.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import o.SplashScreen;
import o.SplashScreen$Impl31$hierarchyListener$1;
import o.getElevationDegrees;
/* loaded from: classes3.dex */
public final class ContentDataSource extends SplashScreen.Impl31 {
    private AssetFileDescriptor ag$a;
    private FileInputStream ah$a;
    private Uri ah$b;
    private final ContentResolver toString;
    private boolean valueOf;
    private long values;

    /* loaded from: classes3.dex */
    public static class ContentDataSourceException extends DataSourceException {
        @Deprecated
        public ContentDataSourceException(IOException iOException) {
            this(iOException, 2000);
        }

        public ContentDataSourceException(IOException iOException, int i) {
            super(iOException, i);
        }
    }

    public ContentDataSource(Context context) {
        super(false);
        this.toString = context.getContentResolver();
    }

    @Override // o.computeDecorFitsWindow
    public long valueOf(SplashScreen$Impl31$hierarchyListener$1 splashScreen$Impl31$hierarchyListener$1) throws ContentDataSourceException {
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            Uri uri = splashScreen$Impl31$hierarchyListener$1.HaptikSDK$b;
            this.ah$b = uri;
            ah$a(splashScreen$Impl31$hierarchyListener$1);
            if ("content".equals(splashScreen$Impl31$hierarchyListener$1.HaptikSDK$b.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = this.toString.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                openAssetFileDescriptor = this.toString.openAssetFileDescriptor(uri, "r");
            }
            this.ag$a = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new ContentDataSourceException(new IOException("Could not open file descriptor for: " + uri), 2000);
            }
            long length = openAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.ah$a = fileInputStream;
            int i = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
            if (i != 0 && splashScreen$Impl31$hierarchyListener$1.HaptikSDK$c > length) {
                throw new ContentDataSourceException(null, 2008);
            }
            long startOffset = openAssetFileDescriptor.getStartOffset();
            long skip = fileInputStream.skip(splashScreen$Impl31$hierarchyListener$1.HaptikSDK$c + startOffset) - startOffset;
            if (skip != splashScreen$Impl31$hierarchyListener$1.HaptikSDK$c) {
                throw new ContentDataSourceException(null, 2008);
            }
            if (i == 0) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.values = -1L;
                } else {
                    long position = size - channel.position();
                    this.values = position;
                    if (position < 0) {
                        throw new ContentDataSourceException(null, 2008);
                    }
                }
            } else {
                long j = length - skip;
                this.values = j;
                if (j < 0) {
                    throw new ContentDataSourceException(null, 2008);
                }
            }
            if (splashScreen$Impl31$hierarchyListener$1.ah$b != -1) {
                long j2 = this.values;
                this.values = j2 == -1 ? splashScreen$Impl31$hierarchyListener$1.ah$b : Math.min(j2, splashScreen$Impl31$hierarchyListener$1.ah$b);
            }
            this.valueOf = true;
            toString(splashScreen$Impl31$hierarchyListener$1);
            return splashScreen$Impl31$hierarchyListener$1.ah$b != -1 ? splashScreen$Impl31$hierarchyListener$1.ah$b : this.values;
        } catch (ContentDataSourceException e) {
            throw e;
        } catch (IOException e2) {
            throw new ContentDataSourceException(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // o.unwrapCryptoObject
    public int values(byte[] bArr, int i, int i2) throws ContentDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.values;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new ContentDataSourceException(e, 2000);
            }
        }
        int read = ((FileInputStream) getElevationDegrees.ah$a(this.ah$a)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.values;
        if (j2 != -1) {
            this.values = j2 - read;
        }
        ah$a(read);
        return read;
    }

    @Override // o.computeDecorFitsWindow
    public Uri ah$a() {
        return this.ah$b;
    }

    @Override // o.computeDecorFitsWindow
    public void valueOf() throws ContentDataSourceException {
        this.ah$b = null;
        try {
            try {
                FileInputStream fileInputStream = this.ah$a;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.ah$a = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.ag$a;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.ag$a = null;
                        if (this.valueOf) {
                            this.valueOf = false;
                            values();
                        }
                    }
                } catch (IOException e) {
                    throw new ContentDataSourceException(e, 2000);
                }
            } catch (IOException e2) {
                throw new ContentDataSourceException(e2, 2000);
            }
        } catch (Throwable th) {
            this.ah$a = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.ag$a;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.ag$a = null;
                    if (this.valueOf) {
                        this.valueOf = false;
                        values();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new ContentDataSourceException(e3, 2000);
                }
            } finally {
                this.ag$a = null;
                if (this.valueOf) {
                    this.valueOf = false;
                    values();
                }
            }
        }
    }
}

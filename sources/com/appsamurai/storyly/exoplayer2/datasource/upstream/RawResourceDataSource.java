package com.appsamurai.storyly.exoplayer2.datasource.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import o.FingerprintManagerCompat;
import o.SplashScreen;
import o.SplashScreen$Impl31$hierarchyListener$1;
import o.getElevationDegrees;
/* loaded from: classes3.dex */
public final class RawResourceDataSource extends SplashScreen.Impl31 {
    private final Resources HaptikSDK$b;
    private Uri HaptikSDK$c;
    private boolean ag$a;
    private final String ah$a;
    private long toString;
    private InputStream valueOf;
    private AssetFileDescriptor values;

    /* loaded from: classes3.dex */
    public static class RawResourceDataSourceException extends DataSourceException {
        @Deprecated
        public RawResourceDataSourceException(String str) {
            super(str, null, 2000);
        }

        @Deprecated
        public RawResourceDataSourceException(Throwable th) {
            super(th, 2000);
        }

        public RawResourceDataSourceException(String str, Throwable th, int i) {
            super(str, th, i);
        }
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.HaptikSDK$b = context.getResources();
        this.ah$a = context.getPackageName();
    }

    @Override // o.computeDecorFitsWindow
    public long valueOf(SplashScreen$Impl31$hierarchyListener$1 splashScreen$Impl31$hierarchyListener$1) throws RawResourceDataSourceException {
        int parseInt;
        String str;
        Uri uri = splashScreen$Impl31$hierarchyListener$1.HaptikSDK$b;
        this.HaptikSDK$c = uri;
        if (TextUtils.equals(com.google.android.exoplayer2.upstream.RawResourceDataSource.RAW_RESOURCE_SCHEME, uri.getScheme()) || (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1 && ((String) FingerprintManagerCompat.toString(uri.getLastPathSegment())).matches("\\d+"))) {
            try {
                parseInt = Integer.parseInt((String) FingerprintManagerCompat.toString(uri.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
            }
        } else if (TextUtils.equals("android.resource", uri.getScheme())) {
            String str2 = (String) FingerprintManagerCompat.toString(uri.getPath());
            if (str2.startsWith("/")) {
                str2 = str2.substring(1);
            }
            String host = uri.getHost();
            StringBuilder sb = new StringBuilder();
            if (TextUtils.isEmpty(host)) {
                str = "";
            } else {
                str = host + ":";
            }
            sb.append(str);
            sb.append(str2);
            parseInt = this.HaptikSDK$b.getIdentifier(sb.toString(), "raw", this.ah$a);
            if (parseInt == 0) {
                throw new RawResourceDataSourceException("Resource not found.", null, 2005);
            }
        } else {
            throw new RawResourceDataSourceException("URI must either use scheme rawresource or android.resource", null, 1004);
        }
        ah$a(splashScreen$Impl31$hierarchyListener$1);
        try {
            AssetFileDescriptor openRawResourceFd = this.HaptikSDK$b.openRawResourceFd(parseInt);
            this.values = openRawResourceFd;
            if (openRawResourceFd == null) {
                throw new RawResourceDataSourceException("Resource is compressed: " + uri, null, 2000);
            }
            long length = openRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
            this.valueOf = fileInputStream;
            int i = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
            if (i != 0) {
                try {
                    if (splashScreen$Impl31$hierarchyListener$1.HaptikSDK$c > length) {
                        throw new RawResourceDataSourceException(null, null, 2008);
                    }
                } catch (RawResourceDataSourceException e) {
                    throw e;
                } catch (IOException e2) {
                    throw new RawResourceDataSourceException(null, e2, 2000);
                }
            }
            long startOffset = openRawResourceFd.getStartOffset();
            long skip = fileInputStream.skip(splashScreen$Impl31$hierarchyListener$1.HaptikSDK$c + startOffset) - startOffset;
            if (skip != splashScreen$Impl31$hierarchyListener$1.HaptikSDK$c) {
                throw new RawResourceDataSourceException(null, null, 2008);
            }
            if (i == 0) {
                FileChannel channel = fileInputStream.getChannel();
                if (channel.size() == 0) {
                    this.toString = -1L;
                } else {
                    long size = channel.size() - channel.position();
                    this.toString = size;
                    if (size < 0) {
                        throw new RawResourceDataSourceException(null, null, 2008);
                    }
                }
            } else {
                long j = length - skip;
                this.toString = j;
                if (j < 0) {
                    throw new DataSourceException(2008);
                }
            }
            if (splashScreen$Impl31$hierarchyListener$1.ah$b != -1) {
                long j2 = this.toString;
                this.toString = j2 == -1 ? splashScreen$Impl31$hierarchyListener$1.ah$b : Math.min(j2, splashScreen$Impl31$hierarchyListener$1.ah$b);
            }
            this.ag$a = true;
            toString(splashScreen$Impl31$hierarchyListener$1);
            return splashScreen$Impl31$hierarchyListener$1.ah$b != -1 ? splashScreen$Impl31$hierarchyListener$1.ah$b : this.toString;
        } catch (Resources.NotFoundException e3) {
            throw new RawResourceDataSourceException(null, e3, 2005);
        }
    }

    @Override // o.unwrapCryptoObject
    public int values(byte[] bArr, int i, int i2) throws RawResourceDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.toString;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new RawResourceDataSourceException(null, e, 2000);
            }
        }
        int read = ((InputStream) getElevationDegrees.ah$a(this.valueOf)).read(bArr, i, i2);
        if (read == -1) {
            if (this.toString == -1) {
                return -1;
            }
            throw new RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j2 = this.toString;
        if (j2 != -1) {
            this.toString = j2 - read;
        }
        ah$a(read);
        return read;
    }

    @Override // o.computeDecorFitsWindow
    public Uri ah$a() {
        return this.HaptikSDK$c;
    }

    @Override // o.computeDecorFitsWindow
    public void valueOf() throws RawResourceDataSourceException {
        this.HaptikSDK$c = null;
        try {
            try {
                InputStream inputStream = this.valueOf;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.valueOf = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.values;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.values = null;
                        if (this.ag$a) {
                            this.ag$a = false;
                            values();
                        }
                    }
                } catch (IOException e) {
                    throw new RawResourceDataSourceException(null, e, 2000);
                }
            } catch (IOException e2) {
                throw new RawResourceDataSourceException(null, e2, 2000);
            }
        } catch (Throwable th) {
            this.valueOf = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.values;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.values = null;
                    if (this.ag$a) {
                        this.ag$a = false;
                        values();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new RawResourceDataSourceException(null, e3, 2000);
                }
            } finally {
                this.values = null;
                if (this.ag$a) {
                    this.ag$a = false;
                    values();
                }
            }
        }
    }
}

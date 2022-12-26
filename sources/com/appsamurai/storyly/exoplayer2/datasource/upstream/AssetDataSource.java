package com.appsamurai.storyly.exoplayer2.datasource.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.net.Uri;
import android.view.ViewConfiguration;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import o.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda2;
import o.FingerprintManagerCompat;
import o.SplashScreen;
import o.SplashScreen$Impl31$hierarchyListener$1;
import o.getElevationDegrees;
/* loaded from: classes3.dex */
public final class AssetDataSource extends SplashScreen.Impl31 {
    private static int HaptikSDK$a = 0;
    private static int ah$b = 1;
    private final AssetManager ag$a;
    private long ah$a;
    private boolean toString;
    private Uri valueOf;
    private InputStream values;

    /* loaded from: classes3.dex */
    public static final class AssetDataSourceException extends DataSourceException {
        @Deprecated
        public AssetDataSourceException(IOException iOException) {
            super(iOException, 2000);
        }

        public AssetDataSourceException(Throwable th, int i) {
            super(th, i);
        }
    }

    public AssetDataSource(Context context) {
        super(false);
        this.ag$a = context.getAssets();
    }

    @Override // o.computeDecorFitsWindow
    public long valueOf(SplashScreen$Impl31$hierarchyListener$1 splashScreen$Impl31$hierarchyListener$1) throws AssetDataSourceException {
        String str;
        try {
            int i = ah$b + 27;
            HaptikSDK$a = i % 128;
            Object[] objArr = null;
            try {
                if (i % 2 != 0) {
                    Uri uri = splashScreen$Impl31$hierarchyListener$1.HaptikSDK$b;
                    this.valueOf = uri;
                    str = (String) FingerprintManagerCompat.toString(uri.getPath());
                    int length = objArr.length;
                } else {
                    Uri uri2 = splashScreen$Impl31$hierarchyListener$1.HaptikSDK$b;
                    this.valueOf = uri2;
                    str = (String) FingerprintManagerCompat.toString(uri2.getPath());
                }
                try {
                    boolean z = false;
                    if (((Boolean) String.class.getMethod("startsWith", String.class).invoke(str, "/android_asset/")).booleanValue()) {
                        try {
                            str = (String) String.class.getMethod("substring", Integer.TYPE).invoke(str, 15);
                            try {
                                int i2 = ah$b + 7;
                                HaptikSDK$a = i2 % 128;
                                int i3 = i2 % 2;
                            } catch (Exception e) {
                                throw e;
                            }
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } else {
                        try {
                            if ((((Boolean) String.class.getMethod("startsWith", String.class).invoke(str, "/")).booleanValue() ? 'L' : 'G') != 'G') {
                                int i4 = HaptikSDK$a + 101;
                                ah$b = i4 % 128;
                                int i5 = i4 % 2;
                                try {
                                    str = (String) String.class.getMethod("substring", Integer.TYPE).invoke(str, 1);
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th2;
                                }
                            }
                        } catch (Throwable th3) {
                            Throwable cause3 = th3.getCause();
                            if (cause3 != null) {
                                throw cause3;
                            }
                            throw th3;
                        }
                    }
                    ah$a(splashScreen$Impl31$hierarchyListener$1);
                    try {
                        InputStream inputStream = (InputStream) ((Class) AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda2.valueOf(ViewConfiguration.getFadingEdgeLength() >> 16, (char) Color.green(0), 87 - Color.green(0))).getMethod("ah$a", AssetManager.class, String.class).invoke(null, this.ag$a, str);
                        this.values = inputStream;
                        if (inputStream.skip(splashScreen$Impl31$hierarchyListener$1.HaptikSDK$c) >= splashScreen$Impl31$hierarchyListener$1.HaptikSDK$c) {
                            if (splashScreen$Impl31$hierarchyListener$1.ah$b == -1) {
                                z = true;
                            }
                            if (z) {
                                long available = this.values.available();
                                this.ah$a = available;
                                if ((available == 2147483647L ? 'S' : '+') == 'S') {
                                    this.ah$a = -1L;
                                }
                            } else {
                                this.ah$a = splashScreen$Impl31$hierarchyListener$1.ah$b;
                            }
                            this.toString = true;
                            toString(splashScreen$Impl31$hierarchyListener$1);
                            return this.ah$a;
                        }
                        throw new AssetDataSourceException(null, 2008);
                    } catch (Throwable th4) {
                        Throwable cause4 = th4.getCause();
                        if (cause4 != null) {
                            throw cause4;
                        }
                        throw th4;
                    }
                } catch (Throwable th5) {
                    Throwable cause5 = th5.getCause();
                    if (cause5 != null) {
                        throw cause5;
                    }
                    throw th5;
                }
            } catch (AssetDataSourceException e2) {
                throw e2;
            } catch (IOException e3) {
                throw new AssetDataSourceException(e3, e3 instanceof FileNotFoundException ? 2005 : 2000);
            }
        } catch (Exception e4) {
            throw e4;
        }
    }

    @Override // o.unwrapCryptoObject
    public int values(byte[] bArr, int i, int i2) throws AssetDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.ah$a;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new AssetDataSourceException(e, 2000);
            }
        }
        int read = ((InputStream) getElevationDegrees.ah$a(this.values)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.ah$a;
        if (j2 != -1) {
            this.ah$a = j2 - read;
        }
        ah$a(read);
        return read;
    }

    @Override // o.computeDecorFitsWindow
    public Uri ah$a() {
        return this.valueOf;
    }

    @Override // o.computeDecorFitsWindow
    public void valueOf() throws AssetDataSourceException {
        this.valueOf = null;
        try {
            try {
                InputStream inputStream = this.values;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new AssetDataSourceException(e, 2000);
            }
        } finally {
            this.values = null;
            if (this.toString) {
                this.toString = false;
                values();
            }
        }
    }
}

package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.net.Uri;
import android.view.ViewConfiguration;
import androidx.core.view.ViewCompat;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import o.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda2;
/* loaded from: classes5.dex */
public final class AssetDataSource extends BaseDataSource {
    private static int valueOf = 1;
    private static int values;
    private final AssetManager assetManager;
    private long bytesRemaining;
    private InputStream inputStream;
    private boolean opened;
    private Uri uri;

    /* loaded from: classes5.dex */
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
        this.assetManager = context.getAssets();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public long open(DataSpec dataSpec) throws AssetDataSourceException {
        int i = values + 15;
        valueOf = i % 128;
        int i2 = i % 2;
        try {
            Uri uri = dataSpec.uri;
            this.uri = uri;
            String str = (String) Assertions.checkNotNull(uri.getPath());
            int i3 = values + 121;
            valueOf = i3 % 128;
            int i4 = i3 % 2;
            try {
                if ((((Boolean) String.class.getMethod("startsWith", String.class).invoke(str, "/android_asset/")).booleanValue() ? (char) 11 : (char) 26) != 11) {
                    try {
                        if ((((Boolean) String.class.getMethod("startsWith", String.class).invoke(str, "/")).booleanValue() ? 'L' : 'G') == 'L') {
                            try {
                                str = (String) String.class.getMethod("substring", Integer.TYPE).invoke(str, 1);
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                } else {
                    int i5 = values + 111;
                    valueOf = i5 % 128;
                    int i6 = i5 % 2 == 0 ? 1 : 15;
                    try {
                        int i7 = values + 63;
                        try {
                            valueOf = i7 % 128;
                            int i8 = i7 % 2;
                            try {
                                str = (String) String.class.getMethod("substring", Integer.TYPE).invoke(str, Integer.valueOf(i6));
                            } catch (Throwable th3) {
                                Throwable cause3 = th3.getCause();
                                if (cause3 != null) {
                                    throw cause3;
                                }
                                throw th3;
                            }
                        } catch (Exception e) {
                            throw e;
                        }
                    } catch (Exception e2) {
                        throw e2;
                    }
                }
                transferInitializing(dataSpec);
                try {
                    InputStream inputStream = (InputStream) ((Class) AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda2.valueOf(Color.argb(0, 0, 0, 0), (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), 87 - (ViewConfiguration.getDoubleTapTimeout() >> 16))).getMethod("ah$a", AssetManager.class, String.class).invoke(null, this.assetManager, str);
                    this.inputStream = inputStream;
                    if ((inputStream.skip(dataSpec.position) >= dataSpec.position ? 'a' : 'E') != 'E') {
                        if (dataSpec.length != -1) {
                            int i9 = values + 25;
                            valueOf = i9 % 128;
                            if ((i9 % 2 == 0 ? '7' : '\t') != '7') {
                                this.bytesRemaining = dataSpec.length;
                            } else {
                                this.bytesRemaining = dataSpec.length;
                                int i10 = 64 / 0;
                            }
                        } else {
                            long available = this.inputStream.available();
                            this.bytesRemaining = available;
                            if ((available == 2147483647L ? '3' : 'W') == '3') {
                                this.bytesRemaining = -1L;
                            }
                        }
                        this.opened = true;
                        transferStarted(dataSpec);
                        long j = this.bytesRemaining;
                        int i11 = values + 47;
                        valueOf = i11 % 128;
                        int i12 = i11 % 2;
                        return j;
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
        } catch (AssetDataSourceException e3) {
            throw e3;
        } catch (IOException e4) {
            throw new AssetDataSourceException(e4, e4 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader, com.google.android.exoplayer2.upstream.HttpDataSource
    public int read(byte[] bArr, int i, int i2) throws AssetDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.bytesRemaining;
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
        int read = ((InputStream) Util.castNonNull(this.inputStream)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.bytesRemaining;
        if (j2 != -1) {
            this.bytesRemaining = j2 - read;
        }
        bytesTransferred(read);
        return read;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Uri getUri() {
        return this.uri;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public void close() throws AssetDataSourceException {
        this.uri = null;
        try {
            try {
                InputStream inputStream = this.inputStream;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new AssetDataSourceException(e, 2000);
            }
        } finally {
            this.inputStream = null;
            if (this.opened) {
                this.opened = false;
                transferEnded();
            }
        }
    }
}

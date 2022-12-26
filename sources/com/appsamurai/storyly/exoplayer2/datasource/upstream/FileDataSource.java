package com.appsamurai.storyly.exoplayer2.datasource.upstream;

import android.net.Uri;
import java.io.IOException;
import java.io.RandomAccessFile;
import o.SplashScreen;
import o.SplashScreen$Impl31$hierarchyListener$1;
import o.getElevationDegrees;
/* loaded from: classes3.dex */
public final class FileDataSource extends SplashScreen.Impl31 {
    private boolean ag$a;
    private RandomAccessFile ah$a;
    private Uri valueOf;
    private long values;

    /* loaded from: classes3.dex */
    public static class FileDataSourceException extends DataSourceException {
        @Deprecated
        public FileDataSourceException(Exception exc) {
            super(exc, 2000);
        }

        @Deprecated
        public FileDataSourceException(String str, IOException iOException) {
            super(str, iOException, 2000);
        }

        public FileDataSourceException(Throwable th, int i) {
            super(th, i);
        }

        public FileDataSourceException(String str, Throwable th, int i) {
            super(str, th, i);
        }
    }

    public FileDataSource() {
        super(false);
    }

    @Override // o.computeDecorFitsWindow
    public long valueOf(SplashScreen$Impl31$hierarchyListener$1 splashScreen$Impl31$hierarchyListener$1) throws FileDataSourceException {
        Uri uri = splashScreen$Impl31$hierarchyListener$1.HaptikSDK$b;
        this.valueOf = uri;
        ah$a(splashScreen$Impl31$hierarchyListener$1);
        RandomAccessFile values = values(uri);
        this.ah$a = values;
        try {
            values.seek(splashScreen$Impl31$hierarchyListener$1.HaptikSDK$c);
            long length = splashScreen$Impl31$hierarchyListener$1.ah$b == -1 ? this.ah$a.length() - splashScreen$Impl31$hierarchyListener$1.HaptikSDK$c : splashScreen$Impl31$hierarchyListener$1.ah$b;
            this.values = length;
            if (length < 0) {
                throw new FileDataSourceException(null, null, 2008);
            }
            this.ag$a = true;
            toString(splashScreen$Impl31$hierarchyListener$1);
            return this.values;
        } catch (IOException e) {
            throw new FileDataSourceException(e, 2000);
        }
    }

    @Override // o.unwrapCryptoObject
    public int values(byte[] bArr, int i, int i2) throws FileDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        if (this.values == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) getElevationDegrees.ah$a(this.ah$a)).read(bArr, i, (int) Math.min(this.values, i2));
            if (read > 0) {
                this.values -= read;
                ah$a(read);
            }
            return read;
        } catch (IOException e) {
            throw new FileDataSourceException(e, 2000);
        }
    }

    @Override // o.computeDecorFitsWindow
    public Uri ah$a() {
        return this.valueOf;
    }

    @Override // o.computeDecorFitsWindow
    public void valueOf() throws FileDataSourceException {
        this.valueOf = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.ah$a;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new FileDataSourceException(e, 2000);
            }
        } finally {
            this.ah$a = null;
            if (this.ag$a) {
                this.ag$a = false;
                values();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
        if (r4 != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.io.RandomAccessFile values(android.net.Uri r4) throws com.appsamurai.storyly.exoplayer2.datasource.upstream.FileDataSource.FileDataSourceException {
        /*
            r0 = 2006(0x7d6, float:2.811E-42)
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.RuntimeException -> L14 java.lang.SecurityException -> L1d java.io.FileNotFoundException -> L24
            java.lang.String r2 = r4.getPath()     // Catch: java.lang.RuntimeException -> L14 java.lang.SecurityException -> L1d java.io.FileNotFoundException -> L24
            java.lang.Object r2 = o.FingerprintManagerCompat.toString(r2)     // Catch: java.lang.RuntimeException -> L14 java.lang.SecurityException -> L1d java.io.FileNotFoundException -> L24
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.RuntimeException -> L14 java.lang.SecurityException -> L1d java.io.FileNotFoundException -> L24
            java.lang.String r3 = "r"
            r1.<init>(r2, r3)     // Catch: java.lang.RuntimeException -> L14 java.lang.SecurityException -> L1d java.io.FileNotFoundException -> L24
            return r1
        L14:
            r4 = move-exception
            com.appsamurai.storyly.exoplayer2.datasource.upstream.FileDataSource$FileDataSourceException r0 = new com.appsamurai.storyly.exoplayer2.datasource.upstream.FileDataSource$FileDataSourceException
            r1 = 2000(0x7d0, float:2.803E-42)
            r0.<init>(r4, r1)
            throw r0
        L1d:
            r4 = move-exception
            com.appsamurai.storyly.exoplayer2.datasource.upstream.FileDataSource$FileDataSourceException r1 = new com.appsamurai.storyly.exoplayer2.datasource.upstream.FileDataSource$FileDataSourceException
            r1.<init>(r4, r0)
            throw r1
        L24:
            r1 = move-exception
            java.lang.String r2 = r4.getQuery()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L52
            java.lang.String r2 = r4.getFragment()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L52
            int r4 = o.getElevationDegrees.HaptikSDK$b
            r2 = 21
            if (r4 < r2) goto L4a
            java.lang.Throwable r4 = r1.getCause()
            boolean r4 = com.appsamurai.storyly.exoplayer2.datasource.upstream.FileDataSource$ah$a.ah$a(r4)
            if (r4 == 0) goto L4a
            goto L4c
        L4a:
            r0 = 2005(0x7d5, float:2.81E-42)
        L4c:
            com.appsamurai.storyly.exoplayer2.datasource.upstream.FileDataSource$FileDataSourceException r4 = new com.appsamurai.storyly.exoplayer2.datasource.upstream.FileDataSource$FileDataSourceException
            r4.<init>(r1, r0)
            throw r4
        L52:
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            java.lang.String r3 = r4.getPath()
            r0[r2] = r3
            r2 = 1
            java.lang.String r3 = r4.getQuery()
            r0[r2] = r3
            r2 = 2
            java.lang.String r4 = r4.getFragment()
            r0[r2] = r4
            com.appsamurai.storyly.exoplayer2.datasource.upstream.FileDataSource$FileDataSourceException r4 = new com.appsamurai.storyly.exoplayer2.datasource.upstream.FileDataSource$FileDataSourceException
            java.lang.String r2 = "uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            r2 = 1004(0x3ec, float:1.407E-42)
            r4.<init>(r0, r1, r2)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsamurai.storyly.exoplayer2.datasource.upstream.FileDataSource.values(android.net.Uri):java.io.RandomAccessFile");
    }
}

package com.appsamurai.storyly.exoplayer2.datasource.upstream;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.Map;
import o.SplashScreen$Impl31$hierarchyListener$1;
import o.SplashScreenViewProvider;
import o.computeDecorFitsWindow;
import o.findViewHolder;
import o.getElevationDegrees;
import o.postponeAndUpdateViewHolders;
/* loaded from: classes3.dex */
public interface HttpDataSource extends computeDecorFitsWindow {
    public static final findViewHolder<String> valueOf = SplashScreenViewProvider.ah$a;

    /* loaded from: classes3.dex */
    public static class HttpDataSourceException extends DataSourceException {
        public static final int TYPE_CLOSE = 3;
        public static final int TYPE_OPEN = 1;
        public static final int TYPE_READ = 2;
        public final SplashScreen$Impl31$hierarchyListener$1 dataSpec;
        public final int type;

        private static int assignErrorCode(int i, int i2) {
            if (i == 2000 && i2 == 1) {
                return 2001;
            }
            return i;
        }

        public static HttpDataSourceException createForIOException(IOException iOException, SplashScreen$Impl31$hierarchyListener$1 splashScreen$Impl31$hierarchyListener$1, int i) {
            int i2;
            String message = iOException.getMessage();
            if (iOException instanceof SocketTimeoutException) {
                i2 = 2002;
            } else if (iOException instanceof InterruptedIOException) {
                i2 = 1004;
            } else {
                i2 = (message == null || !postponeAndUpdateViewHolders.valueOf(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
            }
            if (i2 == 2007) {
                return new CleartextNotPermittedException(iOException, splashScreen$Impl31$hierarchyListener$1);
            }
            return new HttpDataSourceException(iOException, splashScreen$Impl31$hierarchyListener$1, i2, i);
        }

        @Deprecated
        public HttpDataSourceException(SplashScreen$Impl31$hierarchyListener$1 splashScreen$Impl31$hierarchyListener$1, int i) {
            this(splashScreen$Impl31$hierarchyListener$1, 2000, i);
        }

        public HttpDataSourceException(SplashScreen$Impl31$hierarchyListener$1 splashScreen$Impl31$hierarchyListener$1, int i, int i2) {
            super(assignErrorCode(i, i2));
            this.dataSpec = splashScreen$Impl31$hierarchyListener$1;
            this.type = i2;
        }

        @Deprecated
        public HttpDataSourceException(String str, SplashScreen$Impl31$hierarchyListener$1 splashScreen$Impl31$hierarchyListener$1, int i) {
            this(str, splashScreen$Impl31$hierarchyListener$1, 2000, i);
        }

        public HttpDataSourceException(String str, SplashScreen$Impl31$hierarchyListener$1 splashScreen$Impl31$hierarchyListener$1, int i, int i2) {
            super(str, assignErrorCode(i, i2));
            this.dataSpec = splashScreen$Impl31$hierarchyListener$1;
            this.type = i2;
        }

        @Deprecated
        public HttpDataSourceException(IOException iOException, SplashScreen$Impl31$hierarchyListener$1 splashScreen$Impl31$hierarchyListener$1, int i) {
            this(iOException, splashScreen$Impl31$hierarchyListener$1, 2000, i);
        }

        public HttpDataSourceException(IOException iOException, SplashScreen$Impl31$hierarchyListener$1 splashScreen$Impl31$hierarchyListener$1, int i, int i2) {
            super(iOException, assignErrorCode(i, i2));
            this.dataSpec = splashScreen$Impl31$hierarchyListener$1;
            this.type = i2;
        }

        @Deprecated
        public HttpDataSourceException(String str, IOException iOException, SplashScreen$Impl31$hierarchyListener$1 splashScreen$Impl31$hierarchyListener$1, int i) {
            this(str, iOException, splashScreen$Impl31$hierarchyListener$1, 2000, i);
        }

        public HttpDataSourceException(String str, IOException iOException, SplashScreen$Impl31$hierarchyListener$1 splashScreen$Impl31$hierarchyListener$1, int i, int i2) {
            super(str, iOException, assignErrorCode(i, i2));
            this.dataSpec = splashScreen$Impl31$hierarchyListener$1;
            this.type = i2;
        }
    }

    /* loaded from: classes3.dex */
    public static final class CleartextNotPermittedException extends HttpDataSourceException {
        public CleartextNotPermittedException(IOException iOException, SplashScreen$Impl31$hierarchyListener$1 splashScreen$Impl31$hierarchyListener$1) {
            super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, splashScreen$Impl31$hierarchyListener$1, 2007, 1);
        }
    }

    /* loaded from: classes3.dex */
    public static final class InvalidContentTypeException extends HttpDataSourceException {
        public final String contentType;

        public InvalidContentTypeException(String str, SplashScreen$Impl31$hierarchyListener$1 splashScreen$Impl31$hierarchyListener$1) {
            super("Invalid content type: " + str, splashScreen$Impl31$hierarchyListener$1, 2003, 1);
            this.contentType = str;
        }
    }

    /* loaded from: classes3.dex */
    public static final class InvalidResponseCodeException extends HttpDataSourceException {
        public final Map<String, List<String>> headerFields;
        public final byte[] responseBody;
        public final int responseCode;
        public final String responseMessage;

        @Deprecated
        public InvalidResponseCodeException(int i, Map<String, List<String>> map, SplashScreen$Impl31$hierarchyListener$1 splashScreen$Impl31$hierarchyListener$1) {
            this(i, null, null, map, splashScreen$Impl31$hierarchyListener$1, getElevationDegrees.values);
        }

        @Deprecated
        public InvalidResponseCodeException(int i, String str, Map<String, List<String>> map, SplashScreen$Impl31$hierarchyListener$1 splashScreen$Impl31$hierarchyListener$1) {
            this(i, str, null, map, splashScreen$Impl31$hierarchyListener$1, getElevationDegrees.values);
        }

        public InvalidResponseCodeException(int i, String str, IOException iOException, Map<String, List<String>> map, SplashScreen$Impl31$hierarchyListener$1 splashScreen$Impl31$hierarchyListener$1, byte[] bArr) {
            super("Response code: " + i, iOException, splashScreen$Impl31$hierarchyListener$1, 2004, 1);
            this.responseCode = i;
            this.responseMessage = str;
            this.headerFields = map;
            this.responseBody = bArr;
        }
    }
}

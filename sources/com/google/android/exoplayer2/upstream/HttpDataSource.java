package com.google.android.exoplayer2.upstream;

import android.text.TextUtils;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.findViewHolder;
import o.postponeAndUpdateViewHolders;
/* loaded from: classes5.dex */
public interface HttpDataSource extends DataSource {
    public static final findViewHolder<String> REJECT_PAYWALL_TYPES = HttpDataSource$$ExternalSyntheticLambda0.INSTANCE;

    void clearAllRequestProperties();

    void clearRequestProperty(String str);

    @Override // 
    void close() throws HttpDataSourceException;

    int getResponseCode();

    @Override // 
    Map<String, List<String>> getResponseHeaders();

    @Override // 
    long open(DataSpec dataSpec) throws HttpDataSourceException;

    @Override // 
    int read(byte[] bArr, int i, int i2) throws HttpDataSourceException;

    void setRequestProperty(String str, String str2);

    /* loaded from: classes5.dex */
    public interface Factory extends DataSource.Factory {
        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        HttpDataSource createDataSource();

        Factory setDefaultRequestProperties(Map<String, String> map);

        /* renamed from: com.google.android.exoplayer2.upstream.HttpDataSource$Factory$-CC  reason: invalid class name */
        /* loaded from: classes7.dex */
        public final /* synthetic */ class CC {
        }
    }

    /* loaded from: classes5.dex */
    public static final class RequestProperties {
        private final Map<String, String> requestProperties = new HashMap();
        private Map<String, String> requestPropertiesSnapshot;

        public void set(String str, String str2) {
            synchronized (this) {
                this.requestPropertiesSnapshot = null;
                this.requestProperties.put(str, str2);
            }
        }

        public void set(Map<String, String> map) {
            synchronized (this) {
                this.requestPropertiesSnapshot = null;
                this.requestProperties.putAll(map);
            }
        }

        public void clearAndSet(Map<String, String> map) {
            synchronized (this) {
                this.requestPropertiesSnapshot = null;
                this.requestProperties.clear();
                this.requestProperties.putAll(map);
            }
        }

        public void remove(String str) {
            synchronized (this) {
                this.requestPropertiesSnapshot = null;
                this.requestProperties.remove(str);
            }
        }

        public void clear() {
            synchronized (this) {
                this.requestPropertiesSnapshot = null;
                this.requestProperties.clear();
            }
        }

        public Map<String, String> getSnapshot() {
            Map<String, String> map;
            synchronized (this) {
                if (this.requestPropertiesSnapshot == null) {
                    this.requestPropertiesSnapshot = Collections.unmodifiableMap(new HashMap(this.requestProperties));
                }
                map = this.requestPropertiesSnapshot;
            }
            return map;
        }
    }

    /* loaded from: classes7.dex */
    public static abstract class BaseFactory implements Factory {
        private final RequestProperties defaultRequestProperties = new RequestProperties();

        protected abstract HttpDataSource createDataSourceInternal(RequestProperties requestProperties);

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory, com.google.android.exoplayer2.upstream.DataSource.Factory
        public final HttpDataSource createDataSource() {
            return createDataSourceInternal(this.defaultRequestProperties);
        }

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory
        public final Factory setDefaultRequestProperties(Map<String, String> map) {
            this.defaultRequestProperties.clearAndSet(map);
            return this;
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.HttpDataSource$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        static {
            findViewHolder<String> findviewholder = HttpDataSource.REJECT_PAYWALL_TYPES;
        }

        public static /* synthetic */ boolean lambda$static$0(String str) {
            if (str == null) {
                return false;
            }
            String valueOf = postponeAndUpdateViewHolders.valueOf(str);
            if (TextUtils.isEmpty(valueOf)) {
                return false;
            }
            return ((valueOf.contains("text") && !valueOf.contains(MimeTypes.TEXT_VTT)) || valueOf.contains("html") || valueOf.contains("xml")) ? false : true;
        }
    }

    /* loaded from: classes5.dex */
    public static class HttpDataSourceException extends DataSourceException {
        public static final int TYPE_CLOSE = 3;
        public static final int TYPE_OPEN = 1;
        public static final int TYPE_READ = 2;
        public final DataSpec dataSpec;
        public final int type;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface Type {
        }

        private static int assignErrorCode(int i, int i2) {
            if (i == 2000 && i2 == 1) {
                return 2001;
            }
            return i;
        }

        public static HttpDataSourceException createForIOException(IOException iOException, DataSpec dataSpec, int i) {
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
                return new CleartextNotPermittedException(iOException, dataSpec);
            }
            return new HttpDataSourceException(iOException, dataSpec, i2, i);
        }

        @Deprecated
        public HttpDataSourceException(DataSpec dataSpec, int i) {
            this(dataSpec, 2000, i);
        }

        public HttpDataSourceException(DataSpec dataSpec, int i, int i2) {
            super(assignErrorCode(i, i2));
            this.dataSpec = dataSpec;
            this.type = i2;
        }

        @Deprecated
        public HttpDataSourceException(String str, DataSpec dataSpec, int i) {
            this(str, dataSpec, 2000, i);
        }

        public HttpDataSourceException(String str, DataSpec dataSpec, int i, int i2) {
            super(str, assignErrorCode(i, i2));
            this.dataSpec = dataSpec;
            this.type = i2;
        }

        @Deprecated
        public HttpDataSourceException(IOException iOException, DataSpec dataSpec, int i) {
            this(iOException, dataSpec, 2000, i);
        }

        public HttpDataSourceException(IOException iOException, DataSpec dataSpec, int i, int i2) {
            super(iOException, assignErrorCode(i, i2));
            this.dataSpec = dataSpec;
            this.type = i2;
        }

        @Deprecated
        public HttpDataSourceException(String str, IOException iOException, DataSpec dataSpec, int i) {
            this(str, iOException, dataSpec, 2000, i);
        }

        public HttpDataSourceException(String str, IOException iOException, DataSpec dataSpec, int i, int i2) {
            super(str, iOException, assignErrorCode(i, i2));
            this.dataSpec = dataSpec;
            this.type = i2;
        }
    }

    /* loaded from: classes5.dex */
    public static final class CleartextNotPermittedException extends HttpDataSourceException {
        public CleartextNotPermittedException(IOException iOException, DataSpec dataSpec) {
            super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, dataSpec, 2007, 1);
        }
    }

    /* loaded from: classes5.dex */
    public static final class InvalidContentTypeException extends HttpDataSourceException {
        public final String contentType;

        public InvalidContentTypeException(String str, DataSpec dataSpec) {
            super("Invalid content type: " + str, dataSpec, 2003, 1);
            this.contentType = str;
        }
    }

    /* loaded from: classes5.dex */
    public static final class InvalidResponseCodeException extends HttpDataSourceException {
        public final Map<String, List<String>> headerFields;
        public final byte[] responseBody;
        public final int responseCode;
        public final String responseMessage;

        @Deprecated
        public InvalidResponseCodeException(int i, Map<String, List<String>> map, DataSpec dataSpec) {
            this(i, null, null, map, dataSpec, Util.EMPTY_BYTE_ARRAY);
        }

        @Deprecated
        public InvalidResponseCodeException(int i, String str, Map<String, List<String>> map, DataSpec dataSpec) {
            this(i, str, null, map, dataSpec, Util.EMPTY_BYTE_ARRAY);
        }

        public InvalidResponseCodeException(int i, String str, IOException iOException, Map<String, List<String>> map, DataSpec dataSpec, byte[] bArr) {
            super("Response code: " + i, iOException, dataSpec, 2004, 1);
            this.responseCode = i;
            this.responseMessage = str;
            this.headerFields = map;
            this.responseBody = bArr;
        }
    }
}

package com.sendbird.android.shadow.okhttp3;

import com.sendbird.android.shadow.okhttp3.internal.Util;
import com.sendbird.android.shadow.okio.BufferedSink;
import com.sendbird.android.shadow.okio.ByteString;
import com.sendbird.android.shadow.okio.Okio;
import com.sendbird.android.shadow.okio.Source;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;
/* loaded from: classes5.dex */
public abstract class RequestBody {
    public long contentLength() throws IOException {
        return -1L;
    }

    public abstract MediaType contentType();

    public abstract void writeTo(BufferedSink bufferedSink) throws IOException;

    public static RequestBody create(MediaType mediaType, String str) {
        Charset charset = Util.UTF_8;
        if (mediaType != null && (charset = mediaType.charset()) == null) {
            charset = Util.UTF_8;
            mediaType = MediaType.parse(mediaType + "; charset=utf-8");
        }
        return create(mediaType, str.getBytes(charset));
    }

    public static RequestBody create(final MediaType mediaType, final ByteString byteString) {
        return new RequestBody() { // from class: com.sendbird.android.shadow.okhttp3.RequestBody.1
            @Override // com.sendbird.android.shadow.okhttp3.RequestBody
            public MediaType contentType() {
                return MediaType.this;
            }

            @Override // com.sendbird.android.shadow.okhttp3.RequestBody
            public long contentLength() throws IOException {
                return byteString.size();
            }

            @Override // com.sendbird.android.shadow.okhttp3.RequestBody
            public void writeTo(BufferedSink bufferedSink) throws IOException {
                bufferedSink.write(byteString);
            }
        };
    }

    public static RequestBody create(MediaType mediaType, byte[] bArr) {
        return create(mediaType, bArr, 0, bArr.length);
    }

    public static RequestBody create(final MediaType mediaType, final byte[] bArr, final int i, final int i2) {
        Objects.requireNonNull(bArr, "content == null");
        Util.checkOffsetAndCount(bArr.length, i, i2);
        return new RequestBody() { // from class: com.sendbird.android.shadow.okhttp3.RequestBody.2
            @Override // com.sendbird.android.shadow.okhttp3.RequestBody
            public MediaType contentType() {
                return MediaType.this;
            }

            @Override // com.sendbird.android.shadow.okhttp3.RequestBody
            public long contentLength() {
                return i2;
            }

            @Override // com.sendbird.android.shadow.okhttp3.RequestBody
            public void writeTo(BufferedSink bufferedSink) throws IOException {
                bufferedSink.write(bArr, i, i2);
            }
        };
    }

    public static RequestBody create(final MediaType mediaType, final File file) {
        Objects.requireNonNull(file, "file == null");
        return new RequestBody() { // from class: com.sendbird.android.shadow.okhttp3.RequestBody.3
            @Override // com.sendbird.android.shadow.okhttp3.RequestBody
            public MediaType contentType() {
                return MediaType.this;
            }

            @Override // com.sendbird.android.shadow.okhttp3.RequestBody
            public long contentLength() {
                return file.length();
            }

            @Override // com.sendbird.android.shadow.okhttp3.RequestBody
            public void writeTo(BufferedSink bufferedSink) throws IOException {
                Source source = null;
                try {
                    source = Okio.source(file);
                    bufferedSink.writeAll(source);
                } finally {
                    Util.closeQuietly(source);
                }
            }
        };
    }
}

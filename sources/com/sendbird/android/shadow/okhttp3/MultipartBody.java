package com.sendbird.android.shadow.okhttp3;

import androidx.browser.trusted.sharing.ShareTarget;
import com.sendbird.android.shadow.okhttp3.Headers;
import com.sendbird.android.shadow.okhttp3.internal.Util;
import com.sendbird.android.shadow.okio.Buffer;
import com.sendbird.android.shadow.okio.BufferedSink;
import com.sendbird.android.shadow.okio.ByteString;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
/* loaded from: classes7.dex */
public final class MultipartBody extends RequestBody {
    private final ByteString boundary;
    private long contentLength = -1;
    private final MediaType contentType;
    private final MediaType originalType;
    private final List<Part> parts;
    public static final MediaType MIXED = MediaType.get("multipart/mixed");
    public static final MediaType ALTERNATIVE = MediaType.get("multipart/alternative");
    public static final MediaType DIGEST = MediaType.get("multipart/digest");
    public static final MediaType PARALLEL = MediaType.get("multipart/parallel");
    public static final MediaType FORM = MediaType.get(ShareTarget.ENCODING_TYPE_MULTIPART);
    private static final byte[] COLONSPACE = {58, 32};
    private static final byte[] CRLF = {13, 10};
    private static final byte[] DASHDASH = {45, 45};

    MultipartBody(ByteString byteString, MediaType mediaType, List<Part> list) {
        this.boundary = byteString;
        this.originalType = mediaType;
        this.contentType = MediaType.get(mediaType + "; boundary=" + byteString.utf8());
        this.parts = Util.immutableList(list);
    }

    public MediaType type() {
        return this.originalType;
    }

    public String boundary() {
        return this.boundary.utf8();
    }

    public int size() {
        return this.parts.size();
    }

    public List<Part> parts() {
        return this.parts;
    }

    public Part part(int i) {
        return this.parts.get(i);
    }

    @Override // com.sendbird.android.shadow.okhttp3.RequestBody
    public MediaType contentType() {
        return this.contentType;
    }

    @Override // com.sendbird.android.shadow.okhttp3.RequestBody
    public long contentLength() throws IOException {
        long j = this.contentLength;
        if (j != -1) {
            return j;
        }
        long writeOrCountBytes = writeOrCountBytes(null, true);
        this.contentLength = writeOrCountBytes;
        return writeOrCountBytes;
    }

    @Override // com.sendbird.android.shadow.okhttp3.RequestBody
    public void writeTo(BufferedSink bufferedSink) throws IOException {
        writeOrCountBytes(bufferedSink, false);
    }

    private long writeOrCountBytes(BufferedSink bufferedSink, boolean z) throws IOException {
        Buffer buffer;
        Buffer buffer2;
        if (z) {
            buffer2 = new Buffer();
            buffer = buffer2;
        } else {
            buffer = bufferedSink;
            buffer2 = null;
        }
        int size = this.parts.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Part part = this.parts.get(i);
            Headers headers = part.headers;
            RequestBody requestBody = part.body;
            buffer.write(DASHDASH);
            buffer.write(this.boundary);
            buffer.write(CRLF);
            if (headers != null) {
                int size2 = headers.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    buffer.writeUtf8(headers.name(i2)).write(COLONSPACE).writeUtf8(headers.value(i2)).write(CRLF);
                }
            }
            MediaType contentType = requestBody.contentType();
            if (contentType != null) {
                buffer.writeUtf8("Content-Type: ").writeUtf8(contentType.toString()).write(CRLF);
            }
            long contentLength = requestBody.contentLength();
            if (contentLength != -1) {
                buffer.writeUtf8("Content-Length: ").writeDecimalLong(contentLength).write(CRLF);
            } else if (z) {
                buffer2.clear();
                return -1L;
            }
            byte[] bArr = CRLF;
            buffer.write(bArr);
            if (z) {
                j += contentLength;
            } else {
                requestBody.writeTo(buffer);
            }
            buffer.write(bArr);
        }
        byte[] bArr2 = DASHDASH;
        buffer.write(bArr2);
        buffer.write(this.boundary);
        buffer.write(bArr2);
        buffer.write(CRLF);
        if (z) {
            long size3 = j + buffer2.size();
            buffer2.clear();
            return size3;
        }
        return j;
    }

    static StringBuilder appendQuotedString(StringBuilder sb, String str) {
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\n') {
                sb.append("%0A");
            } else if (charAt == '\r') {
                sb.append("%0D");
            } else if (charAt == '\"') {
                sb.append("%22");
            } else {
                sb.append(charAt);
            }
        }
        sb.append('\"');
        return sb;
    }

    /* loaded from: classes7.dex */
    public static final class Part {
        final RequestBody body;
        final Headers headers;

        public static Part create(RequestBody requestBody) {
            return create(null, requestBody);
        }

        public static Part create(Headers headers, RequestBody requestBody) {
            Objects.requireNonNull(requestBody, "body == null");
            if (headers != null && headers.get("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            }
            if (headers != null && headers.get("Content-Length") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }
            return new Part(headers, requestBody);
        }

        public static Part createFormData(String str, String str2) {
            return createFormData(str, null, RequestBody.create((MediaType) null, str2));
        }

        public static Part createFormData(String str, String str2, RequestBody requestBody) {
            Objects.requireNonNull(str, "name == null");
            StringBuilder sb = new StringBuilder("form-data; name=");
            MultipartBody.appendQuotedString(sb, str);
            if (str2 != null) {
                sb.append("; filename=");
                MultipartBody.appendQuotedString(sb, str2);
            }
            return create(new Headers.Builder().addUnsafeNonAscii("Content-Disposition", sb.toString()).build(), requestBody);
        }

        private Part(Headers headers, RequestBody requestBody) {
            this.headers = headers;
            this.body = requestBody;
        }

        public Headers headers() {
            return this.headers;
        }

        public RequestBody body() {
            return this.body;
        }
    }

    /* loaded from: classes7.dex */
    public static final class Builder {
        private final ByteString boundary;
        private final List<Part> parts;
        private MediaType type;

        public Builder() {
            this(UUID.randomUUID().toString());
        }

        public Builder(String str) {
            this.type = MultipartBody.MIXED;
            this.parts = new ArrayList();
            this.boundary = ByteString.encodeUtf8(str);
        }

        public Builder setType(MediaType mediaType) {
            Objects.requireNonNull(mediaType, "type == null");
            if (!mediaType.type().equals("multipart")) {
                throw new IllegalArgumentException("multipart != " + mediaType);
            }
            this.type = mediaType;
            return this;
        }

        public Builder addPart(RequestBody requestBody) {
            return addPart(Part.create(requestBody));
        }

        public Builder addPart(Headers headers, RequestBody requestBody) {
            return addPart(Part.create(headers, requestBody));
        }

        public Builder addFormDataPart(String str, String str2) {
            return addPart(Part.createFormData(str, str2));
        }

        public Builder addFormDataPart(String str, String str2, RequestBody requestBody) {
            return addPart(Part.createFormData(str, str2, requestBody));
        }

        public Builder addPart(Part part) {
            Objects.requireNonNull(part, "part == null");
            this.parts.add(part);
            return this;
        }

        public MultipartBody build() {
            if (this.parts.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new MultipartBody(this.boundary, this.type, this.parts);
        }
    }
}
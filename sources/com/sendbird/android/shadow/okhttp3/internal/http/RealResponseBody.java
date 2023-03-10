package com.sendbird.android.shadow.okhttp3.internal.http;

import com.sendbird.android.shadow.okhttp3.MediaType;
import com.sendbird.android.shadow.okhttp3.ResponseBody;
import com.sendbird.android.shadow.okio.BufferedSource;
/* loaded from: classes5.dex */
public final class RealResponseBody extends ResponseBody {
    private final long contentLength;
    private final String contentTypeString;
    private final BufferedSource source;

    public RealResponseBody(String str, long j, BufferedSource bufferedSource) {
        this.contentTypeString = str;
        this.contentLength = j;
        this.source = bufferedSource;
    }

    @Override // com.sendbird.android.shadow.okhttp3.ResponseBody
    public MediaType contentType() {
        String str = this.contentTypeString;
        if (str != null) {
            return MediaType.parse(str);
        }
        return null;
    }

    @Override // com.sendbird.android.shadow.okhttp3.ResponseBody
    public long contentLength() {
        return this.contentLength;
    }

    @Override // com.sendbird.android.shadow.okhttp3.ResponseBody
    public BufferedSource source() {
        return this.source;
    }
}

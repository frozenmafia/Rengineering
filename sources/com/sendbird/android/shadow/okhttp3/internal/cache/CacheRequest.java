package com.sendbird.android.shadow.okhttp3.internal.cache;

import com.sendbird.android.shadow.okio.Sink;
import java.io.IOException;
/* loaded from: classes5.dex */
public interface CacheRequest {
    void abort();

    Sink body() throws IOException;
}

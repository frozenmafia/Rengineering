package com.sendbird.android.shadow.okio;

import java.io.IOException;
/* loaded from: classes5.dex */
public abstract class ForwardingSource implements Source {
    private final Source delegate;

    public ForwardingSource(Source source) {
        if (source == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.delegate = source;
    }

    public final Source delegate() {
        return this.delegate;
    }

    @Override // com.sendbird.android.shadow.okio.Source
    public long read(Buffer buffer, long j) throws IOException {
        return this.delegate.read(buffer, j);
    }

    @Override // com.sendbird.android.shadow.okio.Source
    public Timeout timeout() {
        return this.delegate.timeout();
    }

    @Override // com.sendbird.android.shadow.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.delegate.toString() + ")";
    }
}

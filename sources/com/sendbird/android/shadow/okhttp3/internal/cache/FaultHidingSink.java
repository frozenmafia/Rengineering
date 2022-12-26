package com.sendbird.android.shadow.okhttp3.internal.cache;

import com.sendbird.android.shadow.okio.Buffer;
import com.sendbird.android.shadow.okio.ForwardingSink;
import com.sendbird.android.shadow.okio.Sink;
import java.io.IOException;
/* loaded from: classes7.dex */
class FaultHidingSink extends ForwardingSink {
    private boolean hasErrors;

    protected void onException(IOException iOException) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FaultHidingSink(Sink sink) {
        super(sink);
    }

    @Override // com.sendbird.android.shadow.okio.ForwardingSink, com.sendbird.android.shadow.okio.Sink
    public void write(Buffer buffer, long j) throws IOException {
        if (this.hasErrors) {
            buffer.skip(j);
            return;
        }
        try {
            super.write(buffer, j);
        } catch (IOException e) {
            this.hasErrors = true;
            onException(e);
        }
    }

    @Override // com.sendbird.android.shadow.okio.ForwardingSink, com.sendbird.android.shadow.okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.hasErrors = true;
            onException(e);
        }
    }

    @Override // com.sendbird.android.shadow.okio.ForwardingSink, com.sendbird.android.shadow.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.hasErrors = true;
            onException(e);
        }
    }
}

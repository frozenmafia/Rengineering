package org.chromium.net;

import java.nio.ByteBuffer;
/* loaded from: classes8.dex */
final class UploadDataProviders$ag$a extends UploadDataProvider {
    private final ByteBuffer values;

    private UploadDataProviders$ag$a(ByteBuffer byteBuffer) {
        this.values = byteBuffer;
    }

    @Override // org.chromium.net.UploadDataProvider
    public long getLength() {
        return this.values.limit();
    }

    @Override // org.chromium.net.UploadDataProvider
    public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
        }
        if (byteBuffer.remaining() >= this.values.remaining()) {
            byteBuffer.put(this.values);
        } else {
            int limit = this.values.limit();
            ByteBuffer byteBuffer2 = this.values;
            byteBuffer2.limit(byteBuffer2.position() + byteBuffer.remaining());
            byteBuffer.put(this.values);
            this.values.limit(limit);
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public void rewind(UploadDataSink uploadDataSink) {
        this.values.position(0);
        uploadDataSink.onRewindSucceeded();
    }
}

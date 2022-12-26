package org.chromium.net;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
/* loaded from: classes8.dex */
public final class UploadDataProviders {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes8.dex */
    public interface values {
        FileChannel valueOf() throws IOException;
    }

    public static UploadDataProvider create(final File file) {
        return new toString(new values() { // from class: org.chromium.net.UploadDataProviders.2
            @Override // org.chromium.net.UploadDataProviders.values
            public FileChannel valueOf() throws IOException {
                return new FileInputStream(file).getChannel();
            }
        });
    }

    public static UploadDataProvider create(final ParcelFileDescriptor parcelFileDescriptor) {
        return new toString(new values() { // from class: org.chromium.net.UploadDataProviders.5
            @Override // org.chromium.net.UploadDataProviders.values
            public FileChannel valueOf() throws IOException {
                if (parcelFileDescriptor.getStatSize() != -1) {
                    return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
                }
                parcelFileDescriptor.close();
                throw new IllegalArgumentException("Not a file: " + parcelFileDescriptor);
            }
        });
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new UploadDataProviders$ag$a(byteBuffer.slice());
    }

    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return new UploadDataProviders$ag$a(ByteBuffer.wrap(bArr, i, i2).slice());
    }

    public static UploadDataProvider create(byte[] bArr) {
        return create(bArr, 0, bArr.length);
    }

    /* loaded from: classes8.dex */
    static final class toString extends UploadDataProvider {
        private volatile FileChannel ah$a;
        private final Object toString;
        private final values valueOf;

        private toString(values valuesVar) {
            this.toString = new Object();
            this.valueOf = valuesVar;
        }

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() throws IOException {
            return valueOf().size();
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
            if (!byteBuffer.hasRemaining()) {
                throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
            }
            FileChannel valueOf = valueOf();
            int i = 0;
            while (i == 0) {
                int read = valueOf.read(byteBuffer);
                if (read == -1) {
                    break;
                }
                i += read;
            }
            uploadDataSink.onReadSucceeded(false);
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) throws IOException {
            valueOf().position(0L);
            uploadDataSink.onRewindSucceeded();
        }

        private FileChannel valueOf() throws IOException {
            if (this.ah$a == null) {
                synchronized (this.toString) {
                    if (this.ah$a == null) {
                        this.ah$a = this.valueOf.valueOf();
                    }
                }
            }
            return this.ah$a;
        }

        @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            FileChannel fileChannel = this.ah$a;
            if (fileChannel != null) {
                fileChannel.close();
            }
        }
    }

    private UploadDataProviders() {
    }
}

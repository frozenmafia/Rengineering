package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes7.dex */
final class convertBitmapForColorMode extends FilterInputStream {
    private boolean toString;

    /* JADX INFO: Access modifiers changed from: package-private */
    public convertBitmapForColorMode(InputStream inputStream) {
        super(inputStream);
        this.toString = false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.toString || this.in == null) {
            return;
        }
        try {
            onFailedToRecycleView.valueOf(this);
            ((FilterInputStream) this).in.close();
        } finally {
            this.toString = true;
        }
    }
}

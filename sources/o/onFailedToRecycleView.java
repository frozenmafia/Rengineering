package o;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* loaded from: classes7.dex */
public final class onFailedToRecycleView {
    private static final OutputStream values = new OutputStream() { // from class: o.onFailedToRecycleView.5
        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            markViewHoldersUpdated.toString(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            markViewHoldersUpdated.toString(bArr);
        }
    };

    static byte[] values() {
        return new byte[8192];
    }

    public static long valueOf(InputStream inputStream) throws IOException {
        byte[] values2 = values();
        long j = 0;
        while (true) {
            long read = inputStream.read(values2);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }
}

package o;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
/* loaded from: classes5.dex */
public final class setExitAction {
    public static /* synthetic */ long values(InputStream inputStream, OutputStream outputStream, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return toString(inputStream, outputStream, i);
    }

    public static final long toString(InputStream inputStream, OutputStream outputStream, int i) {
        runAnimators.ag$a(inputStream, "<this>");
        runAnimators.ag$a(outputStream, "out");
        byte[] bArr = new byte[i];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j += read;
            read = inputStream.read(bArr);
        }
        return j;
    }

    public static final byte[] toString(InputStream inputStream) {
        runAnimators.ag$a(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        values(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        runAnimators.ah$a(byteArray, "buffer.toByteArray()");
        return byteArray;
    }
}

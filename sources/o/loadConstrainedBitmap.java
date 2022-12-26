package o;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import o.PrintHelper;
/* loaded from: classes7.dex */
public final class loadConstrainedBitmap {
    public static long values(InputStream inputStream, OutputStream outputStream) throws IOException {
        PrintHelper.PrintUriAdapter.AnonymousClass1.ag$a(inputStream);
        PrintHelper.PrintUriAdapter.AnonymousClass1.ag$a(outputStream);
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }
}

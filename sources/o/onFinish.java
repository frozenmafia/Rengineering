package o;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* loaded from: classes7.dex */
public class onFinish {
    public static void valueOf(InputStream inputStream, OutputStream outputStream, boolean z) throws IOException {
        try {
            loadConstrainedBitmap.values(inputStream, outputStream);
        } finally {
            if (z) {
                inputStream.close();
            }
        }
    }
}

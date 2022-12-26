package o;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
/* loaded from: classes3.dex */
final class getScaledHoverSlop {
    static final Charset ah$a = Charset.forName("US-ASCII");
    static final Charset ag$a = Charset.forName("UTF-8");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void valueOf(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                valueOf(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void ag$a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }
}

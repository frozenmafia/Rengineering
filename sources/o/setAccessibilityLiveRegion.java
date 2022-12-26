package o;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
/* loaded from: classes3.dex */
class setAccessibilityLiveRegion {
    setAccessibilityLiveRegion() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void valueOf(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int valueOf(Reader reader, Writer writer) throws IOException {
        char[] cArr = new char[4096];
        long j = 0;
        while (true) {
            int read = reader.read(cArr);
            if (-1 == read) {
                break;
            }
            writer.write(cArr, 0, read);
            j += read;
        }
        if (j > 2147483647L) {
            return -1;
        }
        return (int) j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void ah$a(File file, setImportantForAccessibility setimportantforaccessibility) {
        try {
            if (file.delete()) {
                return;
            }
            file.deleteOnExit();
        } catch (Exception e) {
            setimportantforaccessibility.toString("Failed to delete file", e);
        }
    }
}

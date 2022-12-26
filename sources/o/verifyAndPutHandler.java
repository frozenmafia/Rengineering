package o;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
/* loaded from: classes4.dex */
public final class verifyAndPutHandler implements Closeable {
    private FileOutputStream toString;
    private FileLock valueOf;

    public static verifyAndPutHandler ag$a(File file) throws IOException {
        return new verifyAndPutHandler(file, false);
    }

    public static verifyAndPutHandler toString(File file) throws IOException {
        verifyAndPutHandler verifyandputhandler = new verifyAndPutHandler(file, true);
        if (verifyandputhandler.valueOf == null) {
            verifyandputhandler.close();
            return null;
        }
        return verifyandputhandler;
    }

    private void ah$a(File file, boolean z) throws IOException {
        FileLock fileLock;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.toString = fileOutputStream;
        try {
            if (z) {
                try {
                    fileLock = fileOutputStream.getChannel().tryLock();
                } catch (IOException unused) {
                    fileLock = null;
                }
            } else {
                fileLock = fileOutputStream.getChannel().lock();
            }
            if (fileLock == null) {
            }
            this.valueOf = fileLock;
        } finally {
            this.toString.close();
        }
    }

    private verifyAndPutHandler(File file, boolean z) throws IOException {
        ah$a(file, z);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            FileLock fileLock = this.valueOf;
            if (fileLock != null) {
                fileLock.release();
            }
        } finally {
            this.toString.close();
        }
    }
}

package o;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
/* loaded from: classes4.dex */
public class AbstractSavedStateViewModelFactory implements onRequery {
    private File ag$a;
    private FileChannel ah$a;
    private FileInputStream toString;

    public AbstractSavedStateViewModelFactory(File file) throws IOException {
        this.ag$a = file;
        ag$a();
    }

    public void ag$a() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(this.ag$a);
        this.toString = fileInputStream;
        this.ah$a = fileInputStream.getChannel();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        return this.ah$a.read(byteBuffer);
    }

    @Override // o.onRequery
    public int ah$a(ByteBuffer byteBuffer, long j) throws IOException {
        return this.ah$a.read(byteBuffer, j);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        return this.ah$a.write(byteBuffer);
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.toString.close();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.ah$a.isOpen();
    }
}

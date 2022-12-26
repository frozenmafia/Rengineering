package o;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;
import o.WindowInsetsControllerCompat;
/* loaded from: classes3.dex */
public final class unsetWindowFlag extends InputStream {
    private static final Queue<unsetWindowFlag> values = WindowInsetsControllerCompat.Impl30.AnonymousClass1.values(0);
    private InputStream toString;
    private IOException valueOf;

    public static unsetWindowFlag toString(InputStream inputStream) {
        unsetWindowFlag poll;
        Queue<unsetWindowFlag> queue = values;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new unsetWindowFlag();
        }
        poll.valueOf(inputStream);
        return poll;
    }

    unsetWindowFlag() {
    }

    void valueOf(InputStream inputStream) {
        this.toString = inputStream;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.toString.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.toString.close();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.toString.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.toString.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.toString.read();
        } catch (IOException e) {
            this.valueOf = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.toString.read(bArr);
        } catch (IOException e) {
            this.valueOf = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.toString.read(bArr, i, i2);
        } catch (IOException e) {
            this.valueOf = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        synchronized (this) {
            this.toString.reset();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        try {
            return this.toString.skip(j);
        } catch (IOException e) {
            this.valueOf = e;
            throw e;
        }
    }

    public IOException values() {
        return this.valueOf;
    }

    public void ah$a() {
        this.valueOf = null;
        this.toString = null;
        Queue<unsetWindowFlag> queue = values;
        synchronized (queue) {
            queue.offer(this);
        }
    }
}

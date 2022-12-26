package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class findPartiallyOrCompletelyInvisibleChildClosestToStart extends FilterInputStream {
    private final int HaptikSDK$a;
    private boolean HaptikSDK$b;
    private boolean HaptikSDK$c;
    private final ByteBuffer HaptikSDK$d;
    private int HaptikWebView;
    private final int ag$a;
    private final computeScrollExtent ah$a;
    private boolean ah$b;
    private final int invoke;
    private final byte[] toString;
    private final ByteBuffer valueOf;
    private boolean values;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public findPartiallyOrCompletelyInvisibleChildClosestToStart(findMaxElevation findmaxelevation, InputStream inputStream, byte[] bArr) throws GeneralSecurityException, IOException {
        super(inputStream);
        this.ah$a = findmaxelevation.ah$b();
        this.HaptikSDK$a = findmaxelevation.values();
        this.toString = Arrays.copyOf(bArr, bArr.length);
        int valueOf = findmaxelevation.valueOf();
        this.ag$a = valueOf;
        ByteBuffer allocate = ByteBuffer.allocate(valueOf + 1);
        this.valueOf = allocate;
        allocate.limit(0);
        this.invoke = valueOf - findmaxelevation.ah$a();
        ByteBuffer allocate2 = ByteBuffer.allocate(findmaxelevation.HaptikSDK$b() + 16);
        this.HaptikSDK$d = allocate2;
        allocate2.limit(0);
        this.HaptikSDK$b = false;
        this.ah$b = false;
        this.HaptikSDK$c = false;
        this.HaptikWebView = 0;
        this.values = false;
    }

    private void values() throws IOException {
        if (this.HaptikSDK$b) {
            ah$a();
            throw new IOException("Decryption failed.");
        }
        ByteBuffer allocate = ByteBuffer.allocate(this.HaptikSDK$a);
        while (allocate.remaining() > 0) {
            int read = this.in.read(allocate.array(), allocate.position(), allocate.remaining());
            if (read == -1) {
                ah$a();
                throw new IOException("Ciphertext is too short");
            } else if (read == 0) {
                throw new IOException("Could not read bytes from the ciphertext stream");
            } else {
                allocate.position(allocate.position() + read);
            }
        }
        allocate.flip();
        try {
            this.ah$a.ah$a(allocate, this.toString);
            this.HaptikSDK$b = true;
        } catch (GeneralSecurityException e) {
            throw new IOException(e);
        }
    }

    private void ah$a() {
        this.values = true;
        this.HaptikSDK$d.limit(0);
    }

    private void ag$a() throws IOException {
        while (!this.ah$b && this.valueOf.remaining() > 0) {
            int read = this.in.read(this.valueOf.array(), this.valueOf.position(), this.valueOf.remaining());
            if (read > 0) {
                ByteBuffer byteBuffer = this.valueOf;
                byteBuffer.position(byteBuffer.position() + read);
            } else if (read == -1) {
                this.ah$b = true;
            } else if (read == 0) {
                throw new IOException("Could not read bytes from the ciphertext stream");
            }
        }
        byte b2 = 0;
        if (!this.ah$b) {
            ByteBuffer byteBuffer2 = this.valueOf;
            b2 = byteBuffer2.get(byteBuffer2.position() - 1);
            ByteBuffer byteBuffer3 = this.valueOf;
            byteBuffer3.position(byteBuffer3.position() - 1);
        }
        this.valueOf.flip();
        this.HaptikSDK$d.clear();
        try {
            this.ah$a.valueOf(this.valueOf, this.HaptikWebView, this.ah$b, this.HaptikSDK$d);
            this.HaptikWebView++;
            this.HaptikSDK$d.flip();
            this.valueOf.clear();
            if (this.ah$b) {
                return;
            }
            this.valueOf.clear();
            this.valueOf.limit(this.ag$a + 1);
            this.valueOf.put(b2);
        } catch (GeneralSecurityException e) {
            ah$a();
            throw new IOException(e.getMessage() + "\n" + toString() + "\nsegmentNr:" + this.HaptikWebView + " endOfCiphertext:" + this.ah$b, e);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = new byte[1];
        int read = read(bArr, 0, 1);
        if (read == 1) {
            return bArr[0] & 255;
        }
        if (read == -1) {
            return read;
        }
        throw new IOException("Reading failed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        synchronized (this) {
            if (this.values) {
                throw new IOException("Decryption failed.");
            }
            if (!this.HaptikSDK$b) {
                values();
                this.valueOf.clear();
                this.valueOf.limit(this.invoke + 1);
            }
            if (this.HaptikSDK$c) {
                return -1;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                if (this.HaptikSDK$d.remaining() == 0) {
                    if (this.ah$b) {
                        this.HaptikSDK$c = true;
                        break;
                    }
                    ag$a();
                }
                int min = Math.min(this.HaptikSDK$d.remaining(), i2 - i3);
                this.HaptikSDK$d.get(bArr, i3 + i, min);
                i3 += min;
            }
            if (i3 == 0 && this.HaptikSDK$c) {
                return -1;
            }
            return i3;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this) {
            super.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int remaining;
        synchronized (this) {
            remaining = this.HaptikSDK$d.remaining();
        }
        return remaining;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        synchronized (this) {
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        int read;
        long j2 = this.ag$a;
        if (j <= 0) {
            return 0L;
        }
        int min = (int) Math.min(j2, j);
        byte[] bArr = new byte[min];
        long j3 = j;
        while (j3 > 0 && (read = read(bArr, 0, (int) Math.min(min, j3))) > 0) {
            j3 -= read;
        }
        return j - j3;
    }

    public String toString() {
        String str;
        synchronized (this) {
            str = "StreamingAeadDecryptingStream\nsegmentNr:" + this.HaptikWebView + "\nciphertextSegmentSize:" + this.ag$a + "\nheaderRead:" + this.HaptikSDK$b + "\nendOfCiphertext:" + this.ah$b + "\nendOfPlaintext:" + this.HaptikSDK$c + "\ndecryptionErrorOccured:" + this.values + "\nciphertextSgement position:" + this.valueOf.position() + " limit:" + this.valueOf.limit() + "\nplaintextSegment position:" + this.HaptikSDK$d.position() + " limit:" + this.HaptikSDK$d.limit();
        }
        return str;
    }
}

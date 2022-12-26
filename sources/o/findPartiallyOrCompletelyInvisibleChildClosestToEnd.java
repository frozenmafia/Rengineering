package o;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class findPartiallyOrCompletelyInvisibleChildClosestToEnd extends FilterOutputStream {
    ByteBuffer ag$a;
    private findLastPartiallyOrCompletelyInvisibleChild ah$a;
    private int toString;
    ByteBuffer valueOf;
    boolean values;

    public findPartiallyOrCompletelyInvisibleChildClosestToEnd(findMaxElevation findmaxelevation, OutputStream outputStream, byte[] bArr) throws GeneralSecurityException, IOException {
        super(outputStream);
        this.ah$a = findmaxelevation.toString(bArr);
        int HaptikSDK$b = findmaxelevation.HaptikSDK$b();
        this.toString = HaptikSDK$b;
        this.ag$a = ByteBuffer.allocate(HaptikSDK$b);
        this.valueOf = ByteBuffer.allocate(findmaxelevation.valueOf());
        this.ag$a.limit(this.toString - findmaxelevation.ah$a());
        ByteBuffer ag$a = this.ah$a.ag$a();
        byte[] bArr2 = new byte[ag$a.remaining()];
        ag$a.get(bArr2);
        this.out.write(bArr2);
        this.values = true;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        write(new byte[]{(byte) i});
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        synchronized (this) {
            if (!this.values) {
                throw new IOException("Trying to write to closed stream");
            }
            while (i2 > this.ag$a.remaining()) {
                int remaining = this.ag$a.remaining();
                ByteBuffer wrap = ByteBuffer.wrap(bArr, i, remaining);
                i += remaining;
                i2 -= remaining;
                try {
                    this.ag$a.flip();
                    this.valueOf.clear();
                    this.ah$a.ag$a(this.ag$a, wrap, false, this.valueOf);
                    this.valueOf.flip();
                    this.out.write(this.valueOf.array(), this.valueOf.position(), this.valueOf.remaining());
                    this.ag$a.clear();
                    this.ag$a.limit(this.toString);
                } catch (GeneralSecurityException e) {
                    throw new IOException(e);
                }
            }
            this.ag$a.put(bArr, i, i2);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this) {
            if (this.values) {
                try {
                    this.ag$a.flip();
                    this.valueOf.clear();
                    this.ah$a.ag$a(this.ag$a, true, this.valueOf);
                    this.valueOf.flip();
                    this.out.write(this.valueOf.array(), this.valueOf.position(), this.valueOf.remaining());
                    this.values = false;
                    super.close();
                } catch (GeneralSecurityException e) {
                    throw new IOException("ptBuffer.remaining():" + this.ag$a.remaining() + " ctBuffer.remaining():" + this.valueOf.remaining(), e);
                }
            }
        }
    }
}

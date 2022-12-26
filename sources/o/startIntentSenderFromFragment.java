package o;

import java.io.IOException;
import java.io.InputStream;
import o.Fragment;
/* loaded from: classes4.dex */
public class startIntentSenderFromFragment extends InputStream {
    private final onGetHost<byte[]> HaptikSDK$b;
    private final InputStream ag$a;
    private final byte[] toString;
    private int ah$a = 0;
    private int valueOf = 0;
    private boolean values = false;

    public startIntentSenderFromFragment(InputStream inputStream, byte[] bArr, onGetHost<byte[]> ongethost) {
        this.ag$a = (InputStream) inputStream.getClass();
        this.toString = (byte[]) bArr.getClass();
        this.HaptikSDK$b = (onGetHost) ongethost.getClass();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        Fragment.AnonymousClass8.toString(this.valueOf <= this.ah$a);
        values();
        if (ah$a()) {
            byte[] bArr = this.toString;
            int i = this.valueOf;
            this.valueOf = i + 1;
            return bArr[i] & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        Fragment.AnonymousClass8.toString(this.valueOf <= this.ah$a);
        values();
        if (ah$a()) {
            int min = Math.min(this.ah$a - this.valueOf, i2);
            System.arraycopy(this.toString, this.valueOf, bArr, i, min);
            this.valueOf += min;
            return min;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        Fragment.AnonymousClass8.toString(this.valueOf <= this.ah$a);
        values();
        return (this.ah$a - this.valueOf) + this.ag$a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.values) {
            return;
        }
        this.values = true;
        this.HaptikSDK$b.release(this.toString);
        super.close();
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        Fragment.AnonymousClass8.toString(this.valueOf <= this.ah$a);
        values();
        int i = this.ah$a;
        int i2 = this.valueOf;
        long j2 = i - i2;
        if (j2 >= j) {
            this.valueOf = (int) (i2 + j);
            return j;
        }
        this.valueOf = i;
        return j2 + this.ag$a.skip(j - j2);
    }

    private boolean ah$a() throws IOException {
        if (this.valueOf < this.ah$a) {
            return true;
        }
        int read = this.ag$a.read(this.toString);
        if (read <= 0) {
            return false;
        }
        this.ah$a = read;
        this.valueOf = 0;
        return true;
    }

    private void values() throws IOException {
        if (this.values) {
            throw new IOException("stream already closed");
        }
    }

    protected void finalize() throws Throwable {
        if (!this.values) {
            FragmentActivity.values("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }
}

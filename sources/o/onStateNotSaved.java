package o;

import com.facebook.common.memory.PooledByteBuffer;
import java.io.InputStream;
import o.Fragment;
/* loaded from: classes4.dex */
public class onStateNotSaved extends InputStream {
    int ag$a;
    int toString;
    final PooledByteBuffer valueOf;

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    public onStateNotSaved(PooledByteBuffer pooledByteBuffer) {
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(!pooledByteBuffer.isClosed()));
        this.valueOf = (PooledByteBuffer) pooledByteBuffer.getClass();
        this.ag$a = 0;
        this.toString = 0;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.valueOf.size() - this.ag$a;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.toString = this.ag$a;
    }

    @Override // java.io.InputStream
    public int read() {
        if (available() <= 0) {
            return -1;
        }
        PooledByteBuffer pooledByteBuffer = this.valueOf;
        int i = this.ag$a;
        this.ag$a = i + 1;
        return pooledByteBuffer.read(i) & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i + "; regionLength=" + i2);
        }
        int available = available();
        if (available <= 0) {
            return -1;
        }
        if (i2 <= 0) {
            return 0;
        }
        int min = Math.min(available, i2);
        this.valueOf.read(this.ag$a, bArr, i, min);
        this.ag$a += min;
        return min;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.ag$a = this.toString;
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(j >= 0));
        int min = Math.min((int) j, available());
        this.ag$a += min;
        return min;
    }
}

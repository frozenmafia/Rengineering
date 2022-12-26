package o;

import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;
/* loaded from: classes6.dex */
public final class stopLoading extends OutputStream {
    public static final byte[] values = new byte[0];
    private final unregisterListener ag$a;
    private int ah$a;
    private int ah$b;
    private byte[] toString;
    private final LinkedList<byte[]> valueOf;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
    }

    public stopLoading() {
        this(null);
    }

    public stopLoading(unregisterListener unregisterlistener) {
        this(unregisterlistener, 500);
    }

    public stopLoading(unregisterListener unregisterlistener, int i) {
        this.valueOf = new LinkedList<>();
        this.ag$a = unregisterlistener;
        this.toString = unregisterlistener == null ? new byte[i] : unregisterlistener.toString(2);
    }

    private stopLoading(unregisterListener unregisterlistener, byte[] bArr, int i) {
        this.valueOf = new LinkedList<>();
        this.ag$a = null;
        this.toString = bArr;
        this.ah$a = i;
    }

    public static stopLoading toString(byte[] bArr, int i) {
        return new stopLoading(null, bArr, i);
    }

    public void ah$a() {
        this.ah$b = 0;
        this.ah$a = 0;
        if (this.valueOf.isEmpty()) {
            return;
        }
        this.valueOf.clear();
    }

    public void values(int i) {
        if (this.ah$a >= this.toString.length) {
            HaptikSDK$a();
        }
        byte[] bArr = this.toString;
        int i2 = this.ah$a;
        this.ah$a = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public void ag$a(int i) {
        int i2 = this.ah$a;
        byte[] bArr = this.toString;
        int i3 = i2 + 1;
        if (i3 < bArr.length) {
            this.ah$a = i3;
            bArr[i2] = (byte) (i >> 8);
            this.ah$a = i3 + 1;
            bArr[i3] = (byte) i;
            return;
        }
        values(i >> 8);
        values(i);
    }

    public void ah$a(int i) {
        int i2 = this.ah$a;
        byte[] bArr = this.toString;
        if (i2 + 2 < bArr.length) {
            int i3 = i2 + 1;
            this.ah$a = i3;
            bArr[i2] = (byte) (i >> 16);
            int i4 = i3 + 1;
            this.ah$a = i4;
            bArr[i3] = (byte) (i >> 8);
            this.ah$a = i4 + 1;
            bArr[i4] = (byte) i;
            return;
        }
        values(i >> 16);
        values(i >> 8);
        values(i);
    }

    public byte[] HaptikSDK$c() {
        int i = this.ah$b + this.ah$a;
        if (i == 0) {
            return values;
        }
        byte[] bArr = new byte[i];
        Iterator<byte[]> it = this.valueOf.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            byte[] next = it.next();
            int length = next.length;
            System.arraycopy(next, 0, bArr, i2, length);
            i2 += length;
        }
        System.arraycopy(this.toString, 0, bArr, i2, this.ah$a);
        int i3 = i2 + this.ah$a;
        if (i3 != i) {
            throw new RuntimeException("Internal error: total len assumed to be " + i + ", copied " + i3 + " bytes");
        }
        if (!this.valueOf.isEmpty()) {
            ah$a();
        }
        return bArr;
    }

    public byte[] valueOf() {
        HaptikSDK$a();
        return this.toString;
    }

    public byte[] valueOf(int i) {
        this.ah$a = i;
        return HaptikSDK$c();
    }

    public byte[] values() {
        return this.toString;
    }

    public void toString(int i) {
        this.ah$a = i;
    }

    public int ag$a() {
        return this.ah$a;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        while (true) {
            int min = Math.min(this.toString.length - this.ah$a, i2);
            if (min > 0) {
                System.arraycopy(bArr, i, this.toString, this.ah$a, min);
                i += min;
                this.ah$a += min;
                i2 -= min;
            }
            if (i2 <= 0) {
                return;
            }
            HaptikSDK$a();
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        values(i);
    }

    private void HaptikSDK$a() {
        int length = this.ah$b + this.toString.length;
        if (length < 0) {
            throw new IllegalStateException("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
        }
        this.ah$b = length;
        int max = Math.max(length >> 1, 1000);
        if (max > 131072) {
            max = 131072;
        }
        this.valueOf.add(this.toString);
        this.toString = new byte[max];
        this.ah$a = 0;
    }
}

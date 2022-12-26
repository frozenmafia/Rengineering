package o;

import java.io.OutputStream;
/* loaded from: classes7.dex */
final class shouldMeasureChild extends OutputStream {
    private long ah$a = 0;

    @Override // java.io.OutputStream
    public void write(int i) {
        this.ah$a++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.ah$a += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.ah$a += i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long ah$a() {
        return this.ah$a;
    }
}

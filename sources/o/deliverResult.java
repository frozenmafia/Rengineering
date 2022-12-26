package o;

import java.io.DataOutput;
import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes6.dex */
public class deliverResult extends OutputStream {
    protected final DataOutput valueOf;

    public deliverResult(DataOutput dataOutput) {
        this.valueOf = dataOutput;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.valueOf.write(i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.valueOf.write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.valueOf.write(bArr, i, i2);
    }
}

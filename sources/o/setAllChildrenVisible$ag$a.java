package o;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* loaded from: classes7.dex */
public class setAllChildrenVisible$ag$a extends ByteArrayOutputStream {
    public setAllChildrenVisible$ag$a(byte[] bArr) {
        super(0);
        this.buf = bArr;
    }

    public byte[] ah$a() {
        return this.buf;
    }

    public ByteBuffer ag$a(int i) {
        if (this.buf.length < i) {
            valueOf(i);
        }
        return ByteBuffer.wrap(this.buf);
    }

    public void values(int i) {
        this.count = i;
    }

    protected void valueOf(int i) {
        int length = this.buf.length << 1;
        if (length - i < 0) {
            length = i;
        }
        if (length - 2147483639 > 0) {
            length = ah$a(i);
        }
        this.buf = Arrays.copyOf(this.buf, length);
    }

    protected static int ah$a(int i) {
        if (i >= 0) {
            return i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        throw new OutOfMemoryError();
    }
}

package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import java.io.OutputStream;
import java.util.ArrayList;
/* loaded from: classes7.dex */
public final class ByteString$HaptikSDK$c extends OutputStream {
    private static final byte[] ag$a = new byte[0];
    private int ah$a;
    private final int ah$b;
    private int toString;
    private byte[] valueOf;
    private final ArrayList<ByteString> values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ByteString$HaptikSDK$c(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Buffer size < 0");
        }
        this.ah$b = i;
        this.values = new ArrayList<>();
        this.valueOf = new byte[i];
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        synchronized (this) {
            if (this.toString == this.valueOf.length) {
                values(1);
            }
            byte[] bArr = this.valueOf;
            int i2 = this.toString;
            this.toString = i2 + 1;
            bArr[i2] = (byte) i;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        synchronized (this) {
            byte[] bArr2 = this.valueOf;
            int length = bArr2.length;
            int i3 = this.toString;
            if (i2 <= length - i3) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.toString += i2;
            } else {
                int length2 = bArr2.length - i3;
                System.arraycopy(bArr, i, bArr2, i3, length2);
                int i4 = i2 - length2;
                values(i4);
                System.arraycopy(bArr, i + length2, this.valueOf, 0, i4);
                this.toString = i4;
            }
        }
    }

    public int values() {
        int i;
        int i2;
        synchronized (this) {
            i = this.ah$a;
            i2 = this.toString;
        }
        return i + i2;
    }

    public String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(values()));
    }

    private void values(int i) {
        this.values.add(new ByteString.LiteralByteString(this.valueOf));
        int length = this.ah$a + this.valueOf.length;
        this.ah$a = length;
        this.valueOf = new byte[Math.max(this.ah$b, Math.max(i, length >>> 1))];
        this.toString = 0;
    }
}

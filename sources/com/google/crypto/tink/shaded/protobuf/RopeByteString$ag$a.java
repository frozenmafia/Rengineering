package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.RopeByteString;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes7.dex */
class RopeByteString$ag$a extends InputStream {
    private int HaptikSDK$a;
    private int ag$a;
    private int ah$a;
    private RopeByteString.toString ah$b;
    final /* synthetic */ RopeByteString toString;
    private int valueOf;
    private ByteString.LeafByteString values;

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    public RopeByteString$ag$a(RopeByteString ropeByteString) {
        this.toString = ropeByteString;
        values();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        int values = values(bArr, i, i2);
        if (values == 0) {
            return -1;
        }
        return values;
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        if (j < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (j > 2147483647L) {
            j = 2147483647L;
        }
        return values(null, 0, (int) j);
    }

    private int values(byte[] bArr, int i, int i2) {
        int i3 = i2;
        while (i3 > 0) {
            valueOf();
            if (this.values == null) {
                break;
            }
            int min = Math.min(this.ag$a - this.ah$a, i3);
            if (bArr != null) {
                this.values.copyTo(bArr, this.ah$a, i, min);
                i += min;
            }
            this.ah$a += min;
            i3 -= min;
        }
        return i2 - i3;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        valueOf();
        ByteString.LeafByteString leafByteString = this.values;
        if (leafByteString == null) {
            return -1;
        }
        int i = this.ah$a;
        this.ah$a = i + 1;
        return leafByteString.byteAt(i) & 255;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.toString.size() - (this.valueOf + this.ah$a);
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.HaptikSDK$a = this.valueOf + this.ah$a;
    }

    @Override // java.io.InputStream
    public void reset() {
        synchronized (this) {
            values();
            values(null, 0, this.HaptikSDK$a);
        }
    }

    private void values() {
        RopeByteString.toString tostring = new RopeByteString.toString(this.toString);
        this.ah$b = tostring;
        ByteString.LeafByteString next = tostring.next();
        this.values = next;
        this.ag$a = next.size();
        this.ah$a = 0;
        this.valueOf = 0;
    }

    private void valueOf() {
        if (this.values != null) {
            int i = this.ah$a;
            int i2 = this.ag$a;
            if (i == i2) {
                this.valueOf += i2;
                this.ah$a = 0;
                if (this.ah$b.hasNext()) {
                    ByteString.LeafByteString next = this.ah$b.next();
                    this.values = next;
                    this.ag$a = next.size();
                    return;
                }
                this.values = null;
                this.ag$a = 0;
            }
        }
    }
}

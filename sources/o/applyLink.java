package o;

import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class applyLink {
    private final int ag$a;
    public byte[] ah$a;
    private boolean toString;
    private boolean valueOf;
    public int values;

    public applyLink(int i, int i2) {
        this.ag$a = i;
        byte[] bArr = new byte[i2 + 3];
        this.ah$a = bArr;
        bArr[2] = 1;
    }

    public void ah$a() {
        this.toString = false;
        this.valueOf = false;
    }

    public boolean values() {
        return this.valueOf;
    }

    public void ag$a(int i) {
        FingerprintManagerCompat.ah$a(!this.toString);
        boolean z = i == this.ag$a;
        this.toString = z;
        if (z) {
            this.values = 3;
            this.valueOf = false;
        }
    }

    public void ag$a(byte[] bArr, int i, int i2) {
        if (this.toString) {
            int i3 = i2 - i;
            byte[] bArr2 = this.ah$a;
            int length = bArr2.length;
            int i4 = this.values + i3;
            if (length < i4) {
                this.ah$a = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, this.ah$a, this.values, i3);
            this.values += i3;
        }
    }

    public boolean toString(int i) {
        if (this.toString) {
            this.values -= i;
            this.toString = false;
            this.valueOf = true;
            return true;
        }
        return false;
    }
}

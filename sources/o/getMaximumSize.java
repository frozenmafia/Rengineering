package o;

import java.util.Arrays;
import org.apache.http.message.TokenParser;
/* loaded from: classes5.dex */
public final class getMaximumSize implements Cloneable {
    private int ag$a;
    private int[] ah$a;

    public getMaximumSize() {
        this.ag$a = 0;
        this.ah$a = new int[1];
    }

    getMaximumSize(int[] iArr, int i) {
        this.ah$a = iArr;
        this.ag$a = i;
    }

    public int ah$a() {
        return this.ag$a;
    }

    public int ag$a() {
        return (this.ag$a + 7) / 8;
    }

    private void toString(int i) {
        if (i > (this.ah$a.length << 5)) {
            int[] ag$a = ag$a(i);
            int[] iArr = this.ah$a;
            System.arraycopy(iArr, 0, ag$a, 0, iArr.length);
            this.ah$a = ag$a;
        }
    }

    public boolean values(int i) {
        return (this.ah$a[i / 32] & (1 << (i & 31))) != 0;
    }

    public void toString(boolean z) {
        toString(this.ag$a + 1);
        if (z) {
            int[] iArr = this.ah$a;
            int i = this.ag$a;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.ag$a++;
    }

    public void valueOf(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        toString(this.ag$a + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            toString(z);
            i2--;
        }
    }

    public void valueOf(getMaximumSize getmaximumsize) {
        int i = getmaximumsize.ag$a;
        toString(this.ag$a + i);
        for (int i2 = 0; i2 < i; i2++) {
            toString(getmaximumsize.values(i2));
        }
    }

    public void values(getMaximumSize getmaximumsize) {
        if (this.ag$a != getmaximumsize.ag$a) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i = 0;
        while (true) {
            int[] iArr = this.ah$a;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = iArr[i] ^ getmaximumsize.ah$a[i];
            i++;
        }
    }

    public void values(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < 8; i6++) {
                if (values(i)) {
                    i5 |= 1 << (7 - i6);
                }
                i++;
            }
            bArr[i2 + i4] = (byte) i5;
        }
    }

    private static int[] ag$a(int i) {
        return new int[(i + 31) / 32];
    }

    public boolean equals(Object obj) {
        if (obj instanceof getMaximumSize) {
            getMaximumSize getmaximumsize = (getMaximumSize) obj;
            return this.ag$a == getmaximumsize.ag$a && Arrays.equals(this.ah$a, getmaximumsize.ah$a);
        }
        return false;
    }

    public int hashCode() {
        return (this.ag$a * 31) + Arrays.hashCode(this.ah$a);
    }

    public String toString() {
        int i = this.ag$a;
        StringBuilder sb = new StringBuilder(i + (i / 8) + 1);
        for (int i2 = 0; i2 < this.ag$a; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(TokenParser.SP);
            }
            sb.append(values(i2) ? 'X' : '.');
        }
        return sb.toString();
    }

    /* renamed from: values */
    public getMaximumSize clone() {
        return new getMaximumSize((int[]) this.ah$a.clone(), this.ag$a);
    }
}

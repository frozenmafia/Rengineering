package o;

import java.util.Arrays;
/* loaded from: classes5.dex */
public class setMaxSqlCacheSize {
    private final int ag$a;
    private final CharSequence ah$a;
    private final byte[] valueOf;
    private final int values;

    public setMaxSqlCacheSize(CharSequence charSequence, int i, int i2) {
        this.ah$a = charSequence;
        this.ag$a = i;
        this.values = i2;
        byte[] bArr = new byte[i * i2];
        this.valueOf = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    public final boolean values(int i, int i2) {
        return this.valueOf[(i2 * this.ag$a) + i] == 1;
    }

    private void toString(int i, int i2, boolean z) {
        this.valueOf[(i2 * this.ag$a) + i] = z ? (byte) 1 : (byte) 0;
    }

    private boolean valueOf(int i, int i2) {
        return this.valueOf[(i2 * this.ag$a) + i] >= 0;
    }

    public final void ah$a() {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 4;
        while (true) {
            if (i5 == this.values && i4 == 0) {
                ah$a(i3);
                i3++;
            }
            if (i5 == this.values - 2 && i4 == 0 && this.ag$a % 4 != 0) {
                toString(i3);
                i3++;
            }
            if (i5 == this.values - 2 && i4 == 0 && this.ag$a % 8 == 4) {
                valueOf(i3);
                i3++;
            }
            if (i5 == this.values + 4 && i4 == 2 && this.ag$a % 8 == 0) {
                ag$a(i3);
                i3++;
            }
            do {
                if (i5 < this.values && i4 >= 0 && !valueOf(i4, i5)) {
                    ag$a(i5, i4, i3);
                    i3++;
                }
                i5 -= 2;
                i4 += 2;
                if (i5 < 0) {
                    break;
                }
            } while (i4 < this.ag$a);
            int i6 = i5 + 1;
            int i7 = i4 + 3;
            do {
                if (i6 >= 0 && i7 < this.ag$a && !valueOf(i7, i6)) {
                    ag$a(i6, i7, i3);
                    i3++;
                }
                i6 += 2;
                i7 -= 2;
                i = this.values;
                if (i6 >= i) {
                    break;
                }
            } while (i7 >= 0);
            i5 = i6 + 3;
            i4 = i7 + 1;
            if (i5 >= i && i4 >= (i2 = this.ag$a)) {
                break;
            }
        }
        if (valueOf(i2 - 1, i - 1)) {
            return;
        }
        toString(this.ag$a - 1, this.values - 1, true);
        toString(this.ag$a - 2, this.values - 2, true);
    }

    private void valueOf(int i, int i2, int i3, int i4) {
        if (i < 0) {
            int i5 = this.values;
            i += i5;
            i2 += 4 - ((i5 + 4) % 8);
        }
        if (i2 < 0) {
            int i6 = this.ag$a;
            i2 += i6;
            i += 4 - ((i6 + 4) % 8);
        }
        toString(i2, i, (this.ah$a.charAt(i3) & (1 << (8 - i4))) != 0);
    }

    private void ag$a(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        valueOf(i4, i5, i3, 1);
        int i6 = i2 - 1;
        valueOf(i4, i6, i3, 2);
        int i7 = i - 1;
        valueOf(i7, i5, i3, 3);
        valueOf(i7, i6, i3, 4);
        valueOf(i7, i2, i3, 5);
        valueOf(i, i5, i3, 6);
        valueOf(i, i6, i3, 7);
        valueOf(i, i2, i3, 8);
    }

    private void ah$a(int i) {
        valueOf(this.values - 1, 0, i, 1);
        valueOf(this.values - 1, 1, i, 2);
        valueOf(this.values - 1, 2, i, 3);
        valueOf(0, this.ag$a - 2, i, 4);
        valueOf(0, this.ag$a - 1, i, 5);
        valueOf(1, this.ag$a - 1, i, 6);
        valueOf(2, this.ag$a - 1, i, 7);
        valueOf(3, this.ag$a - 1, i, 8);
    }

    private void toString(int i) {
        valueOf(this.values - 3, 0, i, 1);
        valueOf(this.values - 2, 0, i, 2);
        valueOf(this.values - 1, 0, i, 3);
        valueOf(0, this.ag$a - 4, i, 4);
        valueOf(0, this.ag$a - 3, i, 5);
        valueOf(0, this.ag$a - 2, i, 6);
        valueOf(0, this.ag$a - 1, i, 7);
        valueOf(1, this.ag$a - 1, i, 8);
    }

    private void valueOf(int i) {
        valueOf(this.values - 3, 0, i, 1);
        valueOf(this.values - 2, 0, i, 2);
        valueOf(this.values - 1, 0, i, 3);
        valueOf(0, this.ag$a - 2, i, 4);
        valueOf(0, this.ag$a - 1, i, 5);
        valueOf(1, this.ag$a - 1, i, 6);
        valueOf(2, this.ag$a - 1, i, 7);
        valueOf(3, this.ag$a - 1, i, 8);
    }

    private void ag$a(int i) {
        valueOf(this.values - 1, 0, i, 1);
        valueOf(this.values - 1, this.ag$a - 1, i, 2);
        valueOf(0, this.ag$a - 3, i, 3);
        valueOf(0, this.ag$a - 2, i, 4);
        valueOf(0, this.ag$a - 1, i, 5);
        valueOf(1, this.ag$a - 3, i, 6);
        valueOf(1, this.ag$a - 2, i, 7);
        valueOf(1, this.ag$a - 1, i, 8);
    }
}

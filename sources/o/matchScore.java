package o;

import java.util.NoSuchElementException;
/* loaded from: classes3.dex */
final class matchScore {
    private int ah$a = 0;
    private int ag$a = -1;
    private int valueOf = 0;
    private int[] values = new int[16];
    private int toString = 15;

    public void valueOf(int i) {
        if (this.valueOf == this.values.length) {
            valueOf();
        }
        int i2 = (this.ag$a + 1) & this.toString;
        this.ag$a = i2;
        this.values[i2] = i;
        this.valueOf++;
    }

    public int values() {
        int i = this.valueOf;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.values;
        int i2 = this.ah$a;
        int i3 = iArr[i2];
        this.ah$a = (i2 + 1) & this.toString;
        this.valueOf = i - 1;
        return i3;
    }

    public boolean ag$a() {
        return this.valueOf == 0;
    }

    public void ah$a() {
        this.ah$a = 0;
        this.ag$a = -1;
        this.valueOf = 0;
    }

    private void valueOf() {
        int[] iArr = this.values;
        int length = iArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        int[] iArr2 = new int[length];
        int length2 = iArr.length;
        int i = this.ah$a;
        int i2 = length2 - i;
        System.arraycopy(iArr, i, iArr2, 0, i2);
        System.arraycopy(this.values, 0, iArr2, i2, i);
        this.ah$a = 0;
        this.ag$a = this.valueOf - 1;
        this.values = iArr2;
        this.toString = length - 1;
    }
}

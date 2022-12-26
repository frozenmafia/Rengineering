package o;
/* loaded from: classes3.dex */
public final class isDigitsOnly {
    private final byte[] ah$a;
    private int toString;
    private final int valueOf;
    private int values;

    public isDigitsOnly(byte[] bArr) {
        this.ah$a = bArr;
        this.valueOf = bArr.length;
    }

    public boolean ah$a() {
        boolean z = (((this.ah$a[this.toString] & 255) >> this.values) & 1) == 1;
        toString(1);
        return z;
    }

    public int ah$a(int i) {
        int i2 = this.toString;
        int min = Math.min(i, 8 - this.values);
        int i3 = i2 + 1;
        int i4 = ((this.ah$a[i2] & 255) >> this.values) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.ah$a[i3] & 255) << min;
            min += 8;
            i3++;
        }
        toString(i);
        return ((-1) >>> (32 - i)) & i4;
    }

    public void toString(int i) {
        int i2 = i / 8;
        int i3 = this.toString + i2;
        this.toString = i3;
        int i4 = this.values + (i - (i2 * 8));
        this.values = i4;
        if (i4 > 7) {
            this.toString = i3 + 1;
            this.values = i4 - 8;
        }
        valueOf();
    }

    public int values() {
        return (this.toString * 8) + this.values;
    }

    private void valueOf() {
        int i;
        int i2 = this.toString;
        FingerprintManagerCompat.ah$a(i2 >= 0 && (i2 < (i = this.valueOf) || (i2 == i && this.values == 0)));
    }
}

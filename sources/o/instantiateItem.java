package o;
/* loaded from: classes6.dex */
public class instantiateItem {
    private int ag$a = 0;
    private long[] valueOf;

    public static instantiateItem ag$a(int i) {
        return new instantiateItem(i);
    }

    private instantiateItem(int i) {
        this.valueOf = new long[i];
    }

    public void ah$a(long j) {
        ah$a();
        long[] jArr = this.valueOf;
        int i = this.ag$a;
        this.ag$a = i + 1;
        jArr[i] = j;
    }

    public long valueOf(int i) {
        if (i >= this.ag$a) {
            throw new IndexOutOfBoundsException("" + i + " >= " + this.ag$a);
        }
        return this.valueOf[i];
    }

    public void toString(int i, long j) {
        if (i >= this.ag$a) {
            throw new IndexOutOfBoundsException("" + i + " >= " + this.ag$a);
        }
        this.valueOf[i] = j;
    }

    public int values() {
        return this.ag$a;
    }

    public void values(int i) {
        int i2 = this.ag$a;
        if (i > i2) {
            throw new IndexOutOfBoundsException("Trying to drop " + i + " items from array of length " + this.ag$a);
        }
        this.ag$a = i2 - i;
    }

    private void ah$a() {
        int i = this.ag$a;
        if (i == this.valueOf.length) {
            long[] jArr = new long[Math.max(i + 1, (int) (i * 1.8d))];
            System.arraycopy(this.valueOf, 0, jArr, 0, this.ag$a);
            this.valueOf = jArr;
        }
    }
}

package o;

import java.util.Arrays;
/* loaded from: classes3.dex */
public final class getCn0DbHz<V> {
    private int ag$a;
    private long[] ah$a;
    private V[] valueOf;
    private int values;

    public getCn0DbHz() {
        this(10);
    }

    public getCn0DbHz(int i) {
        this.ah$a = new long[i];
        this.valueOf = (V[]) valueOf(i);
    }

    public void values(long j, V v) {
        synchronized (this) {
            ag$a(j);
            valueOf();
            ag$a(j, v);
        }
    }

    public void values() {
        synchronized (this) {
            this.ag$a = 0;
            this.values = 0;
            Arrays.fill(this.valueOf, (Object) null);
        }
    }

    public int ah$a() {
        int i;
        synchronized (this) {
            i = this.values;
        }
        return i;
    }

    public V ag$a() {
        V invoke;
        synchronized (this) {
            invoke = this.values == 0 ? null : invoke();
        }
        return invoke;
    }

    public V toString(long j) {
        V getcn0dbhz;
        synchronized (this) {
            getcn0dbhz = toString(j, true);
        }
        return getcn0dbhz;
    }

    public V values(long j) {
        V getcn0dbhz;
        synchronized (this) {
            getcn0dbhz = toString(j, false);
        }
        return getcn0dbhz;
    }

    private V toString(long j, boolean z) {
        V v = null;
        long j2 = Long.MAX_VALUE;
        while (this.values > 0) {
            long j3 = j - this.ah$a[this.ag$a];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            v = invoke();
            j2 = j3;
        }
        return v;
    }

    private V invoke() {
        FingerprintManagerCompat.ah$a(this.values > 0);
        V[] vArr = this.valueOf;
        int i = this.ag$a;
        V v = vArr[i];
        vArr[i] = null;
        this.ag$a = (i + 1) % vArr.length;
        this.values--;
        return v;
    }

    private void ag$a(long j) {
        int i = this.values;
        if (i > 0) {
            int i2 = this.ag$a;
            if (j <= this.ah$a[((i2 + i) - 1) % this.valueOf.length]) {
                values();
            }
        }
    }

    private void valueOf() {
        int length = this.valueOf.length;
        if (this.values < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        V[] vArr = (V[]) valueOf(i);
        int i2 = this.ag$a;
        int i3 = length - i2;
        System.arraycopy(this.ah$a, i2, jArr, 0, i3);
        System.arraycopy(this.valueOf, this.ag$a, vArr, 0, i3);
        int i4 = this.ag$a;
        if (i4 > 0) {
            System.arraycopy(this.ah$a, 0, jArr, i3, i4);
            System.arraycopy(this.valueOf, 0, vArr, i3, this.ag$a);
        }
        this.ah$a = jArr;
        this.valueOf = vArr;
        this.ag$a = 0;
    }

    private void ag$a(long j, V v) {
        int i = this.ag$a;
        int i2 = this.values;
        V[] vArr = this.valueOf;
        int length = (i + i2) % vArr.length;
        this.ah$a[length] = j;
        vArr[length] = v;
        this.values = i2 + 1;
    }

    private static <V> V[] valueOf(int i) {
        return (V[]) new Object[i];
    }
}

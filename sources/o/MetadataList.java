package o;
/* loaded from: classes5.dex */
public final class MetadataList<T> {
    T[] ag$a;
    int ah$a;
    int toString;
    int valueOf;
    final float values;

    static int values(int i) {
        int i2 = i * (-1640531527);
        return i2 ^ (i2 >>> 16);
    }

    public MetadataList() {
        this(16, 0.75f);
    }

    public MetadataList(int i, float f) {
        this.values = f;
        int valueOf = compatAdded.valueOf(i);
        this.toString = valueOf - 1;
        this.ah$a = (int) (f * valueOf);
        this.ag$a = (T[]) new Object[valueOf];
    }

    public boolean ag$a(T t) {
        T t2;
        T[] tArr = this.ag$a;
        int i = this.toString;
        int values = values(t.hashCode()) & i;
        T t3 = tArr[values];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                values = (values + 1) & i;
                t2 = tArr[values];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[values] = t;
        int i2 = this.valueOf + 1;
        this.valueOf = i2;
        if (i2 >= this.ah$a) {
            values();
        }
        return true;
    }

    public boolean ah$a(T t) {
        T t2;
        T[] tArr = this.ag$a;
        int i = this.toString;
        int values = values(t.hashCode()) & i;
        T t3 = tArr[values];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            return ag$a(values, tArr, i);
        }
        do {
            values = (values + 1) & i;
            t2 = tArr[values];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        return ag$a(values, tArr, i);
    }

    boolean ag$a(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.valueOf--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t == null) {
                    tArr[i] = null;
                    return true;
                }
                int values = values(t.hashCode()) & i2;
                if (i > i3) {
                    if (i >= values && values > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else if (i < values && values <= i3) {
                    i4 = i3 + 1;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }

    void values() {
        T[] tArr = this.ag$a;
        int length = tArr.length;
        int i = length << 1;
        int i2 = i - 1;
        T[] tArr2 = (T[]) new Object[i];
        for (int i3 = this.valueOf; i3 != 0; i3--) {
            do {
                length--;
            } while (tArr[length] == null);
            int values = values(tArr[length].hashCode()) & i2;
            if (tArr2[values] != null) {
                do {
                    values = (values + 1) & i2;
                } while (tArr2[values] != null);
            }
            tArr2[values] = tArr[length];
        }
        this.toString = i2;
        this.ah$a = (int) (i * this.values);
        this.ag$a = tArr2;
    }

    public Object[] valueOf() {
        return this.ag$a;
    }

    public int ag$a() {
        return this.valueOf;
    }
}

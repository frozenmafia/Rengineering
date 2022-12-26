package o;

import java.lang.Comparable;
import java.util.Arrays;
import o.initViewPager;
/* loaded from: classes5.dex */
public class infoForChild<T extends initViewPager & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;
    private T[] valueOf;

    public final int ah$a() {
        return this._size;
    }

    private final void valueOf(int i) {
        this._size = i;
    }

    public final boolean values() {
        return ah$a() == 0;
    }

    public final T valueOf() {
        T[] tArr = this.valueOf;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final T values(int i) {
        if (getPixelSize.values()) {
            if (!(ah$a() > 0)) {
                throw new AssertionError();
            }
        }
        T[] tArr = this.valueOf;
        runAnimators.toString(tArr);
        valueOf(ah$a() - 1);
        if (i < ah$a()) {
            ag$a(i, ah$a());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                runAnimators.toString(t);
                T t2 = tArr[i2];
                runAnimators.toString(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    ag$a(i, i2);
                    ag$a(i2);
                }
            }
            toString(i);
        }
        T t3 = tArr[ah$a()];
        runAnimators.toString(t3);
        if (getPixelSize.values()) {
            if (!(t3.ag$a() == this)) {
                throw new AssertionError();
            }
        }
        t3.ag$a(null);
        t3.ah$a(-1);
        tArr[ah$a()] = null;
        return t3;
    }

    public final void valueOf(T t) {
        if (getPixelSize.values()) {
            if (!(t.ag$a() == null)) {
                throw new AssertionError();
            }
        }
        t.ag$a(this);
        T[] HaptikSDK$b = HaptikSDK$b();
        int ah$a = ah$a();
        valueOf(ah$a + 1);
        HaptikSDK$b[ah$a] = t;
        t.ah$a(ah$a);
        ag$a(ah$a);
    }

    private final void ag$a(int i) {
        while (i > 0) {
            T[] tArr = this.valueOf;
            runAnimators.toString(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            runAnimators.toString(t);
            T t2 = tArr[i];
            runAnimators.toString(t2);
            if (((Comparable) t).compareTo(t2) <= 0) {
                return;
            }
            ag$a(i, i2);
            i = i2;
        }
    }

    private final void toString(int i) {
        while (true) {
            int i2 = (i * 2) + 1;
            if (i2 >= ah$a()) {
                return;
            }
            T[] tArr = this.valueOf;
            runAnimators.toString(tArr);
            int i3 = i2 + 1;
            if (i3 < ah$a()) {
                T t = tArr[i3];
                runAnimators.toString(t);
                T t2 = tArr[i2];
                runAnimators.toString(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    i2 = i3;
                }
            }
            T t3 = tArr[i];
            runAnimators.toString(t3);
            T t4 = tArr[i2];
            runAnimators.toString(t4);
            if (((Comparable) t3).compareTo(t4) <= 0) {
                return;
            }
            ag$a(i, i2);
            i = i2;
        }
    }

    private final T[] HaptikSDK$b() {
        T[] tArr = this.valueOf;
        if (tArr == null) {
            T[] tArr2 = (T[]) new initViewPager[4];
            this.valueOf = tArr2;
            return tArr2;
        } else if (ah$a() >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, ah$a() * 2);
            runAnimators.ah$a(copyOf, "copyOf(this, newSize)");
            T[] tArr3 = (T[]) ((initViewPager[]) copyOf);
            this.valueOf = tArr3;
            return tArr3;
        } else {
            return tArr;
        }
    }

    private final void ag$a(int i, int i2) {
        T[] tArr = this.valueOf;
        runAnimators.toString(tArr);
        T t = tArr[i2];
        runAnimators.toString(t);
        T t2 = tArr[i];
        runAnimators.toString(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.ah$a(i);
        t2.ah$a(i2);
    }

    public final T ag$a() {
        T valueOf;
        synchronized (this) {
            valueOf = valueOf();
        }
        return valueOf;
    }

    public final T invoke() {
        T t;
        synchronized (this) {
            if (ah$a() > 0) {
                t = values(0);
            } else {
                t = (T) null;
            }
        }
        return t;
    }

    public final boolean toString(T t) {
        boolean z;
        synchronized (this) {
            if (t.ag$a() != null) {
                int valueOf = t.valueOf();
                if (getPixelSize.values()) {
                    if (!(valueOf >= 0)) {
                        throw new AssertionError();
                    }
                }
                values(valueOf);
                z = true;
            }
        }
        return z;
    }
}

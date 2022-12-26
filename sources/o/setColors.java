package o;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import o.CircleImageView;
/* loaded from: classes5.dex */
public final class setColors<T> implements CircleImageView.OvalShadow<T> {
    long HaptikSDK$a;
    final int HaptikSDK$b;
    int HaptikSDK$c;
    AtomicReferenceArray<Object> ah$a;
    final int valueOf;
    AtomicReferenceArray<Object> values;
    static final int toString = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    private static final Object invoke = new Object();
    final AtomicLong ah$b = new AtomicLong();
    final AtomicLong ag$a = new AtomicLong();

    private static int toString(int i) {
        return i;
    }

    public setColors(int i) {
        int valueOf = startScaleUpAnimation.valueOf(Math.max(8, i));
        int i2 = valueOf - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(valueOf + 1);
        this.ah$a = atomicReferenceArray;
        this.HaptikSDK$b = i2;
        values(valueOf);
        this.values = atomicReferenceArray;
        this.valueOf = i2;
        this.HaptikSDK$a = i2 - 1;
        values(0L);
    }

    @Override // o.elevationSupported
    public boolean offer(T t) {
        Objects.requireNonNull(t, "Null is not a valid element");
        AtomicReferenceArray<Object> atomicReferenceArray = this.ah$a;
        long ag$a = ag$a();
        int i = this.HaptikSDK$b;
        int ah$a = ah$a(ag$a, i);
        if (ag$a < this.HaptikSDK$a) {
            return toString(atomicReferenceArray, t, ag$a, ah$a);
        }
        long j = this.HaptikSDK$c + ag$a;
        if (valueOf(atomicReferenceArray, ah$a(j, i)) == null) {
            this.HaptikSDK$a = j - 1;
            return toString(atomicReferenceArray, t, ag$a, ah$a);
        } else if (valueOf(atomicReferenceArray, ah$a(1 + ag$a, i)) == null) {
            return toString(atomicReferenceArray, t, ag$a, ah$a);
        } else {
            toString(atomicReferenceArray, ag$a, ah$a, t, i);
            return true;
        }
    }

    private boolean toString(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        valueOf(atomicReferenceArray, i, t);
        values(j + 1);
        return true;
    }

    private void toString(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.ah$a = atomicReferenceArray2;
        this.HaptikSDK$a = (j2 + j) - 1;
        valueOf(atomicReferenceArray2, i, t);
        valueOf(atomicReferenceArray, atomicReferenceArray2);
        valueOf(atomicReferenceArray, i, invoke);
        values(j + 1);
    }

    private void valueOf(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        valueOf(atomicReferenceArray, toString(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    private AtomicReferenceArray<Object> ah$a(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        int setcolors = toString(i);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) valueOf(atomicReferenceArray, setcolors);
        valueOf(atomicReferenceArray, setcolors, null);
        return atomicReferenceArray2;
    }

    @Override // o.CircleImageView.OvalShadow, o.elevationSupported
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.values;
        long values = values();
        int i = this.valueOf;
        int ah$a = ah$a(values, i);
        T t = (T) valueOf(atomicReferenceArray, ah$a);
        boolean z = t == invoke;
        if (t == null || z) {
            if (z) {
                return ah$a(ah$a(atomicReferenceArray, i + 1), values, i);
            }
            return null;
        }
        valueOf(atomicReferenceArray, ah$a, null);
        toString(values + 1);
        return t;
    }

    private T ah$a(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.values = atomicReferenceArray;
        int ah$a = ah$a(j, i);
        T t = (T) valueOf(atomicReferenceArray, ah$a);
        if (t != null) {
            valueOf(atomicReferenceArray, ah$a, null);
            toString(j + 1);
        }
        return t;
    }

    public T ah$a() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.values;
        long values = values();
        int i = this.valueOf;
        T t = (T) valueOf(atomicReferenceArray, ah$a(values, i));
        return t == invoke ? toString(ah$a(atomicReferenceArray, i + 1), values, i) : t;
    }

    private T toString(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.values = atomicReferenceArray;
        return (T) valueOf(atomicReferenceArray, ah$a(j, i));
    }

    @Override // o.elevationSupported
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public int valueOf() {
        long HaptikSDK$c = HaptikSDK$c();
        while (true) {
            long HaptikSDK$b = HaptikSDK$b();
            long HaptikSDK$c2 = HaptikSDK$c();
            if (HaptikSDK$c == HaptikSDK$c2) {
                return (int) (HaptikSDK$b - HaptikSDK$c2);
            }
            HaptikSDK$c = HaptikSDK$c2;
        }
    }

    @Override // o.elevationSupported
    public boolean isEmpty() {
        return HaptikSDK$b() == HaptikSDK$c();
    }

    private void values(int i) {
        this.HaptikSDK$c = Math.min(i / 4, toString);
    }

    private long HaptikSDK$b() {
        return this.ah$b.get();
    }

    private long HaptikSDK$c() {
        return this.ag$a.get();
    }

    private long ag$a() {
        return this.ah$b.get();
    }

    private long values() {
        return this.ag$a.get();
    }

    private void values(long j) {
        this.ah$b.lazySet(j);
    }

    private void toString(long j) {
        this.ag$a.lazySet(j);
    }

    private static int ah$a(long j, int i) {
        return toString(((int) j) & i);
    }

    private static void valueOf(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    private static <E> Object valueOf(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    public boolean toString(T t, T t2) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.ah$a;
        long HaptikSDK$b = HaptikSDK$b();
        int i = this.HaptikSDK$b;
        long j = 2 + HaptikSDK$b;
        if (valueOf(atomicReferenceArray, ah$a(j, i)) == null) {
            int ah$a = ah$a(HaptikSDK$b, i);
            valueOf(atomicReferenceArray, ah$a + 1, t2);
            valueOf(atomicReferenceArray, ah$a, t);
            values(j);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.ah$a = atomicReferenceArray2;
        int ah$a2 = ah$a(HaptikSDK$b, i);
        valueOf(atomicReferenceArray2, ah$a2 + 1, t2);
        valueOf(atomicReferenceArray2, ah$a2, t);
        valueOf(atomicReferenceArray, atomicReferenceArray2);
        valueOf(atomicReferenceArray, ah$a2, invoke);
        values(j);
        return true;
    }
}

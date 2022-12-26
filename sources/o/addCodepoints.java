package o;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* loaded from: classes5.dex */
public final class addCodepoints<T> implements endObject<T> {
    long HaptikSDK$a;
    final int HaptikSDK$c;
    final int ag$a;
    AtomicReferenceArray<Object> ah$a;
    int ah$b;
    AtomicReferenceArray<Object> valueOf;
    static final int toString = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    private static final Object invoke = new Object();
    final AtomicLong HaptikSDK$b = new AtomicLong();
    final AtomicLong values = new AtomicLong();

    private static int ag$a(int i) {
        return i;
    }

    public addCodepoints(int i) {
        int valueOf = compatAdded.valueOf(Math.max(8, i));
        int i2 = valueOf - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(valueOf + 1);
        this.valueOf = atomicReferenceArray;
        this.HaptikSDK$c = i2;
        values(valueOf);
        this.ah$a = atomicReferenceArray;
        this.ag$a = i2;
        this.HaptikSDK$a = i2 - 1;
        ag$a(0L);
    }

    @Override // o.putByte
    public boolean offer(T t) {
        Objects.requireNonNull(t, "Null is not a valid element");
        AtomicReferenceArray<Object> atomicReferenceArray = this.valueOf;
        long ah$a = ah$a();
        int i = this.HaptikSDK$c;
        int addcodepoints = toString(ah$a, i);
        if (ah$a < this.HaptikSDK$a) {
            return values(atomicReferenceArray, t, ah$a, addcodepoints);
        }
        long j = this.ah$b + ah$a;
        if (toString(atomicReferenceArray, toString(j, i)) == null) {
            this.HaptikSDK$a = j - 1;
            return values(atomicReferenceArray, t, ah$a, addcodepoints);
        } else if (toString(atomicReferenceArray, toString(1 + ah$a, i)) == null) {
            return values(atomicReferenceArray, t, ah$a, addcodepoints);
        } else {
            ag$a(atomicReferenceArray, ah$a, addcodepoints, t, i);
            return true;
        }
    }

    private boolean values(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        atomicReferenceArray.lazySet(i, t);
        ag$a(j + 1);
        return true;
    }

    private void ag$a(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.valueOf = atomicReferenceArray2;
        this.HaptikSDK$a = (j2 + j) - 1;
        atomicReferenceArray2.lazySet(i, t);
        toString(atomicReferenceArray, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i, invoke);
        ag$a(j + 1);
    }

    private void toString(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        atomicReferenceArray.lazySet(ag$a(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    private AtomicReferenceArray<Object> valueOf(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        int ag$a = ag$a(i);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) toString(atomicReferenceArray, ag$a);
        atomicReferenceArray.lazySet(ag$a, null);
        return atomicReferenceArray2;
    }

    @Override // o.endObject, o.putByte
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.ah$a;
        long ag$a = ag$a();
        int i = this.ag$a;
        int addcodepoints = toString(ag$a, i);
        T t = (T) toString(atomicReferenceArray, addcodepoints);
        boolean z = t == invoke;
        if (t == null || z) {
            if (z) {
                return toString(valueOf(atomicReferenceArray, i + 1), ag$a, i);
            }
            return null;
        }
        atomicReferenceArray.lazySet(addcodepoints, null);
        ah$a(ag$a + 1);
        return t;
    }

    private T toString(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.ah$a = atomicReferenceArray;
        int addcodepoints = toString(j, i);
        T t = (T) toString(atomicReferenceArray, addcodepoints);
        if (t != null) {
            atomicReferenceArray.lazySet(addcodepoints, null);
            ah$a(j + 1);
        }
        return t;
    }

    public T values() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.ah$a;
        long ag$a = ag$a();
        int i = this.ag$a;
        T t = (T) toString(atomicReferenceArray, toString(ag$a, i));
        return t == invoke ? ag$a(valueOf(atomicReferenceArray, i + 1), ag$a, i) : t;
    }

    private T ag$a(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.ah$a = atomicReferenceArray;
        return (T) toString(atomicReferenceArray, toString(j, i));
    }

    @Override // o.putByte
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
            long HaptikSDK$a = HaptikSDK$a();
            long HaptikSDK$c2 = HaptikSDK$c();
            if (HaptikSDK$c == HaptikSDK$c2) {
                return (int) (HaptikSDK$a - HaptikSDK$c2);
            }
            HaptikSDK$c = HaptikSDK$c2;
        }
    }

    @Override // o.putByte
    public boolean isEmpty() {
        return HaptikSDK$a() == HaptikSDK$c();
    }

    private void values(int i) {
        this.ah$b = Math.min(i / 4, toString);
    }

    private long HaptikSDK$a() {
        return this.HaptikSDK$b.get();
    }

    private long HaptikSDK$c() {
        return this.values.get();
    }

    private long ah$a() {
        return this.HaptikSDK$b.get();
    }

    private long ag$a() {
        return this.values.get();
    }

    private void ag$a(long j) {
        this.HaptikSDK$b.lazySet(j);
    }

    private void ah$a(long j) {
        this.values.lazySet(j);
    }

    private static int toString(long j, int i) {
        return ag$a(((int) j) & i);
    }

    private static Object toString(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    public boolean toString(T t, T t2) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.valueOf;
        long HaptikSDK$a = HaptikSDK$a();
        int i = this.HaptikSDK$c;
        long j = 2 + HaptikSDK$a;
        if (toString(atomicReferenceArray, toString(j, i)) == null) {
            int addcodepoints = toString(HaptikSDK$a, i);
            atomicReferenceArray.lazySet(addcodepoints + 1, t2);
            atomicReferenceArray.lazySet(addcodepoints, t);
            ag$a(j);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.valueOf = atomicReferenceArray2;
        int addcodepoints2 = toString(HaptikSDK$a, i);
        atomicReferenceArray2.lazySet(addcodepoints2 + 1, t2);
        atomicReferenceArray2.lazySet(addcodepoints2, t);
        toString(atomicReferenceArray, atomicReferenceArray2);
        atomicReferenceArray.lazySet(addcodepoints2, invoke);
        ag$a(j);
        return true;
    }
}

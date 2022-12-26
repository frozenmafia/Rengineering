package o;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes5.dex */
public final class addOnPageChangeListener<E> {
    private final int HaptikSDK$a;
    private final int HaptikSDK$b;
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;
    private /* synthetic */ AtomicReferenceArray ag$a;
    private final boolean invoke;
    public static final addOnPageChangeListener$ag$a toString = new addOnPageChangeListener$ag$a(null);
    public static final fakeDragBy valueOf = new fakeDragBy("REMOVE_FROZEN");
    private static final /* synthetic */ AtomicReferenceFieldUpdater ah$a = AtomicReferenceFieldUpdater.newUpdater(addOnPageChangeListener.class, Object.class, "_next");
    private static final /* synthetic */ AtomicLongFieldUpdater values = AtomicLongFieldUpdater.newUpdater(addOnPageChangeListener.class, "_state");

    public addOnPageChangeListener(int i, boolean z) {
        this.HaptikSDK$b = i;
        this.invoke = z;
        int i2 = i - 1;
        this.HaptikSDK$a = i2;
        this.ag$a = new AtomicReferenceArray(i);
        if (!(i2 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i & i2) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final boolean ag$a() {
        long j = this._state;
        return ((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    public final int valueOf() {
        long j = this._state;
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0)));
    }

    private final addOnPageChangeListener<E> values(int i, E e) {
        Object obj = this.ag$a.get(this.HaptikSDK$a & i);
        if ((obj instanceof values) && ((values) obj).values == i) {
            this.ag$a.set(i & this.HaptikSDK$a, e);
            return this;
        }
        return null;
    }

    public final addOnPageChangeListener<E> values() {
        return ah$a(HaptikSDK$c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final addOnPageChangeListener<E> toString(long j) {
        addOnPageChangeListener<E> addonpagechangelistener = new addOnPageChangeListener<>(this.HaptikSDK$b * 2, this.invoke);
        int i = (int) ((1073741823 & j) >> 0);
        int i2 = (int) ((1152921503533105152L & j) >> 30);
        while (true) {
            int i3 = this.HaptikSDK$a;
            int i4 = i & i3;
            if (i4 != (i3 & i2)) {
                Object obj = this.ag$a.get(i4);
                if (obj == null) {
                    obj = new values(i);
                }
                addonpagechangelistener.ag$a.set(addonpagechangelistener.HaptikSDK$a & i, obj);
                i++;
            } else {
                addonpagechangelistener._state = toString.ag$a(j, 1152921504606846976L);
                return addonpagechangelistener;
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class values {
        public final int values;

        public values(int i) {
            this.values = i;
        }
    }

    public final boolean ah$a() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!values.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int ag$a(E r14) {
        /*
            r13 = this;
        L0:
            long r2 = r13._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 == 0) goto L12
            o.addOnPageChangeListener$ag$a r14 = o.addOnPageChangeListener.toString
            int r14 = r14.toString(r2)
            return r14
        L12:
            o.addOnPageChangeListener$ag$a r0 = o.addOnPageChangeListener.toString
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            r8 = 0
            long r4 = r4 >> r8
            int r1 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r9 = 30
            long r4 = r4 >> r9
            int r9 = (int) r4
            int r10 = r13.HaptikSDK$a
            int r4 = r9 + 2
            r4 = r4 & r10
            r5 = r1 & r10
            r11 = 1
            if (r4 != r5) goto L30
            return r11
        L30:
            boolean r4 = r13.invoke
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r4 != 0) goto L4f
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r13.ag$a
            r12 = r9 & r10
            java.lang.Object r4 = r4.get(r12)
            if (r4 == 0) goto L4f
            int r0 = r13.HaptikSDK$b
            r2 = 1024(0x400, float:1.435E-42)
            if (r0 < r2) goto L4e
            int r9 = r9 - r1
            r1 = r9 & r5
            int r0 = r0 >> 1
            if (r1 <= r0) goto L0
        L4e:
            return r11
        L4f:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = o.addOnPageChangeListener.values
            int r4 = r9 + 1
            r4 = r4 & r5
            long r4 = r0.values(r2, r4)
            r0 = r1
            r1 = r13
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r13.ag$a
            r1 = r9 & r10
            r0.set(r1, r14)
            r0 = r13
        L68:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 == 0) goto L7b
            o.addOnPageChangeListener r0 = r0.values()
            o.addOnPageChangeListener r0 = r0.values(r9, r14)
            if (r0 != 0) goto L68
        L7b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.addOnPageChangeListener.ag$a(java.lang.Object):int");
    }

    public final Object invoke() {
        while (true) {
            long j = this._state;
            if ((1152921504606846976L & j) != 0) {
                return valueOf;
            }
            addOnPageChangeListener$ag$a addonpagechangelistener_ag_a = toString;
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = this.HaptikSDK$a;
            int i3 = ((int) ((1152921503533105152L & j) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 == i4) {
                return null;
            }
            Object obj = this.ag$a.get(i4);
            if (obj == null) {
                if (this.invoke) {
                    return null;
                }
            } else if (obj instanceof values) {
                return null;
            } else {
                int i5 = (i + 1) & 1073741823;
                if (values.compareAndSet(this, j, addonpagechangelistener_ag_a.toString(j, i5))) {
                    this.ag$a.set(this.HaptikSDK$a & i, null);
                    return obj;
                } else if (this.invoke) {
                    addOnPageChangeListener<E> addonpagechangelistener = this;
                    do {
                        addonpagechangelistener = addonpagechangelistener.ag$a(i, i5);
                    } while (addonpagechangelistener != null);
                    return obj;
                }
            }
        }
    }

    private final addOnPageChangeListener<E> ag$a(int i, int i2) {
        long j;
        addOnPageChangeListener$ag$a addonpagechangelistener_ag_a;
        int i3;
        do {
            j = this._state;
            addonpagechangelistener_ag_a = toString;
            i3 = (int) ((1073741823 & j) >> 0);
            if (getPixelSize.values()) {
                if (!(i3 == i)) {
                    throw new AssertionError();
                }
            }
            if ((1152921504606846976L & j) != 0) {
                return values();
            }
        } while (!values.compareAndSet(this, j, addonpagechangelistener_ag_a.toString(j, i2)));
        this.ag$a.set(this.HaptikSDK$a & i3, null);
        return null;
    }

    private final long HaptikSDK$c() {
        long j;
        long j2;
        do {
            j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!values.compareAndSet(this, j, j2));
        return j2;
    }

    private final addOnPageChangeListener<E> ah$a(long j) {
        while (true) {
            addOnPageChangeListener<E> addonpagechangelistener = (addOnPageChangeListener) this._next;
            if (addonpagechangelistener != null) {
                return addonpagechangelistener;
            }
            ah$a.compareAndSet(this, null, toString(j));
        }
    }
}

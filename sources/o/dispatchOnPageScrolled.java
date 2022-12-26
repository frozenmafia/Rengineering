package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o.PagerTitleStrip;
import o.dispatchOnPageScrolled;
/* loaded from: classes7.dex */
public abstract class dispatchOnPageScrolled<N extends dispatchOnPageScrolled<N>> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater ag$a = AtomicReferenceFieldUpdater.newUpdater(dispatchOnPageScrolled.class, Object.class, "_next");
    private static final /* synthetic */ AtomicReferenceFieldUpdater toString = AtomicReferenceFieldUpdater.newUpdater(dispatchOnPageScrolled.class, Object.class, "_prev");
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ Object _prev;

    public abstract boolean ah$a();

    public dispatchOnPageScrolled(N n) {
        this._prev = n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object HaptikSDK$c() {
        return this._next;
    }

    public final boolean ah$a(N n) {
        return ag$a.compareAndSet(this, null, n);
    }

    public final boolean HaptikSDK$b() {
        return ag$a() == null;
    }

    public final N values() {
        return (N) this._prev;
    }

    public final void valueOf() {
        toString.lazySet(this, null);
    }

    public final void invoke() {
        if (getPixelSize.values() && !ah$a()) {
            throw new AssertionError();
        }
        if (getPixelSize.values() && !(!HaptikSDK$b())) {
            throw new AssertionError();
        }
        while (true) {
            N HaptikSDK$a = HaptikSDK$a();
            N ah$b = ah$b();
            ah$b._prev = HaptikSDK$a;
            if (HaptikSDK$a != null) {
                HaptikSDK$a._next = ah$b;
            }
            if (!ah$b.ah$a() && (HaptikSDK$a == null || !HaptikSDK$a.ah$a())) {
                return;
            }
        }
    }

    private final N HaptikSDK$a() {
        N values = values();
        while (values != null && values.ah$a()) {
            values = (N) values._prev;
        }
        return values;
    }

    private final N ah$b() {
        if (!getPixelSize.values() || (!HaptikSDK$b())) {
            N ag$a2 = ag$a();
            runAnimators.toString(ag$a2);
            while (ag$a2.ah$a()) {
                ag$a2 = (N) ag$a2.ag$a();
                runAnimators.toString(ag$a2);
            }
            return ag$a2;
        }
        throw new AssertionError();
    }

    public final N ag$a() {
        Object HaptikSDK$c = HaptikSDK$c();
        if (HaptikSDK$c == PagerTitleStrip.SingleLineAllCapsTransform.ah$a()) {
            return null;
        }
        return (N) HaptikSDK$c;
    }
}

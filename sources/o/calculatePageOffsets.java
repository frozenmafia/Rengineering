package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes5.dex */
public abstract class calculatePageOffsets<T> extends clearOnPageChangeListeners {
    private static final /* synthetic */ AtomicReferenceFieldUpdater ag$a = AtomicReferenceFieldUpdater.newUpdater(calculatePageOffsets.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = ViewPager.ag$a;

    public long ah$a() {
        return 0L;
    }

    public abstract Object valueOf(T t);

    public abstract void valueOf(T t, Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.clearOnPageChangeListeners
    public calculatePageOffsets<?> values() {
        return this;
    }

    public final Object valueOf() {
        return this._consensus;
    }

    public final boolean ag$a() {
        return this._consensus != ViewPager.ag$a;
    }

    public final Object ag$a(Object obj) {
        if (getPixelSize.values()) {
            if (!(obj != ViewPager.ag$a)) {
                throw new AssertionError();
            }
        }
        Object obj2 = this._consensus;
        return obj2 != ViewPager.ag$a ? obj2 : ag$a.compareAndSet(this, ViewPager.ag$a, obj) ? obj : this._consensus;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.clearOnPageChangeListeners
    public final Object ah$a(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == ViewPager.ag$a) {
            obj2 = ag$a(valueOf((calculatePageOffsets<T>) obj));
        }
        valueOf(obj, obj2);
        return obj2;
    }
}

package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o.recomputeScrollPosition;
/* loaded from: classes7.dex */
public class recomputeScrollPosition$ah$a<T> extends recomputeScrollPosition.toString {
    private static final /* synthetic */ AtomicReferenceFieldUpdater toString = AtomicReferenceFieldUpdater.newUpdater(recomputeScrollPosition$ah$a.class, Object.class, "_affectedNode");
    private static final /* synthetic */ AtomicReferenceFieldUpdater valueOf = AtomicReferenceFieldUpdater.newUpdater(recomputeScrollPosition$ah$a.class, Object.class, "_originalNext");
    private volatile /* synthetic */ Object _affectedNode = null;
    private volatile /* synthetic */ Object _originalNext = null;
    public final recomputeScrollPosition ag$a;

    public recomputeScrollPosition$ah$a(recomputeScrollPosition recomputescrollposition) {
        this.ag$a = recomputescrollposition;
    }

    public final T values() {
        recomputeScrollPosition valueOf2 = valueOf();
        runAnimators.toString(valueOf2);
        return (T) valueOf2;
    }

    @Override // o.recomputeScrollPosition.toString
    protected final recomputeScrollPosition values(clearOnPageChangeListeners clearonpagechangelisteners) {
        recomputeScrollPosition recomputescrollposition = this.ag$a;
        while (true) {
            Object obj = recomputescrollposition._next;
            if (obj instanceof clearOnPageChangeListeners) {
                clearOnPageChangeListeners clearonpagechangelisteners2 = (clearOnPageChangeListeners) obj;
                if (clearonpagechangelisteners.valueOf(clearonpagechangelisteners2)) {
                    return null;
                }
                clearonpagechangelisteners2.ah$a(this.ag$a);
            } else {
                return (recomputeScrollPosition) obj;
            }
        }
    }

    @Override // o.recomputeScrollPosition.toString
    protected final recomputeScrollPosition valueOf() {
        return (recomputeScrollPosition) this._affectedNode;
    }

    @Override // o.recomputeScrollPosition.toString
    protected final recomputeScrollPosition ah$a() {
        return (recomputeScrollPosition) this._originalNext;
    }

    @Override // o.recomputeScrollPosition.toString
    protected Object ag$a(recomputeScrollPosition recomputescrollposition) {
        Object obj;
        if (recomputescrollposition == this.ag$a) {
            obj = removeNonDecorViews.ah$a;
            return obj;
        }
        return null;
    }

    @Override // o.recomputeScrollPosition.toString
    protected final boolean values(recomputeScrollPosition recomputescrollposition, Object obj) {
        if (obj instanceof beginFakeDrag) {
            ((beginFakeDrag) obj).valueOf.HaptikSDK$d();
            return true;
        }
        return false;
    }

    @Override // o.recomputeScrollPosition.toString
    public void ag$a(recomputeScrollPosition.valueOf valueof) {
        toString.compareAndSet(this, null, valueof.toString);
        valueOf.compareAndSet(this, null, valueof.ag$a);
    }

    @Override // o.recomputeScrollPosition.toString
    public final Object valueOf(recomputeScrollPosition recomputescrollposition, recomputeScrollPosition recomputescrollposition2) {
        return recomputescrollposition2.HaptikSDK$c();
    }

    @Override // o.recomputeScrollPosition.toString
    protected final void values(recomputeScrollPosition recomputescrollposition, recomputeScrollPosition recomputescrollposition2) {
        recomputescrollposition2.ah$a((clearOnPageChangeListeners) null);
    }
}

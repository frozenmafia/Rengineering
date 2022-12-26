package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes5.dex */
public class addOnAdapterChangeListener<E> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater ag$a = AtomicReferenceFieldUpdater.newUpdater(addOnAdapterChangeListener.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur;

    public addOnAdapterChangeListener(boolean z) {
        this._cur = new addOnPageChangeListener(8, z);
    }

    public final int values() {
        return ((addOnPageChangeListener) this._cur).valueOf();
    }

    public final void valueOf() {
        while (true) {
            addOnPageChangeListener addonpagechangelistener = (addOnPageChangeListener) this._cur;
            if (addonpagechangelistener.ah$a()) {
                return;
            }
            ag$a.compareAndSet(this, addonpagechangelistener, addonpagechangelistener.values());
        }
    }

    public final boolean ag$a(E e) {
        while (true) {
            addOnPageChangeListener addonpagechangelistener = (addOnPageChangeListener) this._cur;
            int ag$a2 = addonpagechangelistener.ag$a(e);
            if (ag$a2 == 0) {
                return true;
            }
            if (ag$a2 == 1) {
                ag$a.compareAndSet(this, addonpagechangelistener, addonpagechangelistener.values());
            } else if (ag$a2 == 2) {
                return false;
            }
        }
    }

    public final E ag$a() {
        while (true) {
            addOnPageChangeListener addonpagechangelistener = (addOnPageChangeListener) this._cur;
            E e = (E) addonpagechangelistener.invoke();
            if (e != addOnPageChangeListener.valueOf) {
                return e;
            }
            ag$a.compareAndSet(this, addonpagechangelistener, addonpagechangelistener.values());
        }
    }
}

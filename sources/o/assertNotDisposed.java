package o;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes5.dex */
public final class assertNotDisposed<T> implements invalidateChildInParent<T> {
    private final AtomicReference<invalidateChildInParent<T>> toString;

    public assertNotDisposed(invalidateChildInParent<? extends T> invalidatechildinparent) {
        runAnimators.ag$a(invalidatechildinparent, com.apxor.androidsdk.core.ce.Constants.SEQUENCE_NO);
        this.toString = new AtomicReference<>(invalidatechildinparent);
    }

    @Override // o.invalidateChildInParent
    public Iterator<T> iterator() {
        invalidateChildInParent<T> andSet = this.toString.getAndSet(null);
        if (andSet == null) {
            throw new IllegalStateException("This sequence can be consumed only once.");
        }
        return andSet.iterator();
    }
}

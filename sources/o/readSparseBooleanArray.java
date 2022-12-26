package o;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
/* loaded from: classes7.dex */
public final class readSparseBooleanArray<T> extends WeakReference<T> {
    public final int ah$a;

    public readSparseBooleanArray(T t, ReferenceQueue<T> referenceQueue) {
        super(t, referenceQueue);
        this.ah$a = t != null ? t.hashCode() : 0;
    }
}

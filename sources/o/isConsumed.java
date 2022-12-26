package o;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class isConsumed {
    private final List<isConsumed$ag$a<?, ?>> toString = new ArrayList();

    public <Z, R> void valueOf(Class<Z> cls, Class<R> cls2, replaceSystemWindowInsets<Z, R> replacesystemwindowinsets) {
        synchronized (this) {
            this.toString.add(new isConsumed$ag$a<>(cls, cls2, replacesystemwindowinsets));
        }
    }

    public <Z, R> replaceSystemWindowInsets<Z, R> values(Class<Z> cls, Class<R> cls2) {
        synchronized (this) {
            if (cls2.isAssignableFrom(cls)) {
                return setOverriddenInsets.valueOf();
            }
            for (isConsumed$ag$a<?, ?> isconsumed_ag_a : this.toString) {
                if (isconsumed_ag_a.valueOf(cls, cls2)) {
                    return (replaceSystemWindowInsets<Z, R>) isconsumed_ag_a.ah$a;
                }
            }
            throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
        }
    }

    public <Z, R> List<Class<R>> ah$a(Class<Z> cls, Class<R> cls2) {
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            if (cls2.isAssignableFrom(cls)) {
                arrayList.add(cls2);
                return arrayList;
            }
            for (isConsumed$ag$a<?, ?> isconsumed_ag_a : this.toString) {
                if (isconsumed_ag_a.valueOf(cls, cls2)) {
                    arrayList.add(cls2);
                }
            }
            return arrayList;
        }
    }
}

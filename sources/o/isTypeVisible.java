package o;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import o.WindowInsetsControllerCompat;
/* loaded from: classes3.dex */
public class isTypeVisible {
    private final AtomicReference<WindowInsetsControllerCompat.Impl26> values = new AtomicReference<>();
    private final androidx.collection.ArrayMap<WindowInsetsControllerCompat.Impl26, List<Class<?>>> toString = new androidx.collection.ArrayMap<>();

    public List<Class<?>> toString(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        WindowInsetsControllerCompat.Impl26 andSet = this.values.getAndSet(null);
        if (andSet == null) {
            andSet = new WindowInsetsControllerCompat.Impl26(cls, cls2, cls3);
        } else {
            andSet.ah$a(cls, cls2, cls3);
        }
        synchronized (this.toString) {
            list = this.toString.get(andSet);
        }
        this.values.set(andSet);
        return list;
    }

    public void ag$a(Class<?> cls, Class<?> cls2, Class<?> cls3, List<Class<?>> list) {
        synchronized (this.toString) {
            this.toString.put(new WindowInsetsControllerCompat.Impl26(cls, cls2, cls3), list);
        }
    }
}

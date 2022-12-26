package o;

import java.lang.ref.SoftReference;
/* loaded from: classes4.dex */
public class onGetWindowAnimations<T> {
    SoftReference<T> ah$a = null;
    SoftReference<T> values = null;
    SoftReference<T> toString = null;

    public void ah$a(T t) {
        this.ah$a = new SoftReference<>(t);
        this.values = new SoftReference<>(t);
        this.toString = new SoftReference<>(t);
    }

    public T valueOf() {
        SoftReference<T> softReference = this.ah$a;
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    public void ah$a() {
        SoftReference<T> softReference = this.ah$a;
        if (softReference != null) {
            softReference.clear();
            this.ah$a = null;
        }
        SoftReference<T> softReference2 = this.values;
        if (softReference2 != null) {
            softReference2.clear();
            this.values = null;
        }
        SoftReference<T> softReference3 = this.toString;
        if (softReference3 != null) {
            softReference3.clear();
            this.toString = null;
        }
    }
}

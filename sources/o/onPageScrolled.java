package o;

import java.util.Objects;
/* loaded from: classes5.dex */
public class onPageScrolled<T> {
    private Object[] ag$a = new Object[16];
    private int valueOf;
    private int values;

    public final boolean ah$a() {
        return this.valueOf == this.values;
    }

    public final void ag$a(T t) {
        Object[] objArr = this.ag$a;
        int i = this.values;
        objArr[i] = t;
        int length = (objArr.length - 1) & (i + 1);
        this.values = length;
        if (length == this.valueOf) {
            ag$a();
        }
    }

    public final T valueOf() {
        int i = this.valueOf;
        if (i == this.values) {
            return null;
        }
        Object[] objArr = this.ag$a;
        T t = (T) objArr[i];
        objArr[i] = null;
        this.valueOf = (i + 1) & (objArr.length - 1);
        Objects.requireNonNull(t, "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
        return t;
    }

    private final void ag$a() {
        Object[] objArr = this.ag$a;
        int length = objArr.length;
        Object[] objArr2 = new Object[length << 1];
        getStartAlpha.values(objArr, objArr2, 0, this.valueOf, 0, 10, null);
        Object[] objArr3 = this.ag$a;
        int length2 = objArr3.length;
        int i = this.valueOf;
        getStartAlpha.values(objArr3, objArr2, length2 - i, 0, i, 4, null);
        this.ag$a = objArr2;
        this.valueOf = 0;
        this.values = length;
    }
}

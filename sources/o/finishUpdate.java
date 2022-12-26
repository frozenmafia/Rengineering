package o;

import androidx.core.util.Pools;
/* loaded from: classes4.dex */
public class finishUpdate<T> implements Pools.Pool<T> {
    private final Object[] ag$a;
    private int values = 0;

    public finishUpdate(int i) {
        this.ag$a = new Object[i];
    }

    @Override // androidx.core.util.Pools.Pool
    public T acquire() {
        synchronized (this) {
            int i = this.values;
            if (i == 0) {
                return null;
            }
            int i2 = i - 1;
            this.values = i2;
            Object[] objArr = this.ag$a;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            return t;
        }
    }

    @Override // androidx.core.util.Pools.Pool
    public boolean release(T t) {
        synchronized (this) {
            int i = this.values;
            Object[] objArr = this.ag$a;
            if (i == objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.values = i + 1;
            return true;
        }
    }

    public void ag$a() {
        synchronized (this) {
            for (int i = 0; i < this.values; i++) {
                this.ag$a[i] = null;
            }
            this.values = 0;
        }
    }
}

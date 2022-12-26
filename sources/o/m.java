package o;

import android.util.SparseArray;
import java.util.Objects;
/* loaded from: classes5.dex */
public final class m<T> {
    private int ah$a;
    private SparseArray<Object> toString;
    private int valueOf;
    private final getAlwaysExpand<T> values;

    public static <T> m<T> valueOf(int i, int i2) {
        return new m(null).ah$a(i, i2);
    }

    public static <T> m<T> toString(getAlwaysExpand<T> getalwaysexpand) {
        Objects.requireNonNull(getalwaysexpand, "onItemBind == null");
        return new m<>(getalwaysexpand);
    }

    private m(getAlwaysExpand<T> getalwaysexpand) {
        this.values = getalwaysexpand;
    }

    public final m<T> ah$a(int i, int i2) {
        this.ah$a = i;
        this.valueOf = i2;
        return this;
    }

    public final m<T> values(int i, Object obj) {
        if (this.toString == null) {
            this.toString = new SparseArray<>(1);
        }
        this.toString.put(i, obj);
        return this;
    }

    public final int values() {
        return this.ah$a;
    }

    public final int ag$a() {
        return this.valueOf;
    }

    public void toString(int i, T t) {
        getAlwaysExpand<T> getalwaysexpand = this.values;
        if (getalwaysexpand != null) {
            this.ah$a = -1;
            this.valueOf = 0;
            getalwaysexpand.onItemBind(this, i, t);
            if (this.ah$a == -1) {
                throw new IllegalStateException("variableId not set in onItemBind()");
            }
            if (this.valueOf == 0) {
                throw new IllegalStateException("layoutRes not set in onItemBind()");
            }
        }
    }

    public boolean ag$a(androidx.databinding.ViewDataBinding viewDataBinding, T t) {
        int i = this.ah$a;
        if (i == 0) {
            return false;
        }
        if (!viewDataBinding.setVariable(i, t)) {
            ActivityRule$$ExternalSyntheticBackport0.values(viewDataBinding, this.ah$a, this.valueOf);
        }
        SparseArray<Object> sparseArray = this.toString;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                int keyAt = this.toString.keyAt(i2);
                Object valueAt = this.toString.valueAt(i2);
                if (keyAt != 0) {
                    viewDataBinding.setVariable(keyAt, valueAt);
                }
            }
            return true;
        }
        return true;
    }
}

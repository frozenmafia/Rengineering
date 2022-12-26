package o;

import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class withLayer$ag$a<K, V> {
    withLayer$ag$a<K, V> ag$a;
    final K toString;
    withLayer$ag$a<K, V> valueOf;
    private List<V> values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public withLayer$ag$a() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public withLayer$ag$a(K k) {
        this.valueOf = this;
        this.ag$a = this;
        this.toString = k;
    }

    public V ah$a() {
        int ag$a = ag$a();
        if (ag$a > 0) {
            return this.values.remove(ag$a - 1);
        }
        return null;
    }

    public int ag$a() {
        List<V> list = this.values;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public void valueOf(V v) {
        if (this.values == null) {
            this.values = new ArrayList();
        }
        this.values.add(v);
    }
}

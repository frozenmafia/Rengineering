package o;

import java.util.HashMap;
import java.util.Map;
import o.yBy;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class withLayer<K extends yBy, V> {
    private final withLayer$ag$a<K, V> ah$a = new withLayer$ag$a<>();
    private final Map<K, withLayer$ag$a<K, V>> valueOf = new HashMap();

    public void values(K k, V v) {
        withLayer$ag$a<K, V> withlayer_ag_a = this.valueOf.get(k);
        if (withlayer_ag_a == null) {
            withlayer_ag_a = new withLayer$ag$a<>(k);
            toString(withlayer_ag_a);
            this.valueOf.put(k, withlayer_ag_a);
        } else {
            k.values();
        }
        withlayer_ag_a.valueOf(v);
    }

    public V ag$a(K k) {
        withLayer$ag$a<K, V> withlayer_ag_a = this.valueOf.get(k);
        if (withlayer_ag_a == null) {
            withlayer_ag_a = new withLayer$ag$a<>(k);
            this.valueOf.put(k, withlayer_ag_a);
        } else {
            k.values();
        }
        ah$a(withlayer_ag_a);
        return withlayer_ag_a.ah$a();
    }

    public V ag$a() {
        for (withLayer$ag$a withlayer_ag_a = this.ah$a.valueOf; !withlayer_ag_a.equals(this.ah$a); withlayer_ag_a = withlayer_ag_a.valueOf) {
            V v = (V) withlayer_ag_a.ah$a();
            if (v != null) {
                return v;
            }
            ag$a(withlayer_ag_a);
            this.valueOf.remove(withlayer_ag_a.toString);
            ((yBy) withlayer_ag_a.toString).values();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (withLayer$ag$a withlayer_ag_a = this.ah$a.ag$a; !withlayer_ag_a.equals(this.ah$a); withlayer_ag_a = withlayer_ag_a.ag$a) {
            z = true;
            sb.append('{');
            sb.append(withlayer_ag_a.toString);
            sb.append(':');
            sb.append(withlayer_ag_a.ag$a());
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }

    private void ah$a(withLayer$ag$a<K, V> withlayer_ag_a) {
        ag$a(withlayer_ag_a);
        withlayer_ag_a.valueOf = this.ah$a;
        withlayer_ag_a.ag$a = this.ah$a.ag$a;
        valueOf(withlayer_ag_a);
    }

    private void toString(withLayer$ag$a<K, V> withlayer_ag_a) {
        ag$a(withlayer_ag_a);
        withlayer_ag_a.valueOf = this.ah$a.valueOf;
        withlayer_ag_a.ag$a = this.ah$a;
        valueOf(withlayer_ag_a);
    }

    private static <K, V> void valueOf(withLayer$ag$a<K, V> withlayer_ag_a) {
        withlayer_ag_a.ag$a.valueOf = withlayer_ag_a;
        withlayer_ag_a.valueOf.ag$a = withlayer_ag_a;
    }

    private static <K, V> void ag$a(withLayer$ag$a<K, V> withlayer_ag_a) {
        withlayer_ag_a.valueOf.ag$a = withlayer_ag_a.ag$a;
        withlayer_ag_a.ag$a.valueOf = withlayer_ag_a.valueOf;
    }
}

package o;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Incorrect field signature: TK; */
/* loaded from: classes7.dex */
public class clearView$ag$a implements Map.Entry<K, V>, Comparable<clearView<K, V>.a> {
    private V ag$a;
    private final Comparable valueOf;
    final /* synthetic */ clearView values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public clearView$ag$a(clearView clearview, Map.Entry<K, V> entry) {
        this(clearview, (Comparable) entry.getKey(), entry.getValue());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public clearView$ag$a(clearView clearview, K k, V v) {
        this.values = clearview;
        this.valueOf = k;
        this.ag$a = v;
    }

    /* JADX WARN: Incorrect return type in method signature: ()TK; */
    @Override // java.util.Map.Entry
    /* renamed from: ah$a */
    public Comparable getKey() {
        return this.valueOf;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.ag$a;
    }

    /* JADX WARN: Incorrect inner types in method signature: (Lo/clearView<TK;TV;>.a;)I */
    @Override // java.lang.Comparable
    /* renamed from: values */
    public int compareTo(clearView$ag$a clearview_ag_a) {
        return getKey().compareTo(clearview_ag_a.getKey());
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        this.values.ah$b();
        V v2 = this.ag$a;
        this.ag$a = v;
        return v2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return toString(this.valueOf, entry.getKey()) && toString(this.ag$a, entry.getValue());
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        Comparable comparable = this.valueOf;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        V v = this.ag$a;
        return hashCode ^ (v != 0 ? v.hashCode() : 0);
    }

    public String toString() {
        return this.valueOf + "=" + this.ag$a;
    }

    private boolean toString(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }
}

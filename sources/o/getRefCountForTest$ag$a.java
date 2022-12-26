package o;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Incorrect field signature: TK; */
/* loaded from: classes5.dex */
public class getRefCountForTest$ag$a implements Map.Entry<K, V>, Comparable<getRefCountForTest<K, V>.a> {
    private final Comparable ag$a;
    final /* synthetic */ getRefCountForTest ah$a;
    private V toString;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getRefCountForTest$ag$a(getRefCountForTest getrefcountfortest, Map.Entry<K, V> entry) {
        this(getrefcountfortest, (Comparable) entry.getKey(), entry.getValue());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public getRefCountForTest$ag$a(getRefCountForTest getrefcountfortest, K k, V v) {
        this.ah$a = getrefcountfortest;
        this.ag$a = k;
        this.toString = v;
    }

    /* JADX WARN: Incorrect return type in method signature: ()TK; */
    @Override // java.util.Map.Entry
    /* renamed from: ag$a */
    public Comparable getKey() {
        return this.ag$a;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.toString;
    }

    /* JADX WARN: Incorrect inner types in method signature: (Lo/getRefCountForTest<TK;TV;>.a;)I */
    @Override // java.lang.Comparable
    /* renamed from: values */
    public int compareTo(getRefCountForTest$ag$a getrefcountfortest_ag_a) {
        return getKey().compareTo(getrefcountfortest_ag_a.getKey());
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        this.ah$a.ah$b();
        V v2 = this.toString;
        this.toString = v;
        return v2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return values(this.ag$a, entry.getKey()) && values(this.toString, entry.getValue());
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        Comparable comparable = this.ag$a;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        V v = this.toString;
        return hashCode ^ (v != 0 ? v.hashCode() : 0);
    }

    public String toString() {
        return this.ag$a + "=" + this.toString;
    }

    private boolean values(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }
}

package o;

import com.google.firebase.database.collection.LLRBNode;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.setEdgeEffectFactory;
/* loaded from: classes5.dex */
public class setHasFixedSize<K, V> extends setEdgeEffectFactory<K, V> {
    private final V[] toString;
    private final K[] valueOf;
    private final Comparator<K> values;

    public static <A, B, C> setHasFixedSize<A, C> toString(List<A> list, Map<B, C> map, setEdgeEffectFactory.valueOf.InterfaceC0354valueOf<A, B> interfaceC0354valueOf, Comparator<A> comparator) {
        Collections.sort(list, comparator);
        int size = list.size();
        Object[] objArr = new Object[size];
        Object[] objArr2 = new Object[size];
        int i = 0;
        for (A a : list) {
            objArr[i] = a;
            objArr2[i] = map.get(interfaceC0354valueOf.valueOf(a));
            i++;
        }
        return new setHasFixedSize<>(comparator, objArr, objArr2);
    }

    public static <K, V> setHasFixedSize<K, V> valueOf(Map<K, V> map, Comparator<K> comparator) {
        return toString(new ArrayList(map.keySet()), map, setEdgeEffectFactory.valueOf.valueOf(), comparator);
    }

    public setHasFixedSize(Comparator<K> comparator) {
        this.valueOf = (K[]) new Object[0];
        this.toString = (V[]) new Object[0];
        this.values = comparator;
    }

    private setHasFixedSize(Comparator<K> comparator, K[] kArr, V[] vArr) {
        this.valueOf = kArr;
        this.toString = vArr;
        this.values = comparator;
    }

    @Override // o.setEdgeEffectFactory
    public boolean ah$a(K k) {
        return toString(k) != -1;
    }

    @Override // o.setEdgeEffectFactory
    public V ag$a(K k) {
        int sethasfixedsize = toString(k);
        if (sethasfixedsize != -1) {
            return this.toString[sethasfixedsize];
        }
        return null;
    }

    @Override // o.setEdgeEffectFactory
    public setEdgeEffectFactory<K, V> values(K k) {
        int sethasfixedsize = toString(k);
        if (sethasfixedsize == -1) {
            return this;
        }
        return new setHasFixedSize(this.values, values(this.valueOf, sethasfixedsize), values(this.toString, sethasfixedsize));
    }

    @Override // o.setEdgeEffectFactory
    public setEdgeEffectFactory<K, V> values(K k, V v) {
        int sethasfixedsize = toString(k);
        if (sethasfixedsize != -1) {
            K[] kArr = this.valueOf;
            if (kArr[sethasfixedsize] == k && this.toString[sethasfixedsize] == v) {
                return this;
            }
            return new setHasFixedSize(this.values, toString(kArr, sethasfixedsize, k), toString(this.toString, sethasfixedsize, v));
        } else if (this.valueOf.length > 25) {
            HashMap hashMap = new HashMap(this.valueOf.length + 1);
            int i = 0;
            while (true) {
                K[] kArr2 = this.valueOf;
                if (i < kArr2.length) {
                    hashMap.put(kArr2[i], this.toString[i]);
                    i++;
                } else {
                    hashMap.put(k, v);
                    return setRecyclerListener.toString(hashMap, this.values);
                }
            }
        } else {
            int invoke = invoke(k);
            return new setHasFixedSize(this.values, values(this.valueOf, invoke, k), values(this.toString, invoke, v));
        }
    }

    @Override // o.setEdgeEffectFactory
    public K ah$a() {
        K[] kArr = this.valueOf;
        if (kArr.length > 0) {
            return kArr[0];
        }
        return null;
    }

    @Override // o.setEdgeEffectFactory
    public K ag$a() {
        K[] kArr = this.valueOf;
        if (kArr.length > 0) {
            return kArr[kArr.length - 1];
        }
        return null;
    }

    @Override // o.setEdgeEffectFactory
    public int HaptikSDK$c() {
        return this.valueOf.length;
    }

    @Override // o.setEdgeEffectFactory
    public boolean values() {
        return this.valueOf.length == 0;
    }

    @Override // o.setEdgeEffectFactory
    public void values(LLRBNode.values<K, V> valuesVar) {
        int i = 0;
        while (true) {
            K[] kArr = this.valueOf;
            if (i >= kArr.length) {
                return;
            }
            valuesVar.values(kArr[i], this.toString[i]);
            i++;
        }
    }

    private Iterator<Map.Entry<K, V>> toString(int i, boolean z) {
        return new Iterator<Map.Entry<K, V>>(i, z) { // from class: o.setHasFixedSize.3
            final /* synthetic */ boolean ag$a;
            final /* synthetic */ int toString;
            int values;

            {
                this.toString = i;
                this.ag$a = z;
                this.values = i;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return !this.ag$a ? this.values >= setHasFixedSize.this.valueOf.length : this.values < 0;
            }

            @Override // java.util.Iterator
            /* renamed from: valueOf */
            public Map.Entry<K, V> next() {
                Object obj = setHasFixedSize.this.valueOf[this.values];
                Object[] objArr = setHasFixedSize.this.toString;
                int i2 = this.values;
                Object obj2 = objArr[i2];
                this.values = this.ag$a ? i2 - 1 : i2 + 1;
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
            }
        };
    }

    @Override // o.setEdgeEffectFactory, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return toString(0, false);
    }

    @Override // o.setEdgeEffectFactory
    public Iterator<Map.Entry<K, V>> HaptikSDK$a() {
        return toString(this.valueOf.length - 1, true);
    }

    @Override // o.setEdgeEffectFactory
    public K valueOf(K k) {
        int sethasfixedsize = toString(k);
        if (sethasfixedsize != -1) {
            if (sethasfixedsize > 0) {
                return this.valueOf[sethasfixedsize - 1];
            }
            return null;
        }
        throw new IllegalArgumentException("Can't find predecessor of nonexistent key");
    }

    @Override // o.setEdgeEffectFactory
    public Comparator<K> valueOf() {
        return this.values;
    }

    private static <T> T[] values(T[] tArr, int i) {
        int length = tArr.length - 1;
        T[] tArr2 = (T[]) new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, i);
        System.arraycopy(tArr, i + 1, tArr2, i, length - i);
        return tArr2;
    }

    private static <T> T[] values(T[] tArr, int i, T t) {
        int length = tArr.length + 1;
        T[] tArr2 = (T[]) new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, i);
        tArr2[i] = t;
        System.arraycopy(tArr, i, tArr2, i + 1, (length - i) - 1);
        return tArr2;
    }

    private static <T> T[] toString(T[] tArr, int i, T t) {
        int length = tArr.length;
        T[] tArr2 = (T[]) new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, length);
        tArr2[i] = t;
        return tArr2;
    }

    private int invoke(K k) {
        int i = 0;
        while (true) {
            K[] kArr = this.valueOf;
            if (i >= kArr.length || this.values.compare(kArr[i], k) >= 0) {
                break;
            }
            i++;
        }
        return i;
    }

    private int toString(K k) {
        int i = 0;
        for (K k2 : this.valueOf) {
            if (this.values.compare(k, k2) == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }
}

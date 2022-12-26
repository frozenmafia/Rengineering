package o;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import o.isPortrait;
/* loaded from: classes7.dex */
public class isPortrait<K, V> extends AbstractMap<K, V> implements Cloneable {
    int toString;
    private Object[] values;

    public static <K, V> isPortrait<K, V> valueOf() {
        return new isPortrait<>();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.toString;
    }

    public final K ag$a(int i) {
        if (i < 0 || i >= this.toString) {
            return null;
        }
        return (K) this.values[i << 1];
    }

    public final V ah$a(int i) {
        if (i < 0 || i >= this.toString) {
            return null;
        }
        return HaptikSDK$b((i << 1) + 1);
    }

    public final V values(int i, K k, V v) {
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i2 = i + 1;
        toString(i2);
        int i3 = i << 1;
        V HaptikSDK$b = HaptikSDK$b(i3 + 1);
        ah$a(i3, k, v);
        if (i2 > this.toString) {
            this.toString = i2;
        }
        return HaptikSDK$b;
    }

    public final V ah$a(int i, V v) {
        int i2 = this.toString;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = (i << 1) + 1;
        V HaptikSDK$b = HaptikSDK$b(i3);
        this.values[i3] = v;
        return HaptikSDK$b;
    }

    public final V valueOf(int i) {
        return values(i << 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return -2 != ah$a(obj);
    }

    public final int toString(K k) {
        return ah$a(k) >> 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        return HaptikSDK$b(ah$a(obj) + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        int isportrait = toString((isPortrait<K, V>) k);
        if (isportrait == -1) {
            isportrait = this.toString;
        }
        return values(isportrait, k, v);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        return values(ah$a(obj));
    }

    public final void toString(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        }
        Object[] objArr = this.values;
        int i2 = i << 1;
        int length = objArr == null ? 0 : objArr.length;
        if (i2 > length) {
            int i3 = ((length / 2) * 3) + 1;
            if (i3 % 2 != 0) {
                i3++;
            }
            if (i3 >= i2) {
                i2 = i3;
            }
            HaptikSDK$c(i2);
        }
    }

    private void HaptikSDK$c(int i) {
        if (i == 0) {
            this.values = null;
            return;
        }
        int i2 = this.toString;
        Object[] objArr = this.values;
        if (i2 == 0 || i != objArr.length) {
            Object[] objArr2 = new Object[i];
            this.values = objArr2;
            if (i2 != 0) {
                System.arraycopy(objArr, 0, objArr2, 0, i2 << 1);
            }
        }
    }

    private void ah$a(int i, K k, V v) {
        Object[] objArr = this.values;
        objArr[i] = k;
        objArr[i + 1] = v;
    }

    private V HaptikSDK$b(int i) {
        if (i < 0) {
            return null;
        }
        return (V) this.values[i];
    }

    private int ah$a(Object obj) {
        int i = this.toString;
        Object[] objArr = this.values;
        for (int i2 = 0; i2 < (i << 1); i2 += 2) {
            Object obj2 = objArr[i2];
            if (obj == null) {
                if (obj2 == null) {
                    return i2;
                }
            } else if (obj.equals(obj2)) {
                return i2;
            }
        }
        return -2;
    }

    private V values(int i) {
        int i2 = this.toString << 1;
        if (i < 0 || i >= i2) {
            return null;
        }
        V HaptikSDK$b = HaptikSDK$b(i + 1);
        Object[] objArr = this.values;
        int i3 = (i2 - i) - 2;
        if (i3 != 0) {
            System.arraycopy(objArr, i + 2, objArr, i, i3);
        }
        this.toString--;
        ah$a(i2 - 2, null, null);
        return HaptikSDK$b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.toString = 0;
        this.values = null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        int i = this.toString;
        Object[] objArr = this.values;
        for (int i2 = 1; i2 < (i << 1); i2 += 2) {
            Object obj2 = objArr[i2];
            if (obj == null) {
                if (obj2 == null) {
                    return true;
                }
            } else if (obj.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return new AbstractSet<Map.Entry<K, V>>() { // from class: o.isPortrait$ag$a
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return new isPortrait.toString();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return isPortrait.this.toString;
            }
        };
    }

    @Override // java.util.AbstractMap
    /* renamed from: ah$a */
    public isPortrait<K, V> clone() {
        try {
            isPortrait<K, V> isportrait = (isPortrait) super.clone();
            Object[] objArr = this.values;
            if (objArr != null) {
                int length = objArr.length;
                Object[] objArr2 = new Object[length];
                isportrait.values = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
            }
            return isportrait;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* loaded from: classes7.dex */
    final class toString implements Iterator<Map.Entry<K, V>> {
        private boolean toString;
        private int valueOf;

        /* JADX INFO: Access modifiers changed from: package-private */
        public toString() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.valueOf < isPortrait.this.toString;
        }

        @Override // java.util.Iterator
        /* renamed from: ag$a */
        public Map.Entry<K, V> next() {
            int i = this.valueOf;
            if (i == isPortrait.this.toString) {
                throw new NoSuchElementException();
            }
            this.valueOf++;
            this.toString = false;
            return new valueOf(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            int i = this.valueOf - 1;
            if (this.toString || i < 0) {
                throw new IllegalArgumentException();
            }
            isPortrait.this.valueOf(i);
            this.valueOf--;
            this.toString = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public final class valueOf implements Map.Entry<K, V> {
        private int values;

        valueOf(int i) {
            this.values = i;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) isPortrait.this.ag$a(this.values);
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return (V) isPortrait.this.ah$a(this.values);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            return (V) isPortrait.this.ah$a(this.values, v);
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object key = getKey();
            Object value = getValue();
            return (key != null ? key.hashCode() : 0) ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            boolean values;
            boolean values2;
            if (this == obj) {
                return true;
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                values = recycleUpdateOp.values(getKey(), entry.getKey());
                if (values) {
                    values2 = recycleUpdateOp.values(getValue(), entry.getValue());
                    if (values2) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
    }
}

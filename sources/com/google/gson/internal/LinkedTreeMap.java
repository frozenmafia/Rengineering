package com.google.gson.internal;

import com.google.gson.internal.LinkedTreeMap;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes5.dex */
public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Comparator<Comparable> NATURAL_ORDER = new Comparator<Comparable>() { // from class: com.google.gson.internal.LinkedTreeMap.5
        @Override // java.util.Comparator
        /* renamed from: ah$a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };
    Comparator<? super K> comparator;
    /* JADX WARN: Incorrect inner types in field signature: Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>.a; */
    private LinkedTreeMap$ah$a entrySet;
    final LinkedTreeMap$ag$a<K, V> header;
    private LinkedTreeMap<K, V>.values keySet;
    int modCount;
    LinkedTreeMap$ag$a<K, V> root;
    int size;

    public LinkedTreeMap() {
        this(NATURAL_ORDER);
    }

    public LinkedTreeMap(Comparator<? super K> comparator) {
        this.size = 0;
        this.modCount = 0;
        this.header = new LinkedTreeMap$ag$a<>();
        this.comparator = comparator == null ? NATURAL_ORDER : comparator;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        LinkedTreeMap$ag$a<K, V> findByObject = findByObject(obj);
        if (findByObject != null) {
            return findByObject.invoke;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return findByObject(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        Objects.requireNonNull(k, "key == null");
        LinkedTreeMap$ag$a<K, V> find = find(k, true);
        V v2 = find.invoke;
        find.invoke = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.root = null;
        this.size = 0;
        this.modCount++;
        LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a = this.header;
        linkedTreeMap$ag$a.HaptikSDK$c = linkedTreeMap$ag$a;
        linkedTreeMap$ag$a.ag$a = linkedTreeMap$ag$a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        LinkedTreeMap$ag$a<K, V> removeInternalByKey = removeInternalByKey(obj);
        if (removeInternalByKey != null) {
            return removeInternalByKey.invoke;
        }
        return null;
    }

    LinkedTreeMap$ag$a<K, V> find(K k, boolean z) {
        int i;
        LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a;
        Comparator<? super K> comparator = this.comparator;
        LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a2 = this.root;
        if (linkedTreeMap$ag$a2 != null) {
            Comparable comparable = comparator == NATURAL_ORDER ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(linkedTreeMap$ag$a2.ah$a);
                } else {
                    i = comparator.compare(k, (K) linkedTreeMap$ag$a2.ah$a);
                }
                if (i == 0) {
                    return linkedTreeMap$ag$a2;
                }
                LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a3 = i < 0 ? linkedTreeMap$ag$a2.valueOf : linkedTreeMap$ag$a2.ah$b;
                if (linkedTreeMap$ag$a3 == null) {
                    break;
                }
                linkedTreeMap$ag$a2 = linkedTreeMap$ag$a3;
            }
        } else {
            i = 0;
        }
        if (z) {
            LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a4 = this.header;
            if (linkedTreeMap$ag$a2 == null) {
                if (comparator == NATURAL_ORDER && !(k instanceof Comparable)) {
                    throw new ClassCastException(k.getClass().getName() + " is not Comparable");
                }
                linkedTreeMap$ag$a = new LinkedTreeMap$ag$a<>(linkedTreeMap$ag$a2, k, linkedTreeMap$ag$a4, linkedTreeMap$ag$a4.HaptikSDK$c);
                this.root = linkedTreeMap$ag$a;
            } else {
                linkedTreeMap$ag$a = new LinkedTreeMap$ag$a<>(linkedTreeMap$ag$a2, k, linkedTreeMap$ag$a4, linkedTreeMap$ag$a4.HaptikSDK$c);
                if (i < 0) {
                    linkedTreeMap$ag$a2.valueOf = linkedTreeMap$ag$a;
                } else {
                    linkedTreeMap$ag$a2.ah$b = linkedTreeMap$ag$a;
                }
                rebalance(linkedTreeMap$ag$a2, true);
            }
            this.size++;
            this.modCount++;
            return linkedTreeMap$ag$a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    LinkedTreeMap$ag$a<K, V> findByObject(Object obj) {
        if (obj != 0) {
            try {
                return find(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LinkedTreeMap$ag$a<K, V> findByEntry(Map.Entry<?, ?> entry) {
        LinkedTreeMap$ag$a<K, V> findByObject = findByObject(entry.getKey());
        if (findByObject != null && equal(findByObject.invoke, entry.getValue())) {
            return findByObject;
        }
        return null;
    }

    private boolean equal(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeInternal(LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a, boolean z) {
        int i;
        if (z) {
            linkedTreeMap$ag$a.HaptikSDK$c.ag$a = linkedTreeMap$ag$a.ag$a;
            linkedTreeMap$ag$a.ag$a.HaptikSDK$c = linkedTreeMap$ag$a.HaptikSDK$c;
        }
        LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a2 = linkedTreeMap$ag$a.valueOf;
        LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a3 = linkedTreeMap$ag$a.ah$b;
        LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a4 = linkedTreeMap$ag$a.values;
        int i2 = 0;
        if (linkedTreeMap$ag$a2 != null && linkedTreeMap$ag$a3 != null) {
            LinkedTreeMap$ag$a<K, V> values2 = linkedTreeMap$ag$a2.toString > linkedTreeMap$ag$a3.toString ? linkedTreeMap$ag$a2.values() : linkedTreeMap$ag$a3.ah$a();
            removeInternal(values2, false);
            LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a5 = linkedTreeMap$ag$a.valueOf;
            if (linkedTreeMap$ag$a5 != null) {
                i = linkedTreeMap$ag$a5.toString;
                values2.valueOf = linkedTreeMap$ag$a5;
                linkedTreeMap$ag$a5.values = values2;
                linkedTreeMap$ag$a.valueOf = null;
            } else {
                i = 0;
            }
            LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a6 = linkedTreeMap$ag$a.ah$b;
            if (linkedTreeMap$ag$a6 != null) {
                i2 = linkedTreeMap$ag$a6.toString;
                values2.ah$b = linkedTreeMap$ag$a6;
                linkedTreeMap$ag$a6.values = values2;
                linkedTreeMap$ag$a.ah$b = null;
            }
            values2.toString = Math.max(i, i2) + 1;
            replaceInParent(linkedTreeMap$ag$a, values2);
            return;
        }
        if (linkedTreeMap$ag$a2 != null) {
            replaceInParent(linkedTreeMap$ag$a, linkedTreeMap$ag$a2);
            linkedTreeMap$ag$a.valueOf = null;
        } else if (linkedTreeMap$ag$a3 != null) {
            replaceInParent(linkedTreeMap$ag$a, linkedTreeMap$ag$a3);
            linkedTreeMap$ag$a.ah$b = null;
        } else {
            replaceInParent(linkedTreeMap$ag$a, null);
        }
        rebalance(linkedTreeMap$ag$a4, false);
        this.size--;
        this.modCount++;
    }

    LinkedTreeMap$ag$a<K, V> removeInternalByKey(Object obj) {
        LinkedTreeMap$ag$a<K, V> findByObject = findByObject(obj);
        if (findByObject != null) {
            removeInternal(findByObject, true);
        }
        return findByObject;
    }

    private void replaceInParent(LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a, LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a2) {
        LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a3 = linkedTreeMap$ag$a.values;
        linkedTreeMap$ag$a.values = null;
        if (linkedTreeMap$ag$a2 != null) {
            linkedTreeMap$ag$a2.values = linkedTreeMap$ag$a3;
        }
        if (linkedTreeMap$ag$a3 != null) {
            if (linkedTreeMap$ag$a3.valueOf == linkedTreeMap$ag$a) {
                linkedTreeMap$ag$a3.valueOf = linkedTreeMap$ag$a2;
                return;
            } else {
                linkedTreeMap$ag$a3.ah$b = linkedTreeMap$ag$a2;
                return;
            }
        }
        this.root = linkedTreeMap$ag$a2;
    }

    private void rebalance(LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a, boolean z) {
        while (linkedTreeMap$ag$a != null) {
            LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a2 = linkedTreeMap$ag$a.valueOf;
            LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a3 = linkedTreeMap$ag$a.ah$b;
            int i = linkedTreeMap$ag$a2 != null ? linkedTreeMap$ag$a2.toString : 0;
            int i2 = linkedTreeMap$ag$a3 != null ? linkedTreeMap$ag$a3.toString : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a4 = linkedTreeMap$ag$a3.valueOf;
                LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a5 = linkedTreeMap$ag$a3.ah$b;
                int i4 = (linkedTreeMap$ag$a4 != null ? linkedTreeMap$ag$a4.toString : 0) - (linkedTreeMap$ag$a5 != null ? linkedTreeMap$ag$a5.toString : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    rotateLeft(linkedTreeMap$ag$a);
                } else {
                    rotateRight(linkedTreeMap$ag$a3);
                    rotateLeft(linkedTreeMap$ag$a);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a6 = linkedTreeMap$ag$a2.valueOf;
                LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a7 = linkedTreeMap$ag$a2.ah$b;
                int i5 = (linkedTreeMap$ag$a6 != null ? linkedTreeMap$ag$a6.toString : 0) - (linkedTreeMap$ag$a7 != null ? linkedTreeMap$ag$a7.toString : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    rotateRight(linkedTreeMap$ag$a);
                } else {
                    rotateLeft(linkedTreeMap$ag$a2);
                    rotateRight(linkedTreeMap$ag$a);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                linkedTreeMap$ag$a.toString = i + 1;
                if (z) {
                    return;
                }
            } else {
                linkedTreeMap$ag$a.toString = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            linkedTreeMap$ag$a = linkedTreeMap$ag$a.values;
        }
    }

    private void rotateLeft(LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a) {
        LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a2 = linkedTreeMap$ag$a.valueOf;
        LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a3 = linkedTreeMap$ag$a.ah$b;
        LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a4 = linkedTreeMap$ag$a3.valueOf;
        LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a5 = linkedTreeMap$ag$a3.ah$b;
        linkedTreeMap$ag$a.ah$b = linkedTreeMap$ag$a4;
        if (linkedTreeMap$ag$a4 != null) {
            linkedTreeMap$ag$a4.values = linkedTreeMap$ag$a;
        }
        replaceInParent(linkedTreeMap$ag$a, linkedTreeMap$ag$a3);
        linkedTreeMap$ag$a3.valueOf = linkedTreeMap$ag$a;
        linkedTreeMap$ag$a.values = linkedTreeMap$ag$a3;
        linkedTreeMap$ag$a.toString = Math.max(linkedTreeMap$ag$a2 != null ? linkedTreeMap$ag$a2.toString : 0, linkedTreeMap$ag$a4 != null ? linkedTreeMap$ag$a4.toString : 0) + 1;
        linkedTreeMap$ag$a3.toString = Math.max(linkedTreeMap$ag$a.toString, linkedTreeMap$ag$a5 != null ? linkedTreeMap$ag$a5.toString : 0) + 1;
    }

    private void rotateRight(LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a) {
        LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a2 = linkedTreeMap$ag$a.valueOf;
        LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a3 = linkedTreeMap$ag$a.ah$b;
        LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a4 = linkedTreeMap$ag$a2.valueOf;
        LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a5 = linkedTreeMap$ag$a2.ah$b;
        linkedTreeMap$ag$a.valueOf = linkedTreeMap$ag$a5;
        if (linkedTreeMap$ag$a5 != null) {
            linkedTreeMap$ag$a5.values = linkedTreeMap$ag$a;
        }
        replaceInParent(linkedTreeMap$ag$a, linkedTreeMap$ag$a2);
        linkedTreeMap$ag$a2.ah$b = linkedTreeMap$ag$a;
        linkedTreeMap$ag$a.values = linkedTreeMap$ag$a2;
        linkedTreeMap$ag$a.toString = Math.max(linkedTreeMap$ag$a3 != null ? linkedTreeMap$ag$a3.toString : 0, linkedTreeMap$ag$a5 != null ? linkedTreeMap$ag$a5.toString : 0) + 1;
        linkedTreeMap$ag$a2.toString = Math.max(linkedTreeMap$ag$a.toString, linkedTreeMap$ag$a4 != null ? linkedTreeMap$ag$a4.toString : 0) + 1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.gson.internal.LinkedTreeMap$ah$a, java.util.Set<java.util.Map$Entry<K, V>>] */
    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        LinkedTreeMap$ah$a linkedTreeMap$ah$a = this.entrySet;
        if (linkedTreeMap$ah$a != null) {
            return linkedTreeMap$ah$a;
        }
        AbstractSet<Map.Entry<K, V>> abstractSet = new AbstractSet<Map.Entry<K, V>>() { // from class: com.google.gson.internal.LinkedTreeMap$ah$a
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return LinkedTreeMap.this.size;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return new LinkedTreeMap.valueOf() { // from class: com.google.gson.internal.LinkedTreeMap$ah$a.4
                    {
                        LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
                    }

                    @Override // java.util.Iterator
                    /* renamed from: ag$a */
                    public Map.Entry<K, V> next() {
                        return ah$a();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return (obj instanceof Map.Entry) && LinkedTreeMap.this.findByEntry((Map.Entry) obj) != null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                LinkedTreeMap$ag$a findByEntry;
                if ((obj instanceof Map.Entry) && (findByEntry = LinkedTreeMap.this.findByEntry((Map.Entry) obj)) != null) {
                    LinkedTreeMap.this.removeInternal(findByEntry, true);
                    return true;
                }
                return false;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                LinkedTreeMap.this.clear();
            }
        };
        this.entrySet = abstractSet;
        return abstractSet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        LinkedTreeMap<K, V>.values valuesVar = this.keySet;
        if (valuesVar != null) {
            return valuesVar;
        }
        LinkedTreeMap<K, V>.values valuesVar2 = new values();
        this.keySet = valuesVar2;
        return valuesVar2;
    }

    /* loaded from: classes5.dex */
    abstract class valueOf<T> implements Iterator<T> {
        LinkedTreeMap$ag$a<K, V> ag$a = null;
        LinkedTreeMap$ag$a<K, V> valueOf;
        int values;

        /* JADX INFO: Access modifiers changed from: package-private */
        public valueOf() {
            this.valueOf = LinkedTreeMap.this.header.ag$a;
            this.values = LinkedTreeMap.this.modCount;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.valueOf != LinkedTreeMap.this.header;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final LinkedTreeMap$ag$a<K, V> ah$a() {
            LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a = this.valueOf;
            if (linkedTreeMap$ag$a == LinkedTreeMap.this.header) {
                throw new NoSuchElementException();
            }
            if (LinkedTreeMap.this.modCount != this.values) {
                throw new ConcurrentModificationException();
            }
            this.valueOf = linkedTreeMap$ag$a.ag$a;
            this.ag$a = linkedTreeMap$ag$a;
            return linkedTreeMap$ag$a;
        }

        @Override // java.util.Iterator
        public final void remove() {
            LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a = this.ag$a;
            if (linkedTreeMap$ag$a == null) {
                throw new IllegalStateException();
            }
            LinkedTreeMap.this.removeInternal(linkedTreeMap$ag$a, true);
            this.ag$a = null;
            this.values = LinkedTreeMap.this.modCount;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class values extends AbstractSet<K> {
        values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedTreeMap.this.size;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new valueOf() { // from class: com.google.gson.internal.LinkedTreeMap.values.2
                {
                    LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
                }

                @Override // java.util.Iterator
                public K next() {
                    return ah$a().ah$a;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LinkedTreeMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return LinkedTreeMap.this.removeInternalByKey(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedTreeMap.this.clear();
        }
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }
}

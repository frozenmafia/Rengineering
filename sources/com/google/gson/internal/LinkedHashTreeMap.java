package com.google.gson.internal;

import com.google.gson.internal.LinkedHashTreeMap;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes5.dex */
public final class LinkedHashTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Comparator<Comparable> NATURAL_ORDER = new Comparator<Comparable>() { // from class: com.google.gson.internal.LinkedHashTreeMap.1
        @Override // java.util.Comparator
        /* renamed from: ah$a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };
    Comparator<? super K> comparator;
    /* JADX WARN: Incorrect inner types in field signature: Lcom/google/gson/internal/LinkedHashTreeMap<TK;TV;>.a; */
    private LinkedHashTreeMap$ah$a entrySet;
    final LinkedHashTreeMap$ah$b<K, V> header;
    /* JADX WARN: Incorrect inner types in field signature: Lcom/google/gson/internal/LinkedHashTreeMap<TK;TV;>.a; */
    private LinkedHashTreeMap$ag$a keySet;
    int modCount;
    int size;
    LinkedHashTreeMap$ah$b<K, V>[] table;
    int threshold;

    private static int secondaryHash(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 ^ (i2 >>> 7)) ^ (i2 >>> 4);
    }

    public LinkedHashTreeMap() {
        this(NATURAL_ORDER);
    }

    public LinkedHashTreeMap(Comparator<? super K> comparator) {
        this.size = 0;
        this.modCount = 0;
        this.comparator = comparator == null ? NATURAL_ORDER : comparator;
        this.header = new LinkedHashTreeMap$ah$b<>();
        this.table = new LinkedHashTreeMap$ah$b[16];
        this.threshold = 12;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        LinkedHashTreeMap$ah$b<K, V> findByObject = findByObject(obj);
        if (findByObject != null) {
            return findByObject.HaptikSDK$c;
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
        LinkedHashTreeMap$ah$b<K, V> find = find(k, true);
        V v2 = find.HaptikSDK$c;
        find.HaptikSDK$c = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.table, (Object) null);
        this.size = 0;
        this.modCount++;
        LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b = this.header;
        LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b2 = linkedHashTreeMap$ah$b.ah$a;
        while (linkedHashTreeMap$ah$b2 != linkedHashTreeMap$ah$b) {
            LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b3 = linkedHashTreeMap$ah$b2.ah$a;
            linkedHashTreeMap$ah$b2.HaptikSDK$b = null;
            linkedHashTreeMap$ah$b2.ah$a = null;
            linkedHashTreeMap$ah$b2 = linkedHashTreeMap$ah$b3;
        }
        linkedHashTreeMap$ah$b.HaptikSDK$b = linkedHashTreeMap$ah$b;
        linkedHashTreeMap$ah$b.ah$a = linkedHashTreeMap$ah$b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        LinkedHashTreeMap$ah$b<K, V> removeInternalByKey = removeInternalByKey(obj);
        if (removeInternalByKey != null) {
            return removeInternalByKey.HaptikSDK$c;
        }
        return null;
    }

    LinkedHashTreeMap$ah$b<K, V> find(K k, boolean z) {
        LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b;
        int i;
        LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b2;
        int compare;
        Comparator<? super K> comparator = this.comparator;
        LinkedHashTreeMap$ah$b<K, V>[] linkedHashTreeMap$ah$bArr = this.table;
        int secondaryHash = secondaryHash(k.hashCode());
        int length = (linkedHashTreeMap$ah$bArr.length - 1) & secondaryHash;
        LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b3 = linkedHashTreeMap$ah$bArr[length];
        if (linkedHashTreeMap$ah$b3 != null) {
            Comparable comparable = comparator == NATURAL_ORDER ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    compare = comparable.compareTo(linkedHashTreeMap$ah$b3.ag$a);
                } else {
                    compare = comparator.compare(k, (K) linkedHashTreeMap$ah$b3.ag$a);
                }
                if (compare == 0) {
                    return linkedHashTreeMap$ah$b3;
                }
                LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b4 = compare < 0 ? linkedHashTreeMap$ah$b3.valueOf : linkedHashTreeMap$ah$b3.HaptikSDK$a;
                if (linkedHashTreeMap$ah$b4 == null) {
                    linkedHashTreeMap$ah$b = linkedHashTreeMap$ah$b3;
                    i = compare;
                    break;
                }
                linkedHashTreeMap$ah$b3 = linkedHashTreeMap$ah$b4;
            }
        } else {
            linkedHashTreeMap$ah$b = linkedHashTreeMap$ah$b3;
            i = 0;
        }
        if (z) {
            LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b5 = this.header;
            if (linkedHashTreeMap$ah$b == null) {
                if (comparator == NATURAL_ORDER && !(k instanceof Comparable)) {
                    throw new ClassCastException(k.getClass().getName() + " is not Comparable");
                }
                linkedHashTreeMap$ah$b2 = new LinkedHashTreeMap$ah$b<>(linkedHashTreeMap$ah$b, k, secondaryHash, linkedHashTreeMap$ah$b5, linkedHashTreeMap$ah$b5.HaptikSDK$b);
                linkedHashTreeMap$ah$bArr[length] = linkedHashTreeMap$ah$b2;
            } else {
                linkedHashTreeMap$ah$b2 = new LinkedHashTreeMap$ah$b<>(linkedHashTreeMap$ah$b, k, secondaryHash, linkedHashTreeMap$ah$b5, linkedHashTreeMap$ah$b5.HaptikSDK$b);
                if (i < 0) {
                    linkedHashTreeMap$ah$b.valueOf = linkedHashTreeMap$ah$b2;
                } else {
                    linkedHashTreeMap$ah$b.HaptikSDK$a = linkedHashTreeMap$ah$b2;
                }
                rebalance(linkedHashTreeMap$ah$b, true);
            }
            int i2 = this.size;
            this.size = i2 + 1;
            if (i2 > this.threshold) {
                doubleCapacity();
            }
            this.modCount++;
            return linkedHashTreeMap$ah$b2;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    LinkedHashTreeMap$ah$b<K, V> findByObject(Object obj) {
        if (obj != 0) {
            try {
                return find(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LinkedHashTreeMap$ah$b<K, V> findByEntry(Map.Entry<?, ?> entry) {
        LinkedHashTreeMap$ah$b<K, V> findByObject = findByObject(entry.getKey());
        if (findByObject != null && equal(findByObject.HaptikSDK$c, entry.getValue())) {
            return findByObject;
        }
        return null;
    }

    private boolean equal(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeInternal(LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b, boolean z) {
        int i;
        if (z) {
            linkedHashTreeMap$ah$b.HaptikSDK$b.ah$a = linkedHashTreeMap$ah$b.ah$a;
            linkedHashTreeMap$ah$b.ah$a.HaptikSDK$b = linkedHashTreeMap$ah$b.HaptikSDK$b;
            linkedHashTreeMap$ah$b.HaptikSDK$b = null;
            linkedHashTreeMap$ah$b.ah$a = null;
        }
        LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b2 = linkedHashTreeMap$ah$b.valueOf;
        LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b3 = linkedHashTreeMap$ah$b.HaptikSDK$a;
        LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b4 = linkedHashTreeMap$ah$b.ah$b;
        int i2 = 0;
        if (linkedHashTreeMap$ah$b2 != null && linkedHashTreeMap$ah$b3 != null) {
            LinkedHashTreeMap$ah$b<K, V> values2 = linkedHashTreeMap$ah$b2.values > linkedHashTreeMap$ah$b3.values ? linkedHashTreeMap$ah$b2.values() : linkedHashTreeMap$ah$b3.valueOf();
            removeInternal(values2, false);
            LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b5 = linkedHashTreeMap$ah$b.valueOf;
            if (linkedHashTreeMap$ah$b5 != null) {
                i = linkedHashTreeMap$ah$b5.values;
                values2.valueOf = linkedHashTreeMap$ah$b5;
                linkedHashTreeMap$ah$b5.ah$b = values2;
                linkedHashTreeMap$ah$b.valueOf = null;
            } else {
                i = 0;
            }
            LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b6 = linkedHashTreeMap$ah$b.HaptikSDK$a;
            if (linkedHashTreeMap$ah$b6 != null) {
                i2 = linkedHashTreeMap$ah$b6.values;
                values2.HaptikSDK$a = linkedHashTreeMap$ah$b6;
                linkedHashTreeMap$ah$b6.ah$b = values2;
                linkedHashTreeMap$ah$b.HaptikSDK$a = null;
            }
            values2.values = Math.max(i, i2) + 1;
            replaceInParent(linkedHashTreeMap$ah$b, values2);
            return;
        }
        if (linkedHashTreeMap$ah$b2 != null) {
            replaceInParent(linkedHashTreeMap$ah$b, linkedHashTreeMap$ah$b2);
            linkedHashTreeMap$ah$b.valueOf = null;
        } else if (linkedHashTreeMap$ah$b3 != null) {
            replaceInParent(linkedHashTreeMap$ah$b, linkedHashTreeMap$ah$b3);
            linkedHashTreeMap$ah$b.HaptikSDK$a = null;
        } else {
            replaceInParent(linkedHashTreeMap$ah$b, null);
        }
        rebalance(linkedHashTreeMap$ah$b4, false);
        this.size--;
        this.modCount++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LinkedHashTreeMap$ah$b<K, V> removeInternalByKey(Object obj) {
        LinkedHashTreeMap$ah$b<K, V> findByObject = findByObject(obj);
        if (findByObject != null) {
            removeInternal(findByObject, true);
        }
        return findByObject;
    }

    private void replaceInParent(LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b, LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b2) {
        LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b3 = linkedHashTreeMap$ah$b.ah$b;
        linkedHashTreeMap$ah$b.ah$b = null;
        if (linkedHashTreeMap$ah$b2 != null) {
            linkedHashTreeMap$ah$b2.ah$b = linkedHashTreeMap$ah$b3;
        }
        if (linkedHashTreeMap$ah$b3 != null) {
            if (linkedHashTreeMap$ah$b3.valueOf == linkedHashTreeMap$ah$b) {
                linkedHashTreeMap$ah$b3.valueOf = linkedHashTreeMap$ah$b2;
                return;
            } else {
                linkedHashTreeMap$ah$b3.HaptikSDK$a = linkedHashTreeMap$ah$b2;
                return;
            }
        }
        int i = linkedHashTreeMap$ah$b.toString;
        LinkedHashTreeMap$ah$b<K, V>[] linkedHashTreeMap$ah$bArr = this.table;
        linkedHashTreeMap$ah$bArr[i & (linkedHashTreeMap$ah$bArr.length - 1)] = linkedHashTreeMap$ah$b2;
    }

    private void rebalance(LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b, boolean z) {
        while (linkedHashTreeMap$ah$b != null) {
            LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b2 = linkedHashTreeMap$ah$b.valueOf;
            LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b3 = linkedHashTreeMap$ah$b.HaptikSDK$a;
            int i = linkedHashTreeMap$ah$b2 != null ? linkedHashTreeMap$ah$b2.values : 0;
            int i2 = linkedHashTreeMap$ah$b3 != null ? linkedHashTreeMap$ah$b3.values : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b4 = linkedHashTreeMap$ah$b3.valueOf;
                LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b5 = linkedHashTreeMap$ah$b3.HaptikSDK$a;
                int i4 = (linkedHashTreeMap$ah$b4 != null ? linkedHashTreeMap$ah$b4.values : 0) - (linkedHashTreeMap$ah$b5 != null ? linkedHashTreeMap$ah$b5.values : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    rotateLeft(linkedHashTreeMap$ah$b);
                } else {
                    rotateRight(linkedHashTreeMap$ah$b3);
                    rotateLeft(linkedHashTreeMap$ah$b);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b6 = linkedHashTreeMap$ah$b2.valueOf;
                LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b7 = linkedHashTreeMap$ah$b2.HaptikSDK$a;
                int i5 = (linkedHashTreeMap$ah$b6 != null ? linkedHashTreeMap$ah$b6.values : 0) - (linkedHashTreeMap$ah$b7 != null ? linkedHashTreeMap$ah$b7.values : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    rotateRight(linkedHashTreeMap$ah$b);
                } else {
                    rotateLeft(linkedHashTreeMap$ah$b2);
                    rotateRight(linkedHashTreeMap$ah$b);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                linkedHashTreeMap$ah$b.values = i + 1;
                if (z) {
                    return;
                }
            } else {
                linkedHashTreeMap$ah$b.values = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            linkedHashTreeMap$ah$b = linkedHashTreeMap$ah$b.ah$b;
        }
    }

    private void rotateLeft(LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b) {
        LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b2 = linkedHashTreeMap$ah$b.valueOf;
        LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b3 = linkedHashTreeMap$ah$b.HaptikSDK$a;
        LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b4 = linkedHashTreeMap$ah$b3.valueOf;
        LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b5 = linkedHashTreeMap$ah$b3.HaptikSDK$a;
        linkedHashTreeMap$ah$b.HaptikSDK$a = linkedHashTreeMap$ah$b4;
        if (linkedHashTreeMap$ah$b4 != null) {
            linkedHashTreeMap$ah$b4.ah$b = linkedHashTreeMap$ah$b;
        }
        replaceInParent(linkedHashTreeMap$ah$b, linkedHashTreeMap$ah$b3);
        linkedHashTreeMap$ah$b3.valueOf = linkedHashTreeMap$ah$b;
        linkedHashTreeMap$ah$b.ah$b = linkedHashTreeMap$ah$b3;
        linkedHashTreeMap$ah$b.values = Math.max(linkedHashTreeMap$ah$b2 != null ? linkedHashTreeMap$ah$b2.values : 0, linkedHashTreeMap$ah$b4 != null ? linkedHashTreeMap$ah$b4.values : 0) + 1;
        linkedHashTreeMap$ah$b3.values = Math.max(linkedHashTreeMap$ah$b.values, linkedHashTreeMap$ah$b5 != null ? linkedHashTreeMap$ah$b5.values : 0) + 1;
    }

    private void rotateRight(LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b) {
        LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b2 = linkedHashTreeMap$ah$b.valueOf;
        LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b3 = linkedHashTreeMap$ah$b.HaptikSDK$a;
        LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b4 = linkedHashTreeMap$ah$b2.valueOf;
        LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b5 = linkedHashTreeMap$ah$b2.HaptikSDK$a;
        linkedHashTreeMap$ah$b.valueOf = linkedHashTreeMap$ah$b5;
        if (linkedHashTreeMap$ah$b5 != null) {
            linkedHashTreeMap$ah$b5.ah$b = linkedHashTreeMap$ah$b;
        }
        replaceInParent(linkedHashTreeMap$ah$b, linkedHashTreeMap$ah$b2);
        linkedHashTreeMap$ah$b2.HaptikSDK$a = linkedHashTreeMap$ah$b;
        linkedHashTreeMap$ah$b.ah$b = linkedHashTreeMap$ah$b2;
        linkedHashTreeMap$ah$b.values = Math.max(linkedHashTreeMap$ah$b3 != null ? linkedHashTreeMap$ah$b3.values : 0, linkedHashTreeMap$ah$b5 != null ? linkedHashTreeMap$ah$b5.values : 0) + 1;
        linkedHashTreeMap$ah$b2.values = Math.max(linkedHashTreeMap$ah$b.values, linkedHashTreeMap$ah$b4 != null ? linkedHashTreeMap$ah$b4.values : 0) + 1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.gson.internal.LinkedHashTreeMap$ah$a, java.util.Set<java.util.Map$Entry<K, V>>] */
    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        LinkedHashTreeMap$ah$a linkedHashTreeMap$ah$a = this.entrySet;
        if (linkedHashTreeMap$ah$a != null) {
            return linkedHashTreeMap$ah$a;
        }
        AbstractSet<Map.Entry<K, V>> abstractSet = new AbstractSet<Map.Entry<K, V>>() { // from class: com.google.gson.internal.LinkedHashTreeMap$ah$a
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return LinkedHashTreeMap.this.size;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return new LinkedHashTreeMap.values() { // from class: com.google.gson.internal.LinkedHashTreeMap$ah$a.5
                    {
                        LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
                    }

                    @Override // java.util.Iterator
                    /* renamed from: ah$a */
                    public Map.Entry<K, V> next() {
                        return ag$a();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return (obj instanceof Map.Entry) && LinkedHashTreeMap.this.findByEntry((Map.Entry) obj) != null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                LinkedHashTreeMap$ah$b findByEntry;
                if ((obj instanceof Map.Entry) && (findByEntry = LinkedHashTreeMap.this.findByEntry((Map.Entry) obj)) != null) {
                    LinkedHashTreeMap.this.removeInternal(findByEntry, true);
                    return true;
                }
                return false;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                LinkedHashTreeMap.this.clear();
            }
        };
        this.entrySet = abstractSet;
        return abstractSet;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Set<K>, com.google.gson.internal.LinkedHashTreeMap$ag$a] */
    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        LinkedHashTreeMap$ag$a linkedHashTreeMap$ag$a = this.keySet;
        if (linkedHashTreeMap$ag$a != null) {
            return linkedHashTreeMap$ag$a;
        }
        AbstractSet<K> abstractSet = new AbstractSet<K>() { // from class: com.google.gson.internal.LinkedHashTreeMap$ag$a
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return LinkedHashTreeMap.this.size;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<K> iterator() {
                return new LinkedHashTreeMap.values() { // from class: com.google.gson.internal.LinkedHashTreeMap$ag$a.1
                    {
                        LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
                    }

                    @Override // java.util.Iterator
                    public K next() {
                        return ag$a().ag$a;
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return LinkedHashTreeMap.this.containsKey(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                return LinkedHashTreeMap.this.removeInternalByKey(obj) != null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                LinkedHashTreeMap.this.clear();
            }
        };
        this.keySet = abstractSet;
        return abstractSet;
    }

    private void doubleCapacity() {
        LinkedHashTreeMap$ah$b<K, V>[] doubleCapacity = doubleCapacity(this.table);
        this.table = doubleCapacity;
        this.threshold = (doubleCapacity.length / 2) + (doubleCapacity.length / 4);
    }

    static <K, V> LinkedHashTreeMap$ah$b<K, V>[] doubleCapacity(LinkedHashTreeMap$ah$b<K, V>[] linkedHashTreeMap$ah$bArr) {
        int length = linkedHashTreeMap$ah$bArr.length;
        LinkedHashTreeMap$ah$b<K, V>[] linkedHashTreeMap$ah$bArr2 = new LinkedHashTreeMap$ah$b[length * 2];
        toString tostring = new toString();
        valueOf valueof = new valueOf();
        valueOf valueof2 = new valueOf();
        for (int i = 0; i < length; i++) {
            LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b = linkedHashTreeMap$ah$bArr[i];
            if (linkedHashTreeMap$ah$b != null) {
                tostring.ah$a(linkedHashTreeMap$ah$b);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    LinkedHashTreeMap$ah$b<K, V> ag$a = tostring.ag$a();
                    if (ag$a == null) {
                        break;
                    } else if ((ag$a.toString & length) == 0) {
                        i2++;
                    } else {
                        i3++;
                    }
                }
                valueof.ag$a(i2);
                valueof2.ag$a(i3);
                tostring.ah$a(linkedHashTreeMap$ah$b);
                while (true) {
                    LinkedHashTreeMap$ah$b<K, V> ag$a2 = tostring.ag$a();
                    if (ag$a2 == null) {
                        break;
                    } else if ((ag$a2.toString & length) == 0) {
                        valueof.toString(ag$a2);
                    } else {
                        valueof2.toString(ag$a2);
                    }
                }
                linkedHashTreeMap$ah$bArr2[i] = i2 > 0 ? valueof.ag$a() : null;
                linkedHashTreeMap$ah$bArr2[i + length] = i3 > 0 ? valueof2.ag$a() : null;
            }
        }
        return linkedHashTreeMap$ah$bArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class toString<K, V> {
        private LinkedHashTreeMap$ah$b<K, V> valueOf;

        toString() {
        }

        void ah$a(LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b) {
            LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b2 = null;
            while (linkedHashTreeMap$ah$b != null) {
                linkedHashTreeMap$ah$b.ah$b = linkedHashTreeMap$ah$b2;
                linkedHashTreeMap$ah$b2 = linkedHashTreeMap$ah$b;
                linkedHashTreeMap$ah$b = linkedHashTreeMap$ah$b.valueOf;
            }
            this.valueOf = linkedHashTreeMap$ah$b2;
        }

        public LinkedHashTreeMap$ah$b<K, V> ag$a() {
            LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b = this.valueOf;
            if (linkedHashTreeMap$ah$b == null) {
                return null;
            }
            LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b2 = linkedHashTreeMap$ah$b.ah$b;
            linkedHashTreeMap$ah$b.ah$b = null;
            for (LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b3 = linkedHashTreeMap$ah$b.HaptikSDK$a; linkedHashTreeMap$ah$b3 != null; linkedHashTreeMap$ah$b3 = linkedHashTreeMap$ah$b3.valueOf) {
                linkedHashTreeMap$ah$b3.ah$b = linkedHashTreeMap$ah$b2;
                linkedHashTreeMap$ah$b2 = linkedHashTreeMap$ah$b3;
            }
            this.valueOf = linkedHashTreeMap$ah$b2;
            return linkedHashTreeMap$ah$b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class valueOf<K, V> {
        private int ag$a;
        private int ah$a;
        private LinkedHashTreeMap$ah$b<K, V> toString;
        private int valueOf;

        valueOf() {
        }

        void ag$a(int i) {
            this.ah$a = ((Integer.highestOneBit(i) * 2) - 1) - i;
            this.ag$a = 0;
            this.valueOf = 0;
            this.toString = null;
        }

        void toString(LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b) {
            linkedHashTreeMap$ah$b.HaptikSDK$a = null;
            linkedHashTreeMap$ah$b.ah$b = null;
            linkedHashTreeMap$ah$b.valueOf = null;
            linkedHashTreeMap$ah$b.values = 1;
            int i = this.ah$a;
            if (i > 0) {
                int i2 = this.ag$a;
                if ((i2 & 1) == 0) {
                    this.ag$a = i2 + 1;
                    this.ah$a = i - 1;
                    this.valueOf++;
                }
            }
            linkedHashTreeMap$ah$b.ah$b = this.toString;
            this.toString = linkedHashTreeMap$ah$b;
            int i3 = this.ag$a + 1;
            this.ag$a = i3;
            int i4 = this.ah$a;
            if (i4 > 0 && (i3 & 1) == 0) {
                this.ag$a = i3 + 1;
                this.ah$a = i4 - 1;
                this.valueOf++;
            }
            int i5 = 4;
            while (true) {
                int i6 = i5 - 1;
                if ((this.ag$a & i6) != i6) {
                    return;
                }
                int i7 = this.valueOf;
                if (i7 == 0) {
                    LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b2 = this.toString;
                    LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b3 = linkedHashTreeMap$ah$b2.ah$b;
                    LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b4 = linkedHashTreeMap$ah$b3.ah$b;
                    linkedHashTreeMap$ah$b3.ah$b = linkedHashTreeMap$ah$b4.ah$b;
                    this.toString = linkedHashTreeMap$ah$b3;
                    linkedHashTreeMap$ah$b3.valueOf = linkedHashTreeMap$ah$b4;
                    linkedHashTreeMap$ah$b3.HaptikSDK$a = linkedHashTreeMap$ah$b2;
                    linkedHashTreeMap$ah$b3.values = linkedHashTreeMap$ah$b2.values + 1;
                    linkedHashTreeMap$ah$b4.ah$b = linkedHashTreeMap$ah$b3;
                    linkedHashTreeMap$ah$b2.ah$b = linkedHashTreeMap$ah$b3;
                } else if (i7 == 1) {
                    LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b5 = this.toString;
                    LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b6 = linkedHashTreeMap$ah$b5.ah$b;
                    this.toString = linkedHashTreeMap$ah$b6;
                    linkedHashTreeMap$ah$b6.HaptikSDK$a = linkedHashTreeMap$ah$b5;
                    linkedHashTreeMap$ah$b6.values = linkedHashTreeMap$ah$b5.values + 1;
                    linkedHashTreeMap$ah$b5.ah$b = linkedHashTreeMap$ah$b6;
                    this.valueOf = 0;
                } else if (i7 == 2) {
                    this.valueOf = 0;
                }
                i5 *= 2;
            }
        }

        LinkedHashTreeMap$ah$b<K, V> ag$a() {
            LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b = this.toString;
            if (linkedHashTreeMap$ah$b.ah$b == null) {
                return linkedHashTreeMap$ah$b;
            }
            throw new IllegalStateException();
        }
    }

    /* loaded from: classes5.dex */
    abstract class values<T> implements Iterator<T> {
        LinkedHashTreeMap$ah$b<K, V> ag$a;
        int ah$a;
        LinkedHashTreeMap$ah$b<K, V> values = null;

        /* JADX INFO: Access modifiers changed from: package-private */
        public values() {
            this.ag$a = LinkedHashTreeMap.this.header.ah$a;
            this.ah$a = LinkedHashTreeMap.this.modCount;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.ag$a != LinkedHashTreeMap.this.header;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final LinkedHashTreeMap$ah$b<K, V> ag$a() {
            LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b = this.ag$a;
            if (linkedHashTreeMap$ah$b == LinkedHashTreeMap.this.header) {
                throw new NoSuchElementException();
            }
            if (LinkedHashTreeMap.this.modCount != this.ah$a) {
                throw new ConcurrentModificationException();
            }
            this.ag$a = linkedHashTreeMap$ah$b.ah$a;
            this.values = linkedHashTreeMap$ah$b;
            return linkedHashTreeMap$ah$b;
        }

        @Override // java.util.Iterator
        public final void remove() {
            LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b = this.values;
            if (linkedHashTreeMap$ah$b == null) {
                throw new IllegalStateException();
            }
            LinkedHashTreeMap.this.removeInternal(linkedHashTreeMap$ah$b, true);
            this.values = null;
            this.ah$a = LinkedHashTreeMap.this.modCount;
        }
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }
}

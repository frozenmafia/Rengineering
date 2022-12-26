package com.airbnb.lottie.parser.moshi;

import com.airbnb.lottie.parser.moshi.LinkedHashTreeMap;
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
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class LinkedHashTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Comparator<Comparable> NATURAL_ORDER = new Comparator<Comparable>() { // from class: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.3
        @Override // java.util.Comparator
        /* renamed from: toString */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };
    Comparator<? super K> comparator;
    /* JADX WARN: Incorrect inner types in field signature: Lcom/airbnb/lottie/parser/moshi/LinkedHashTreeMap<TK;TV;>.a; */
    private LinkedHashTreeMap$ah$a entrySet;
    final LinkedHashTreeMap$HaptikSDK$c<K, V> header;
    private LinkedHashTreeMap<K, V>.valueOf keySet;
    int modCount;
    int size;
    LinkedHashTreeMap$HaptikSDK$c<K, V>[] table;
    int threshold;

    private static int secondaryHash(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 ^ (i2 >>> 7)) ^ (i2 >>> 4);
    }

    LinkedHashTreeMap() {
        this(null);
    }

    LinkedHashTreeMap(Comparator<? super K> comparator) {
        this.size = 0;
        this.modCount = 0;
        this.comparator = comparator == null ? NATURAL_ORDER : comparator;
        this.header = new LinkedHashTreeMap$HaptikSDK$c<>();
        this.table = new LinkedHashTreeMap$HaptikSDK$c[16];
        this.threshold = 12;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        LinkedHashTreeMap$HaptikSDK$c<K, V> findByObject = findByObject(obj);
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
        LinkedHashTreeMap$HaptikSDK$c<K, V> find = find(k, true);
        V v2 = find.invoke;
        find.invoke = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.table, (Object) null);
        this.size = 0;
        this.modCount++;
        LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c = this.header;
        LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c2 = linkedHashTreeMap$HaptikSDK$c.values;
        while (linkedHashTreeMap$HaptikSDK$c2 != linkedHashTreeMap$HaptikSDK$c) {
            LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c3 = linkedHashTreeMap$HaptikSDK$c2.values;
            linkedHashTreeMap$HaptikSDK$c2.HaptikSDK$b = null;
            linkedHashTreeMap$HaptikSDK$c2.values = null;
            linkedHashTreeMap$HaptikSDK$c2 = linkedHashTreeMap$HaptikSDK$c3;
        }
        linkedHashTreeMap$HaptikSDK$c.HaptikSDK$b = linkedHashTreeMap$HaptikSDK$c;
        linkedHashTreeMap$HaptikSDK$c.values = linkedHashTreeMap$HaptikSDK$c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        LinkedHashTreeMap$HaptikSDK$c<K, V> removeInternalByKey = removeInternalByKey(obj);
        if (removeInternalByKey != null) {
            return removeInternalByKey.invoke;
        }
        return null;
    }

    LinkedHashTreeMap$HaptikSDK$c<K, V> find(K k, boolean z) {
        LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c;
        int i;
        LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c2;
        int compare;
        Comparator<? super K> comparator = this.comparator;
        LinkedHashTreeMap$HaptikSDK$c<K, V>[] linkedHashTreeMap$HaptikSDK$cArr = this.table;
        int secondaryHash = secondaryHash(k.hashCode());
        int length = (linkedHashTreeMap$HaptikSDK$cArr.length - 1) & secondaryHash;
        LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c3 = linkedHashTreeMap$HaptikSDK$cArr[length];
        if (linkedHashTreeMap$HaptikSDK$c3 != null) {
            Comparable comparable = comparator == NATURAL_ORDER ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    compare = comparable.compareTo(linkedHashTreeMap$HaptikSDK$c3.toString);
                } else {
                    compare = comparator.compare(k, (K) linkedHashTreeMap$HaptikSDK$c3.toString);
                }
                if (compare == 0) {
                    return linkedHashTreeMap$HaptikSDK$c3;
                }
                LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c4 = compare < 0 ? linkedHashTreeMap$HaptikSDK$c3.valueOf : linkedHashTreeMap$HaptikSDK$c3.HaptikSDK$a;
                if (linkedHashTreeMap$HaptikSDK$c4 == null) {
                    linkedHashTreeMap$HaptikSDK$c = linkedHashTreeMap$HaptikSDK$c3;
                    i = compare;
                    break;
                }
                linkedHashTreeMap$HaptikSDK$c3 = linkedHashTreeMap$HaptikSDK$c4;
            }
        } else {
            linkedHashTreeMap$HaptikSDK$c = linkedHashTreeMap$HaptikSDK$c3;
            i = 0;
        }
        if (z) {
            LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c5 = this.header;
            if (linkedHashTreeMap$HaptikSDK$c == null) {
                if (comparator == NATURAL_ORDER && !(k instanceof Comparable)) {
                    throw new ClassCastException(k.getClass().getName() + " is not Comparable");
                }
                linkedHashTreeMap$HaptikSDK$c2 = new LinkedHashTreeMap$HaptikSDK$c<>(linkedHashTreeMap$HaptikSDK$c, k, secondaryHash, linkedHashTreeMap$HaptikSDK$c5, linkedHashTreeMap$HaptikSDK$c5.HaptikSDK$b);
                linkedHashTreeMap$HaptikSDK$cArr[length] = linkedHashTreeMap$HaptikSDK$c2;
            } else {
                linkedHashTreeMap$HaptikSDK$c2 = new LinkedHashTreeMap$HaptikSDK$c<>(linkedHashTreeMap$HaptikSDK$c, k, secondaryHash, linkedHashTreeMap$HaptikSDK$c5, linkedHashTreeMap$HaptikSDK$c5.HaptikSDK$b);
                if (i < 0) {
                    linkedHashTreeMap$HaptikSDK$c.valueOf = linkedHashTreeMap$HaptikSDK$c2;
                } else {
                    linkedHashTreeMap$HaptikSDK$c.HaptikSDK$a = linkedHashTreeMap$HaptikSDK$c2;
                }
                rebalance(linkedHashTreeMap$HaptikSDK$c, true);
            }
            int i2 = this.size;
            this.size = i2 + 1;
            if (i2 > this.threshold) {
                doubleCapacity();
            }
            this.modCount++;
            return linkedHashTreeMap$HaptikSDK$c2;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    LinkedHashTreeMap$HaptikSDK$c<K, V> findByObject(Object obj) {
        if (obj != 0) {
            try {
                return find(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LinkedHashTreeMap$HaptikSDK$c<K, V> findByEntry(Map.Entry<?, ?> entry) {
        LinkedHashTreeMap$HaptikSDK$c<K, V> findByObject = findByObject(entry.getKey());
        if (findByObject != null && equal(findByObject.invoke, entry.getValue())) {
            return findByObject;
        }
        return null;
    }

    private boolean equal(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeInternal(LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c, boolean z) {
        int i;
        if (z) {
            linkedHashTreeMap$HaptikSDK$c.HaptikSDK$b.values = linkedHashTreeMap$HaptikSDK$c.values;
            linkedHashTreeMap$HaptikSDK$c.values.HaptikSDK$b = linkedHashTreeMap$HaptikSDK$c.HaptikSDK$b;
            linkedHashTreeMap$HaptikSDK$c.HaptikSDK$b = null;
            linkedHashTreeMap$HaptikSDK$c.values = null;
        }
        LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c2 = linkedHashTreeMap$HaptikSDK$c.valueOf;
        LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c3 = linkedHashTreeMap$HaptikSDK$c.HaptikSDK$a;
        LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c4 = linkedHashTreeMap$HaptikSDK$c.HaptikSDK$c;
        int i2 = 0;
        if (linkedHashTreeMap$HaptikSDK$c2 != null && linkedHashTreeMap$HaptikSDK$c3 != null) {
            LinkedHashTreeMap$HaptikSDK$c<K, V> valueOf2 = linkedHashTreeMap$HaptikSDK$c2.ah$a > linkedHashTreeMap$HaptikSDK$c3.ah$a ? linkedHashTreeMap$HaptikSDK$c2.valueOf() : linkedHashTreeMap$HaptikSDK$c3.ag$a();
            removeInternal(valueOf2, false);
            LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c5 = linkedHashTreeMap$HaptikSDK$c.valueOf;
            if (linkedHashTreeMap$HaptikSDK$c5 != null) {
                i = linkedHashTreeMap$HaptikSDK$c5.ah$a;
                valueOf2.valueOf = linkedHashTreeMap$HaptikSDK$c5;
                linkedHashTreeMap$HaptikSDK$c5.HaptikSDK$c = valueOf2;
                linkedHashTreeMap$HaptikSDK$c.valueOf = null;
            } else {
                i = 0;
            }
            LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c6 = linkedHashTreeMap$HaptikSDK$c.HaptikSDK$a;
            if (linkedHashTreeMap$HaptikSDK$c6 != null) {
                i2 = linkedHashTreeMap$HaptikSDK$c6.ah$a;
                valueOf2.HaptikSDK$a = linkedHashTreeMap$HaptikSDK$c6;
                linkedHashTreeMap$HaptikSDK$c6.HaptikSDK$c = valueOf2;
                linkedHashTreeMap$HaptikSDK$c.HaptikSDK$a = null;
            }
            valueOf2.ah$a = Math.max(i, i2) + 1;
            replaceInParent(linkedHashTreeMap$HaptikSDK$c, valueOf2);
            return;
        }
        if (linkedHashTreeMap$HaptikSDK$c2 != null) {
            replaceInParent(linkedHashTreeMap$HaptikSDK$c, linkedHashTreeMap$HaptikSDK$c2);
            linkedHashTreeMap$HaptikSDK$c.valueOf = null;
        } else if (linkedHashTreeMap$HaptikSDK$c3 != null) {
            replaceInParent(linkedHashTreeMap$HaptikSDK$c, linkedHashTreeMap$HaptikSDK$c3);
            linkedHashTreeMap$HaptikSDK$c.HaptikSDK$a = null;
        } else {
            replaceInParent(linkedHashTreeMap$HaptikSDK$c, null);
        }
        rebalance(linkedHashTreeMap$HaptikSDK$c4, false);
        this.size--;
        this.modCount++;
    }

    LinkedHashTreeMap$HaptikSDK$c<K, V> removeInternalByKey(Object obj) {
        LinkedHashTreeMap$HaptikSDK$c<K, V> findByObject = findByObject(obj);
        if (findByObject != null) {
            removeInternal(findByObject, true);
        }
        return findByObject;
    }

    private void replaceInParent(LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c, LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c2) {
        LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c3 = linkedHashTreeMap$HaptikSDK$c.HaptikSDK$c;
        linkedHashTreeMap$HaptikSDK$c.HaptikSDK$c = null;
        if (linkedHashTreeMap$HaptikSDK$c2 != null) {
            linkedHashTreeMap$HaptikSDK$c2.HaptikSDK$c = linkedHashTreeMap$HaptikSDK$c3;
        }
        if (linkedHashTreeMap$HaptikSDK$c3 != null) {
            if (linkedHashTreeMap$HaptikSDK$c3.valueOf == linkedHashTreeMap$HaptikSDK$c) {
                linkedHashTreeMap$HaptikSDK$c3.valueOf = linkedHashTreeMap$HaptikSDK$c2;
                return;
            } else {
                linkedHashTreeMap$HaptikSDK$c3.HaptikSDK$a = linkedHashTreeMap$HaptikSDK$c2;
                return;
            }
        }
        int i = linkedHashTreeMap$HaptikSDK$c.ag$a;
        LinkedHashTreeMap$HaptikSDK$c<K, V>[] linkedHashTreeMap$HaptikSDK$cArr = this.table;
        linkedHashTreeMap$HaptikSDK$cArr[i & (linkedHashTreeMap$HaptikSDK$cArr.length - 1)] = linkedHashTreeMap$HaptikSDK$c2;
    }

    private void rebalance(LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c, boolean z) {
        while (linkedHashTreeMap$HaptikSDK$c != null) {
            LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c2 = linkedHashTreeMap$HaptikSDK$c.valueOf;
            LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c3 = linkedHashTreeMap$HaptikSDK$c.HaptikSDK$a;
            int i = linkedHashTreeMap$HaptikSDK$c2 != null ? linkedHashTreeMap$HaptikSDK$c2.ah$a : 0;
            int i2 = linkedHashTreeMap$HaptikSDK$c3 != null ? linkedHashTreeMap$HaptikSDK$c3.ah$a : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c4 = linkedHashTreeMap$HaptikSDK$c3.valueOf;
                LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c5 = linkedHashTreeMap$HaptikSDK$c3.HaptikSDK$a;
                int i4 = (linkedHashTreeMap$HaptikSDK$c4 != null ? linkedHashTreeMap$HaptikSDK$c4.ah$a : 0) - (linkedHashTreeMap$HaptikSDK$c5 != null ? linkedHashTreeMap$HaptikSDK$c5.ah$a : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    rotateLeft(linkedHashTreeMap$HaptikSDK$c);
                } else {
                    rotateRight(linkedHashTreeMap$HaptikSDK$c3);
                    rotateLeft(linkedHashTreeMap$HaptikSDK$c);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c6 = linkedHashTreeMap$HaptikSDK$c2.valueOf;
                LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c7 = linkedHashTreeMap$HaptikSDK$c2.HaptikSDK$a;
                int i5 = (linkedHashTreeMap$HaptikSDK$c6 != null ? linkedHashTreeMap$HaptikSDK$c6.ah$a : 0) - (linkedHashTreeMap$HaptikSDK$c7 != null ? linkedHashTreeMap$HaptikSDK$c7.ah$a : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    rotateRight(linkedHashTreeMap$HaptikSDK$c);
                } else {
                    rotateLeft(linkedHashTreeMap$HaptikSDK$c2);
                    rotateRight(linkedHashTreeMap$HaptikSDK$c);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                linkedHashTreeMap$HaptikSDK$c.ah$a = i + 1;
                if (z) {
                    return;
                }
            } else {
                linkedHashTreeMap$HaptikSDK$c.ah$a = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            linkedHashTreeMap$HaptikSDK$c = linkedHashTreeMap$HaptikSDK$c.HaptikSDK$c;
        }
    }

    private void rotateLeft(LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c) {
        LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c2 = linkedHashTreeMap$HaptikSDK$c.valueOf;
        LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c3 = linkedHashTreeMap$HaptikSDK$c.HaptikSDK$a;
        LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c4 = linkedHashTreeMap$HaptikSDK$c3.valueOf;
        LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c5 = linkedHashTreeMap$HaptikSDK$c3.HaptikSDK$a;
        linkedHashTreeMap$HaptikSDK$c.HaptikSDK$a = linkedHashTreeMap$HaptikSDK$c4;
        if (linkedHashTreeMap$HaptikSDK$c4 != null) {
            linkedHashTreeMap$HaptikSDK$c4.HaptikSDK$c = linkedHashTreeMap$HaptikSDK$c;
        }
        replaceInParent(linkedHashTreeMap$HaptikSDK$c, linkedHashTreeMap$HaptikSDK$c3);
        linkedHashTreeMap$HaptikSDK$c3.valueOf = linkedHashTreeMap$HaptikSDK$c;
        linkedHashTreeMap$HaptikSDK$c.HaptikSDK$c = linkedHashTreeMap$HaptikSDK$c3;
        linkedHashTreeMap$HaptikSDK$c.ah$a = Math.max(linkedHashTreeMap$HaptikSDK$c2 != null ? linkedHashTreeMap$HaptikSDK$c2.ah$a : 0, linkedHashTreeMap$HaptikSDK$c4 != null ? linkedHashTreeMap$HaptikSDK$c4.ah$a : 0) + 1;
        linkedHashTreeMap$HaptikSDK$c3.ah$a = Math.max(linkedHashTreeMap$HaptikSDK$c.ah$a, linkedHashTreeMap$HaptikSDK$c5 != null ? linkedHashTreeMap$HaptikSDK$c5.ah$a : 0) + 1;
    }

    private void rotateRight(LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c) {
        LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c2 = linkedHashTreeMap$HaptikSDK$c.valueOf;
        LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c3 = linkedHashTreeMap$HaptikSDK$c.HaptikSDK$a;
        LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c4 = linkedHashTreeMap$HaptikSDK$c2.valueOf;
        LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c5 = linkedHashTreeMap$HaptikSDK$c2.HaptikSDK$a;
        linkedHashTreeMap$HaptikSDK$c.valueOf = linkedHashTreeMap$HaptikSDK$c5;
        if (linkedHashTreeMap$HaptikSDK$c5 != null) {
            linkedHashTreeMap$HaptikSDK$c5.HaptikSDK$c = linkedHashTreeMap$HaptikSDK$c;
        }
        replaceInParent(linkedHashTreeMap$HaptikSDK$c, linkedHashTreeMap$HaptikSDK$c2);
        linkedHashTreeMap$HaptikSDK$c2.HaptikSDK$a = linkedHashTreeMap$HaptikSDK$c;
        linkedHashTreeMap$HaptikSDK$c.HaptikSDK$c = linkedHashTreeMap$HaptikSDK$c2;
        linkedHashTreeMap$HaptikSDK$c.ah$a = Math.max(linkedHashTreeMap$HaptikSDK$c3 != null ? linkedHashTreeMap$HaptikSDK$c3.ah$a : 0, linkedHashTreeMap$HaptikSDK$c5 != null ? linkedHashTreeMap$HaptikSDK$c5.ah$a : 0) + 1;
        linkedHashTreeMap$HaptikSDK$c2.ah$a = Math.max(linkedHashTreeMap$HaptikSDK$c.ah$a, linkedHashTreeMap$HaptikSDK$c4 != null ? linkedHashTreeMap$HaptikSDK$c4.ah$a : 0) + 1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$ah$a, java.util.Set<java.util.Map$Entry<K, V>>] */
    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        LinkedHashTreeMap$ah$a linkedHashTreeMap$ah$a = this.entrySet;
        if (linkedHashTreeMap$ah$a != null) {
            return linkedHashTreeMap$ah$a;
        }
        AbstractSet<Map.Entry<K, V>> abstractSet = new AbstractSet<Map.Entry<K, V>>() { // from class: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$ah$a
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return LinkedHashTreeMap.this.size;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return new LinkedHashTreeMap.toString() { // from class: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$ah$a.5
                    {
                        LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
                    }

                    @Override // java.util.Iterator
                    /* renamed from: ah$a */
                    public Map.Entry<K, V> next() {
                        return valueOf();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return (obj instanceof Map.Entry) && LinkedHashTreeMap.this.findByEntry((Map.Entry) obj) != null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                LinkedHashTreeMap$HaptikSDK$c findByEntry;
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

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        LinkedHashTreeMap<K, V>.valueOf valueof = this.keySet;
        if (valueof != null) {
            return valueof;
        }
        LinkedHashTreeMap<K, V>.valueOf valueof2 = new valueOf();
        this.keySet = valueof2;
        return valueof2;
    }

    private void doubleCapacity() {
        LinkedHashTreeMap$HaptikSDK$c<K, V>[] doubleCapacity = doubleCapacity(this.table);
        this.table = doubleCapacity;
        this.threshold = (doubleCapacity.length / 2) + (doubleCapacity.length / 4);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$ag$a] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$ag$a] */
    static <K, V> LinkedHashTreeMap$HaptikSDK$c<K, V>[] doubleCapacity(LinkedHashTreeMap$HaptikSDK$c<K, V>[] linkedHashTreeMap$HaptikSDK$cArr) {
        int length = linkedHashTreeMap$HaptikSDK$cArr.length;
        LinkedHashTreeMap$HaptikSDK$c<K, V>[] linkedHashTreeMap$HaptikSDK$cArr2 = new LinkedHashTreeMap$HaptikSDK$c[length * 2];
        values valuesVar = new values();
        ?? r3 = new Object() { // from class: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$ag$a
            private int ah$a;
            private int toString;
            private LinkedHashTreeMap$HaptikSDK$c<K, V> valueOf;
            private int values;

            /* JADX INFO: Access modifiers changed from: package-private */
            public void ag$a(int i) {
                this.ah$a = ((Integer.highestOneBit(i) * 2) - 1) - i;
                this.values = 0;
                this.toString = 0;
                this.valueOf = null;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public void ah$a(LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c) {
                linkedHashTreeMap$HaptikSDK$c.HaptikSDK$a = null;
                linkedHashTreeMap$HaptikSDK$c.HaptikSDK$c = null;
                linkedHashTreeMap$HaptikSDK$c.valueOf = null;
                linkedHashTreeMap$HaptikSDK$c.ah$a = 1;
                int i = this.ah$a;
                if (i > 0) {
                    int i2 = this.values;
                    if ((i2 & 1) == 0) {
                        this.values = i2 + 1;
                        this.ah$a = i - 1;
                        this.toString++;
                    }
                }
                linkedHashTreeMap$HaptikSDK$c.HaptikSDK$c = this.valueOf;
                this.valueOf = linkedHashTreeMap$HaptikSDK$c;
                int i3 = this.values + 1;
                this.values = i3;
                int i4 = this.ah$a;
                if (i4 > 0 && (i3 & 1) == 0) {
                    this.values = i3 + 1;
                    this.ah$a = i4 - 1;
                    this.toString++;
                }
                int i5 = 4;
                while (true) {
                    int i6 = i5 - 1;
                    if ((this.values & i6) != i6) {
                        return;
                    }
                    int i7 = this.toString;
                    if (i7 == 0) {
                        LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c2 = this.valueOf;
                        LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c3 = linkedHashTreeMap$HaptikSDK$c2.HaptikSDK$c;
                        LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c4 = linkedHashTreeMap$HaptikSDK$c3.HaptikSDK$c;
                        linkedHashTreeMap$HaptikSDK$c3.HaptikSDK$c = linkedHashTreeMap$HaptikSDK$c4.HaptikSDK$c;
                        this.valueOf = linkedHashTreeMap$HaptikSDK$c3;
                        linkedHashTreeMap$HaptikSDK$c3.valueOf = linkedHashTreeMap$HaptikSDK$c4;
                        linkedHashTreeMap$HaptikSDK$c3.HaptikSDK$a = linkedHashTreeMap$HaptikSDK$c2;
                        linkedHashTreeMap$HaptikSDK$c3.ah$a = linkedHashTreeMap$HaptikSDK$c2.ah$a + 1;
                        linkedHashTreeMap$HaptikSDK$c4.HaptikSDK$c = linkedHashTreeMap$HaptikSDK$c3;
                        linkedHashTreeMap$HaptikSDK$c2.HaptikSDK$c = linkedHashTreeMap$HaptikSDK$c3;
                    } else if (i7 == 1) {
                        LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c5 = this.valueOf;
                        LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c6 = linkedHashTreeMap$HaptikSDK$c5.HaptikSDK$c;
                        this.valueOf = linkedHashTreeMap$HaptikSDK$c6;
                        linkedHashTreeMap$HaptikSDK$c6.HaptikSDK$a = linkedHashTreeMap$HaptikSDK$c5;
                        linkedHashTreeMap$HaptikSDK$c6.ah$a = linkedHashTreeMap$HaptikSDK$c5.ah$a + 1;
                        linkedHashTreeMap$HaptikSDK$c5.HaptikSDK$c = linkedHashTreeMap$HaptikSDK$c6;
                        this.toString = 0;
                    } else if (i7 == 2) {
                        this.toString = 0;
                    }
                    i5 *= 2;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public LinkedHashTreeMap$HaptikSDK$c<K, V> ag$a() {
                LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c = this.valueOf;
                if (linkedHashTreeMap$HaptikSDK$c.HaptikSDK$c == null) {
                    return linkedHashTreeMap$HaptikSDK$c;
                }
                throw new IllegalStateException();
            }
        };
        ?? r4 = new Object() { // from class: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$ag$a
            private int ah$a;
            private int toString;
            private LinkedHashTreeMap$HaptikSDK$c<K, V> valueOf;
            private int values;

            /* JADX INFO: Access modifiers changed from: package-private */
            public void ag$a(int i) {
                this.ah$a = ((Integer.highestOneBit(i) * 2) - 1) - i;
                this.values = 0;
                this.toString = 0;
                this.valueOf = null;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public void ah$a(LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c) {
                linkedHashTreeMap$HaptikSDK$c.HaptikSDK$a = null;
                linkedHashTreeMap$HaptikSDK$c.HaptikSDK$c = null;
                linkedHashTreeMap$HaptikSDK$c.valueOf = null;
                linkedHashTreeMap$HaptikSDK$c.ah$a = 1;
                int i = this.ah$a;
                if (i > 0) {
                    int i2 = this.values;
                    if ((i2 & 1) == 0) {
                        this.values = i2 + 1;
                        this.ah$a = i - 1;
                        this.toString++;
                    }
                }
                linkedHashTreeMap$HaptikSDK$c.HaptikSDK$c = this.valueOf;
                this.valueOf = linkedHashTreeMap$HaptikSDK$c;
                int i3 = this.values + 1;
                this.values = i3;
                int i4 = this.ah$a;
                if (i4 > 0 && (i3 & 1) == 0) {
                    this.values = i3 + 1;
                    this.ah$a = i4 - 1;
                    this.toString++;
                }
                int i5 = 4;
                while (true) {
                    int i6 = i5 - 1;
                    if ((this.values & i6) != i6) {
                        return;
                    }
                    int i7 = this.toString;
                    if (i7 == 0) {
                        LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c2 = this.valueOf;
                        LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c3 = linkedHashTreeMap$HaptikSDK$c2.HaptikSDK$c;
                        LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c4 = linkedHashTreeMap$HaptikSDK$c3.HaptikSDK$c;
                        linkedHashTreeMap$HaptikSDK$c3.HaptikSDK$c = linkedHashTreeMap$HaptikSDK$c4.HaptikSDK$c;
                        this.valueOf = linkedHashTreeMap$HaptikSDK$c3;
                        linkedHashTreeMap$HaptikSDK$c3.valueOf = linkedHashTreeMap$HaptikSDK$c4;
                        linkedHashTreeMap$HaptikSDK$c3.HaptikSDK$a = linkedHashTreeMap$HaptikSDK$c2;
                        linkedHashTreeMap$HaptikSDK$c3.ah$a = linkedHashTreeMap$HaptikSDK$c2.ah$a + 1;
                        linkedHashTreeMap$HaptikSDK$c4.HaptikSDK$c = linkedHashTreeMap$HaptikSDK$c3;
                        linkedHashTreeMap$HaptikSDK$c2.HaptikSDK$c = linkedHashTreeMap$HaptikSDK$c3;
                    } else if (i7 == 1) {
                        LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c5 = this.valueOf;
                        LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c6 = linkedHashTreeMap$HaptikSDK$c5.HaptikSDK$c;
                        this.valueOf = linkedHashTreeMap$HaptikSDK$c6;
                        linkedHashTreeMap$HaptikSDK$c6.HaptikSDK$a = linkedHashTreeMap$HaptikSDK$c5;
                        linkedHashTreeMap$HaptikSDK$c6.ah$a = linkedHashTreeMap$HaptikSDK$c5.ah$a + 1;
                        linkedHashTreeMap$HaptikSDK$c5.HaptikSDK$c = linkedHashTreeMap$HaptikSDK$c6;
                        this.toString = 0;
                    } else if (i7 == 2) {
                        this.toString = 0;
                    }
                    i5 *= 2;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public LinkedHashTreeMap$HaptikSDK$c<K, V> ag$a() {
                LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c = this.valueOf;
                if (linkedHashTreeMap$HaptikSDK$c.HaptikSDK$c == null) {
                    return linkedHashTreeMap$HaptikSDK$c;
                }
                throw new IllegalStateException();
            }
        };
        for (int i = 0; i < length; i++) {
            LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c = linkedHashTreeMap$HaptikSDK$cArr[i];
            if (linkedHashTreeMap$HaptikSDK$c != null) {
                valuesVar.toString(linkedHashTreeMap$HaptikSDK$c);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    LinkedHashTreeMap$HaptikSDK$c<K, V> ah$a = valuesVar.ah$a();
                    if (ah$a == null) {
                        break;
                    } else if ((ah$a.ag$a & length) == 0) {
                        i2++;
                    } else {
                        i3++;
                    }
                }
                r3.ag$a(i2);
                r4.ag$a(i3);
                valuesVar.toString(linkedHashTreeMap$HaptikSDK$c);
                while (true) {
                    LinkedHashTreeMap$HaptikSDK$c<K, V> ah$a2 = valuesVar.ah$a();
                    if (ah$a2 == null) {
                        break;
                    } else if ((ah$a2.ag$a & length) == 0) {
                        r3.ah$a(ah$a2);
                    } else {
                        r4.ah$a(ah$a2);
                    }
                }
                linkedHashTreeMap$HaptikSDK$cArr2[i] = i2 > 0 ? r3.ag$a() : null;
                linkedHashTreeMap$HaptikSDK$cArr2[i + length] = i3 > 0 ? r4.ag$a() : null;
            }
        }
        return linkedHashTreeMap$HaptikSDK$cArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class values<K, V> {
        private LinkedHashTreeMap$HaptikSDK$c<K, V> toString;

        values() {
        }

        void toString(LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c) {
            LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c2 = null;
            while (linkedHashTreeMap$HaptikSDK$c != null) {
                linkedHashTreeMap$HaptikSDK$c.HaptikSDK$c = linkedHashTreeMap$HaptikSDK$c2;
                linkedHashTreeMap$HaptikSDK$c2 = linkedHashTreeMap$HaptikSDK$c;
                linkedHashTreeMap$HaptikSDK$c = linkedHashTreeMap$HaptikSDK$c.valueOf;
            }
            this.toString = linkedHashTreeMap$HaptikSDK$c2;
        }

        public LinkedHashTreeMap$HaptikSDK$c<K, V> ah$a() {
            LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c = this.toString;
            if (linkedHashTreeMap$HaptikSDK$c == null) {
                return null;
            }
            LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c2 = linkedHashTreeMap$HaptikSDK$c.HaptikSDK$c;
            linkedHashTreeMap$HaptikSDK$c.HaptikSDK$c = null;
            for (LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c3 = linkedHashTreeMap$HaptikSDK$c.HaptikSDK$a; linkedHashTreeMap$HaptikSDK$c3 != null; linkedHashTreeMap$HaptikSDK$c3 = linkedHashTreeMap$HaptikSDK$c3.valueOf) {
                linkedHashTreeMap$HaptikSDK$c3.HaptikSDK$c = linkedHashTreeMap$HaptikSDK$c2;
                linkedHashTreeMap$HaptikSDK$c2 = linkedHashTreeMap$HaptikSDK$c3;
            }
            this.toString = linkedHashTreeMap$HaptikSDK$c2;
            return linkedHashTreeMap$HaptikSDK$c;
        }
    }

    /* loaded from: classes6.dex */
    abstract class toString<T> implements Iterator<T> {
        int ag$a;
        LinkedHashTreeMap$HaptikSDK$c<K, V> toString;
        LinkedHashTreeMap$HaptikSDK$c<K, V> valueOf = null;

        /* JADX INFO: Access modifiers changed from: package-private */
        public toString() {
            this.toString = LinkedHashTreeMap.this.header.values;
            this.ag$a = LinkedHashTreeMap.this.modCount;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.toString != LinkedHashTreeMap.this.header;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final LinkedHashTreeMap$HaptikSDK$c<K, V> valueOf() {
            LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c = this.toString;
            if (linkedHashTreeMap$HaptikSDK$c == LinkedHashTreeMap.this.header) {
                throw new NoSuchElementException();
            }
            if (LinkedHashTreeMap.this.modCount != this.ag$a) {
                throw new ConcurrentModificationException();
            }
            this.toString = linkedHashTreeMap$HaptikSDK$c.values;
            this.valueOf = linkedHashTreeMap$HaptikSDK$c;
            return linkedHashTreeMap$HaptikSDK$c;
        }

        @Override // java.util.Iterator
        public final void remove() {
            LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c = this.valueOf;
            if (linkedHashTreeMap$HaptikSDK$c == null) {
                throw new IllegalStateException();
            }
            LinkedHashTreeMap.this.removeInternal(linkedHashTreeMap$HaptikSDK$c, true);
            this.valueOf = null;
            this.ag$a = LinkedHashTreeMap.this.modCount;
        }
    }

    /* loaded from: classes6.dex */
    final class valueOf extends AbstractSet<K> {
        valueOf() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedHashTreeMap.this.size;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new toString() { // from class: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.valueOf.2
                {
                    LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
                }

                @Override // java.util.Iterator
                public K next() {
                    return valueOf().toString;
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
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }
}

package com.google.common.collect;

import java.util.AbstractSet;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import o.getChangePayload;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class HashBiMap$HaptikSDK$b<K, V, T> extends AbstractSet<T> {
    final HashBiMap<K, V> valueOf;

    abstract T ag$a(int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashBiMap$HaptikSDK$b(HashBiMap<K, V> hashBiMap) {
        this.valueOf = hashBiMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<T> iterator() {
        return new Iterator<T>() { // from class: com.google.common.collect.HashBiMap$HaptikSDK$b.3
            private int ah$a;
            private int toString;
            private int valueOf;
            private int values;

            {
                int i;
                i = ((HashBiMap) HashBiMap$HaptikSDK$b.this.valueOf).firstInInsertionOrder;
                this.values = i;
                this.toString = -1;
                this.ah$a = HashBiMap$HaptikSDK$b.this.valueOf.modCount;
                this.valueOf = HashBiMap$HaptikSDK$b.this.valueOf.size;
            }

            private void valueOf() {
                if (HashBiMap$HaptikSDK$b.this.valueOf.modCount != this.ah$a) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                valueOf();
                return this.values != -2 && this.valueOf > 0;
            }

            @Override // java.util.Iterator
            public T next() {
                int[] iArr;
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T t = (T) HashBiMap$HaptikSDK$b.this.ag$a(this.values);
                this.toString = this.values;
                iArr = ((HashBiMap) HashBiMap$HaptikSDK$b.this.valueOf).nextInInsertionOrder;
                this.values = iArr[this.values];
                this.valueOf--;
                return t;
            }

            @Override // java.util.Iterator
            public void remove() {
                valueOf();
                getChangePayload.toString(this.toString != -1);
                HashBiMap$HaptikSDK$b.this.valueOf.removeEntry(this.toString);
                if (this.values == HashBiMap$HaptikSDK$b.this.valueOf.size) {
                    this.values = this.toString;
                }
                this.toString = -1;
                this.ah$a = HashBiMap$HaptikSDK$b.this.valueOf.modCount;
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.valueOf.size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.valueOf.clear();
    }
}

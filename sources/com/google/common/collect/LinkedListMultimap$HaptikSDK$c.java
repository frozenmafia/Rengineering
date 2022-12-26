package com.google.common.collect;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import o.markViewHoldersUpdated;
/* loaded from: classes7.dex */
class LinkedListMultimap$HaptikSDK$c implements ListIterator<Map.Entry<K, V>> {
    final /* synthetic */ LinkedListMultimap HaptikSDK$b;
    int ag$a;
    int ah$a;
    LinkedListMultimap$ah$b<K, V> toString;
    LinkedListMultimap$ah$b<K, V> valueOf;
    LinkedListMultimap$ah$b<K, V> values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LinkedListMultimap$HaptikSDK$c(LinkedListMultimap linkedListMultimap, int i) {
        LinkedListMultimap$ah$b<K, V> linkedListMultimap$ah$b;
        this.HaptikSDK$b = linkedListMultimap;
        this.ag$a = linkedListMultimap.modCount;
        int size = linkedListMultimap.size();
        markViewHoldersUpdated.toString(i, size, "index");
        if (i >= size / 2) {
            linkedListMultimap$ah$b = linkedListMultimap.tail;
            this.valueOf = linkedListMultimap$ah$b;
            this.ah$a = size;
            while (i < size) {
                previous();
                i++;
            }
        } else {
            this.values = linkedListMultimap.head;
            while (i > 0) {
                next();
                i--;
            }
        }
        this.toString = null;
    }

    private void ag$a() {
        if (this.HaptikSDK$b.modCount != this.ag$a) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        ag$a();
        return this.values != null;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    /* renamed from: valueOf */
    public LinkedListMultimap$ah$b<K, V> next() {
        ag$a();
        LinkedListMultimap$ah$b<K, V> linkedListMultimap$ah$b = this.values;
        if (linkedListMultimap$ah$b == 0) {
            throw new NoSuchElementException();
        }
        this.toString = linkedListMultimap$ah$b;
        this.valueOf = linkedListMultimap$ah$b;
        this.values = linkedListMultimap$ah$b.toString;
        this.ah$a++;
        return this.toString;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        ag$a();
        markViewHoldersUpdated.ah$a(this.toString != null, "no calls to next() since the last call to remove()");
        LinkedListMultimap$ah$b<K, V> linkedListMultimap$ah$b = this.toString;
        if (linkedListMultimap$ah$b != this.values) {
            this.valueOf = linkedListMultimap$ah$b.values;
            this.ah$a--;
        } else {
            this.values = linkedListMultimap$ah$b.toString;
        }
        this.HaptikSDK$b.removeNode(this.toString);
        this.toString = null;
        this.ag$a = this.HaptikSDK$b.modCount;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        ag$a();
        return this.valueOf != null;
    }

    @Override // java.util.ListIterator
    /* renamed from: ah$a */
    public LinkedListMultimap$ah$b<K, V> previous() {
        ag$a();
        LinkedListMultimap$ah$b<K, V> linkedListMultimap$ah$b = this.valueOf;
        if (linkedListMultimap$ah$b == 0) {
            throw new NoSuchElementException();
        }
        this.toString = linkedListMultimap$ah$b;
        this.values = linkedListMultimap$ah$b;
        this.valueOf = linkedListMultimap$ah$b.values;
        this.ah$a--;
        return this.toString;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.ah$a;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.ah$a - 1;
    }

    @Override // java.util.ListIterator
    /* renamed from: values */
    public void set(Map.Entry<K, V> entry) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    /* renamed from: ag$a */
    public void add(Map.Entry<K, V> entry) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ag$a(V v) {
        markViewHoldersUpdated.ag$a(this.toString != null);
        this.toString.HaptikSDK$c = v;
    }
}

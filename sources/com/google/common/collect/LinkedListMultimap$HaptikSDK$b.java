package com.google.common.collect;

import com.google.common.collect.LinkedListMultimap;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import o.markViewHoldersUpdated;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class LinkedListMultimap$HaptikSDK$b implements ListIterator<V> {
    int ag$a;
    final K ah$a;
    final /* synthetic */ LinkedListMultimap ah$b;
    LinkedListMultimap$ah$b<K, V> toString;
    LinkedListMultimap$ah$b<K, V> valueOf;
    LinkedListMultimap$ah$b<K, V> values;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public LinkedListMultimap$HaptikSDK$b(LinkedListMultimap linkedListMultimap, K k) {
        this.ah$b = linkedListMultimap;
        this.ah$a = k;
        LinkedListMultimap.toString tostring = (LinkedListMultimap.toString) linkedListMultimap.keyToKeyList.get(k);
        this.toString = tostring == null ? 0 : tostring.ah$a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LinkedListMultimap$HaptikSDK$b(LinkedListMultimap linkedListMultimap, K k, int i) {
        this.ah$b = linkedListMultimap;
        LinkedListMultimap.toString tostring = (LinkedListMultimap.toString) linkedListMultimap.keyToKeyList.get(k);
        int i2 = tostring == null ? 0 : tostring.valueOf;
        markViewHoldersUpdated.toString(i, i2, "index");
        if (i >= i2 / 2) {
            this.valueOf = tostring == null ? 0 : tostring.toString;
            this.ag$a = i2;
            while (i < i2) {
                previous();
                i++;
            }
        } else {
            this.toString = tostring == null ? 0 : tostring.ah$a;
            while (i > 0) {
                next();
                i--;
            }
        }
        this.ah$a = k;
        this.values = null;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.toString != null;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public V next() {
        LinkedListMultimap$ah$b<K, V> linkedListMultimap$ah$b = this.toString;
        if (linkedListMultimap$ah$b == 0) {
            throw new NoSuchElementException();
        }
        this.values = linkedListMultimap$ah$b;
        this.valueOf = linkedListMultimap$ah$b;
        this.toString = linkedListMultimap$ah$b.ah$a;
        this.ag$a++;
        return this.values.HaptikSDK$c;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.valueOf != null;
    }

    @Override // java.util.ListIterator
    public V previous() {
        LinkedListMultimap$ah$b<K, V> linkedListMultimap$ah$b = this.valueOf;
        if (linkedListMultimap$ah$b == 0) {
            throw new NoSuchElementException();
        }
        this.values = linkedListMultimap$ah$b;
        this.toString = linkedListMultimap$ah$b;
        this.valueOf = linkedListMultimap$ah$b.valueOf;
        this.ag$a--;
        return this.values.HaptikSDK$c;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.ag$a;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.ag$a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        markViewHoldersUpdated.ah$a(this.values != null, "no calls to next() since the last call to remove()");
        LinkedListMultimap$ah$b<K, V> linkedListMultimap$ah$b = this.values;
        if (linkedListMultimap$ah$b != this.toString) {
            this.valueOf = linkedListMultimap$ah$b.valueOf;
            this.ag$a--;
        } else {
            this.toString = linkedListMultimap$ah$b.ah$a;
        }
        this.ah$b.removeNode(this.values);
        this.values = null;
    }

    @Override // java.util.ListIterator
    public void set(V v) {
        markViewHoldersUpdated.ag$a(this.values != null);
        this.values.HaptikSDK$c = v;
    }

    @Override // java.util.ListIterator
    public void add(V v) {
        LinkedListMultimap$ah$b<K, V> addNode;
        addNode = this.ah$b.addNode(this.ah$a, v, this.toString);
        this.valueOf = addNode;
        this.ag$a++;
        this.values = null;
    }
}
